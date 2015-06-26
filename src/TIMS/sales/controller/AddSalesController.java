/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.sales.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.sales.dto.SalesDto;
import TIMS.sales.view.SalesForm;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

/**
 *
 * @author Damith
 */
public class AddSalesController extends BaseController{

     SalesForm form = null;

    public SalesForm getForm() {
        if (this.form == null) {
            this.form = new SalesForm();
        }
        return form;
    }

    public void setForm(SalesForm form) {
        this.form = form;
    }
    public AddSalesController(){
        
    }
    public AddSalesController(ActionEvent e){
        super(e);
    }
    public AddSalesController(SalesDto salesDto) {

        System.out.println("salesDto------->" + salesDto.getCode());
    }

    
    
    @Override
    public void execute() {
        try{
            this.setAddSalesScreen();
        }catch(Exception ex){
            System.out.print("Errors--->"+ex);
        }
    }

    private void setAddSalesScreen() {
        try{
            SalesForm salesForm = new SalesForm();
            this.getMainPanel().removeAll();
            this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
            this.getMainPanel().add(salesForm);
            this.getTemplate().pack();
            this.getTemplate().render();
        }catch(Exception ex){
            System.out.print("Errors--->"+ex);
        }
    }
    
    
}
