/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.sales.controller.action;

import TIMS.app.core.controller.action.BaseAction;
import TIMS.sales.controller.AddSalesController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Damith
 */
public class AddSalesAction extends BaseAction{

    @Override
    public void execute(ActionEvent e) {
        try {
            AddSalesController addSalesController = new AddSalesController();
            addSalesController.execute();
        } catch (Exception ex) {
            System.out.print("Error----->" + ex);
        }
    }
    
}
