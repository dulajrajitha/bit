/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.auth.controller.action;

import TIMS.app.auth.controller.AddUserFormController;
import TIMS.app.core.controller.action.BaseAction;
import java.awt.event.ActionEvent;

/**
 *
 * @author Sithara Gunawardana
 */
public class AddUserAction extends BaseAction{

    @Override
    public void execute(ActionEvent e) {
       AddUserFormController userFormController = new AddUserFormController();
       userFormController.execute();
    }
    
}
