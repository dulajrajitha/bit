/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.controller.action;

import TIMS.app.core.controller.action.BaseAction;
import TIMS.product.controller.ViewProductController;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class ViewProductAction extends BaseAction{

    @Override
    public void execute(ActionEvent e) {
        try {
            ViewProductController viewProductController = new ViewProductController();
            viewProductController.execute();
        } catch (Exception ex) {
            System.out.print("Error----->" + ex);
        }
    }
    
}
