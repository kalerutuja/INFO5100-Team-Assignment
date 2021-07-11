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
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Surbhi
 */
public class CoursesPanel extends javax.swing.JPanel {

    /**
     * Creates new form TranscriptsPanel
     */
    JPanel mainWorkArea;
    StudentProfile studentProfile;
    University university;
    public CoursesPanel(JPanel mainWorkArea, 
            StudentProfile studentProfile,
            University university) {
       
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.studentProfile = studentProfile;
        this.university = university;
        txtStudentID.setText(studentProfile.getPerson().getId());
        txtCGPA.setText(String.valueOf(studentProfile.getGPA()));
        refreshTable();
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
        tblTranscripts = new javax.swing.JTable();
        lblCGPA = new javax.swing.JLabel();
        txtCGPA = new javax.swing.JTextField();
        lblStudentID = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        btnCourseDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        tblTranscripts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course Taken", "Grades", "Semester"
            }
        ));
        jScrollPane1.setViewportView(tblTranscripts);

        lblCGPA.setText("CGPA: ");

        txtCGPA.setEditable(false);

        lblStudentID.setText("Student ID: ");

        txtStudentID.setEditable(false);
        txtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentIDActionPerformed(evt);
            }
        });

        btnCourseDetails.setText("Course Details");
        btnCourseDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnCourseDetails)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentID)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCGPA)
                    .addComponent(txtCGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCourseDetails)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCourseDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblTranscripts.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(null, " Please select a row! ", 
                    "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }  
        DefaultTableModel model = (DefaultTableModel) tblTranscripts.getModel(); 
        SeatAssignment selectedSeat = (SeatAssignment)model.getValueAt(selectedRowIndex, 0);
   
        CourseDetailsPanel cdp = new CourseDetailsPanel(mainWorkArea,
                selectedSeat, studentProfile, university);
        mainWorkArea.add("CourseDetailsPanel", cdp);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea); 
        
    }//GEN-LAST:event_btnCourseDetailsActionPerformed

    private void txtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourseDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCGPA;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JTable tblTranscripts;
    private javax.swing.JTextField txtCGPA;
    private javax.swing.JTextField txtStudentID;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) tblTranscripts.getModel();
        model.setRowCount(0);
        List<SeatAssignment> result =  studentProfile.getSeatAssignments() ;
        result.sort((SeatAssignment sa1, SeatAssignment sa2) -> {
            return compareSemester(sa1, sa2);
        });
        for (SeatAssignment sa: result){
                Object row[] = new Object[3];
                row[0] = sa;
                row[1] = sa.getGrade();
                row[2] = sa.getCourseload().getSemester();
                model.addRow(row);
        }  
    }
    
    public int compareSemester(SeatAssignment sa1, SeatAssignment sa2) {
        String semester1 = sa1.getCourseload().getSemester();
        String[] yearSessionArr1 = semester1.split(" ");
        String year1 = yearSessionArr1[0];
        String session1 = yearSessionArr1[1];

        String semester2 = sa2.getCourseload().getSemester();
        String[] yearSessionArr2 = semester2.split(" ");
        String year2 = yearSessionArr2[0];
        String session2 = yearSessionArr2[1];

        if(year1.equals(year2)) {
            return session1.compareTo(session2);
        } else {
            return year1.compareTo(year2);
        }
    }
}
