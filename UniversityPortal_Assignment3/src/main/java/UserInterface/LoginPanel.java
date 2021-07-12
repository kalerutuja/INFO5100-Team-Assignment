/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.University.University;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author swaroopgupta
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    JPanel mainWorkArea;
    University university;
    Map<String, String> usernamePasswordMap;
    Map<String, Object> usernameProfileMap;
    public LoginPanel(JPanel mainWorkArea,University university) {
        initComponents();
        this.university = university;
        this.mainWorkArea = mainWorkArea;
        usernamePasswordMap = new HashMap();
        usernameProfileMap = new HashMap();
        populateUserMaps();       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblRoles = new javax.swing.JLabel();
        cmbRoles = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 181, 204));

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(lblImage)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(lblImage)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -3, 310, 700));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("University Performance Measure");

        txtUserName.setForeground(new java.awt.Color(153, 153, 153));
        txtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        lblUsername.setText("Username: ");

        lblPassword.setText("Password: ");

        lblRoles.setText("Choose Roles: ");

        cmbRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Faculty", "Student" }));
        cmbRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRolesActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(lblPassword)
                            .addComponent(lblRoles))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbRoles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(lblTitle)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoles)
                    .addComponent(cmbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 570, 690));
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void cmbRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRolesActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String errorMessage = fetchErrorMessageForCredentials();
        if (!errorMessage.isEmpty()){
            StringBuilder builder = new StringBuilder();
            builder.append("Please correct following "
                    + "details to continue -");
            builder.append("\n");
            builder.append(errorMessage);        
            JOptionPane.showMessageDialog(this, builder.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            return;
        } 

        if(!validateCredentials()) {
            JOptionPane.showMessageDialog(this, "Invalid Username and Password"
                    ,"Error",JOptionPane.ERROR_MESSAGE);
            return;
        } 
        String role = (String) cmbRoles.getSelectedItem();
        if("Admin".equals(role)) {
            SummaryPanel sp = new SummaryPanel(mainWorkArea,university);
            mainWorkArea.add("SummaryPanel", sp);
            CardLayout layout = (CardLayout) mainWorkArea.getLayout();
            layout.next(mainWorkArea); 
        } else if ("Student".equals(role)) {
            String username = txtUserName.getText();
            StudentProfile sp = (StudentProfile) usernameProfileMap.get(username);
            
            StudentPanel studentPanel = new StudentPanel(mainWorkArea,sp,university);
            mainWorkArea.add("StudentPanel", studentPanel);
            CardLayout layout = (CardLayout) mainWorkArea.getLayout();
            layout.next(mainWorkArea); 
            
            
        } else {
            String username = txtUserName.getText();
            FacultyProfile fp = (FacultyProfile) usernameProfileMap.get(username);
            FacultyPanel facultyPanel = new FacultyPanel(mainWorkArea,fp, university);
            mainWorkArea.add("FacultyPanel", facultyPanel);
            CardLayout layout = (CardLayout) mainWorkArea.getLayout();
            layout.next(mainWorkArea);
        }
        
        
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbRoles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRoles;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private String fetchErrorMessageForCredentials() {
        StringBuilder builder = new StringBuilder();
        builder.append("");
        builder.append(fetchErrorMessageForUserName());
        builder.append(fetchErrorMessageForPassword());
        return builder.toString().trim();    
    }

    private String fetchErrorMessageForUserName() {
        String errorMessage = "";
        if(txtUserName.getText().isEmpty()) {
            errorMessage = "Please fill the username\n";
            return errorMessage;
        }
        if(!txtUserName.getText().matches("^[a-zA-Z,0-9,.,-,_]+$")){
            errorMessage = "Username is not valid\n ";
        }       
        return errorMessage;
    }

    private String fetchErrorMessageForPassword() {
        String errorMessage = "";
        if(txtPassword.getText().isEmpty()) {
            errorMessage = "Please fill the password\n";
        }
        return errorMessage;
    }

    private boolean validateCredentials() {
        String usernameInput = txtUserName.getText();
        String passwordInput = txtPassword.getText(); 
        String role = (String)cmbRoles.getSelectedItem();
        if("Admin".equals(role)) {
            return usernameInput.equals("admin") 
                    && passwordInput.equals("password");
        }
        if(usernamePasswordMap.containsKey(usernameInput)) {
            String pass = usernamePasswordMap.get(usernameInput);
            if(pass.equals(passwordInput)) {
                return true;
            }
        }
        return false;   
    }

    private void populateUserMaps() {
        List<Department> dptList = university.getAllDepartments();
        dptList.forEach(dpt-> {
            StudentDirectory sd = dpt.getStudentDirectory();
            List<StudentProfile> spList = sd.getStudentlist();
            spList.forEach(sp->{
                String username = sp.getPerson().getId();
                usernamePasswordMap.put(username
                        , sp.getPerson().getPassword());               
                usernameProfileMap.put(username, sp);
            });
            FacultyDirectory fd = dpt.getFacultydirectory();
            List<FacultyProfile> fpList = fd.getTeacherlist();
            fpList.forEach(faculty->{
                String username = faculty.getPerson().getId();
                usernamePasswordMap.put(username
                        , faculty.getPerson().getPassword());               
                usernameProfileMap.put(username, faculty);          
            });  
        });
    }
}
