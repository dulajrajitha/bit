/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.brand.model;

import TIMS.app.lib.hbm.TimsBarnd;
import TIMS.brand.dao.BrandDao;
import TIMS.brand.dto.BrandComboItem;
import TIMS.brand.dto.BrandDto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Damith
 */
public class BrandModel {

    protected BrandDao brandDao = null;

    public BrandDao getBrandDao() {
        if (this.brandDao == null) {
            this.brandDao = new BrandDao();
        }
        return brandDao;
    }

    public void setBrandDao(BrandDao brandDao) {
        this.brandDao = brandDao;
    }

    public TimsBarnd saveBrand(BrandDto brandDto) {

        TimsBarnd barnd = null;
        TimsBarnd newBarnd = null;
        try {

            if (brandDto.getCode() == null) {
                barnd = new TimsBarnd();
            } else {
                barnd = this.getBrandsByCode(brandDto.getCode());
            }


            barnd.setName(brandDto.getName());
            barnd.setDescription(brandDto.getDescription());
            barnd.setOther(brandDto.getOther());

            System.out.println("brandDto.getCode()------>" + brandDto.getCode());
            if (brandDto.getCode() == null) {
                newBarnd = this.getBrandDao().saveBrand(barnd);
            } else {
                barnd.setCode(brandDto.getCode());
                newBarnd = this.getBrandDao().updateBrand(barnd);
            }
            System.out.println("newBarnd.getCode()------>" + newBarnd.getCode());
        } catch (Exception e) {
            System.out.println("error from brand model save---->" + e);
        }

        return newBarnd;
    }

    public TimsBarnd getBrandsByCode(Integer code) {
        TimsBarnd brandsByCode = null;
        try {
            brandsByCode = this.getBrandDao().getBrandsByCode(code);
        } catch (Exception e) {
            System.out.println("error form getBransbycode in brand model--->" + e);
        }
        return brandsByCode;
    }

    public TableModel loadBrandsData() {
        List data = this.getBrandDao().getAllBrands();
        Object columnNames[] = {"Select", "Code", "Name", "Description", "Others"};

        Object rowData[][] = new Object[data.size()][columnNames.length];

        for (int i = 0; i < data.size(); i++) {
            TimsBarnd timsBarnd = (TimsBarnd) data.get(i);
            Object o[] = this.getDataRow(timsBarnd);
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

    private Object[] getDataRow(TimsBarnd timsBarnd) {
        Object o[] = {false, timsBarnd.getCode(), timsBarnd.getName(), timsBarnd.getDescription(), timsBarnd.getOther()};
        return o;
    }

    public int deleteBrands(ArrayList<Integer> brandIds) {
        int count = 0;
        for (Integer brandid : brandIds) {
            count = count + this.getBrandDao().deleteBrandById(brandid);

        }
        return count;
    }
    
    
    public List getAllBrandsList() {
        return this.getBrandDao().getAllBrands();
    }

    public BrandComboItem[] getBrandComboItem() {
        List brandList = this.getAllBrandsList();
        BrandComboItem brandComboItem[] = new BrandComboItem[brandList.size()];
        int i = 0;
        for (Object object : brandList) {
            brandComboItem[i++] = new BrandComboItem((TimsBarnd) object);
        }
        return brandComboItem;
    }
}

