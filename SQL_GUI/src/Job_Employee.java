
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
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
public class Job_Employee extends javax.swing.JFrame {
    String DB_URL = SQL_GUI.DB_URL ;
   String username = SQL_GUI.USERNAME;
   String password = SQL_GUI.PASSWORD;
    private int deleteItem;
    /**
     * Creates new form Job_Employee
     */
    public Job_Employee() {
        initComponents();
        UpdateDB();
        UpdateCombo_job();
        UpdateCombo_employee();
        setLocationRelativeTo(null);
    }
    public  void UpdateDB() {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);
            
            PreparedStatement stmnt = con.prepareStatement("SELECT * FROM job_employee");
            
            ResultSet resultSet = stmnt.executeQuery();
            
            ResultSetMetaData metadata = resultSet.getMetaData();
            int numberOfColumns = metadata.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)Job_Employee_Table.getModel();
                    RecordTable.setRowCount(0);
                    
             while (resultSet.next()){
                 
             Vector columnData = new Vector();
                for (int i = 1; i <= numberOfColumns; i++){
                    columnData.add(resultSet.getLong("job"));
                    columnData.add(resultSet.getString("Employee"));
                    
                    
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jobid_dialog = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jobid_table = new javax.swing.JTable();
        backJobid_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jobid_txt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Job_Employee_Table = new javax.swing.JTable();
        combo_job = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        combo_employee = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnEvaluator_Insert = new javax.swing.JButton();
        btnEvaluator_Reset = new javax.swing.JButton();
        btnEvaluator_Update = new javax.swing.JButton();
        btnEvaluator_Delete = new javax.swing.JButton();
        procedure = new javax.swing.JButton();
        btnEvaluator_back = new javax.swing.JButton();
        bonus_btn = new javax.swing.JButton();

        jobid_dialog.setSize(new java.awt.Dimension(700, 400));

        jobid_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jobid_table.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jobid_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee", "Evaluator No1", "Evaluator No2", "Apply Status"
            }
        ));
        jobid_table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jobid_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jobid_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jobid_table);

        backJobid_btn.setBackground(new java.awt.Color(102, 102, 102));
        backJobid_btn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        backJobid_btn.setForeground(new java.awt.Color(255, 255, 255));
        backJobid_btn.setText("← Back");
        backJobid_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJobid_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel3.setText("Job ID :");

        jobid_txt.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jobid_dialogLayout = new javax.swing.GroupLayout(jobid_dialog.getContentPane());
        jobid_dialog.getContentPane().setLayout(jobid_dialogLayout);
        jobid_dialogLayout.setHorizontalGroup(
            jobid_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jobid_dialogLayout.createSequentialGroup()
                .addContainerGap(590, Short.MAX_VALUE)
                .addComponent(backJobid_btn)
                .addGap(24, 24, 24))
            .addGroup(jobid_dialogLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jobid_txt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jobid_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jobid_dialogLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(51, Short.MAX_VALUE)))
        );
        jobid_dialogLayout.setVerticalGroup(
            jobid_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jobid_dialogLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jobid_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jobid_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                .addComponent(backJobid_btn)
                .addGap(15, 15, 15))
            .addGroup(jobid_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jobid_dialogLayout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Job_Employee_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job ID", "Employee"
            }
        ));
        Job_Employee_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Job_Employee_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Job_Employee_Table);

        combo_job.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        combo_job.setSelectedIndex(-1);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Employee :");

        combo_employee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "unknown", " " }));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Job ID :");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Job Employee");

        btnEvaluator_Insert.setBackground(new java.awt.Color(102, 102, 102));
        btnEvaluator_Insert.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEvaluator_Insert.setForeground(new java.awt.Color(255, 255, 255));
        btnEvaluator_Insert.setText("Insert");
        btnEvaluator_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluator_InsertActionPerformed(evt);
            }
        });

        btnEvaluator_Reset.setBackground(new java.awt.Color(102, 102, 102));
        btnEvaluator_Reset.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEvaluator_Reset.setForeground(new java.awt.Color(255, 255, 255));
        btnEvaluator_Reset.setText("Reset");
        btnEvaluator_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluator_ResetActionPerformed(evt);
            }
        });

        btnEvaluator_Update.setBackground(new java.awt.Color(102, 102, 102));
        btnEvaluator_Update.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEvaluator_Update.setForeground(new java.awt.Color(255, 255, 255));
        btnEvaluator_Update.setText("Update");
        btnEvaluator_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluator_UpdateActionPerformed(evt);
            }
        });

        btnEvaluator_Delete.setBackground(new java.awt.Color(102, 102, 102));
        btnEvaluator_Delete.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEvaluator_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btnEvaluator_Delete.setText("Delete");
        btnEvaluator_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluator_DeleteActionPerformed(evt);
            }
        });

        procedure.setBackground(new java.awt.Color(102, 102, 102));
        procedure.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        procedure.setForeground(new java.awt.Color(255, 255, 255));
        procedure.setText("Apply_Evaluation_and_Results Procedure");
        procedure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procedureActionPerformed(evt);
            }
        });

        btnEvaluator_back.setBackground(new java.awt.Color(102, 102, 102));
        btnEvaluator_back.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEvaluator_back.setForeground(new java.awt.Color(255, 255, 255));
        btnEvaluator_back.setText("← Back");
        btnEvaluator_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluator_backActionPerformed(evt);
            }
        });

        bonus_btn.setBackground(new java.awt.Color(102, 102, 102));
        bonus_btn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        bonus_btn.setForeground(new java.awt.Color(255, 255, 255));
        bonus_btn.setText("Click to see all completed applies for this job");
        bonus_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonus_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEvaluator_back))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(combo_job, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(combo_employee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnEvaluator_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnEvaluator_Insert)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEvaluator_Update)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEvaluator_Delete))))
                            .addComponent(jLabel9)
                            .addComponent(bonus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(procedure, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(combo_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(combo_employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEvaluator_Reset)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEvaluator_Insert)
                            .addComponent(btnEvaluator_Update)
                            .addComponent(btnEvaluator_Delete))
                        .addGap(56, 56, 56)
                        .addComponent(procedure)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bonus_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(btnEvaluator_back)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEvaluator_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluator_InsertActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);

            PreparedStatement stmnt = con.prepareStatement("INSERT INTO job_employee(job,employee)value(?,?)");

            stmnt.setLong(1, Long.parseLong((String) combo_job.getSelectedItem()));
            stmnt.setString(2, (String) combo_employee.getSelectedItem());

            stmnt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Added");
            UpdateDB();
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Job_Employee.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null,"Job entry already exists");
        
        } catch (SQLException ex) {
          Logger.getLogger(Job_Employee.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }//GEN-LAST:event_btnEvaluator_InsertActionPerformed

    private void btnEvaluator_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluator_ResetActionPerformed

        combo_job.setSelectedItem(null);
        combo_employee.setSelectedItem(null);
        
        combo_job.enable();
        

        
    }//GEN-LAST:event_btnEvaluator_ResetActionPerformed

    private void btnEvaluator_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluator_UpdateActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);

            PreparedStatement stmnt = con.prepareStatement("UPDATE job_employee SET  employee = ? where job = ?");
            
            stmnt.setString(1, (String) combo_employee.getSelectedItem());
            stmnt.setLong(2, Long.parseLong((String) combo_job.getSelectedItem()));
            

            stmnt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Record Updated");
            UpdateDB();
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Job_Employee.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(Job_Employee.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }
    }//GEN-LAST:event_btnEvaluator_UpdateActionPerformed

    private void btnEvaluator_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluator_DeleteActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)Job_Employee_Table.getModel();
        int SelectedRows = Job_Employee_Table.getSelectedRow();

        try{

            Long job;
             job = (Long) (RecordTable.getValueAt(SelectedRows, 0));

            deleteItem = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this entry ?","Warning!",JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_OPTION){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(DB_URL,username,password);
                PreparedStatement stmnt = con.prepareStatement("DELETE FROM job_employee WHERE job = ?");

                stmnt.setLong(1, job);
                stmnt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Entry Deleted");
                UpdateDB();

                combo_job.setSelectedItem(null);
                combo_employee.setSelectedItem(null);

            }
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Job_Employee.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }catch (SQLException ex){
            System.err.println(ex);
        }
    }//GEN-LAST:event_btnEvaluator_DeleteActionPerformed

    private void procedureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procedureActionPerformed
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);

            PreparedStatement stmnt = con.prepareStatement("call apply_evaluation_and_results(?)");
            
            
            stmnt.setLong(1, Integer.parseInt((String) combo_job.getSelectedItem()));
            

            stmnt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Job position covered");
            UpdateDB();
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Job_Employee.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
            
        } catch (SQLException ex) {  
          Logger.getLogger(Job_Employee.class.getName()).log(Level.SEVERE, null, ex);
          
      }  

    }//GEN-LAST:event_procedureActionPerformed

    private void btnEvaluator_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluator_backActionPerformed
        this.setVisible(false);
        new Table_Select().toFront();
        new Table_Select().setVisible(true);
        new Table_Select().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_btnEvaluator_backActionPerformed

    private void Job_Employee_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Job_Employee_TableMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)Job_Employee_Table.getModel();
        int SelectedRows = Job_Employee_Table.getSelectedRow();

        combo_job.setSelectedItem(RecordTable.getValueAt(SelectedRows, 0).toString());
        combo_employee.setSelectedItem(RecordTable.getValueAt(SelectedRows, 1).toString());
        
        combo_job.disable();
        
    }//GEN-LAST:event_Job_Employee_TableMouseClicked

    private void bonus_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonus_btnActionPerformed
        jobid_dialog.setVisible(true);
        jobid_txt.setText((String) combo_job.getSelectedItem());
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);

            PreparedStatement stmnt = con.prepareStatement("SELECT * FROM history_applies WHERE job = ? and average = 0");
           
            stmnt.setLong(1, Long.parseLong((String) combo_job.getSelectedItem()));
            

            ResultSet resultSet = stmnt.executeQuery();
            ResultSetMetaData metadata = resultSet.getMetaData();
            int numberOfColumns = metadata.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)jobid_table.getModel();
                    RecordTable.setRowCount(0);
                    
             while (resultSet.next()){
                 
             Vector columnData = new Vector();
                for (int i = 1; i <= numberOfColumns; i++){
                    columnData.add(resultSet.getString("employee"));
                    columnData.add(resultSet.getString("evaluator1"));  
                    columnData.add(resultSet.getString("evaluator2")); 
                    columnData.add(resultSet.getString("status")); 
                    
                    
                    
                  
                }                 
                RecordTable.addRow(columnData);
             }
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Job_Employee.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(Job_Employee.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }
    }//GEN-LAST:event_bonus_btnActionPerformed

    private void jobid_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jobid_tableMouseClicked

    }//GEN-LAST:event_jobid_tableMouseClicked

    private void backJobid_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJobid_btnActionPerformed
        jobid_dialog.setVisible(false);
        
    }//GEN-LAST:event_backJobid_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Job_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Job_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Job_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Job_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Job_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Job_Employee_Table;
    private javax.swing.JButton backJobid_btn;
    private javax.swing.JButton bonus_btn;
    private javax.swing.JButton btnEvaluator_Delete;
    private javax.swing.JButton btnEvaluator_Insert;
    private javax.swing.JButton btnEvaluator_Reset;
    private javax.swing.JButton btnEvaluator_Update;
    private javax.swing.JButton btnEvaluator_back;
    private javax.swing.JComboBox<String> combo_employee;
    private javax.swing.JComboBox<String> combo_job;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jobid_dialog;
    private javax.swing.JTable jobid_table;
    private javax.swing.JLabel jobid_txt;
    private javax.swing.JButton procedure;
    // End of variables declaration//GEN-END:variables
}
