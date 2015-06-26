/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.auth.controller;

import TIMS.app.auth.model.UserModel;
import TIMS.app.core.controller.BaseController;
import java.util.ArrayList;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class DeleteUserController extends BaseController{

    private ArrayList<Integer> userIds;
    protected UserModel userModel;
    
    @Override
    public void execute() {
        
    }

    public ArrayList<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(ArrayList<Integer> userIds) {
        this.userIds = userIds;
    }

    public UserModel getUserModel() {
        if(userModel == null){
            userModel = new UserModel();
        }
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
    
    public int deleteUsers(){
        return this.getUserModel().deleteUsers(this.getUserIds());
    }
}
