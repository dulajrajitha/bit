/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.controller.action;

import TIMS.app.core.controller.action.BaseAction;
import TIMS.product.controller.AddProductController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class AddProductAction extends BaseAction {

    @Override
    public void execute(ActionEvent e) {
        try {
            AddProductController addProductController = new AddProductController();
            addProductController.execute();
        } catch (Exception ex) {
            System.out.print("Error----->" + ex);
        }
    }
}
