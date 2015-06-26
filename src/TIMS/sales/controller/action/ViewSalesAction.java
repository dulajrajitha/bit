/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.sales.controller.action;

import TIMS.app.core.controller.action.BaseAction;
import TIMS.invoice.controller.ViewInvoiceController;
import TIMS.sales.controller.ViewSalesController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Damith
 */
public class ViewSalesAction extends BaseAction {

    @Override
    public void execute(ActionEvent e) {
        try {
            ViewSalesController viewSalesController = new ViewSalesController();
            viewSalesController.execute();
        } catch (Exception ex) {
            System.out.print("Error----->" + ex);
        }
    }
    
        }
