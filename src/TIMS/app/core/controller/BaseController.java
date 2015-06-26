/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.core.controller;

import TIMS.app.config.Config;
import TIMS.app.config.Routes;
import TIMS.app.lib.UserManager;
import TIMS.app.template.AbstractTimsTemplate;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public abstract class BaseController {

    protected Config config;
    protected JFrame view;
    protected Routes routes;
    protected ActionEvent e;
    protected UserManager userManager;
    protected Component c;
    private AbstractTimsTemplate template;
    
    public BaseController() {
     
    }

    
    public BaseController(ActionEvent e) {
        this.e = e;
        this.executeTemplate();
    }

    public BaseController(ActionEvent e, Component c) {
        this.e=e;
        this.c=c;
    }

    public JFrame getView() {
        return view;
    }

    public void setView(JFrame view) {
        this.view = view;
    }

    public Routes getRoutes() {
        if (routes == null) {
            routes = Routes.getRoutes();
        }
        return routes;
    }

    public void setRoutes(Routes routes) {
        this.routes = routes;
    }

    public Config getConfig() {
        if (config == null) {
            config = Config.getConfig();
        }
        return config;
    }

    public UserManager getUserManager() {
        if(this.userManager == null){
            this.userManager = UserManager.getUserManager();
        }
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public ActionEvent getE() {
        return e;
    }

    public void setE(ActionEvent e) {
        this.e = e;
    }
    
    public abstract void execute();
    public boolean preExecute(){
        return true;
    }
    public void postExecute(){
       
    }
       
    protected void executeTemplate(){
        if(this.preExecute()){
            this.execute();
        }
        this.postExecute();
    }
    
        public AbstractTimsTemplate getTemplate() {
        if (this.template == null) {
            this.template = this.getConfig().getMainTemplate();
        }
        return this.template;
    }
    
    public void setTemplate(AbstractTimsTemplate template) {
        this.template = template;
    }
    /**
     *
     * @return
     */
    protected JPanel getMainPanel() {
        return this.getTemplate().getMainPanel();
    }
    
    protected JScrollPane getMainScrollPane(){
        return this.getTemplate().getMainScrollPanel();
    }
}
