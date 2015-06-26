/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.lib;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class UserManager {
    protected User user;
    private static UserManager manager;

    private UserManager() {
    }
    
    public static UserManager getUserManager(){
        if(UserManager.manager == null){
            UserManager.manager = new UserManager();
        }
        return UserManager.manager;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
