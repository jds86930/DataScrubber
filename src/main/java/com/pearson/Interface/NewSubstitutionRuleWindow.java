/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pearson.Interface;
import com.pearson.SQL.Database;
import com.pearson.Interface.Models.ItemsSelectedTableModel;
import com.pearson.SQL.Column;
import noNamespace.*;
import com.pearson.SQL.MySQLTable;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import javax.swing.tree.TreeSelectionModel;
import noNamespace.RulesDocument.Rules;
import org.apache.xmlbeans.XmlException;

/**
 *
 * @author UMA99J5
 */
public class NewSubstitutionRuleWindow extends javax.swing.JFrame {

    /**
     * Creates new form NewSubstitutionRule
     */
    Database database;
    ArrayList<String> tableNames =  new ArrayList<>();
    ArrayList<String> columnNames = new ArrayList<>();
    DefaultListModel<String> listModel;
    boolean firstTimeSelected = true;
    
    /** Similar to new shuffle rule window, this method throws an exception, 
     * by the time when users open the new substitution rule window, 
     * database information has been passed over. **/
    
    public NewSubstitutionRuleWindow() throws SQLException {
        database = new Database(UIManager.getDefaultSchema(), UIManager.getUsername(),
                UIManager.getPassword(), "jdbc:mysql://" + UIManager.getUrl()
                + ":" + UIManager.getPort());

        database.fillTables();
        // end of preparing database structure

        for (MySQLTable table : database.tables.values()) {
            tableNames.add(table.getTableName());
        }

        listModel = new DefaultListModel();
        initComponents();
        tablesSelectedTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tableScrollPane = new javax.swing.JScrollPane();
        tablesSelectedTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        ColumnsComboBox = new javax.swing.JComboBox();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ColumnsSelectedList = new javax.swing.JList();
        DeleteButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("New Substitution Rule");

        jLabel2.setText("Select table");

        tablesSelectedTable.setModel(new com.pearson.Interface.Models.ItemsSelectedTableModel(tableNames));
        tablesSelectedTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesSelectedTableMouseClicked(evt);
            }
        });
        tablesSelectedTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tablesSelectedTableComponentShown(evt);
            }
        });
        tableScrollPane.setViewportView(tablesSelectedTable);

        jLabel4.setText("Selected Columns");

        ColumnsComboBox.setModel(new javax.swing.DefaultComboBoxModel());
        ColumnsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColumnsComboBoxActionPerformed(evt);
            }
        });

        ColumnsSelectedList.setModel(listModel);
        ColumnsSelectedList.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setViewportView(ColumnsSelectedList);

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteButton)
                .addContainerGap(392, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(DeleteButton)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 48, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("List of Columns", jPanel4);

        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Create Substitution Rule");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ColumnsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTabbedPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ColumnsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Exit
       dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tablesSelectedTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tablesSelectedTableComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_tablesSelectedTableComponentShown

    private void tablesSelectedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesSelectedTableMouseClicked
        // select table from the window
        firstTimeSelected = true;
        ColumnsComboBox.removeAllItems();
        listModel.removeAllElements();
        int row = tablesSelectedTable.rowAtPoint(evt.getPoint());
        String tableSelected = tableNames.get(row);
        for (Column column : database.tables.get(tableSelected).columns) {
            ColumnsComboBox.addItem(column.name);
        }
        firstTimeSelected = false;
    }//GEN-LAST:event_tablesSelectedTableMouseClicked

    private void ColumnsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColumnsComboBoxActionPerformed
        // TODO add your handling code here:
        if (!firstTimeSelected) {
            String column = (String) ColumnsComboBox.getSelectedItem();
            listModel.addElement(column);
        }
    }//GEN-LAST:event_ColumnsComboBoxActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // create new substitution rule
         File tempFile = new File("temp_file1.xml");

        MaskingSetDocument doc = null;


        ArrayList<String> columns = new ArrayList<>();
        for (Object column : listModel.toArray()) {
            columns.add((String) column);
        }
        try {
            doc = MaskingSetDocument.Factory.parse(tempFile);
        } catch (XmlException | IOException ex) {
            Logger.getLogger(NewShuffleRuleWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        Rules rulesInSet = doc.getMaskingSet().getRules();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        listModel.removeElement(ColumnsSelectedList.getSelectedValue().toString());
    }//GEN-LAST:event_DeleteButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(NewSubstitutionRuleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewSubstitutionRuleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewSubstitutionRuleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewSubstitutionRuleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewSubstitutionRuleWindow().setVisible(true);
        
                } catch(SQLException ex){
                    Logger.getLogger(NewShuffleRuleWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ColumnsComboBox;
    private javax.swing.JList ColumnsSelectedList;
    private javax.swing.JButton DeleteButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JTable tablesSelectedTable;
    // End of variables declaration//GEN-END:variables
}
