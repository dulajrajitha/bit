/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.supplier.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.supplier.model.SupplierModel;
import java.util.ArrayList;

/**
 *
 * @author Damith
 */
public class DeleteSuppliersController extends BaseController {

    private ArrayList<Integer> supplierIds;
    protected SupplierModel model;

    public SupplierModel getModel() {
        if (this.model == null) {
            this.model = new SupplierModel();
        }
        return model;
    }

    public void setModel(SupplierModel model) {
        this.model = model;
    }

    public ArrayList<Integer> getSupplierIds() {
        if (this.supplierIds == null) {
            this.supplierIds = new ArrayList<Integer>();
        }
        return supplierIds;
    }

    public void setSupplierIds(ArrayList<Integer> supplierIds) {
        this.supplierIds = supplierIds;
    }

    @Override
    public void execute() {
    }

    public int deleteSuppliers() {
        return this.getModel().deleteSuppliers(this.getSupplierIds());
    }
}
