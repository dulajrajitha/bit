/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.invoice.controller.action;

import TIMS.app.core.controller.action.BaseAction;
import TIMS.invoice.controller.AddInvoiceController;
import TIMS.invoice.controller.ViewInvoiceController;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class ViewInvoiceAction extends BaseAction{

    @Override
    public void execute(ActionEvent e) {
        //JOptionPane.showMessageDialog(null, "view invoice action");
        try {
            ViewInvoiceController viewInvoiceController = new ViewInvoiceController();
            viewInvoiceController.execute();
        } catch (Exception ex) {
            System.out.print("Error----->" + ex);
        }
    }
    
}
