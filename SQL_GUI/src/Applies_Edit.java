

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class Applies_Edit extends javax.swing.JFrame  {
    String DB_URL = SQL_GUI.DB_URL ;
   String username = SQL_GUI.USERNAME;
   String password = SQL_GUI.PASSWORD;       
    private int deleteItem;
    /**
     * Creates new form Applies_Edit
     */
    public Applies_Edit() {
        initComponents();
        UpdateDB();
        UpdateCombo_employee();
        UpdateCombo_job();
        UpdateCombo_eval1();
        UpdateCombo_eval2();
        setLocationRelativeTo(null);
    }
    
     public  void UpdateDB() {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);

            
            PreparedStatement stmnt = con.prepareStatement("SELECT * FROM applies");
            
            ResultSet resultSet = stmnt.executeQuery();
            
            ResultSetMetaData metadata = resultSet.getMetaData();
            int numberOfColumns = metadata.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)Applies_Table.getModel();
                    RecordTable.setRowCount(0);
                    
             while (resultSet.next()){
                 
             Vector columnData = new Vector();
                for (int i = 1; i <= numberOfColumns; i++) {
                columnData.add(resultSet.getString("cand_usrname"));
                columnData.add(resultSet.getLong("job_id"));
                columnData.add(resultSet.getDate("sub_date"));
                columnData.add(resultSet.getString("evaluator1"));
                columnData.add(resultSet.getString("evaluator2"));
                columnData.add(resultSet.getInt("grade1"));
                columnData.add(resultSet.getInt("grade2"));                
                columnData.add(resultSet.getString("status"));
            }
                RecordTable.addRow(columnData);
             }
       
        }catch (Exception ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
     } 
public void UpdateCombo_employee(){
        String dropdown = "Select * from employee";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);
            PreparedStatement stmnt = con.prepareStatement(dropdown);
            ResultSet rs = stmnt.executeQuery();
            
            while(rs.next()){
                combo_employee.addItem(rs.getString("username"));
            }
            
        }catch (Exception e){
            
        }
        
    }

public void UpdateCombo_job(){
        String dropdown = "Select * from job";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);
            PreparedStatement stmnt = con.prepareStatement(dropdown);
            ResultSet rs = stmnt.executeQuery();
            
            while(rs.next()){
                combo_job.addItem(rs.getString("id"));
            }
            
        }catch (Exception e){
            
        }
        
    }

public void UpdateCombo_eval1(){
        String dropdown = "Select * from evaluator";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);
            PreparedStatement stmnt = con.prepareStatement(dropdown);
            ResultSet rs = stmnt.executeQuery();
            
            while(rs.next()){
                combo_eval1.addItem(rs.getString("username"));
            }
            
        }catch (Exception e){
            
        }
        
    }

