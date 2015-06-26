/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.invoice.view.partial;

import TIMS.product.dto.ProductBarndComboItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class BrandChangeListener implements ActionListener {

    private ProductSelecter productSelecter;

    public ProductSelecter getProductSelecter() {
        return productSelecter;
    }

    public void setProductSelecter(ProductSelecter productSelecter) {
        this.productSelecter = productSelecter;
    }

    BrandChangeListener(ProductSelecter productSelecter) {
        this.productSelecter = productSelecter;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox) e.getSource();
        ProductBarndComboItem productBarndComboItem = (ProductBarndComboItem) comboBox.getSelectedItem();
        if (productBarndComboItem != null) {
            getProductSelecter().setSellingPrice(productBarndComboItem.getSellingPrice());
        }
    }
}
