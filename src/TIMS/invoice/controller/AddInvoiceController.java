/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.invoice.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.invoice.view.InvoiceForm;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

/**
 *
 * @author Damith
 */
public class AddInvoiceController extends BaseController {

    public AddInvoiceController() {
    }

    public AddInvoiceController(ActionEvent e) {
        super(e);
    }

    @Override
    public void execute() {
        try {
            this.setAddInvoiceScreen();
        } catch (Exception ex) {
            System.out.print("Errors--->" + ex);
        }
    }

    private void setAddInvoiceScreen() {
        try {
            InvoiceForm invoiceForm = new InvoiceForm();
            this.getMainPanel().removeAll();
            this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
            this.getMainPanel().add(invoiceForm);
            this.getTemplate().pack();
            this.getTemplate().render();
        } catch (Exception ex) {
            System.out.print("Errors--->" + ex);
        }
    }
}
