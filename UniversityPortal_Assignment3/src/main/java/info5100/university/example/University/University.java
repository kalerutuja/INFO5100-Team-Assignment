/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.University;

import info5100.university.example.College.College;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.reports.CourseRatingData;
import info5100.university.reports.GPAReportData;
import info5100.university.reports.GradeRange;
import info5100.university.reports.SubReportDTO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Surbhi
 */
public class University {

    String name;
    ArrayList<College> collegeList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<College> getCollegeList() {
        return collegeList;
    }

    public void addNewCollege(College college) {
        collegeList.add(college);
    }

    public University(String name) {
        this.name = name;
        collegeList = new ArrayList<College>();
    }

    public int calculateRevenuesBySemester(String sem) {
        int sum = 0;
        for (College c : collegeList) {
            sum = sum + c.calculateRevenuesBySemester(sem);
        }
        return sum;

    }

    public void printRevenueBySemester(String semester) {
        System.out.println("Revenue Breakdown for Semester : " + semester);
        System.out.println("University : " + name);
        for (College c : collegeList) {
            c.printRevenueBySemester(semester);
        }
        System.out.println("Total revenue(in dollars): " + this.calculateRevenuesBySemester(semester));
    }

    public void printAllTeacherRatingsBySemester(String semester) {
        System.out.println("Faculty Rating for Semester : " + semester);
        System.out.println("University: " + name);
        for (College c : collegeList) {
            c.printAllTeacherRatingsBySemester(semester);
        }
    }

    public List<Department> getAllDepartments() {
        List<Department> departments = new ArrayList<>();
        collegeList.forEach(col -> departments.addAll(col.getDepartmentList()));
        return departments;
    }

    public List<GPAReportData> getGPAReportDataList() {
        List<StudentProfile> studentMasterList = getAllStudents();
        HashMap<GradeRange, List<StudentProfile>> gradeRangeStudentMap = new HashMap<>();

        for (GradeRange gr : GradeRange.values()) {
            gradeRangeStudentMap.put(gr, new ArrayList<StudentProfile>());
        }
        studentMasterList.forEach(student -> {
            float grade = student.getGPA();
            GradeRange g = GradeRange.determineGradeRangeFromGrade(grade);
            gradeRangeStudentMap.get(g).add(student);
        });
        List<GPAReportData> gpaReportDataList = new ArrayList<>();
        gradeRangeStudentMap.forEach((gradeRange, studentList) -> {
            SubReportDTO srd = new SubReportDTO();
            srd.setNoOfStudents(studentList.size());
            srd.setStudentsWithInternship(determineEmployedStudentCount(studentList));
            GPAReportData data = new GPAReportData(srd, gradeRange);
            gpaReportDataList.add(data);
        });
        gpaReportDataList.sort((GPAReportData o1, GPAReportData o2)
                -> o1.getGradeRange().compareTo(o2.getGradeRange()));
        return gpaReportDataList;
    }

    public List<StudentProfile> getAllStudents() {
        List<StudentProfile> students = new ArrayList<>();
        collegeList.forEach(col -> students.addAll(col.getAllStudents()));
        return students;
    }

    private int determineEmployedStudentCount(List<StudentProfile> studentList) {
        int count = 0;
        for (StudentProfile s : studentList) {
            if (s.hasValidInternship()) {
                count = count + 1;
            }
        }
        return count;
    }
}
