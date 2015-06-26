/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.brand.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.app.lib.hbm.TimsBarnd;
import TIMS.brand.dto.BrandDto;
import TIMS.brand.model.BrandModel;

/**
 *
 * @author Damith
 */
public class SaveBrandController extends BaseController {

    protected BrandModel brandModel = null;

    public BrandModel getBrandModel() {
        if (this.brandModel == null) {
            this.brandModel = new BrandModel();
        }
        return brandModel;
    }

    public void setBrandModel(BrandModel brandModel) {
        this.brandModel = brandModel;
    }

    public void saveBeand(BrandDto brandDto) {
        try {
            TimsBarnd saveBrand = this.getBrandModel().saveBrand(brandDto);

            BrandDto dto = new BrandDto();

            dto.setCode(saveBrand.getCode());
            dto.setDescription(saveBrand.getDescription());
            dto.setName(saveBrand.getName());
            dto.setOther(saveBrand.getOther());

            AddBrandController addBrandController = new AddBrandController(dto);
            addBrandController.execute();
        } catch (Exception ex) {
            System.out.println("error form save brand controller--->" + ex);
        }

    }

    @Override
    public void execute() {
    }
}
