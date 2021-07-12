/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.University.University;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author swaroopgupta
 */
public class GradeStudentsPanel extends javax.swing.JPanel {

    /**
     * Creates new form GradeStudentsPanel
     */
    JPanel mainWorkArea;
    FacultyProfile facultyProfile;
    University university;
    public GradeStudentsPanel(JPanel mainWorkArea, FacultyProfile facultyProfile, University university) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.facultyProfile = facultyProfile;
        this.university = university;
        
        populateCoursesCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCourseSelection = new javax.swing.JLabel();
        lblStudentSelection = new javax.swing.JLabel();
        cmbCourses = new javax.swing.JComboBox<>();
        cmbStudents = new javax.swing.JComboBox<>();
        lblStudentGrade = new javax.swing.JLabel();
        btnChanges = new javax.swing.JButton();
        cmbGrades = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 255, 255));

        lblCourseSelection.setText("Select Course :");

        lblStudentSelection.setText("Select Student :");

        cmbCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCoursesActionPerformed(evt);
            }
        });

        cmbStudents.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmbStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStudentsActionPerformed(evt);
            }
        });

        lblStudentGrade.setText("Grade :");

        btnChanges.setText("Save");
        btnChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangesActionPerformed(evt);
            }
        });

        cmbGrades.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblStudentSelection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCourseSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblStudentGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnChanges)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCourseSelection)
                    .addComponent(cmbCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentSelection)
                    .addComponent(cmbStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGrades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnChanges)
                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCoursesActionPerformed
        if(cmbCourses.getSelectedItem() != null)
            populateStudentCombo(cmbCourses.getSelectedItem());
    }//GEN-LAST:event_cmbCoursesActionPerformed

    private void cmbStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStudentsActionPerformed
        if(cmbStudents.getSelectedItem() != null)
            populateGradesCombo(cmbStudents.getSelectedItem());
    }//GEN-LAST:event_cmbStudentsActionPerformed

    private void btnChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangesActionPerformed
        
        String courseSelected = (String) cmbCourses.getSelectedItem();
        StudentProfile sp = (StudentProfile) cmbStudents.getSelectedItem();
        float grade = (float) 4.0;
        if(cmbGrades.getSelectedItem() != null)
            grade = Float.valueOf((String)cmbGrades.getSelectedItem());
        
        if(sp != null){
            for(SeatAssignment seatAssignment :  sp.getSeatAssignments()){
                if(seatAssignment.getSeat().getCourseOffer().getCourseNumber().equals(courseSelected)){
                    seatAssignment.setGrade(grade);
                    JOptionPane.showMessageDialog(this, "Graded Successfully !");
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnChangesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChanges;
    private javax.swing.JComboBox<String> cmbCourses;
    private javax.swing.JComboBox<String> cmbGrades;
    private javax.swing.JComboBox<Object> cmbStudents;
    private javax.swing.JLabel lblCourseSelection;
    private javax.swing.JLabel lblStudentGrade;
    private javax.swing.JLabel lblStudentSelection;
    // End of variables declaration//GEN-END:variables

    private void populateCoursesCombo() {
        
        Set<String> courseList = facultyProfile.getAllCoursesByFaculty();
        System.out.println("courseList by faculty : " + courseList);
        cmbCourses.removeAllItems();
        for(String c : courseList){
            cmbCourses.addItem(c);
        }
        cmbCourses.setSelectedItem(null);
    }

    private void populateStudentCombo(Object selectedItem) {
        
        List<StudentProfile> allStudents = university.getAllStudents();
        
        cmbStudents.removeAllItems();
        for(StudentProfile sp : allStudents)
        {
            CourseLoad selectedCourseLoads = sp.getCourseLoadBySemester("2021 Fall");
            
            if(selectedCourseLoads != null){

                List<SeatAssignment> seatAssignments = selectedCourseLoads.getSeatAssignments();
            
                for(SeatAssignment seatAssignment : seatAssignments)
                {
                    if(seatAssignment.getSeat().getCourseOffer().getCourse().getCourseNumber().equals(selectedItem)){
                        System.out.println("student enrolled :" + sp);
                        cmbStudents.addItem(sp);
                    }
                }
            }
        }

    }

    private void populateGradesCombo(Object selectedItem) {
        
        cmbGrades.removeAllItems();
        cmbGrades.addItem("4.0");
        cmbGrades.addItem("3.7");
        cmbGrades.addItem("3.3");
        cmbGrades.addItem("3.0");
    }
}
