
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
public class Degree_Edit extends javax.swing.JFrame {
    String DB_URL = SQL_GUI.DB_URL ;
   String username = SQL_GUI.USERNAME;
   String password = SQL_GUI.PASSWORD;
    private int deleteItem;
    /**
     * Creates new form Degree_Edit
     */
    public Degree_Edit() {
        initComponents();
        UpdateDB();
        setLocationRelativeTo(null);
    }
    
    public  void UpdateDB() {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);
            
            PreparedStatement stmnt = con.prepareStatement("SELECT * FROM degree");
            
            ResultSet resultSet = stmnt.executeQuery();
            
            ResultSetMetaData metadata = resultSet.getMetaData();
            int numberOfColumns = metadata.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)Degree_Table.getModel();
                    RecordTable.setRowCount(0);
                    
             while (resultSet.next()){
                 
             Vector columnData = new Vector();
                for (int i = 1; i <= numberOfColumns; i++){
                    columnData.add(resultSet.getString("titlos"));
                    columnData.add(resultSet.getString("idryma"));
                    columnData.add(resultSet.getString("bathmida"));
                    
                    
                    
                }                 
                RecordTable.addRow(columnData);
             }
       
        }catch (Exception ex) {
             JOptionPane.showMessageDialog(null, ex);
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

        jLabel5 = new javax.swing.JLabel();
        btnEtaireia_Delete = new javax.swing.JButton();
        txtDegree_title = new javax.swing.JTextField();
        btnEtaireia_back = new javax.swing.JButton();
        combo_degtype = new javax.swing.JComboBox<>();
        btnEtaireia_Update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDegree_uni = new javax.swing.JTextField();
        btnEtaireia_Insert = new javax.swing.JButton();
        btnEtaireia_Reset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Degree_Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("University :");

        btnEtaireia_Delete.setBackground(new java.awt.Color(102, 102, 102));
        btnEtaireia_Delete.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEtaireia_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btnEtaireia_Delete.setText("Delete");
        btnEtaireia_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEtaireia_DeleteActionPerformed(evt);
            }
        });

        txtDegree_title.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnEtaireia_back.setBackground(new java.awt.Color(102, 102, 102));
        btnEtaireia_back.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEtaireia_back.setForeground(new java.awt.Color(255, 255, 255));
        btnEtaireia_back.setText("← Back");
        btnEtaireia_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEtaireia_backActionPerformed(evt);
            }
        });

        combo_degtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSc", "MSc", "PhD" }));
        combo_degtype.setSelectedIndex(-1);

        btnEtaireia_Update.setBackground(new java.awt.Color(102, 102, 102));
        btnEtaireia_Update.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEtaireia_Update.setForeground(new java.awt.Color(255, 255, 255));
        btnEtaireia_Update.setText("Update");
        btnEtaireia_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEtaireia_UpdateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Type :");

        txtDegree_uni.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnEtaireia_Insert.setBackground(new java.awt.Color(102, 102, 102));
        btnEtaireia_Insert.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEtaireia_Insert.setForeground(new java.awt.Color(255, 255, 255));
        btnEtaireia_Insert.setText("Insert");
        btnEtaireia_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEtaireia_InsertActionPerformed(evt);
            }
        });

        btnEtaireia_Reset.setBackground(new java.awt.Color(102, 102, 102));
        btnEtaireia_Reset.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEtaireia_Reset.setForeground(new java.awt.Color(255, 255, 255));
        btnEtaireia_Reset.setText("Reset");
        btnEtaireia_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEtaireia_ResetActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Degree");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Title :");

        Degree_Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Degree_Table.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        Degree_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "University", "Type"
            }
        ));
        Degree_Table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Degree_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Degree_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Degree_Table);

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
                                .addGap(120, 120, 120)
                                .addComponent(btnEtaireia_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(571, 571, 571))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnEtaireia_Insert)
                                .addGap(8, 8, 8)
                                .addComponent(btnEtaireia_Update)
                                .addGap(5, 5, 5)
                                .addComponent(btnEtaireia_Delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEtaireia_back))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(combo_degtype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDegree_uni, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                    .addComponent(txtDegree_title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDegree_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtDegree_uni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(combo_degtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addComponent(btnEtaireia_Reset)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEtaireia_Insert)
                    .addComponent(btnEtaireia_Update)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEtaireia_Delete)
                        .addComponent(btnEtaireia_back)))
                .addGap(0, 70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEtaireia_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEtaireia_DeleteActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)Degree_Table.getModel();
        int SelectedRows = Degree_Table.getSelectedRow();

        try{
            String titlos;
            titlos  = (RecordTable.getValueAt(SelectedRows, 0).toString());
            

            deleteItem = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this entry ?","Warning!",JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_OPTION){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(DB_URL,username,password);
                PreparedStatement stmnt = con.prepareStatement("DELETE FROM degree WHERE titlos = ? ");

                stmnt.setString(1, titlos);
                
                stmnt.executeUpdate();
                JOptionPane.showMessageDialog(this,"Entry Deleted");
                UpdateDB();
                
                txtDegree_title.setText("");
                txtDegree_title.requestFocus();
                txtDegree_uni.setText("");
                combo_degtype.setSelectedItem(null);
                
                

            }
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Degree_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }catch (SQLException ex){
            System.err.println(ex);
        }
    }//GEN-LAST:event_btnEtaireia_DeleteActionPerformed

    private void btnEtaireia_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEtaireia_backActionPerformed
        this.setVisible(false);
        new Table_Select().toFront();
        new Table_Select().setVisible(true);
        new Table_Select().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_btnEtaireia_backActionPerformed

    private void btnEtaireia_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEtaireia_UpdateActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);
            PreparedStatement stmnt = con.prepareStatement("UPDATE degree SET  idryma = ?, bathmida = ? WHERE titlos = ? ");

            stmnt.setString(1,txtDegree_uni.getText());
            stmnt.setString(2,(String)combo_degtype.getSelectedItem());
            stmnt.setString(3,txtDegree_title.getText());
            
            stmnt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Record Updated");
            UpdateDB();
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Degree_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(Degree_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        } 
    }//GEN-LAST:event_btnEtaireia_UpdateActionPerformed

    private void btnEtaireia_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEtaireia_InsertActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,username,password);
            PreparedStatement stmnt = con.prepareStatement("INSERT INTO degree(titlos,idryma,bathmida)value(?,?,?)");
            
            stmnt.setString(1,txtDegree_title.getText());
            stmnt.setString(2,txtDegree_uni.getText());
            stmnt.setString(3,(String)combo_degtype.getSelectedItem());
            

            stmnt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Added");
            UpdateDB();
        }catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Degree_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null,"Degree entry already exists");
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(Degree_Edit.class.getName()).log(java.util.logging.Level.SEVERE ,null,ex);
        }
    }//GEN-LAST:event_btnEtaireia_InsertActionPerformed

    private void btnEtaireia_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEtaireia_ResetActionPerformed
        txtDegree_title.setText("");
        txtDegree_uni.setText("");
        combo_degtype.setSelectedItem(null);
        
        txtDegree_title.enable();
    }//GEN-LAST:event_btnEtaireia_ResetActionPerformed

    private void Degree_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Degree_TableMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)Degree_Table.getModel();
        int SelectedRows = Degree_Table.getSelectedRow();
        
        txtDegree_title.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        txtDegree_uni.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        combo_degtype.setSelectedItem(RecordTable.getValueAt(SelectedRows, 2).toString());
        
        
         txtDegree_title.disable();
    }//GEN-LAST:event_Degree_TableMouseClicked

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
            java.util.logging.Logger.getLogger(Degree_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Degree_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Degree_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Degree_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Degree_Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Degree_Table;
    private javax.swing.JButton btnEtaireia_Delete;
    private javax.swing.JButton btnEtaireia_Insert;
    private javax.swing.JButton btnEtaireia_Reset;
    private javax.swing.JButton btnEtaireia_Update;
    private javax.swing.JButton btnEtaireia_back;
    private javax.swing.JComboBox<String> combo_degtype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDegree_title;
    private javax.swing.JTextField txtDegree_uni;
    // End of variables declaration//GEN-END:variables
}
