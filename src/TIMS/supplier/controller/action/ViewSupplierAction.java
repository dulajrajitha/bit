/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.supplier.controller.action;

import TIMS.app.core.controller.action.BaseAction;
import TIMS.supplier.controller.ViewSupplierController;
import java.awt.event.ActionEvent;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class ViewSupplierAction extends BaseAction{

    @Override
    public void execute(ActionEvent e) {
        ViewSupplierController vuc= new ViewSupplierController();
        vuc.execute();
    }
    
}
