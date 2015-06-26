/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.purches.controller.action;

import TIMS.purches.controller.ViewPurchaseController;
import TIMS.app.core.controller.action.BaseAction;
import java.awt.event.ActionEvent;

/**
 *
 * @author Sithara Gunawardana
 */
public class ViewPurchesAction extends BaseAction{

    @Override
    public void execute(ActionEvent e) {
        try {
        ViewPurchaseController controller = new ViewPurchaseController();
        controller.execute();
        } catch (Exception ex) {
            System.out.print("Error----->" + ex);
        }
    }
   
}
