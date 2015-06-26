/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.core.controller.action;

import java.awt.event.ActionEvent;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public abstract class BaseAction implements BaseActionInterface{


    @Override
    public abstract void execute(ActionEvent e);

    @Override
    public void actionPerformed(ActionEvent e){
        this.execute(e);
    }
}
