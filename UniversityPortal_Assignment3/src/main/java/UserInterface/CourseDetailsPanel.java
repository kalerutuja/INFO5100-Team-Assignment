/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Persona.Transcript;
import info5100.university.example.University.University;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Surbhi
 */
public class CourseDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorRatingPanel
     */
    JPanel mainWorkArea;
    SeatAssignment seatAssignment;
    StudentProfile studentProfile;
    University university;
    
    public CourseDetailsPanel(JPanel mainWorkArea,SeatAssignment seatAssignment, 
            StudentProfile studentProfile, University university) {
        initComponents();
        this.seatAssignment =seatAssignment;
        this.mainWorkArea = mainWorkArea;
        this.studentProfile = studentProfile;
        this.university = university;
        
        txtCourseName.setText(seatAssignment.getCourseName());
        txtSemester.setText(seatAssignment.getCourseload().getSemester());
        txtCredits.setText(String.valueOf(seatAssignment.getCreditHours()));
        txtGrade.setText(String.valueOf(seatAssignment.getGrade()));
        txtProfessorName.setText(seatAssignment.getSeat().getCourseOffer().getFacultyProfile().getPerson().getId());   
        cmbRating.setSelectedIndex(seatAssignment.getFacultyEval());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCourseDetails = new javax.swing.JLabel();
        lblCourseName = new javax.swing.JLabel();
        lblSemester = new javax.swing.JLabel();
        lblCredits = new javax.swing.JLabel();
        lblGrades = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        txtSemester = new javax.swing.JTextField();
        txtCredits = new javax.swing.JTextField();
        txtGrade = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtProfessorName = new javax.swing.JTextField();
        cmbRating = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        lblRating = new javax.swing.JLabel();
        lblProfessorName = new javax.swing.JLabel();
        lblRateProfessor = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        lblCourseDetails.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblCourseDetails.setText("   Course Details");
        lblCourseDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCourseName.setText("Course Name:");

        lblSemester.setText("Semester: ");

        lblCredits.setText("Credits: ");

        lblGrades.setText("Grade: ");

        txtCourseName.setEditable(false);
        txtCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseNameActionPerformed(evt);
            }
        });

        txtSemester.setEditable(false);

        txtCredits.setEditable(false);

        txtGrade.setEditable(false);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        txtProfessorName.setEditable(false);

        cmbRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblRating.setText("Rating: ");

        lblProfessorName.setText("Professor Name: ");

        lblRateProfessor.setText("Rate your Professor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRateProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRating, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProfessorName))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProfessorName)
                            .addComponent(cmbRating, 0, 102, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnSubmit)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRateProfessor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfessorName)
                    .addComponent(txtProfessorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRating)
                    .addComponent(cmbRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(btnBack)
                            .addGap(105, 105, 105)
                            .addComponent(lblCourseDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(58, 58, 58)
                                    .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCourseName)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(274, 274, 274)
                            .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCourseName, lblCredits, lblGrades, lblSemester});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblCourseDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCourseName)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSemester)
                    .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCredits)
                    .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGrades)
                    .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCourseName, txtCredits, txtGrade, txtSemester});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCourseName, lblCredits, lblGrades, lblSemester});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int eval = Integer.valueOf((String)cmbRating.getSelectedItem());
        seatAssignment.setFacultyEval(eval);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        StudentPanel sp = new StudentPanel(mainWorkArea,studentProfile, university);
        mainWorkArea.add("StudentPanel", sp);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);   
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbRating;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCourseDetails;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblCredits;
    private javax.swing.JLabel lblGrades;
    private javax.swing.JLabel lblProfessorName;
    private javax.swing.JLabel lblRateProfessor;
    private javax.swing.JLabel lblRating;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtCredits;
    private javax.swing.JTextField txtGrade;
    private javax.swing.JTextField txtProfessorName;
    private javax.swing.JTextField txtSemester;
    // End of variables declaration//GEN-END:variables
}
