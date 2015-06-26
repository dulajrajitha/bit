/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.customer.controller.action;

import TIMS.customer.controller.ViewCustomerController;
import TIMS.app.core.controller.action.BaseAction;
import java.awt.event.ActionEvent;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class ViewCustomerAction extends BaseAction{

    @Override
    public void execute(ActionEvent e) {
        ViewCustomerController controller = new ViewCustomerController(e);
    }
    
}
