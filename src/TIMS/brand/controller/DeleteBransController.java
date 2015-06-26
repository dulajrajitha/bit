/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.brand.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.brand.model.BrandModel;
import java.util.ArrayList;

/**
 *
 * @author Damith
 */
public class DeleteBransController extends BaseController {

    private ArrayList<Integer> brandIds;
    protected BrandModel brandModel;

    public ArrayList<Integer> getBrandIds() {
        if (this.brandIds == null) {
            this.brandIds = new ArrayList<Integer>();
        }
        return brandIds;
    }

    public void setBrandIds(ArrayList<Integer> brandIds) {
        this.brandIds = brandIds;
    }

    public BrandModel getBrandModel() {
        if (this.brandModel == null) {
            this.brandModel = new BrandModel();
        }
        return brandModel;
    }

    public void setBrandModel(BrandModel brandModel) {
        this.brandModel = brandModel;
    }

    @Override
    public void execute() {
    }

    public int deleteBrands() {
        return this.getBrandModel().deleteBrands(this.getBrandIds());
    }
}
