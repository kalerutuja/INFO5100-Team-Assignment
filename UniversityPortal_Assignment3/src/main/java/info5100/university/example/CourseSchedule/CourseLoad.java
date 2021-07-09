/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author kal bugrara
 */
public class CourseLoad {
    String semester;
    ArrayList<SeatAssignment> seatassignments;
    
    public CourseLoad(String s){
        seatassignments = new ArrayList<SeatAssignment>();
        semester = s;
    }

    public String getSemester() {
        return semester;
    }
    
    public SeatAssignment newSeatAssignment(CourseOffer co){
        
        Seat seat = co.getEmptySeat(); // seat linked to courseoffer.
        if (seat==null) return null;
        SeatAssignment sa = seat.newSeatAssignment(this);
        seatassignments.add(sa);  //add to students course 
        return sa;
    }
    
    public void registerStudent(SeatAssignment sa){   
        sa.assignSeatToStudent(this);
//        seatassignments.add(sa);
    }
    public float getSemesterScore(){ //total score for a full semeter
        float sum = 0;
        for (SeatAssignment sa: seatassignments){
            sum = sum + sa.GetCourseStudentScore();
        }
        return sum;
    } 
    
    public int getSemesterCreditHours() {
        int sum = 0;
        for (SeatAssignment sa: seatassignments) {
            sum = sum + sa.getCreditHours();
        }
        return sum;
    }

    public void printCourseLoad() {
        for(SeatAssignment s: seatassignments){           
            System.out.println("Course Name: " + s.getCourseName());
            System.out.println("\tCredit hours: " + s.getCreditHours());
            System.out.println("\tGrades: " + s.getGrade());      
        }
         
    }
    public ArrayList<Course> getCoursesTaken(){
        ArrayList<Course> result = new ArrayList<>();
        for(SeatAssignment sa: seatassignments){
            result.add(sa.seat.getCourseOffer().getSubjectCourse());
        }
        return result;
    }
    
    public List<CourseOffer> getCourseOffers() {
        ArrayList<CourseOffer> result = new ArrayList<>();
        for(SeatAssignment sa: seatassignments){
            result.add(sa.seat.getCourseOffer());
        }
        return result;
    }   

    public List<SeatAssignment> getSeatAssignments() {
        return seatassignments;  
    }
}
