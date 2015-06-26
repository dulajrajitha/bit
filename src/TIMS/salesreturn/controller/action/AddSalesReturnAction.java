/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.salesreturn.controller.action;

import TIMS.app.core.controller.action.BaseAction;
import TIMS.salesreturn.controller.AddSalesReturnController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Sithara Gunawardana
 */
public class AddSalesReturnAction extends BaseAction {

    @Override
    public void execute(ActionEvent e) {
        try {
            AddSalesReturnController salesReturnController = new AddSalesReturnController();
            salesReturnController.execute();
        } catch (Exception ex) {
            System.out.print("Error----->" + ex);
        }
    }
}
