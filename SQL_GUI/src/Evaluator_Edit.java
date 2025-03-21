
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
public class Evaluator_Edit extends javax.swing.JFrame {
    String DB_URL = SQL_GUI.DB_URL ;
   String username = SQL_GUI.USERNAME;
   String password = SQL_GUI.PASSWORD;
    private int deleteItem;

    /**
     * Creates new form Evaluator_Edit
     */
    public Evaluator_Edit() {
        initComponents();
        UpdateDB();
        UpdateCombo_firm();
        UpdateCombo_user();
        setLocationRelativeTo(null);
    }
    
    public  void UpdateDB() {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);
            
            PreparedStatement stmnt = con.prepareStatement("SELECT * FROM evaluator");
            
            ResultSet resultSet = stmnt.executeQuery();
            
            ResultSetMetaData metadata = resultSet.getMetaData();
            int numberOfColumns = metadata.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)Evaluator_Table.getModel();
                    RecordTable.setRowCount(0);
                    
             while (resultSet.next()){
                 
             Vector columnData = new Vector();
                for (int i = 1; i <= numberOfColumns; i++){
                    columnData.add(resultSet.getString("Username"));
                    columnData.add(resultSet.getString("Exp_years"));
                    columnData.add(resultSet.getString("firm"));
                    
                    
                }                 
                RecordTable.addRow(columnData);
             }
       
        }catch (Exception ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
     } 
    public void UpdateCombo_firm(){
        String dropdown = "Select * from etaireia";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);
            PreparedStatement stmnt = con.prepareStatement(dropdown);
            ResultSet rs = stmnt.executeQuery();
            
            while(rs.next()){
                txtEvaluator_firm.addItem(rs.getString("AFM"));
            }
            
        }catch (Exception e){
            
        }
        
    }
        public void UpdateCombo_user(){
        String dropdown = "Select * from user";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);
            PreparedStatement stmnt = con.prepareStatement(dropdown);
            ResultSet rs = stmnt.executeQuery();
            
            while(rs.next()){
                txtEvaluator_username.addItem(rs.getString("username"));
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

        Eval_Applies = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        DialogBack_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Applies_Table = new javax.swing.JTable();
        evaluator_sel = new javax.swing.JLabel();
        btnEvaluator_Update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Evaluator_Table = new javax.swing.JTable();
        btnEvaluator_Delete = new javax.swing.JButton();
        txtEvaluator_exp_years = new javax.swing.JTextField();
        btnEvaluator_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEvaluator_Insert = new javax.swing.JButton();
        eval_applies = new javax.swing.JButton();
        txtEvaluator_firm = new javax.swing.JComboBox<>();
        btnEvaluator_Reset1 = new javax.swing.JButton();
        txtEvaluator_username = new javax.swing.JComboBox<>();

        Eval_Applies.setSize(new java.awt.Dimension(850, 650));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel4.setText("Evaluator username :");

        DialogBack_btn.setBackground(new java.awt.Color(102, 102, 102));
        DialogBack_btn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DialogBack_btn.setForeground(new java.awt.Color(255, 255, 255));
        DialogBack_btn.setText("← Back");
        DialogBack_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DialogBack_btnActionPerformed(evt);
            }
        });

        Applies_Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Applies_Table.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        Applies_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee", "Job ID", "Submission Date", "Evaluator No1", "Evaluator No2", "Grade 1", "Grade 2", "Average", "Apply Status"
            }
        ));
        Applies_Table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Applies_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Applies_TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Applies_Table);

        evaluator_sel.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout Eval_AppliesLayout = new javax.swing.GroupLayout(Eval_Applies.getContentPane());
        Eval_Applies.getContentPane().setLayout(Eval_AppliesLayout);
        Eval_AppliesLayout.setHorizontalGroup(
            Eval_AppliesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Eval_AppliesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Eval_AppliesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Eval_AppliesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(DialogBack_btn))
                    .addGroup(Eval_AppliesLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(evaluator_sel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE))
                .addContainerGap())
        );
        Eval_AppliesLayout.setVerticalGroup(
            Eval_AppliesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Eval_AppliesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(Eval_AppliesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(evaluator_sel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DialogBack_btn)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEvaluator_Update.setBackground(new java.awt.Color(102, 102, 102));
        btnEvaluator_Update.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEvaluator_Update.setForeground(new java.awt.Color(255, 255, 255));
        btnEvaluator_Update.setText("Update");
        btnEvaluator_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluator_UpdateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Experience Years :");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Firm :");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Evaluator");

        Evaluator_Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Evaluator_Table.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        Evaluator_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Experience Years", "Firm"
            }
        ));
        Evaluator_Table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Evaluator_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Evaluator_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Evaluator_Table);

        btnEvaluator_Delete.setBackground(new java.awt.Color(102, 102, 102));
        btnEvaluator_Delete.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEvaluator_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btnEvaluator_Delete.setText("Delete");
        btnEvaluator_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluator_DeleteActionPerformed(evt);
            }
        });

        txtEvaluator_exp_years.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnEvaluator_back.setBackground(new java.awt.Color(102, 102, 102));
        btnEvaluator_back.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEvaluator_back.setForeground(new java.awt.Color(255, 255, 255));
        btnEvaluator_back.setText("← Back");
        btnEvaluator_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluator_backActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Username :");

        btnEvaluator_Insert.setBackground(new java.awt.Color(102, 102, 102));
        btnEvaluator_Insert.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEvaluator_Insert.setForeground(new java.awt.Color(255, 255, 255));
        btnEvaluator_Insert.setText("Insert");
        btnEvaluator_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluator_InsertActionPerformed(evt);
            }
        });

        eval_applies.setBackground(new java.awt.Color(102, 102, 102));
        eval_applies.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        eval_applies.setForeground(new java.awt.Color(255, 255, 255));
        eval_applies.setText("Evaluator Applies");
        eval_applies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eval_appliesActionPerformed(evt);
            }
        });

        txtEvaluator_firm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        txtEvaluator_firm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEvaluator_firmActionPerformed(evt);
            }
        });

        btnEvaluator_Reset1.setBackground(new java.awt.Color(102, 102, 102));
        btnEvaluator_Reset1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEvaluator_Reset1.setForeground(new java.awt.Color(255, 255, 255));
        btnEvaluator_Reset1.setText("Reset");
        btnEvaluator_Reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluator_Reset1ActionPerformed(evt);
            }
        });

        txtEvaluator_username.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        txtEvaluator_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEvaluator_usernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEvaluator_exp_years, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(txtEvaluator_firm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEvaluator_username, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnEvaluator_Insert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEvaluator_Update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEvaluator_Delete)
                        .addGap(166, 166, 166)
                        .addComponent(eval_applies, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEvaluator_back)
                        .addGap(90, 90, 90))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(btnEvaluator_Reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(731, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtEvaluator_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtEvaluator_exp_years, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtEvaluator_firm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEvaluator_Delete)
                    .addComponent(btnEvaluator_back)
                    .addComponent(btnEvaluator_Update)
                    .addComponent(btnEvaluator_Insert)
                    .addComponent(eval_applies))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(377, Short.MAX_VALUE)
                    .addComponent(btnEvaluator_Reset1)
                    .addGap(69, 69, 69)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEvaluator_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluator_UpdateActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);

            PreparedStatement stmnt = con.prepareStatement("UPDATE evaluator SET  exp_years = ?, firm = ? where username = ?");

            stmnt.setString(1,txtEvaluator_exp_years.getText());
            stmnt.setString(2, (String) txtEvaluator_firm.getSelectedItem());
            stmnt.setString(3, (String) txtEvaluator_username.getSelectedItem());

            stmnt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Record Updated");
            UpdateDB();
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Evaluator_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(Evaluator_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }
    }//GEN-LAST:event_btnEvaluator_UpdateActionPerformed

    private void Evaluator_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Evaluator_TableMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)Evaluator_Table.getModel();
        int SelectedRows = Evaluator_Table.getSelectedRow();

        txtEvaluator_username.setSelectedItem(RecordTable.getValueAt(SelectedRows, 0).toString());
        txtEvaluator_exp_years.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        txtEvaluator_firm.setSelectedItem(RecordTable.getValueAt(SelectedRows, 2).toString());
        
        txtEvaluator_username.disable();

    }//GEN-LAST:event_Evaluator_TableMouseClicked

    private void btnEvaluator_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluator_DeleteActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)Evaluator_Table.getModel();
        int SelectedRows = Evaluator_Table.getSelectedRow();

        try{

            String usernm;
            usernm = (RecordTable.getValueAt(SelectedRows, 0).toString());

            deleteItem = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this entry ?","Warning!",JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_OPTION){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(DB_URL,username,password);
                PreparedStatement stmnt = con.prepareStatement("DELETE FROM evaluator WHERE username = ?");

                stmnt.setString(1, usernm);
                stmnt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Entry Deleted");
                UpdateDB();

                txtEvaluator_username.setSelectedItem(null);
                txtEvaluator_username.requestFocus();
                txtEvaluator_exp_years.setText("");
                txtEvaluator_firm.setSelectedItem(null);
                

            }
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Etaireia_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }catch (SQLException ex){
            System.err.println(ex);
        }
    }//GEN-LAST:event_btnEvaluator_DeleteActionPerformed

    private void btnEvaluator_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluator_backActionPerformed
        this.setVisible(false);
        new Table_Select().toFront();
        new Table_Select().setVisible(true);
        new Table_Select().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_btnEvaluator_backActionPerformed

    private void btnEvaluator_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluator_InsertActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);

            PreparedStatement stmnt = con.prepareStatement("INSERT INTO evaluator(username,exp_years,firm)value(?,?,?)");

            stmnt.setString(1, (String) txtEvaluator_username.getSelectedItem());
            stmnt.setString(2,txtEvaluator_exp_years.getText());
            stmnt.setString(3,(String) txtEvaluator_firm.getSelectedItem());
           
           

            stmnt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Added");
            UpdateDB();
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Evaluator_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null,"Evaluator entry already exists");
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(Evaluator_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }
    }//GEN-LAST:event_btnEvaluator_InsertActionPerformed

    private void eval_appliesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eval_appliesActionPerformed
        Eval_Applies.setVisible(true);
        evaluator_sel.setText((String) txtEvaluator_username.getSelectedItem());
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);

            PreparedStatement stmnt = con.prepareStatement("Select * from applies where evaluator1  = ? or evaluator2 = ?");

            stmnt.setString(1, (String) txtEvaluator_username.getSelectedItem());
            stmnt.setString(2,(String) txtEvaluator_username.getSelectedItem());
            
            ResultSet resultSet = stmnt.executeQuery();
            ResultSetMetaData metadata = resultSet.getMetaData();
            int numberOfColumns = metadata.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)Applies_Table.getModel();
                    RecordTable.setRowCount(0);
                    
             while (resultSet.next()){
                 
             Vector columnData = new Vector();
                for (int i = 1; i <= numberOfColumns; i++){
                    columnData.add(resultSet.getString("cand_usrname"));
                    columnData.add(resultSet.getLong("job_id"));
                    columnData.add(resultSet.getDate("sub_date"));
                    columnData.add(resultSet.getString("evaluator1"));
                    columnData.add(resultSet.getString("evaluator2"));
                    columnData.add(resultSet.getInt("grade1"));
                    columnData.add(resultSet.getInt("grade2"));
                    columnData.add(resultSet.getInt("averg"));
                    columnData.add(resultSet.getString("status"));                  
                    
                    
                  
                }                 
                RecordTable.addRow(columnData);
             }
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Evaluator_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(Evaluator_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }
                                                       
    }//GEN-LAST:event_eval_appliesActionPerformed

    private void txtEvaluator_firmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEvaluator_firmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEvaluator_firmActionPerformed

    private void btnEvaluator_Reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluator_Reset1ActionPerformed
        txtEvaluator_username.setSelectedItem(null);
        txtEvaluator_exp_years.setText("");
        txtEvaluator_firm.setSelectedItem(null);
        
        txtEvaluator_username.enable();
    }//GEN-LAST:event_btnEvaluator_Reset1ActionPerformed

    private void DialogBack_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DialogBack_btnActionPerformed
       Eval_Applies.setVisible(false);

    }//GEN-LAST:event_DialogBack_btnActionPerformed

    private void Applies_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Applies_TableMouseClicked
        

    }//GEN-LAST:event_Applies_TableMouseClicked

    private void txtEvaluator_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEvaluator_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEvaluator_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(Evaluator_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Evaluator_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Evaluator_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Evaluator_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Evaluator_Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Applies_Table;
    private javax.swing.JButton DialogBack_btn;
    private javax.swing.JDialog Eval_Applies;
    private javax.swing.JTable Evaluator_Table;
    private javax.swing.JButton btnEvaluator_Delete;
    private javax.swing.JButton btnEvaluator_Insert;
    private javax.swing.JButton btnEvaluator_Reset1;
    private javax.swing.JButton btnEvaluator_Update;
    private javax.swing.JButton btnEvaluator_back;
    private javax.swing.JButton eval_applies;
    private javax.swing.JLabel evaluator_sel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtEvaluator_exp_years;
    private javax.swing.JComboBox<String> txtEvaluator_firm;
    private javax.swing.JComboBox<String> txtEvaluator_username;
    // End of variables declaration//GEN-END:variables
}
