/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.Employer.EmployerProfile;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class EmploymentHistory {
    ArrayList<Employment> employments;
    StudentProfile studentProfile;
    
    public EmploymentHistory(StudentProfile sp){
        studentProfile = sp;
        employments = new ArrayList();
    }
    
    public Employment newEmployment(String job, EmployerProfile ep){
        Employment ne = new Employment(job, ep);
        employments.add(ne);
        return ne;
    }

    public ArrayList<Employment> getEmployments() {
        return employments;
    }
    
    public boolean isEmpty() {
        return employments.isEmpty();
    }

    public boolean hasValidInternship() {
        if(employments.isEmpty()) {
            return false;
        }

        if(studentProfile.getCredits() >= 16) {
            return true;
        }else {
            return false;
        }
    }

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    
}
