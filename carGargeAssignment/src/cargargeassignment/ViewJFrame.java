/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargargeassignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
 
public class ViewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddissueJFrame
     */
    public ViewJFrame() {
        initComponents();
        insertDataTojTable();
        this.setResizable(false);
        this.deleteBtn.setVisible(false);
        this.updatebtn.setVisible(false);
        this.TextFieldupdate.setVisible(false);
        this.LabelEnterUpdate.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        sreachbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        deleteBtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        TextFieldupdate = new javax.swing.JTextField();
        LabelEnterUpdate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CustomerName", "TelePhone", "CarModel", "CarIdentity", "FixDate", "CompleteTime", "Description"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Select your Option");

        jLabel1.setText("ID");

        TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  <  Back");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("UserMode");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CustomerName", "Telephone", "CarModel,CarIdentity", "FixDate,CompleteTime,Description", "Find Payment", "Select View All" }));

        sreachbtn.setText("Sreach");
        sreachbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sreachbtnActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CusID", "Problem", "Type", "unit", "UnitPrice", "totalUnitP", "Deposite", "totalCost"
            }
        ));
        jTable2.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(1).setMinWidth(70);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(82);
            jTable2.getColumnModel().getColumn(3).setMinWidth(40);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTable2.getColumnModel().getColumn(3).setMaxWidth(50);
            jTable2.getColumnModel().getColumn(4).setMinWidth(60);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(4).setMaxWidth(90);
        }

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Update");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Delete");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("View");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        TextFieldupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldupdateActionPerformed(evt);
            }
        });

        LabelEnterUpdate.setText("Enter New");

        jPanel3.setBackground(new java.awt.Color(252, 252, 252));
        jPanel3.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(252, 252, 252));
        jPanel4.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelEnterUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextFieldupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(52, 52, 52)
                                .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sreachbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(168, 168, 168)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sreachbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelEnterUpdate)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(11, 11, 11)
                        .addComponent(jCheckBox2)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       MainFrame main = new MainFrame();
       this.dispose();
       main.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void sreachbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sreachbtnActionPerformed
        PreparedStatement ps2 ;
            PreparedStatement ps ;
      String getID = TextField1.getText();
      String getSelection = jComboBox1.getSelectedItem().toString();
  
   
      String sqlselect ="select "+getSelection+" from CustomerHistory where CusID = ?";
      try{
          Connection con = DriverManager.getConnection(Myconnection.url);
 
         
             if(jComboBox1.getSelectedIndex() == 0){
                  String sqlSelectName = "select CusName from CustomerHistory where CusID = ?";
                      ps = con.prepareStatement(sqlSelectName);
            ps.setString(1, getID);
          
          ResultSet rs = ps.executeQuery();
          while (rs.next()){
                  JOptionPane.showMessageDialog(this, "CustomerName : "+rs.getString("CusName"));

          }
                //   JOptionPane.showConfirmDialog(this, rs.getString("CusName"));
              }else if(jComboBox1.getSelectedIndex() == 1){
                 String sqlSelectPhone = "select Telephone from CustomerHistory where CusID = ?";
                      ps = con.prepareStatement(sqlSelectPhone);
            ps.setString(1, getID);
          
          ResultSet rs = ps.executeQuery();
          while (rs.next()){
                  JOptionPane.showMessageDialog(this, "PhoneNumber: "+rs.getString("Telephone"));

          }
              }
            
            else if(jComboBox1.getSelectedIndex() == 2){
                  String sqlSelectCar = "select CarModel,CarIdentity from CustomerHistory where CusID = ?";
              ps = con.prepareStatement(sqlSelectCar);
            ps.setString(1, getID);
          
          ResultSet rs = ps.executeQuery();
          while (rs.next()){
                 
                  JOptionPane.showMessageDialog(this, "CarModel : "+rs.getString("CarModel")+"\n Identity : "
                          +rs.getString("CarIdentity"));
              }
            }else if(jComboBox1.getSelectedIndex() == 3){
                 String sqlSelectCar = "select FixDate,CompleteTime,Description from CustomerHistory where CusID = ?";
              ps = con.prepareStatement(sqlSelectCar);
            ps.setString(1, getID);
          
          ResultSet rs = ps.executeQuery();
          while (rs.next()){
                  JOptionPane.showMessageDialog(this, "FIXDATE : "+rs.getString("FixDate")+"\n CompeletTime : "
                       +   rs.getString("CompleteTime")+"\n Description : "+rs.getString("Description"));
          }
              }else if(jComboBox1.getSelectedIndex() == 4){
                 String Sqlselect3 = "select * from payment where CusID = ?";
              
              ps = con.prepareStatement(Sqlselect3);
            ps.setString(1, getID);
          
          ResultSet rs = ps.executeQuery();
          while (rs.next()){
              String data [] ={rs.getString("CusID"),rs.getString("Problem"),rs.getString("ItemType"),
                  rs.getString("unit"),rs.getString("Priceperunit"),
                  rs.getString("totalperunit"),rs.getString("Deposite"),rs.getString("totalCost")};
            DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
            tblModel.addRow(data);
                
                   //  ps.close();
                   //  rs.close();
          }
              }
             if(jComboBox1.getSelectedIndex() == 5){
                  String sqlselectall = "select * from CustomerHistory where CusID = ?";
                  String sqlselectall2 = "select * from payment where CusID = ?";
                  ps2 = con.prepareStatement(sqlselectall);
                  ps2.setString(1, getID);
                  ResultSet rs = ps2.executeQuery();
                  
                  while(rs.next()){
                  String data[] = {rs.getString("CusID"),rs.getString("CusName"),rs.getString("TelePhone"),
                      rs.getString("CarModel"),rs.getString("CarIdentity"),rs.getString("FixDate"),
                      rs.getString("CompleteTime"),rs.getString("Description")
                  };
                     DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            tblModel.addRow(data);
                      ps2.close();
                  }
                  PreparedStatement ps3 = con.prepareStatement(sqlselectall2);
                ps3.setString(1, getID);
                ResultSet rset = ps3.executeQuery();
                while(rset.next()){
                     String data [] ={rset.getString("CusID"),rset.getString("Problem"),rset.getString("ItemType"),
                  rset.getString("unit"),rset.getString("Priceperunit"),
                  rset.getString("totalperunit"),rset.getString("Deposite"),rset.getString("totalCost")};
            DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
            tblModel.addRow(data);
                }
                 // rs2.close();
         }
             
              
        
      }catch(Exception ex){
          JOptionPane.showMessageDialog(this, ex);
      }
    }//GEN-LAST:event_sreachbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        DefaultTableModel tblModel2 = (DefaultTableModel)jTable2.getModel();
        tblModel.setRowCount(0);
        tblModel2.setRowCount(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
      if(jCheckBox3.isSelected() == true){
          deleteBtn.setVisible(false);
          updatebtn.setVisible(false);
          TextFieldupdate.setVisible(false);
          LabelEnterUpdate.setVisible(false);
          sreachbtn.setVisible(true);
      }else{
           deleteBtn.setVisible(false);
          updatebtn.setVisible(false);
            TextFieldupdate.setVisible(false);
            LabelEnterUpdate.setVisible(false);
      }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        String deletSql = "delete * from CustomerHistory where CusID = ?";
           try{
          Connection con = DriverManager.getConnection(Myconnection.url);
 
         PreparedStatement ps = con.prepareStatement(deletSql);
         ps.setString(1, TextField1.getText());
         ps.executeUpdate();
           
          }catch(Exception ex){
              JOptionPane.showMessageDialog(this,ex);
          }
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
       
           try{
          Connection con = DriverManager.getConnection(Myconnection.url);
 if(jComboBox1.getSelectedIndex() == 0){
     String sqlu1 = "update CustomerHistory set CusName = ? where CusID = ?";
      PreparedStatement ps = con.prepareStatement(sqlu1);
         ps.setString(1, TextField1.getText());
         ps.setString(2, TextFieldupdate.getText());
         ps.executeUpdate();
      //   ps.close();
         JOptionPane.showMessageDialog(this,"update OK");
 }if(jComboBox1.getSelectedIndex() == 1){
     String sqlu1 = "update CustomerHistory set Telephone = ? where CusID = ?";
      PreparedStatement ps2 = con.prepareStatement(sqlu1);
         ps2.setString(1, TextField1.getText());
         ps2.setString(2, TextFieldupdate.getText());
         ps2.executeUpdate();
      //   ps.close();
         JOptionPane.showMessageDialog(this,"update OK");
 }if(jComboBox1.getSelectedIndex() == 2){
     String sqlu1 = "update CustomerHistory set CarModel = ? where CusID = ?";
      PreparedStatement ps3 = con.prepareStatement(sqlu1);
         ps3.setString(1, TextField1.getText());
         ps3.setString(2, TextFieldupdate.getText());
         ps3.executeUpdate();
      //   ps.close();
         JOptionPane.showMessageDialog(this,"update OK");
 }if(jComboBox1.getSelectedIndex() == 3){
     String sqlu1 = "update CustomerHistory set CarIdentity = ? where CusID = ?";
      PreparedStatement ps4 = con.prepareStatement(sqlu1);
         ps4.setString(1, TextField1.getText());
         ps4.setString(2, TextFieldupdate.getText());
         ps4.executeUpdate();
      //   ps.close();
         JOptionPane.showMessageDialog(this,"update OK");
 }if(jComboBox1.getSelectedIndex() == 4){
     String sqlu1 = "update CustomerHistory set FixDate = ? where CusID = ?";
      PreparedStatement ps5 = con.prepareStatement(sqlu1);
         ps5.setString(1, TextField1.getText());
         ps5.setString(2, TextFieldupdate.getText());
         ps5.executeUpdate();
      //   ps.close();
         JOptionPane.showMessageDialog(this,"update OK");
 }if(jComboBox1.getSelectedIndex() == 5){
     String sqlu1 = "update CustomerHistory set CompleteTime = ? where CusID = ?";
      PreparedStatement ps6 = con.prepareStatement(sqlu1);
         ps6.setString(1, TextField1.getText());
         ps6.setString(2, TextFieldupdate.getText());
         ps6.executeUpdate();
      //   ps.close();
         JOptionPane.showMessageDialog(this,"update OK");
 }if(jComboBox1.getSelectedIndex() == 6){
     String sqlu1 = "update CustomerHistory set Desrciption = ? where CusID = ?";
      PreparedStatement ps7 = con.prepareStatement(sqlu1);
         ps7.setString(1, TextField1.getText());
         ps7.setString(2, TextFieldupdate.getText());
         ps7.executeUpdate();
      //   ps.close();
         JOptionPane.showMessageDialog(this,"update OK");
 }
         
           
          }catch(Exception ex){
              JOptionPane.showMessageDialog(this,ex);
          }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void TextFieldupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldupdateActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
      if(jCheckBox2.isSelected() == true){
         sreachbtn.setVisible(false);
          updatebtn.setVisible(false);
          TextFieldupdate.setVisible(false);
          LabelEnterUpdate.setVisible(false);
          deleteBtn.setVisible(true);
          jComboBox1.setEnabled(false);
         
      }else{
           deleteBtn.setVisible(false);
          updatebtn.setVisible(false);
            TextFieldupdate.setVisible(false);
            LabelEnterUpdate.setVisible(false);
            sreachbtn.setVisible(true);
            LabelEnterUpdate.setVisible(false);
              deleteBtn.setVisible(false);
               jComboBox1.setEnabled(true);
      }
    
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
if(jCheckBox1.isSelected() == true){
    updatebtn.setVisible(true);
    TextFieldupdate.setVisible(true);
    sreachbtn.setVisible(false);
   LabelEnterUpdate.setVisible(true); 
   jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CustomerName", "Telephone", 
       "CarModel","CarIdentity", "FixDate","CompleteTime",
       "Description"}));
    
}     else{
    sreachbtn.setVisible(true);
    updatebtn.setVisible(false);
    LabelEnterUpdate.setVisible(false);
     TextFieldupdate.setVisible(false);
    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CustomerName", 
        "Telephone", "CarModel,CarIdentity", "FixDate,"
            + "CompleteTime,Description", "Find Payment", "Select View All" }));
}
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    if(jToggleButton1.isSelected() == true){
        jToggleButton1.setText("AdminMode");
       
        loginForm login = new loginForm();
        login.setVisible(true);
        this.setVisible(false);
     
           login.Btnlogin.addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                      if("Sara".equals(login.userNameText.getText()) && "1234".equals(login.PasswordField.getText())){
                     
                      
                      }
               }
           });
        
        
    }else{
        jToggleButton1.setText("UserMode");
    }
    
    }//GEN-LAST:event_jToggleButton1ActionPerformed
