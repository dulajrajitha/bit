/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.auth.controller.action;

import TIMS.app.auth.controller.ViewUserController;
import TIMS.app.core.controller.action.BaseAction;
import java.awt.event.ActionEvent;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class ViewUserAction extends BaseAction{

    @Override
    public void execute(ActionEvent e) {
        ViewUserController vuc= new ViewUserController();
        vuc.execute();
    }
    
}
