/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.invoice.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.app.lib.hbm.TimsInvoice;
import TIMS.invoice.view.AddItemsPanel;
import TIMS.invoice.view.InvoiceForm;
import javax.swing.BoxLayout;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class AddInvoiceItemsController extends BaseController {

    private TimsInvoice invoice;

    public TimsInvoice getInvoice() {
        return invoice;
    }

    public void setInvoice(TimsInvoice invoice) {
        this.invoice = invoice;
    }

    public AddInvoiceItemsController(TimsInvoice invoice) {
        this.invoice = invoice;
        execute();
    }

    @Override
    public void execute() {
        try {
            AddItemsPanel panel = new AddItemsPanel(this.getInvoice());
            this.getMainPanel().removeAll();
            this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
            this.getMainPanel().add(panel);
            this.getTemplate().pack();
            this.getTemplate().render();
        } catch (Exception ex) {
            System.out.print("Errors--->" + ex);
        }
    }
}
