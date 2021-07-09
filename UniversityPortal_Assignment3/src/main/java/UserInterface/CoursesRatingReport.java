/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Department.Department;
import info5100.university.example.University.University;
import info5100.university.reports.CourseRatingData;
import info5100.university.reports.SubReportDTO;
import java.awt.CardLayout;
import static java.lang.Math.random;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author swaroopgupta
 */
public class CoursesRatingReport extends javax.swing.JPanel {

    /**
     * Creates new form Courses_Internship_Report
     */
    JPanel workArea;
    University university;
    Department department;
    private static Random random = new Random();
    private static DecimalFormat df = new DecimalFormat("0.00");
    
    public CoursesRatingReport(JPanel workArea, University university) {
        initComponents();
        this.workArea = workArea;
        this.university = university;

        refreshTable(cmbCourses.getSelectedItem());
        populateComboBox();

    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourses_Rating_Report = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbCourses = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tblCourses_Rating_Report.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblCourses_Rating_Report.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Rating", "No of Students rated"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCourses_Rating_Report);

        btnBack.setText("Back<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Report of Courses vs Internships");

        cmbCourses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course" }));
        cmbCourses.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                cmbCoursesComponentAdded(evt);
            }
        });
        cmbCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCoursesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Select Course");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(cmbCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCoursesActionPerformed
        // TODO add your handling code here:
        refreshTable(cmbCourses.getSelectedItem());
    }//GEN-LAST:event_cmbCoursesActionPerformed


    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        SummaryPanel sp = new SummaryPanel(workArea, university);
        workArea.add("SummaryPanel", sp);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbCoursesComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_cmbCoursesComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCoursesComponentAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbCourses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCourses_Rating_Report;
    // End of variables declaration//GEN-END:variables

    private void refreshTable(Object selectedItem) {
        DefaultTableModel model = (DefaultTableModel) tblCourses_Rating_Report.getModel();
        model.setRowCount(0);
        List<CourseRatingData> resultList = generateCourseRatingDataReport(university);
        for (CourseRatingData courseRatingData: resultList){
                Object row[] = new Object[2];
                row[0] = df.format(courseRatingData.getCourseRating());
                row[1] = courseRatingData.getStudentsRated();
                model.addRow(row);
                break;
        }
    }

    private static List<CourseRatingData> generateCourseRatingDataReport(University university) {
        List<CourseRatingData> resultList = new ArrayList<>();
        List<Course> courseList = new ArrayList<>();
        CourseRatingData courseRatingData;
        int nOfStudents = 100;
        int count = 1;
        for (Department dept : university.getAllDepartments()) {
            courseList = dept.getCourses();}
            if (courseList != null && courseList.size() > 0) {
                for (Course c : courseList) {
                    courseRatingData = new CourseRatingData();
                    courseRatingData.setCourseNumber(c.getCourseNumber());
                    courseRatingData.setCourseRating(random.nextFloat() * 5);
                    courseRatingData.setStudentsRated((int) (Math.random() * nOfStudents));
                    resultList.add(courseRatingData);
                }

            
        }
        resultList.sort((CourseRatingData c1, CourseRatingData c2)
                -> {
            return Double.valueOf(c2.getCourseRating()).compareTo(Double.valueOf(c1.getCourseRating()));
        });
        return resultList;
    }

    private void populateComboBox() {
        cmbCourses.removeAllItems();
        for (Department dept : university.getAllDepartments()) {
            ArrayList<Course> course = dept.getCourseCatalog().getCourseList();
            for (Course c : course) {
                cmbCourses.addItem(c.getCourseNumber());
            }
        }
    }
    
}
