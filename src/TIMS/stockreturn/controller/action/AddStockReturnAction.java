/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.stockreturn.controller.action;

import TIMS.app.core.controller.action.BaseAction;
import TIMS.stockreturn.controller.AddStockReturnController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Sithara Gunawardana
 */
public class AddStockReturnAction extends BaseAction {

    @Override
    public void execute(ActionEvent e) {
        try {
            AddStockReturnController stockReturnController = new AddStockReturnController();
            stockReturnController.execute();
        } catch (Exception ex) {
            System.out.print("Error----->" + ex);
        }
    }
}
