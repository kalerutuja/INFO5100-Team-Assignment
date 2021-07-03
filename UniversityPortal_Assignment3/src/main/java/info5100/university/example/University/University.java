/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.University;

import info5100.university.example.College.College;
import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author Surbhi
 */
public class University {
    String name;
    ArrayList <College> collegeList;

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
        collegeList= new ArrayList<College>();
    }
    
    public int calculateRevenuesBySemester(String sem) {
      int sum=0;
      for (College c : collegeList ){
          sum=sum+c.calculateRevenuesBySemester(sem);
      }
      return sum;

    }

    public void printRevenueBySemester(String semester) {
        System.out.println("Revenue Breakdown for Semester : " + semester);
        System.out.println("University : " + name);
        for(College c : collegeList) {
            c.printRevenueBySemester(semester);
        }
        System.out.println("Total revenue(in dollars): " + this.calculateRevenuesBySemester(semester));
    }

    public void printAllTeacherRatingsBySemester(String semester) {
        System.out.println("Faculty Rating for Semester : " + semester);
        System.out.println("University: " + name);
        for(College c : collegeList) {
            c.printAllTeacherRatingsBySemester(semester);
        }
    }

    
}
