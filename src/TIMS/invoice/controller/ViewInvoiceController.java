/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.invoice.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.invoice.view.InvoiceDetails;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

/**
 *
 * @author Damith
 */
public class ViewInvoiceController extends BaseController{

    public ViewInvoiceController() {
    }

    public ViewInvoiceController(ActionEvent e) {
        super(e);
    }
    
    @Override
    public void execute() {
        
        try {
            this.setViewInvoiceScreen();
        } catch (Exception ex) {
            System.out.print("Errors--->" + ex);
        }
    }
    
    private void setViewInvoiceScreen() {
        try {
            InvoiceDetails invoiceDetail = new InvoiceDetails();
            this.getMainPanel().removeAll();
            this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
            this.getMainPanel().add(invoiceDetail);
            this.getTemplate().pack();
            this.getTemplate().render();
        } catch (Exception ex) {
            System.out.print("Errors--->" + ex);
        }
    }
    
    
}
