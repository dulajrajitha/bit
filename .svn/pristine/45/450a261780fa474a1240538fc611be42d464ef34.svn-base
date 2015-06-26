/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.sales.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.sales.dto.SalesDto;
import TIMS.sales.model.SalesModel;

/**
 *
 * @author Damith
 */
public class SaveSalesController extends BaseController {

    protected SalesModel salesModel = null;

    public SalesModel getSalesModel() {
        if (this.salesModel == null) {
            this.salesModel = new SalesModel();
        }
        return salesModel;
    }

    public void setSalesModel(SalesModel salesModel) {
        this.salesModel = salesModel;
    }

    public void saveSales(SalesDto salesDto) {
        this.getSalesModel().saveSales(salesDto);
    }

    @Override
    public void execute() {
    }
}
