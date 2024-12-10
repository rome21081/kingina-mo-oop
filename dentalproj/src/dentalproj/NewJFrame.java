
package dentalproj;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
        connect();
        fillTable();
    }

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
     public void connect() {
        try {
            String uname = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3307/dentist";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, uname, pass);
            JOptionPane.showMessageDialog(null, "Connected to the database...");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
     public void clear (){
         txtId.setText("");
         txtaddress.setText("");
         txtage.setText("");
         txtcase.setText("");
         txtcontact.setText("");
         txtfname.setText("");
         txtgender.setText("");
         txtlastdentalV.setText("");
         txtlastn.setText("");
         txtmedication.setText("");
         txtnextden.setText("");
      }
       
     public void fillTable(){
         jTable1.setModel (new DefaultTableModel(null,
         new String []{"patientID","first_name","last_name","age","gender","cp_number","address","case_description","last_visitation","next_visitation"}));
         
         try{
             ps = con.prepareStatement("SELECT * FROM patients");
             rs = ps.executeQuery();
             while(rs.next()){
             String patientID = rs.getString(1);
             String firstName = rs.getString(2);
             String lastName = rs.getString(3);
             String age = rs.getString(4);
             String gender = rs.getString(5);
             String contactNo = rs.getString(6);
             String address = rs.getString(7);
             String caseDesc = rs.getString(8);
             String medication = rs.getNString(9);
             String lastDentalVisit = rs.getString(10);
             String nextDentalVisit = rs.getString(11);
             String tblData [] = {patientID,firstName,lastName,age,gender,contactNo,address,caseDesc,medication,lastDentalVisit,nextDentalVisit};
             DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
             tblModel.addRow(tblData);
          
             }
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
         }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        panel2 = new java.awt.Panel();
        jLabel14 = new javax.swing.JLabel();
        txtnextden = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtlastn = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcase = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtmedication = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtlastdentalV = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtsearch = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("Next Dental Visit:");

        jLabel15.setText("Patient ID:");

        jLabel10.setText("Address:");

        jLabel11.setText("Case description:");

        jLabel12.setText("Medication:");

        jLabel5.setText("Age:");

        jLabel6.setText("Gender:");

        jLabel2.setText("First name:");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Contact no:");

        jLabel4.setText("Last Name:");

        jLabel13.setText("Last Dental Visit:");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcase, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmedication, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlastdentalV, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlastn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnextden, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtlastn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmedication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtlastdentalV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnextden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_exit)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_delete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsearchKeyTyped(evt);
            }
        });

        jLabel16.setText("Search");

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
      String patientID = txtId.getText();
    String firstName = txtfname.getText();
    String lastName = txtlastn.getText();
    String age = txtage.getText();
    String gender = txtgender.getText();
    String address = txtaddress.getText();
    String contactNo = txtcontact.getText();
    String caseDesc = txtcase.getText();
    String medication = txtmedication.getText();
    String lastDentalVisit = txtlastdentalV.getText();
    String nextDentalVisit = txtnextden.getText();
 
    
    try{


ps = con.prepareStatement("first_name = '"+firstName+"'");



ps.executeUpdate();  // Execute the update statement

     JOptionPane.showMessageDialog(null, "Record Updated....", "Information", JOptionPane.INFORMATION_MESSAGE);
     fillTable();
    }catch(Exception e){
     JOptionPane.showMessageDialog(null, "Error Updating....", "Information", JOptionPane.INFORMATION_MESSAGE);
    }
    

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
  String patientID = txtId.getText();
    String firstName = txtfname.getText();
    String lastName = txtlastn.getText();
    String age = txtage.getText();
    String gender = txtgender.getText();
    String address = txtaddress.getText();
    String contactNo = txtcontact.getText();
    String caseDesc = txtcase.getText();
    String medication = txtmedication.getText();
    String lastDentalVisit = txtlastdentalV.getText();
    String nextDentalVisit = txtnextden.getText();
    String search = txtsearch.getText();


    if (patientID.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || age.isEmpty() || gender.isEmpty() 
            || address.isEmpty() || contactNo.isEmpty() || caseDesc.isEmpty() || medication.isEmpty() 
            || lastDentalVisit.isEmpty() || nextDentalVisit.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill up all the fields....", "Try Again", JOptionPane.ERROR_MESSAGE);
    } else { 
        try {
           
            String sql = "INSERT INTO patients (patientID, first_name, last_name, age, gender, cp_number, address, "
                    + "case_description, medication, last_visitation, next_visitation) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

         
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                
                ps.setString(1, patientID);
                ps.setString(2, firstName);
                ps.setString(3, lastName);
                ps.setString(4, age); 
                ps.setString(5, gender);
                ps.setString(6, contactNo);
                ps.setString(7, address);
                ps.setString(8, caseDesc);
                ps.setString(9, medication);
                ps.setString(10, lastDentalVisit); 
                ps.setString(11, nextDentalVisit); 

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Inserted....", "Information", JOptionPane.INFORMATION_MESSAGE);
                clear();
                fillTable();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error inserting record: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
   String Pid = txtId.getText();
if (Pid == null || Pid.trim().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please select or enter a patient ID first.",
            "Warning", JOptionPane.WARNING_MESSAGE);
    return; 
}

try {
    ps = con.prepareStatement("DELETE FROM patients WHERE patientID = ?");
    ps.setString(1, Pid); 
    int result = JOptionPane.showConfirmDialog(null, 
            "Click 'OK' if you want to delete this record.",
            "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (result == JOptionPane.YES_OPTION) {
        int rowsAffected = ps.executeUpdate(); 
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Record Deleted.",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No record found with the given Patient ID.",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    clear(); 
    fillTable(); 
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(),
            "Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
           int result = JOptionPane.showConfirmDialog(null,"Are you sure you want to exti?",
       "Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       
       if (result == JOptionPane.YES_OPTION){
       System.exit(0);}
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
       clear();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        String search = txtsearch.getText();
        jTable1.setModel (new DefaultTableModel(null,
         new String []{"patientID","first_name","last_name","age","gender","cp_number","address","case_description","last_visitation","next_visitation"}));
         
         try{
             ps = con.prepareStatement("SELECT * FROM patients WHERE patientID = '"+search+"'");
             rs = ps.executeQuery();
             while(rs.next()){
             String patientID = rs.getString(1);
             String firstName = rs.getString(2);
             String lastName = rs.getString(3);
             String age = rs.getString(4);
             String gender = rs.getString(5);
             String contactNo = rs.getString(6);
             String address = rs.getString(7);
             String caseDesc = rs.getString(8);
             String medication = rs.getNString(9);
             String lastDentalVisit = rs.getString(10);
             String nextDentalVisit = rs.getString(11);
             String tblData [] = {patientID,firstName,lastName,age,gender,contactNo,address,caseDesc,medication,lastDentalVisit,nextDentalVisit};
             DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
             tblModel.addRow(tblData);
             }
             
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
         }
          
        
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyTyped
       fillTable();
    }//GEN-LAST:event_txtsearchKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      int noOfRow = jTable1.getSelectedRow();
      String click = (jTable1.getModel().getValueAt(noOfRow, 0).toString());
      try{
          ps = con.prepareStatement("SELECT * FROM patients WHERE patientID = '"+click+"' ");
          rs = ps.executeQuery();
          if(rs.next()){
            txtId.setText(rs.getString("patientID"));
            txtfname.setText(rs.getString("first_name"));
            txtlastn.setText(rs.getString("last_name"));
            txtage.setText(rs.getString("age"));
            txtgender.setText(rs.getString("gender"));
            txtaddress.setText(rs.getString("gender"));
            txtcontact.setText(rs.getString("cp_number"));
            txtcase.setText(rs.getString("case_description"));
            txtmedication.setText(rs.getString("medication"));
            txtlastdentalV.setText(rs.getString("last_visitation"));
            txtnextden.setText(rs.getString("next_visitation"));
          
 
              
          }else{
               JOptionPane.showMessageDialog(null, "Information not found","Try Again", JOptionPane.ERROR_MESSAGE);
          }
      }catch(Exception e){
      JOptionPane.showMessageDialog(null, e);
      }
      
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btnsearch;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Panel panel2;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcase;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtlastdentalV;
    private javax.swing.JTextField txtlastn;
    private javax.swing.JTextField txtmedication;
    private javax.swing.JTextField txtnextden;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
