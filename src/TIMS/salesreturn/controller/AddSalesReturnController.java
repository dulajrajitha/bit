/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.salesreturn.controller;

import TIMS.app.core.controller.BaseController;
//import TIMS.salesreturn.dto.CustomerDto;
import TIMS.salesreturn.view.SalesReturn;
import TIMS.salesreturn.view.SalesReturnDetails;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

/**
 *
 * @author Sitahra Gunawardana
 */
public class AddSalesReturnController extends BaseController {

    SalesReturn form = null;

    public SalesReturn getForm() {
        if (this.form == null) {
            this.form = new SalesReturn();
        }
        return form;
    }

    public void setForm(SalesReturn form) {
        this.form = form;
    }

    public AddSalesReturnController() {
    }

    public AddSalesReturnController(ActionEvent e) {
        super(e);
    }

//    public AddSalesReturnController(CustomerDto customerDto) {
//
//        System.out.println("customerDto------->" + customerDto.getCode());
//        this.getForm().setCode(customerDto.getCode());
//        this.getForm().setCity(customerDto.getCity());
//        this.getForm().setEmail(customerDto.getEmail());
//        this.getForm().setFax(customerDto.getFax());
//        this.getForm().setMobile(customerDto.getMobile());
//        this.getForm().setName(customerDto.getName());
//        this.getForm().setOther(customerDto.getOther());
//        this.getForm().setOtherName(customerDto.getOtherName());
//        this.getForm().setPoBox(customerDto.getPobox());
//        this.getForm().setStreet(customerDto.getStreet());
//        this.getForm().setTelephone(customerDto.getTel());
//        this.getForm().setType(customerDto.getType());
//    }

    @Override
    public void execute() {
        try {
            this.setAddSalesReturnScreen();
        } catch (Exception ex) {
            System.out.print("Errors--->" + ex);
        }
    }

    private void setAddSalesReturnScreen() {

        try {
            SalesReturnDetails form = new SalesReturnDetails();
            this.getMainPanel().removeAll();
            this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
            this.getMainPanel().add(this.getForm());
            this.getTemplate().pack();
            this.getTemplate().render();
                    
        } catch (Exception ex) {
            System.out.print("Errors--->" + ex);
        }
    }
}
