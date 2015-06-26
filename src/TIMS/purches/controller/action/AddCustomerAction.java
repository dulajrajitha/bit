/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.purches.controller.action;

import TIMS.app.core.controller.action.BaseAction;
import TIMS.customer.controller.AddCustomerController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class AddCustomerAction extends BaseAction {

    @Override
    public void execute(ActionEvent e) {
        try {
            AddCustomerController customerController = new AddCustomerController();
            customerController.execute();
        } catch (Exception ex) {
            System.out.print("Error----->" + ex);
        }
    }
}
