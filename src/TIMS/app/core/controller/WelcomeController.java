/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.core.controller;

import TIMS.app.auth.controller.LoginController;
import TIMS.app.core.model.MenuModel;
import TIMS.app.template.AbstractTimsTemplate;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public final class WelcomeController extends BaseController {

    protected static MenuModel menuModel;
    private static WelcomeController wc;
    private static AbstractTimsTemplate template;

    public WelcomeController() {
        this.executeTemplate();
    }

    public MenuModel getMenuModel() {
        if (menuModel == null) {
            menuModel = new MenuModel();
        }
        return menuModel;
    }

    public void setMenuModel(MenuModel menuModel) {
        WelcomeController.menuModel = menuModel;
    }

    public AbstractTimsTemplate getTemplate() {
        if (WelcomeController.template == null) {
            WelcomeController.template = this.getConfig().getMainTemplate();
        }
        return WelcomeController.template;
    }

    /**
     * Singleton pattern is used
     *
     * @return WelcomeController
     */
    public static WelcomeController getInstance() {
        if (WelcomeController.wc == null) {
            WelcomeController.wc = new WelcomeController();
        }
        return WelcomeController.wc;
    }

    protected void setMainMenuBar() {
        this.getTemplate().setMainMenuBar(this.getMenuModel().getMenuBarByMenyName("Main Menu"));
        this.getTemplate().render();

    }

    @Override
    public void execute() {
        if (this.getUserManager().getUser() == null) {
            new LoginController();
        } else {
            this.setMainMenuBar();
            this.getMainPanel().removeAll();
        }

    }
}
