/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.auth.model;

import TIMS.app.auth.dao.LoginDao;
import TIMS.app.lib.User;
import TIMS.app.lib.hbm.TimsUser;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class LoginModel {

    protected LoginDao loginDao;
    private boolean login;

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public LoginDao getLoginDao() {
        if (loginDao == null) {
            loginDao = new LoginDao();
        }
        return loginDao;
    }

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    public User checkLogin(String userName, String password) {
        TimsUser tu;
        try {
            tu = this.getLoginDao().getUserByUserName(userName);
        } catch (Exception ex) {
            Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
            tu =null;
        }
        User user = new User(tu);
        this.setLogin(user.checkPassword(password));
        return user;
    }
}
