/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SupplierForm.java
 *
 * Created on Jun 5, 2014, 10:17:54 PM
 */
package TIMS.supplier.view;

import TIMS.supplier.controller.SaveSupplierController;
import TIMS.supplier.dto.SupplierDto;

/**
 *
 * @author Damith
 */
public class SupplierForm extends javax.swing.JPanel {

    private Integer code;

    public String getCity() {
        return Sup_City.getText();
    }

    public void setCity(String city) {
        this.Sup_City.setText(city);
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getEmail() {
        return this.Sup_Email.getText();
    }

    public void setEmail(String email) {
        this.Sup_Email.setText(email);
    }

    public Integer getFax() {
        return Integer.parseInt(this.Sup_Fax.getText());
    }

    public void setFax(Integer fax) {
        this.Sup_Fax.setText(String.valueOf(fax));

    }

    public String getOtherName() {
        return this.Sup_OtherName.getText();
    }

    public void setOtherName(String otherName) {
        this.Sup_OtherName.setText(otherName);
    }

    public String getPobox() {
        return this.Sup_PoBox.getText();
    }

    public void setPobox(String pobox) {
        this.Sup_PoBox.setText(pobox);
    }

    public String getStreet() {
        return this.Sup_Street.getText();
    }

    public void setStreet(String street) {
        this.Sup_Street.setText(street);
    }

    public Integer getTel() {
        return Integer.parseInt(this.Sup_TelephoneNo.getText());
    }

    public void setTel(Integer tel) {
        this.Sup_TelephoneNo.setText(String.valueOf(tel));
    }

    public Integer getMobile() {
        return Integer.parseInt(this.Sup_Mobile.getText());
    }

    public void setMobile(Integer mobile) {
        this.Sup_Mobile.setText(String.valueOf(mobile));
    }

    public String getName() {
        return this.Sup_FirstName.getText();
    }

    public void setName(String name) {
        this.Sup_FirstName.setText(name);
    }

    /** Creates new form SupplierForm */
    public SupplierForm() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        Sup_FirstName = new javax.swing.JTextField();
        otherName = new javax.swing.JLabel();
        Sup_OtherName = new javax.swing.JTextField();
        pobox = new javax.swing.JLabel();
        Sup_PoBox = new javax.swing.JTextField();
        street = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        Sup_Street = new javax.swing.JTextField();
        Sup_City = new javax.swing.JTextField();
        tel = new javax.swing.JLabel();
        mobile = new javax.swing.JLabel();
        fax = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        Sup_TelephoneNo = new javax.swing.JTextField();
        Sup_Mobile = new javax.swing.JTextField();
        Sup_Fax = new javax.swing.JTextField();
        Sup_Email = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(640, 512));

        jPanel1.setPreferredSize(new java.awt.Dimension(640, 512));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Supplier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        name.setFont(new java.awt.Font("Tahoma", 0, 12));
        name.setText("Name:");

        Sup_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sup_FirstNameActionPerformed(evt);
            }
        });

        otherName.setFont(new java.awt.Font("Tahoma", 0, 12));
        otherName.setText("Other Name:");

        pobox.setFont(new java.awt.Font("Tahoma", 0, 12));
        pobox.setText("POBox:");

        street.setFont(new java.awt.Font("Tahoma", 0, 12));
        street.setText("Street:");

        city.setFont(new java.awt.Font("Tahoma", 0, 12));
        city.setText("City:");

        tel.setFont(new java.awt.Font("Tahoma", 0, 12));
        tel.setText("Tel:");

        mobile.setFont(new java.awt.Font("Tahoma", 0, 12));
        mobile.setText("Mobile:");

        fax.setFont(new java.awt.Font("Tahoma", 0, 12));
        fax.setText("Fax:");

        email.setFont(new java.awt.Font("Tahoma", 0, 12));
        email.setText("Email:");

        Sup_TelephoneNo.setPreferredSize(new java.awt.Dimension(8, 20));

        Sup_Mobile.setPreferredSize(new java.awt.Dimension(8, 20));

        Sup_Email.setPreferredSize(new java.awt.Dimension(8, 20));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name)
                    .addComponent(pobox)
                    .addComponent(street)
                    .addComponent(email)
                    .addComponent(fax)
                    .addComponent(city)
                    .addComponent(tel)
                    .addComponent(mobile)
                    .addComponent(otherName))
                .addGap(67, 67, 67)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Sup_OtherName, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Sup_Street)
                        .addComponent(Sup_Email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sup_Fax, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Sup_Mobile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sup_TelephoneNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sup_City, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Sup_FirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                    .addComponent(Sup_PoBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sup_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Sup_OtherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherName))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pobox)
                    .addComponent(Sup_PoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(street)
                            .addComponent(Sup_Street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(city)
                        .addGap(18, 18, 18)
                        .addComponent(tel)
                        .addGap(18, 18, 18)
                        .addComponent(mobile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fax))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Sup_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Sup_TelephoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Sup_Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Sup_Fax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(email))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Sup_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        save.setFont(new java.awt.Font("Tahoma", 0, 12));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Tahoma", 0, 12));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(save)
                .addGap(29, 29, 29)
                .addComponent(Reset)
                .addGap(61, 61, 61))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(Reset))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setFont(new java.awt.Font("Times New Roman", 1, 12));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jLabel1.setText("Supplier Form");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

    try {
        SupplierDto bean = new SupplierDto();

        bean.setCode(this.getCode());
        bean.setName(Sup_FirstName.getText());
        bean.setOtherName(Sup_OtherName.getText());
        bean.setPobox(Sup_PoBox.getText());
        bean.setStreet(Sup_Street.getText());
        bean.setCity(Sup_City.getText());
        bean.setTel(Sup_TelephoneNo.getText());
        bean.setMobile(Sup_Mobile.getText());
        bean.setFax(Sup_Fax.getText());
        bean.setEmail(Sup_Email.getText());

        SaveSupplierController controller = new SaveSupplierController();

        controller.saveSupplier(bean);
    } catch (Exception e) {
        System.out.print("okkkkkkkkk" + e);
    }



}//GEN-LAST:event_saveActionPerformed

private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
    Sup_FirstName.setText(null);
    Sup_City.setText(null);
    Sup_Email.setText(null);
    Sup_OtherName.setText(null);
}//GEN-LAST:event_ResetActionPerformed

private void Sup_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sup_FirstNameActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_Sup_FirstNameActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JTextField Sup_City;
    private javax.swing.JTextField Sup_Email;
    private javax.swing.JTextField Sup_Fax;
    private javax.swing.JTextField Sup_FirstName;
    private javax.swing.JTextField Sup_Mobile;
    private javax.swing.JTextField Sup_OtherName;
    private javax.swing.JTextField Sup_PoBox;
    private javax.swing.JTextField Sup_Street;
    private javax.swing.JTextField Sup_TelephoneNo;
    private javax.swing.JLabel city;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel mobile;
    private javax.swing.JLabel name;
    private javax.swing.JLabel otherName;
    private javax.swing.JLabel pobox;
    private javax.swing.JButton save;
    private javax.swing.JLabel street;
    private javax.swing.JLabel tel;
    // End of variables declaration//GEN-END:variables
}
