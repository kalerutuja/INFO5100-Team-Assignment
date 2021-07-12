/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.University.University;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Surbhi
 */
public class FacultyPanel extends javax.swing.JPanel {

    /**
     * Creates new form FacultyPanel
     */
    JPanel mainWorkArea;
    FacultyProfile facultyProfile;
    University university;
    
    public FacultyPanel(JPanel mainWorkArea, FacultyProfile facultyProfile, University university) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.facultyProfile = facultyProfile;
        this.university = university;
           
        lblTitle.setText("Welcome " + facultyProfile.getPerson().getFullName() + " to faculty dashboard");
        
        GradeStudentsPanel gradeStudentsPanel = new GradeStudentsPanel(mainWorkArea, facultyProfile, university);
        JPGradeStudentsPanel.add("GradeStudentsPanel",gradeStudentsPanel);
        CardLayout coursesLayout = (CardLayout)JPGradeStudentsPanel.getLayout();
        coursesLayout.next(JPGradeStudentsPanel);
       
        FacultyProfilePanel facultyProfilePanel = new FacultyProfilePanel(mainWorkArea, facultyProfile);
        JPFacultyProfilePanel.add("FacultyProfilePanel",facultyProfilePanel);
        CardLayout facultyProfileLayout = (CardLayout)JPFacultyProfilePanel.getLayout();
        facultyProfileLayout.next(JPFacultyProfilePanel);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        JPFacultyProfilePanel = new javax.swing.JPanel();
        JPGradeStudentsPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 255, 255));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("<Welcome Message>");
        lblTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTabbedPane1.setBackground(new java.awt.Color(153, 255, 255));

        JPFacultyProfilePanel.setLayout(new java.awt.CardLayout());
        jTabbedPane1.addTab("Course taught", JPFacultyProfilePanel);

        JPGradeStudentsPanel.setLayout(new java.awt.CardLayout());
        jTabbedPane1.addTab("Grade Students", JPGradeStudentsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnLogout)
                .addGap(102, 102, 102)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(119, 119, 119)
                    .addComponent(jTabbedPane1)
                    .addGap(120, 120, 120)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout))
                .addContainerGap(532, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(jTabbedPane1)
                    .addGap(111, 111, 111)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        LoginPanel loginPanel = new LoginPanel(mainWorkArea,university);
        mainWorkArea.add("LoginPanel", loginPanel);
        CardLayout layout = (CardLayout)mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPFacultyProfilePanel;
    private javax.swing.JPanel JPGradeStudentsPanel;
    private javax.swing.JButton btnLogout;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
