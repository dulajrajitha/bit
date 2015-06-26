/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.invoice.view.partial;

import TIMS.app.lib.hbm.TimsProductBrand;
import TIMS.product.dto.ProductBarndComboItem;
import TIMS.product.dto.ProductComboItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.JComboBox;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class ProductChangeListener implements ActionListener {

    private ProductSelecter productSelecter;

    public ProductSelecter getProductSelecter() {
        return productSelecter;
    }

    public void setProductSelecter(ProductSelecter productSelecter) {
        this.productSelecter = productSelecter;
    }

    public ProductChangeListener(ProductSelecter productSelecter) {
        this.productSelecter = productSelecter;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox) e.getSource();
        ProductComboItem productComboItem = (ProductComboItem) comboBox.getSelectedItem();
        System.out.println(productComboItem);
        Set productBrands = productComboItem.getTimsProduct().getTimsProductBrands();
        System.out.println("set"+ productBrands.toString());
        ProductBarndComboItem[] barndComboItems = new ProductBarndComboItem[productBrands.size()];
        int i = 0;
        for (Object productBrand : productBrands) {
            barndComboItems[i] = new ProductBarndComboItem((TimsProductBrand) productBrand);
            i++;
        }

        getProductSelecter().setProductBrands(barndComboItems);
    }
}
