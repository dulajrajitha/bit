/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.controller.action;

import TIMS.app.core.controller.action.BaseAction;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class AddProductToBrandAction extends BaseAction{

    @Override
    public void execute(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "add barnd product action");
    }
    
}
