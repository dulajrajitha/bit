/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.invoice.controller.action;

import TIMS.app.core.controller.action.BaseAction;
import TIMS.invoice.controller.AddInvoiceController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class AddInvoiceAction extends BaseAction{

    @Override
    public void execute(ActionEvent e) {
        try {
            AddInvoiceController addInvoiceController = new AddInvoiceController();
            addInvoiceController.execute();
        } catch (Exception ex) {
            System.out.print("Error----->" + ex);
        }
    }
    
}
