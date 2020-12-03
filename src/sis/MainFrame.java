/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Dipendra
 */
public class MainFrame extends javax.swing.JFrame {
    boolean editmode = false;
    String id;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        editModeChange(editmode);
        fillStudentDataToTable(studentTable,"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        contactField = new javax.swing.JTextField();
        courseField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        savBtn = new javax.swing.JButton();
        modeBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        addStudentMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "fullname", "email", "address", "contact_no", "course_enrolled"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Student Information");

        searchTextField.setToolTipText("search");
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });

        jLabel1.setText("Name");

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Email");

        jLabel4.setText("Address");

        jLabel5.setText("Contact no");

        jLabel6.setText("Course");

        savBtn.setText("Edit");
        savBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savBtnActionPerformed(evt);
            }
        });

        modeBtn.setText("Change to Edit mode");
        modeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeBtnActionPerformed(evt);
            }
        });

        addBtn.setText("add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        error.setForeground(new java.awt.Color(255, 0, 0));

        jMenu1.setText("File");

        addStudentMenu.setText("Add New Student");
        addStudentMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentMenuActionPerformed(evt);
            }
        });
        jMenu1.add(addStudentMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField)
                            .addComponent(emailField)
                            .addComponent(addressField)
                            .addComponent(contactField)
                            .addComponent(courseField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(error)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(savBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modeBtn)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 365, Short.MAX_VALUE)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchTextField))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(modeBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(9, 9, 9)
                        .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)
                        .addComponent(courseField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(savBtn)
                                    .addComponent(addBtn)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(error)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentMenuActionPerformed
       new AddNewStudent().setVisible(true);
    }//GEN-LAST:event_addStudentMenuActionPerformed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        String query = searchTextField.getText();
        fillStudentDataToTable(studentTable, query);
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void modeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeBtnActionPerformed
      if(!editmode){
       editmode=true;
       editModeChange(editmode);
       modeBtn.setText("Chage to normal mode");
      }else{
        editmode=false;
        editModeChange(editmode);
        modeBtn.setText("Change to edit mode");
      }
    }//GEN-LAST:event_modeBtnActionPerformed

    private void savBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savBtnActionPerformed
      String name = nameField.getText();
      String email = emailField.getText();
      String add = addressField.getText();
      String contact = contactField.getText();
      String course = courseField.getText();
      
      DbConnection db = new DbConnection();
      Connection  conn = db.getConnection();
      
      PreparedStatement pst;
      
      try{
        pst = conn.prepareStatement("UPDATE student SET fullname=?,email=?,address=?,contact_no=?,course_enrolled=? WHERE id=?");
        pst.setString(1,name);
        pst.setString(2, email);
        pst.setString(3, add);
        pst.setString(4,contact);
        pst.setString(5, course);
        pst.setInt(6,Integer.parseInt(id));
        if(pst.executeUpdate()==1){
          JOptionPane.showMessageDialog(rootPane,"successfully updated");
            this.dispose();
            new MainFrame().setVisible(true);
        }else{
         JOptionPane.showMessageDialog(rootPane,"sorry error occured");
        }
      }catch(SQLException ex){
          JOptionPane.showMessageDialog(rootPane,ex.getMessage());
      }
      
    }//GEN-LAST:event_savBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
         String name = nameField.getText();
       String address = addressField.getText();
       String email = emailField.getText();
       String contact = contactField.getText();
       String course = courseField.getText();
       if(!name.equals("") && !address.equals("")&&!email.equals("")&&!contact.equals("")&&!course.equals("")){
         DbConnection db = new DbConnection();
         Connection conn = db.getConnection();
         PreparedStatement pst;
         try{
           pst = conn.prepareStatement("INSERT INTO student(fullname,email,address,contact_no,course_enrolled)VALUES(?,?,?,?,?)");
           pst.setString(1, name);
           pst.setString(2, email);
           pst.setString(3, address);
           pst.setString(4, contact);
           pst.setString(5, course);
           if(pst.executeUpdate()>0){
               JOptionPane.showMessageDialog(rootPane,"Successfully Inserted");
               this.dispose();
               new MainFrame().setVisible(true);
              
           }else{
             error.setText("Could not insert data");
             error.setVisible(true);
           }
         }catch(SQLException ex){
           error.setText(ex.getMessage());
           error.setVisible(true);
         }
         
       }
    }//GEN-LAST:event_addBtnActionPerformed


    public void fillStudentDataToTable(JTable table,String searchText){
        
      DbConnection db = new DbConnection();
      Connection conn = db.getConnection();
      PreparedStatement ps;
      DefaultTableModel model = (DefaultTableModel) table.getModel();
      Object[] row;
     if(searchText.equals("")){
      //all the data
         try{
           ps = conn.prepareStatement("SELECT * FROM student");
           ResultSet rs = ps.executeQuery();
           model.setRowCount(0);
           while(rs.next()){
            row = new Object[6];
            row[0] = rs.getString(1);
            row[1] = rs.getString(2);
            row[2] = rs.getString(3);
            row[3] = rs.getString(4);
            row[4] = rs.getString(5);
            row[5] = rs.getString(6);
            model.addRow(row);
           }
             
         }catch(SQLException ex){
          System.out.println(ex.getMessage());
         }
     }else{
      //according to search text
      try{
           ps = conn.prepareStatement("SELECT * FROM student WHERE concat(fullname,email,address,contact_no,course_enrolled) LIKE ?");
           ps.setString(1,"%"+searchText+"%");
           ResultSet rs = ps.executeQuery();
           model.setRowCount(0);
           while(rs.next()){
            row = new Object[5];
            row[0] = rs.getString(1);
            row[1] = rs.getString(2);
            row[2] = rs.getString(3);
            row[3] = rs.getString(4);
            row[4] = rs.getString(5);
            row[5] = rs.getString(6);
            model.addRow(row);
           }
             
         }catch(SQLException ex){
          System.out.println(ex.getMessage());
         }
     }
     table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
          @Override
          public void valueChanged(ListSelectionEvent e) {
              nameField.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
              emailField.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
              addressField.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
              contactField.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
              courseField.setText(table.getValueAt(table.getSelectedRow(), 5).toString());
              id = table.getValueAt(table.getSelectedRow(),0).toString();
          }
     });
    
    }
    public void editModeChange(Boolean mode){
      nameField.setEditable(mode);
      emailField.setEditable(mode);
      addressField.setEditable(mode);
      contactField.setEditable(mode);
      courseField.setEditable(mode);
      savBtn.setVisible(mode);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JMenuItem addStudentMenu;
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField contactField;
    private javax.swing.JTextField courseField;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modeBtn;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton savBtn;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables
}
