/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.purches.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.customer.dto.CustomerDto;
import TIMS.customer.view.CustomerForm;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

/**
 *
 * @author Sithara Gunawardana
 */
public class AddPurchaseController extends BaseController {

    CustomerForm form = null;

    public CustomerForm getForm() {
        if (this.form == null) {
            this.form = new CustomerForm();
        }
        return form;
    }

    public void setForm(CustomerForm form) {
        this.form = form;
    }

    public AddPurchaseController() {
    }

    public AddPurchaseController(ActionEvent e) {
        super(e);
    }

    public AddPurchaseController(CustomerDto customerDto) {

        System.out.println("customerDto------->" + customerDto.getCode());
        this.getForm().setCode(customerDto.getCode());
        this.getForm().setCity(customerDto.getCity());
        this.getForm().setEmail(customerDto.getEmail());
        this.getForm().setFax(customerDto.getFax());
        this.getForm().setMobile(customerDto.getMobile());
        this.getForm().setName(customerDto.getName());
        this.getForm().setOther(customerDto.getOther());
        this.getForm().setOtherName(customerDto.getOtherName());
        this.getForm().setPoBox(customerDto.getPobox());
        this.getForm().setStreet(customerDto.getStreet());
        this.getForm().setTelephone(customerDto.getTel());
        this.getForm().setType(customerDto.getType());
    }

    @Override
    public void execute() {
        try {
            this.setAddCustomerScreen();
        } catch (Exception ex) {
            System.out.print("Errors--->" + ex);
        }
    }

    private void setAddCustomerScreen() {

        try {
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
