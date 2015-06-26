/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.auth.controller;

import TIMS.app.auth.dto.UserDto;
import TIMS.app.auth.model.UserModel;
import TIMS.app.core.controller.BaseController;
import TIMS.app.lib.hbm.TimsUser;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class AddUserController extends BaseController {

    protected UserModel userModel;
    protected UserDto user;
    protected ViewUserController vuc;

    public AddUserController(UserDto userDto) {
        this.user = userDto;
    }

    public UserModel getUserModel() {
        if (this.userModel == null) {
            this.userModel = new UserModel();
        }
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    @Override
    public void execute() {
        TimsUser tu = this.getUserModel().saveUser(this.getUser());
        if (tu.getId() > 0) {
            JOptionPane.showMessageDialog(null, "User saved successfully");
            UserDto ud = new UserDto(tu);
            
            AddUserFormController userFormController = new AddUserFormController(ud);
            userFormController.execute();
        } else {
            JOptionPane.showMessageDialog(null, "New user account could not be created at this time.");
        }
    }
}
