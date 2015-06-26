/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.brand.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.brand.dto.BrandDto;
import TIMS.brand.view.BrandForm;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

/**
 *
 * @author Damith
 */
public class AddBrandController extends BaseController {

    BrandForm brandForm = null;

    public BrandForm getBrandForm() {
        if (this.brandForm == null) {
            this.brandForm = new BrandForm();
        }
        return brandForm;
    }

    public void setBrandForm(BrandForm brandForm) {
        this.brandForm = brandForm;
    }

    public AddBrandController() {
    }

    public AddBrandController(ActionEvent e) {
        super(e);
    }

    public AddBrandController(BrandDto dto) {
        this.getBrandForm().setBrand_Name(dto.getName());
        this.getBrandForm().setBr_Other(dto.getOther());
        this.getBrandForm().setBrand_Des(dto.getDescription());
        this.getBrandForm().setCode(dto.getCode());

    }

    @Override
    public void execute() {
        try {
            this.setAddBransScreen();
        } catch (Exception ex) {
            System.out.print("Errors--->" + ex);
        }
    }

    private void setAddBransScreen() {

        try {
            this.getMainPanel().removeAll();
            this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
            this.getMainPanel().add(this.getBrandForm());
            this.getTemplate().pack();
            this.getTemplate().render();
        } catch (Exception ex) {
            System.out.print("Errors--->" + ex);
        }
    }
}
