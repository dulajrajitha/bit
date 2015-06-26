/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.supplier.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.supplier.dto.SupplierDto;
import TIMS.supplier.view.SupplierForm;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

/**
 *
 * @author Damith
 */
public class AddSupplierController extends BaseController {
    
    SupplierForm supplierForm = null;
    
    /**
     * 
     * @return SupplierForm
     */
    public SupplierForm getSupplierForm() {
        if (this.supplierForm == null) {
            this.supplierForm = new SupplierForm();
        }
        return supplierForm;
    }
    
    public void setSupplierForm(SupplierForm supplierForm) {
        this.supplierForm = supplierForm;
    }

    public AddSupplierController(ActionEvent e) {
        super(e);
    }
    
    public AddSupplierController() {
        
    }
    
    public AddSupplierController(SupplierDto supplierDto) {
        
        this.getSupplierForm().setCity(supplierDto.getCity());        
        this.getSupplierForm().setEmail(supplierDto.getEmail());
        this.getSupplierForm().setFax(supplierDto.getFax());
        this.getSupplierForm().setMobile(supplierDto.getMobile());
        this.getSupplierForm().setName(supplierDto.getName());
        this.getSupplierForm().setOtherName(supplierDto.getOtherName());
        this.getSupplierForm().setPobox(supplierDto.getPobox());
        this.getSupplierForm().setStreet(supplierDto.getStreet());
        this.getSupplierForm().setTel(supplierDto.getTel());
        this.getSupplierForm().setCode(supplierDto.getCode());
        
    }
    
    @Override
    public void execute() {
        try {
            this.setAddSupplierScreen();
        } catch (Exception ex) {
            System.out.print("Errors--->" + ex);
        }
        
    }
    
    private void setAddSupplierScreen() {
        try {
            
            this.getMainPanel().removeAll();
            this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
            this.getMainPanel().add(this.getSupplierForm());
            this.getTemplate().pack();
            this.getTemplate().render();
        } catch (Exception ex) {
            System.out.print("Errors--->" + ex);
        }
        
    }
//    changes to identify version
}
