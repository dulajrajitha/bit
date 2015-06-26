/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.lib;

import TIMS.app.lib.hbm.TimsUser;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class User {
    private TimsUser user;

    public User(TimsUser tu) {
        this.user = tu;
    }

    public TimsUser getUser() {
        return user;
    }

    public void setUser(TimsUser user) {
        this.user = user;
    }
    
    private String generatePassword(String password){
        return password;
    }
    public String generatePassword(){
        return this.generatePassword(this.getUser().getPassword());
    }
    
    public boolean checkPassword(String password){
        boolean flag= false;
        try {
            flag = this.getUser().getPassword().equals(this.generatePassword(password));
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }
}
