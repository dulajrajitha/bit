/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.supplier.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.app.lib.hbm.TimsSupplier;
import TIMS.supplier.dto.SupplierDto;
import TIMS.supplier.model.SupplierModel;

/**
 *
 * @author Damith
 */
public class SaveSupplierController extends BaseController {

    protected SupplierModel supplierModel = null;

    public SaveSupplierController() {
    }

    public SupplierModel getSupplierModel() {
        if (this.supplierModel == null) {
            this.supplierModel = new SupplierModel();
        }
        return supplierModel;
    }

    public void setSupplierModel(SupplierModel supplierModel) {
        this.supplierModel = supplierModel;
    }

    public void saveSupplier(SupplierDto bean) {
        TimsSupplier saveSupplier = this.getSupplierModel().saveSupplier(bean);

        SupplierDto supplierDto = new SupplierDto();

        System.out.println("saveSupplier.getCode()------>"+saveSupplier.getCode());
        supplierDto.setCode(saveSupplier.getCode());
        supplierDto.setName(saveSupplier.getName());
        supplierDto.setCity(saveSupplier.getCity());
        supplierDto.setEmail(saveSupplier.getEmail());
        supplierDto.setFax(saveSupplier.getFax());
        supplierDto.setMobile(saveSupplier.getMobileNo());
        supplierDto.setOtherName(saveSupplier.getOtherName());
        supplierDto.setPobox(saveSupplier.getPobox());
        supplierDto.setStreet(saveSupplier.getStreet());
        supplierDto.setTel(saveSupplier.getTelephone());

        AddSupplierController addSupplierController = new AddSupplierController(supplierDto);
        addSupplierController.execute();
    }

    @Override
    public void execute() {
    }
}
