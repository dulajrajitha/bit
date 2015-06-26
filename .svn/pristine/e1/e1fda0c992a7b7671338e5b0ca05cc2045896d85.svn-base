/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.auth.controller;

import TIMS.app.auth.model.LoginModel;
import TIMS.app.auth.view.LoginPanel;
import TIMS.app.core.controller.BaseController;
import TIMS.app.core.controller.WelcomeController;
import TIMS.app.lib.User;
import TIMS.app.lib.hbm.TimsUser;
import TIMS.app.template.AbstractTimsTemplate;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class LoginController extends BaseController {

    private boolean tryToLogin = false;
    protected LoginModel loginModel;
    protected LoginPanel loginForm;
    protected String userName;
    protected String password;

    public LoginPanel getLoginForm() {
        return loginForm;
    }

    public final void setLoginForm(LoginPanel loginForm) {
        this.loginForm = loginForm;
    }

    public LoginController() {
        this.setTryToLogin(false);
        this.executeTemplate();
    }

    public LoginController(ActionEvent evt, LoginPanel loginForm, String userName, String password) {
        this.setTryToLogin(true);
        this.loginForm = loginForm;
        this.userName = userName;
        this.password = password;
        this.executeTemplate();
    }

    public final void setTryToLogin(boolean tryToLogin) {
        this.tryToLogin = tryToLogin;
    }

    public LoginModel getLoginModel() {
        if (loginModel == null) {
            loginModel = new LoginModel();
        }
        return loginModel;
    }

    public boolean isTryToLogin() {
        return tryToLogin;
    }

    public void setLoginModel(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    public LoginController(ActionEvent evt, JPanel loginForm) {
        this.setTryToLogin(true);
        this.setLoginForm((LoginPanel) loginForm);
        this.executeTemplate();
    }

    @Override
    public void execute() {
        if (!this.getConfig().isSecured()) {
            this.getUserManager().setUser(new User(new TimsUser()));
            WelcomeController.getInstance().execute();
        } else {
            if (!this.isTryToLogin()) {
                this.setLoginScreen();
            } else {
                User u = this.getLoginModel().checkLogin(this.userName, this.password);
                if (this.getLoginModel().isLogin()) {

                    this.getUserManager().setUser(u);
                    WelcomeController.getInstance().execute();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password combination");
                }
            }
        }
    }

    private void setLoginScreen() {
        LoginPanel lp = new LoginPanel();
        this.getMainPanel().removeAll();
        this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
        this.getMainPanel().add(lp);
        this.getTemplate().pack();
        this.getTemplate().render();
    }
}
