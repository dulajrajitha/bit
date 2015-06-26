/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.stockreturn.controller.action;

import TIMS.stockreturn.controller.ViewStockReturnController;
import TIMS.app.core.controller.action.BaseAction;
import java.awt.event.ActionEvent;

/**
 *
 * @author Sithara Gunawardana
 */
public class ViewStockReturnAction extends BaseAction{

    @Override
    public void execute(ActionEvent e) {
        try {
        ViewStockReturnController controller = new ViewStockReturnController();
        controller.execute();
        } catch (Exception ex) {
            System.out.print("Error----->" + ex);
        }
    }
   
}
