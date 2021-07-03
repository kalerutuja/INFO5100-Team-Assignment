/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import info5100.university.example.CourseCatalog.Course;
import java.util.ArrayList;

/**
 *
 * @author Surbhi
 */
public class Degree {
    String name;
    ArrayList<Course> required;
    ArrayList<Course> elective;
    int credits;
    Department department;

    public Degree(String name, Department department) {
        this.name = name;
        this.department = department;
        required = new ArrayList<Course>();
        elective = new ArrayList<Course>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getRequired() {
        return required;
    }

    public ArrayList<Course> getElectives() {
        return elective;
    }

    public int getCredits() {
        return credits;
    }

    public Department getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    public void addRequiredCourse(Course c){
        if(c!= null){
            required.add(c);
        }
    }
    public void addElectiveCourse(Course c){
        if(c!= null){
            elective.add(c);
        }
    }
    
}