private void insertDataTojTable(){
String no = null;
    String id = null;
    String Name = null;
    String phone = null;
    String Model = null;
    String CarID = null;
    String FixDate = null;
    String CompleteTime = null;
    String Price = null;
    String  Description = null;
    String issue = null;
    String typeItem = null;
    String Deposite = null;
      DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
       DefaultTableModel tblModel2 = (DefaultTableModel)jTable2.getModel();
  PreparedStatement ps;
  
  String sql = "Select * from CustomerHistory";

    try{
        Connection con = DriverManager.getConnection(Myconnection.url);
        ps = con.prepareStatement(sql);
      
      
        ResultSet resultset = ps.executeQuery();
        while (resultset.next()){
          no = resultset.getString("hisNum");
           id = resultset.getString("CusID");
           Name = resultset.getString("CusName");
           phone = resultset.getString("Telephone");
           Description = resultset.getString("Description");
        Model = resultset.getString("CarModel");
           CarID = resultset.getString("CarIdentity");
         FixDate = resultset.getString("FixDate");
      
        
      
         CompleteTime = resultset.getString("CompleteTime");
       
      
        
     
        
          tblModel.addRow(new Object[]{id,Name,phone,Model,CarID,FixDate,CompleteTime,
            Description});
        }
  /*      String tabel = ("select * from payment");
       PreparedStatement ps2 = con.prepareStatement(tabel);
       ResultSet rs2 = ps2.executeQuery();
       while (rs2.next()){
           String Problem = rs2.getString("Problem");
           String ItemType = rs2.getString("ItemType");
           String totalpriceofUnit = rs2.getString("totalperunit");
           String unit = rs2.getString("unit");
           String totalCost = rs2.getString("totalCost");
           String deposite = rs2.getString("Deposite");
           String priecperunit = rs2.getString("Priceperunit");
         tblModel2.addRow( new Object [] {Problem,ItemType,unit,totalpriceofUnit,totalCost,deposite,priecperunit});
       }*/
        con.close();
        
    }catch(Exception ex){
       JOptionPane.showMessageDialog(this,ex );
        
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelEnterUpdate;
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextFieldupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton sreachbtn;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
