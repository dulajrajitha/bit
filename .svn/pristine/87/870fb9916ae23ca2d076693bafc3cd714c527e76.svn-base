/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.supplier.model;

import TIMS.app.lib.hbm.TimsSupplier;
import TIMS.supplier.dao.SupplierDao;
import TIMS.supplier.dto.SupplierComboItem;
import TIMS.supplier.dto.SupplierDto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Damith
 */
public class SupplierModel {

    protected SupplierDao supplierDao;

    /**
     *
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

    public TimsSupplier saveSupplier(SupplierDto supplierDto) {
        TimsSupplier supplier;
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

        if (supplierDto.getCode() == null) {
            supplier = this.getSupplierDao().saveSupplier(supplier);
        } else {
            supplier.setCode(supplierDto.getCode());
            supplier = this.getSupplierDao().updateSupplier(supplier);
        }

        return supplier;

    }

    public TimsSupplier getSupplierByCode(Integer code) {
        return this.getSupplierDao().getSupplierByCode(code);
    }

    public DefaultTableModel loadSuppliesData() {

        List data = this.getSupplierDao().getAllSuppliers();
        Object columnNames[] = {"Select", "Code", "Name", "Othrer Name", "Telephone", "Mobile", "Pobox", "Email", "Street", "City", "Fax"};

        Object rowData[][] = new Object[data.size()][columnNames.length];

        for (int i = 0; i < data.size(); i++) {
            TimsSupplier suppliers = (TimsSupplier) data.get(i);
            Object o[] = this.getDataRow(suppliers);
            rowData[i] = o;
        }


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

    public int deleteSuppliers(ArrayList<Integer> supplierIds) {
        int count = 0;
        for (Integer supplierId : supplierIds) {
            count = count + this.getSupplierDao().deleteSupplierById(supplierId);

        }
        return count;
    }

    public List getSupplierList() {
        return this.getSupplierDao().getAllSuppliers();
    }

    public SupplierComboItem[] getSupplierComboItem() {
        List supplierList = this.getSupplierList();
        SupplierComboItem comboItem[] = new SupplierComboItem[supplierList.size()];
        int i = 0;
        for (Object object : supplierList) {
            comboItem[i++] = new SupplierComboItem((TimsSupplier) object);
        }
        return comboItem;
    }
}
