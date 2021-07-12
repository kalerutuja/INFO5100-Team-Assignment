/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import info5100.university.example.University.University;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author swaroopgupta
 */
public class SummaryPanel extends javax.swing.JPanel {

    /**
     * Creates new form SummaryPanel
     */
    private JPanel workArea;
    University university;
    public SummaryPanel(JPanel workArea,University university) {
        initComponents();
        this.workArea = workArea;
        this.university = university;
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
        jPanel1 = new javax.swing.JPanel();
        btnGPAReport = new javax.swing.JButton();
        btnCourse_Internships = new javax.swing.JButton();
        btnCourseRating = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 4));
        jPanel1.setEnabled(false);

        btnGPAReport.setText("Report for GPA v/s Industrial Success");
        btnGPAReport.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnGPAReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGPAReportActionPerformed(evt);
            }
        });

        btnCourse_Internships.setText("Report of Courses vs Internships");
        btnCourse_Internships.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCourse_Internships.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourse_InternshipsActionPerformed(evt);
            }
        });

        btnCourseRating.setText("Course Rating");
        btnCourseRating.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCourseRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseRatingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCourseRating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCourse_Internships, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGPAReport, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(btnGPAReport, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCourse_Internships, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCourseRating, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnLogout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addGap(71, 71, 71)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCourse_InternshipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourse_InternshipsActionPerformed
        
        CoursesInternshipReport CoursesInternshipReport = new CoursesInternshipReport(workArea,university);
        workArea.add("CoursesInternshipReport", CoursesInternshipReport);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnCourse_InternshipsActionPerformed

    private void btnGPAReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGPAReportActionPerformed
        // TODO add your handling code here:
        GPA_Report gpaReport = new GPA_Report(workArea,university);
        workArea.add("GPAReport", gpaReport);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
      
    }//GEN-LAST:event_btnGPAReportActionPerformed

    private void btnCourseRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseRatingActionPerformed
        // TODO add your handling code here:
        CoursesRatingReport courseReport = new CoursesRatingReport(workArea,university);
        workArea.add("CoursesRatingReport", courseReport);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnCourseRatingActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginPanel loginPanel = new LoginPanel(workArea,university);
        workArea.add("LoginPanel", loginPanel);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnLogoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourseRating;
    private javax.swing.JButton btnCourse_Internships;
    private javax.swing.JButton btnGPAReport;
    private javax.swing.JButton btnLogout;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
