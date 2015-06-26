/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.template;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public interface TimsTemplateInterface {
    public JPanel getMainPanel();
    public JFrame getMainFrame();
    public JMenuBar getMainMenuBar();
    public void setMainPanel(JPanel panel);
    public void setMainMenuBar(JMenuBar menuBar);
}
