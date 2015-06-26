/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.salesreturn.controller.action;

import TIMS.salesreturn.controller.ViewSalesReturnController;
import TIMS.app.core.controller.action.BaseAction;
import java.awt.event.ActionEvent;

/**
 *
 * @author Sithara Gunawardana
 */
public class ViewSalesReturnAction extends BaseAction{

    @Override
    public void execute(ActionEvent e) {
        try {
        ViewSalesReturnController controller = new ViewSalesReturnController();
        controller.execute();
        } catch (Exception ex) {
            System.out.print("Error----->" + ex);
        }
    }
   
}