public void UpdateCombo_eval2(){
        String dropdown = "Select * from evaluator";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);
            PreparedStatement stmnt = con.prepareStatement(dropdown);
            ResultSet rs = stmnt.executeQuery();
            
            while(rs.next()){
                combo_eval2.addItem(rs.getString("username"));
            }
            
        }catch (Exception e){
            
        }
        
    }




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Applies_Table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnUser_Delete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnUser_back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnUser_Update = new javax.swing.JButton();
        btnUser_Insert = new javax.swing.JButton();
        btnUser_Reset = new javax.swing.JButton();
        sub_date = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        combo_job = new javax.swing.JComboBox<>();
        combo_eval2 = new javax.swing.JComboBox<>();
        combo_eval1 = new javax.swing.JComboBox<>();
        combo_employee = new javax.swing.JComboBox<>();
        combo_status = new javax.swing.JComboBox<>();
        grade1 = new javax.swing.JComboBox<>();
        grade2 = new javax.swing.JComboBox<>();
        Activate_apply = new javax.swing.JButton();
        Cancel_apply = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Employee :");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Applies");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Job ID :");

        Applies_Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Applies_Table.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        Applies_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee", "Job ID", "Submission Date", "Evaluator No1", "Evaluator No2", "Grade 1", "Grade 2", "Apply Status"
            }
        ));
        Applies_Table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Applies_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Applies_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Applies_Table);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Submission Date:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Evaluator No1 :");

        btnUser_Delete.setBackground(new java.awt.Color(102, 102, 102));
        btnUser_Delete.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnUser_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btnUser_Delete.setText("Delete");
        btnUser_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUser_DeleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Evaluator No2:");

        btnUser_back.setBackground(new java.awt.Color(102, 102, 102));
        btnUser_back.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnUser_back.setForeground(new java.awt.Color(255, 255, 255));
        btnUser_back.setText("← Back");
        btnUser_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUser_backActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Grade 1:");

        btnUser_Update.setBackground(new java.awt.Color(102, 102, 102));
        btnUser_Update.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnUser_Update.setForeground(new java.awt.Color(255, 255, 255));
        btnUser_Update.setText("Update");
        btnUser_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUser_UpdateActionPerformed(evt);
            }
        });

        btnUser_Insert.setBackground(new java.awt.Color(102, 102, 102));
        btnUser_Insert.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnUser_Insert.setForeground(new java.awt.Color(255, 255, 255));
        btnUser_Insert.setText("Insert");
        btnUser_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUser_InsertActionPerformed(evt);
            }
        });

        btnUser_Reset.setBackground(new java.awt.Color(102, 102, 102));
        btnUser_Reset.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnUser_Reset.setForeground(new java.awt.Color(255, 255, 255));
        btnUser_Reset.setText("Reset");
        btnUser_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUser_ResetActionPerformed(evt);
            }
        });

        sub_date.setDateFormatString("yyyy-MM-dd");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Grade 2 :");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Apply Status :");

        combo_job.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        combo_job.setSelectedIndex(-1);

        combo_eval2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        combo_eval2.setSelectedIndex(-1);

        combo_eval1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        combo_eval1.setSelectedIndex(-1);

        combo_employee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        combo_employee.setSelectedIndex(-1);

        combo_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "active", "canceled", "completed" }));

        grade1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        grade2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        Activate_apply.setBackground(new java.awt.Color(102, 102, 102));
        Activate_apply.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        Activate_apply.setForeground(new java.awt.Color(255, 255, 255));
        Activate_apply.setText("Activate apply");
        Activate_apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Activate_applyActionPerformed(evt);
            }
        });

        Cancel_apply.setBackground(new java.awt.Color(102, 102, 102));
        Cancel_apply.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        Cancel_apply.setForeground(new java.awt.Color(255, 255, 255));
        Cancel_apply.setText("Cancel apply");
        Cancel_apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_applyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(Cancel_apply)
                        .addGap(2, 2, 2)
                        .addComponent(Activate_apply))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sub_date, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addComponent(combo_eval2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(combo_eval1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(combo_job, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(combo_employee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(grade1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(grade2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(btnUser_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnUser_Insert)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnUser_Update)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnUser_Delete)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUser_back)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(combo_eval2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(combo_employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(combo_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(combo_eval1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(sub_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(grade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(grade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(combo_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Activate_apply)
                            .addComponent(Cancel_apply))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addComponent(btnUser_Reset)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUser_Insert)
                    .addComponent(btnUser_Update)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUser_Delete)
                        .addComponent(btnUser_back)))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Applies_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Applies_TableMouseClicked
                
        DefaultTableModel RecordTable = (DefaultTableModel)Applies_Table.getModel();
        int SelectedRows = Applies_Table.getSelectedRow();
        
        combo_employee.setSelectedItem(RecordTable.getValueAt(SelectedRows, 0).toString());
        combo_job.setSelectedItem(RecordTable.getValueAt(SelectedRows, 1).toString());
        try{
            Date subm_date = new SimpleDateFormat("yyyy-MM-dd").parse(RecordTable.getValueAt(SelectedRows, 2).toString());
            sub_date.setDate(subm_date);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        Object eval1 = RecordTable.getValueAt(SelectedRows, 3);
        Object eval2 = RecordTable.getValueAt(SelectedRows, 4);

        
        if (eval1 != null) {
            combo_eval1.setSelectedItem(eval1.toString());
        } else {
            combo_eval1.setSelectedIndex(-1);
        }

        if (eval2 != null) {
            combo_eval2.setSelectedItem(eval2.toString());
        } else {
            combo_eval2.setSelectedIndex(-1);
        }
        grade1.setSelectedItem(RecordTable.getValueAt(SelectedRows, 5).toString());
        grade2.setSelectedItem(RecordTable.getValueAt(SelectedRows, 6).toString());
        combo_status.setSelectedItem(RecordTable.getValueAt(SelectedRows, 7).toString());
        combo_employee.disable();
        combo_job.disable();

    }//GEN-LAST:event_Applies_TableMouseClicked

    private void btnUser_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUser_DeleteActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)Applies_Table.getModel();
        int SelectedRows = Applies_Table.getSelectedRow();

        try{

            String usernm;
            usernm = (RecordTable.getValueAt(SelectedRows, 0).toString());

            deleteItem = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this entry ?","Warning!",JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_OPTION){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(DB_URL,username,password);
                PreparedStatement stmnt = con.prepareStatement("DELETE FROM applies WHERE cand_usrname = ? and job_id = ? and status = ?");

                stmnt.setString(1,RecordTable.getValueAt(SelectedRows, 0).toString());
                stmnt.setInt(2,Integer.parseInt(RecordTable.getValueAt(SelectedRows, 1).toString()));
                stmnt.setString(3, RecordTable.getValueAt(SelectedRows, 8).toString());
                stmnt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Entry Deleted");
                UpdateDB();

                combo_employee.setSelectedItem(null);
                combo_job.setSelectedItem(null);
                sub_date.setDate(null);
                combo_eval1.setSelectedItem(null);
                combo_eval2.setSelectedItem(null);
                grade1.setSelectedItem(null);
                grade2.setSelectedItem(null);
                combo_status.setSelectedItem(null);

            }
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Applies_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }catch (SQLException ex){
            System.err.println(ex);
        }
    }//GEN-LAST:event_btnUser_DeleteActionPerformed

    private void btnUser_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUser_backActionPerformed
        this.setVisible(false);
        new Table_Select().toFront();
        new Table_Select().setVisible(true);
        new Table_Select().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_btnUser_backActionPerformed

    private void btnUser_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUser_UpdateActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String subm_date = sdf.format(sub_date.getDate());
                       
            PreparedStatement stmnt = con.prepareStatement("UPDATE applies SET sub_date = ?, evaluator1 = ?,evaluator2 = ?,grade1 = ?,grade2 = ?,status = ? where cand_usrname = ? and job_id = ? ");

            stmnt.setString(1,subm_date);
            stmnt.setString(2,(String)combo_eval1.getSelectedItem());
            stmnt.setString(3,(String)combo_eval2.getSelectedItem());
            stmnt.setInt(4,Integer.parseInt((String) grade1.getSelectedItem()));
            stmnt.setInt(5,Integer.parseInt((String) grade2.getSelectedItem()));
            stmnt.setString(6,(String)combo_status.getSelectedItem()); 
            stmnt.setString(7,(String)combo_employee.getSelectedItem());                  
            stmnt.setInt(8,Integer.parseInt((String) combo_job.getSelectedItem()));                   
            stmnt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Record Updated");
            UpdateDB();
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Applies_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        } 
    }//GEN-LAST:event_btnUser_UpdateActionPerformed

    private void btnUser_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUser_InsertActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String subm_date = sdf.format(sub_date.getDate());
            
            
            if ((combo_eval1.getSelectedItem() == null) || (combo_eval2.getSelectedItem() == null) ){
                 PreparedStatement stmnt = con.prepareStatement("call EditApplies(?,?,?,?)");
                 stmnt.setString(1,(String)combo_employee.getSelectedItem());       
                 stmnt.setInt(2,Integer.parseInt((String) combo_job.getSelectedItem()));           
                 stmnt.setString(3,subm_date);
                 stmnt.setString(4,"i"); 
                 stmnt.executeUpdate();
                 JOptionPane.showMessageDialog(this, "Apply existed but now all evaluators are covered");
            }
            else {
            PreparedStatement stmnt = con.prepareStatement("INSERT INTO applies(cand_usrname,job_id,sub_date,evaluator1,evaluator2,grade1,grade2,status)value(?,?,?,?,?,?,?,?)");
            
            
            stmnt.setString(1,(String)combo_employee.getSelectedItem());       
            stmnt.setInt(2,Integer.parseInt((String) combo_job.getSelectedItem()));           
            stmnt.setString(3,subm_date);
            stmnt.setString(4,(String)combo_eval1.getSelectedItem());
            stmnt.setString(5,(String)combo_eval2.getSelectedItem());
            stmnt.setInt(6,Integer.parseInt((String) grade1.getSelectedItem()));
            stmnt.setInt(7,Integer.parseInt((String) grade2.getSelectedItem()));
            stmnt.setString(8,(String)combo_status.getSelectedItem());
            stmnt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Added");
            }
           
            
            UpdateDB();
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Applies_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null,"Applie entry already exists");
        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        
    }//GEN-LAST:event_btnUser_InsertActionPerformed

    private void btnUser_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUser_ResetActionPerformed
                combo_employee.setSelectedItem(null);
                combo_job.setSelectedItem(null);
                sub_date.setDate(null);
                combo_eval1.setSelectedItem(null);
                combo_eval2.setSelectedItem(null);
                grade1.setSelectedItem(null);
                grade2.setSelectedItem(null);
                combo_status.setSelectedItem(null);
                
                combo_employee.enable();
                combo_job.enable();
                

    }//GEN-LAST:event_btnUser_ResetActionPerformed

    private void Activate_applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Activate_applyActionPerformed
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String subm_date = sdf.format(sub_date.getDate());
           
                 PreparedStatement stmnt = con.prepareStatement("call EditApplies(?,?,?,?)");
                 stmnt.setString(1,(String)combo_employee.getSelectedItem());       
                 stmnt.setInt(2,Integer.parseInt((String) combo_job.getSelectedItem()));           
                 stmnt.setString(3,subm_date);
                 stmnt.setString(4,"a"); 
                 stmnt.executeUpdate();
                 JOptionPane.showMessageDialog(this, "Apply activated");
            
            
        
            UpdateDB();
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Applies_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_Activate_applyActionPerformed

    private void Cancel_applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_applyActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String subm_date = sdf.format(sub_date.getDate());
           
                 PreparedStatement stmnt = con.prepareStatement("call EditApplies(?,?,?,?)");
                 stmnt.setString(1,(String)combo_employee.getSelectedItem());       
                 stmnt.setInt(2,Integer.parseInt((String) combo_job.getSelectedItem()));           
                 stmnt.setString(3,subm_date);
                 stmnt.setString(4,"c"); 
                 stmnt.executeUpdate();
                 JOptionPane.showMessageDialog(this, "Apply canceled");
            
            
        
            UpdateDB();
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Applies_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_Cancel_applyActionPerformed

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
            java.util.logging.Logger.getLogger(Applies_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Applies_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Applies_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Applies_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Applies_Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Activate_apply;
    private javax.swing.JTable Applies_Table;
    private javax.swing.JButton Cancel_apply;
    private javax.swing.JButton btnUser_Delete;
    private javax.swing.JButton btnUser_Insert;
    private javax.swing.JButton btnUser_Reset;
    private javax.swing.JButton btnUser_Update;
    private javax.swing.JButton btnUser_back;
    private javax.swing.JComboBox<String> combo_employee;
    private javax.swing.JComboBox<String> combo_eval1;
    private javax.swing.JComboBox<String> combo_eval2;
    private javax.swing.JComboBox<String> combo_job;
    private javax.swing.JComboBox<String> combo_status;
    private javax.swing.JComboBox<String> grade1;
    private javax.swing.JComboBox<String> grade2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser sub_date;
    // End of variables declaration//GEN-END:variables
}
