/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.sales.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.invoice.view.InvoiceDetails;
import TIMS.sales.view.SalesForm;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

/**
 *
 * @author Sithara Gunawardana
 */
public class ViewSalesController extends BaseController {
   public ViewSalesController(ActionEvent e) {
        super(e);
    }

    public ViewSalesController() {
       
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
            SalesForm salesForm = new SalesForm();
            this.getMainPanel().removeAll();
            this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
            this.getMainPanel().add(salesForm);
            this.getTemplate().pack();
            this.getTemplate().render();
        } catch (Exception ex) {
            System.out.print("Errors--->" + ex);
        }
    }
}
