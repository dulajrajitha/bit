/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.auth.controller.action;

import TIMS.app.core.controller.action.BaseAction;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class LogOutAction extends BaseAction{

    @Override
    public void execute(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Log out");
    }
    
}
