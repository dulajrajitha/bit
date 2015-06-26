/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.brand.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.brand.dto.BrandDto;
import TIMS.brand.model.BrandModel;
import TIMS.brand.view.BrandDetails;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author Damith
 */
public class ViewBrandController extends BaseController {

    protected BrandDetails brandDetails = null;
    protected TableModel tableModel = null;
    protected BrandModel model = null;

    public ViewBrandController() {
        
    }

    public BrandDetails getBrandDetails() {
        if (this.brandDetails == null) {
            this.brandDetails = new BrandDetails();
        }
        return brandDetails;
    }

    public void setBrandDetails(BrandDetails brandDetails) {
        this.brandDetails = brandDetails;
    }

    public BrandModel getModel() {
        if (this.model == null) {
            this.model = new BrandModel();
        }
        return model;
    }

    public void setModel(BrandModel model) {
        this.model = model;
    }

    public TableModel getTableModel() {
        if (this.tableModel == null) {
            this.tableModel = this.loadBransTableData();
        }
        return tableModel;
    }

    public void setTableModel(TableModel tableModel) {
        this.tableModel = tableModel;
    }

    public ViewBrandController(ActionEvent e) {
        super(e);
    }

    @Override
    public void execute() {
        this.viewBrandsList();
    }

    private void viewBrandsList() {
        this.getMainPanel().removeAll();
        this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
        BrandDetails list = this.getBrandDetails();
        this.bindDoubleClickToEventToTable();
        list.getBransTB().setModel(this.getTableModel());
        this.getMainPanel().add(list);
        this.getTemplate().pack();
        this.getTemplate().render();
    }

    private void bindDoubleClickToEventToTable() {

        JTable table = this.getBrandDetails().getBransTB();

        table.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {


                if (e.getClickCount() == 2) {
                    JTable tablee = (JTable) e.getSource();
                    int row = tablee.getSelectedRow();
                    Integer code = (Integer) tablee.getModel().getValueAt(row, 1);
                    String name = tablee.getModel().getValueAt(row, 2).toString();
                    String description = (String) tablee.getModel().getValueAt(row, 3);
                    String others = (String) tablee.getModel().getValueAt(row, 4);


                    BrandDto sdto = new BrandDto();
                    sdto.setCode(code);
                    sdto.setName(name);
                    sdto.setDescription(description);
                    sdto.setOther(others);


                    (new AddBrandController(sdto)).execute();
                }
            }
        });

    }

    private TableModel loadBransTableData() {
        return this.getModel().loadBrandsData();
    }
}
