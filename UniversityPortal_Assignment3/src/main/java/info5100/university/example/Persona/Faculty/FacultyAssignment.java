/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.SeatAssignment;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class FacultyAssignment {
    
    CourseOffer courseoffer;
    FacultyProfile facultyprofile;
    public FacultyAssignment(FacultyProfile fp, CourseOffer co){
        courseoffer = co;
        facultyprofile = fp;
    }
    public FacultyProfile getFacultyProfile(){
        return facultyprofile;
    }
    public int calculateFacultyEvaluation(){
        float sum = 0;
        ArrayList<SeatAssignment> seatAssignmentList = courseoffer.getSeatAssignmentList();
        for(SeatAssignment sa: seatAssignmentList) {
            sum = sum + sa.getFacultyEval();
        }     
        int averageRating = (int)sum/seatAssignmentList.size();
        return averageRating;
    }
    
    public String getSemester() {
        return courseoffer.getSemester();
    }

    public CourseOffer getCourseoffer() {
        return courseoffer;
    }

    public void setCourseoffer(CourseOffer courseoffer) {
        this.courseoffer = courseoffer;
    }
    
    public String getCourseName() {
        return courseoffer.getCourseName();
    }
    
    
    
}
