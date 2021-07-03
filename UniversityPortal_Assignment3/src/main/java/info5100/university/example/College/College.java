/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.College;

import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author Surbhi
 */
public class College {
    String name;
    ArrayList<Department> departmentList;
    
    public String getName() {
        return name;
    }

    public College(String name) {
        this.name = name;
        departmentList = new ArrayList<Department>();
    }
     public void addNewDepartment(Department department){
         departmentList.add(department);
     }
    public int calculateRevenuesBySemester(String sem) {
      int sum=0;
      for (Department d:departmentList ){
          sum=sum+d.calculateRevenuesBySemester(sem);
      }
      return sum;

    }

    public void printRevenueBySemester(String semester) {
        System.out.println("\tCollege: " + name);
        for(Department d: departmentList){
            d.printRevenueBySemester(semester);
        }
        System.out.println("\tTotal revenue(in dollars): " + this.calculateRevenuesBySemester(semester));
    }

    public void printAllTeacherRatingsBySemester(String semester) {
        System.out.println("\tCollege:" + name);
        for(Department d: departmentList){
            d.printAllTeacherRatingsBySemester(semester);
        }
    }
}