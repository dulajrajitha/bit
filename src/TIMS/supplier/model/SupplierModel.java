/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.supplier.model;

import TIMS.app.lib.hbm.TimsSupplier;
import TIMS.supplier.dao.SupplierDao;
import TIMS.supplier.dto.SupplierComboItem;
import TIMS.supplier.dto.SupplierDto;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Damith
 */
public class SupplierModel {

    protected SupplierDao supplierDao;

    /**
     * @return SupplierDao
     */
    public SupplierDao getSupplierDao() {
        if (this.supplierDao == null) {
            this.supplierDao = new SupplierDao();
        }
        return supplierDao;
    }

    public void setSupplierDao(SupplierDao supplierDao) {
        this.supplierDao = supplierDao;
    }

    /**
     * Save or edit the supplier to db via hbm
     *
     * @param supplierDto
     * @return
     */
    public TimsSupplier saveSupplier(SupplierDto supplierDto) {
        TimsSupplier supplier = null;
        TimsSupplier newSupplier = null;

        if (supplierDto.getCode() == null) {
            supplier = new TimsSupplier();
        } else {
            supplier = this.getSupplierByCode(supplierDto.getCode());
        }

        supplier.setName(supplierDto.getName());
        supplier.setOtherName(supplierDto.getOtherName());
        supplier.setCity(supplierDto.getCity());
        supplier.setEmail(supplierDto.getEmail());
        supplier.setFax(supplierDto.getFax());
        supplier.setMobileNo(supplierDto.getMobile());
        supplier.setPobox(supplierDto.getPobox());
        supplier.setStreet(supplierDto.getStreet());
        supplier.setTelephone(supplierDto.getTel());

        /**
         * changed bu dula
         * removed
         */
        /*
        if (supplierDto.getCode() == null) {
            supplier = this.getSupplierDao().saveSupplier(supplier);
        } else {
            supplier.setCode(supplierDto.getCode());
            supplier = this.getSupplierDao().updateSupplier(supplier);
        }

        return supplier;
        */
        /**
         * added by dula
         */
        System.out.println("SupplierDto.getCode()------>" + supplierDto.getCode());
        if (supplierDto.getCode() == null) {
            newSupplier = this.getSupplierDao().saveSupplier(supplier);
        } else {
            supplierDto.setCode(supplierDto.getCode());
            newSupplier = this.getSupplierDao().updateSupplier(supplier);
        }
        System.out.println("newSupplier---code-->" + newSupplier.getCode());
        return newSupplier;
        /**
         * changes ends by dula
         */
    }


    /**
     * Select the Sx object from db using hbm query
     *
     * @param code
     * @return TimsSupplier
     */
    public TimsSupplier getSupplierByCode(Integer code) {
        return this.getSupplierDao().getSupplierByCode(code);
    }

    public DefaultTableModel loadSuppliesData() {

        //query for all the Sx in the db
        List suplierList = this.getSupplierDao().getAllSuppliers();
        Object columnNames[] = {"Select", "Code", "Name", "Othrer Name", "Telephone", "Mobile", "Pobox", "Email", "Street", "City", "Fax"};

        Object rowData[][] = new Object[suplierList.size()][columnNames.length];

        for (int i = 0; i < suplierList.size(); i++) {
            TimsSupplier suppliers = (TimsSupplier) suplierList.get(i);
            Object o[] = this.getDataRow(suppliers);
            rowData[i] = o;
        }


        /**
         * inner class fo create new table model with DB data
         */
        DefaultTableModel model = new DefaultTableModel(rowData, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0 ? true : false;
            }

            @Override
            public Class<?> getColumnClass(int col) {
                switch (col) {
                    case 0:
                        return Boolean.class;
                    case 1:
                        return Integer.class;
                    case 2:
                        return String.class;
                    case 3:
                        return Integer.class;
                    default:
                        return String.class;
                }

            }
        };
        return model;
    }

    private Object[] getDataRow(TimsSupplier suppliers) {
        Object o[] = {false, suppliers.getCode(), suppliers.getName(), suppliers.getOtherName(),
                suppliers.getTelephone(), suppliers.getMobileNo(), suppliers.getPobox(),
                suppliers.getEmail(), suppliers.getStreet(), suppliers.getCity(), suppliers.getFax()};
        return o;
    }

    /**
     *
     * @param supplierIds
     * @return how many deleted
     */
    public int deleteSuppliers(ArrayList<Integer> supplierIds) {
        int count = 0;
        for (Integer supplierId : supplierIds) {
            //delete from the DB using hbm
            count = count + this.getSupplierDao().deleteSupplierById(supplierId);

        }
        return count;
    }

    //for Sx dropDown, get from the DB
    public List getAllSupplierList() {
        return this.getSupplierDao().getAllSuppliers();
    }

    /**
     * return Sx Combo list which has less attributes compared with Sx object
     * @return Sx Combo list
     */
    public SupplierComboItem[] getSupplierComboItem() {
        List supplierList = this.getAllSupplierList();
        SupplierComboItem comboItem[] = new SupplierComboItem[supplierList.size()];
        int i = 0;
        for (Object supplier : supplierList) {
            comboItem[i++] = new SupplierComboItem((TimsSupplier) supplier);
        }
        return comboItem;
    }
}
