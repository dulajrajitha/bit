/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.config;

import TIMS.app.template.AbstractTimsTemplate;
import TIMS.app.template.TimsTemplate;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class Config {
    protected JFrame mainTemplate;
    protected JPanel mainPanel;
    private static Config config;

    private Config() {
        
    }
    

    public JPanel getMainPanel() {
        if(mainPanel==null){
            mainPanel =  this.getMainTemplate().getMainPanel();
        }
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public AbstractTimsTemplate getMainTemplate() {
        if(mainTemplate==null){
            mainTemplate = new TimsTemplate();
        }
        return (AbstractTimsTemplate) mainTemplate;
    }

    public void setMainTemplate(JFrame mainTemplate) {
        this.mainTemplate = mainTemplate;
    }
    
    public static Config getConfig(){
        if(Config.config== null){
            Config.config = new Config();
        }
        return Config.config;
    }
    
    public boolean isSecured(){
        return false;
    }
}
