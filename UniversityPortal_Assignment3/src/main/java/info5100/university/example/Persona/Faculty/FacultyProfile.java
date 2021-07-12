/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.Persona.*;
import info5100.university.example.CourseSchedule.CourseOffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kal bugrara
 */
public class FacultyProfile {

    Person person;
    ArrayList <FacultyAssignment> facultyassignments; 
    
    public FacultyProfile(Person p) {

        person = p;
        facultyassignments = new ArrayList();
    }

    public FacultyAssignment AssignAsTeacher(CourseOffer co){
        
        FacultyAssignment fa = new FacultyAssignment(this, co);
        facultyassignments.add(fa);
        
        return fa;
    }
    
    public FacultyProfile getCourseOffer(String courseid){
        return null; //complete it later
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }
    
    public ArrayList<FacultyRating> getSortedListOfFacultyRating(String semester) {
        ArrayList<FacultyRating> facultyRatingList = new ArrayList<>();
        for(FacultyAssignment fa: facultyassignments) {
            if(fa.getSemester().equals(semester)) {
                FacultyRating fr = new FacultyRating(fa, fa.calculateFacultyEvaluation());
                facultyRatingList.add(fr);
            }
        }
        // refered this example to use Collections.sort method 
        // https://www.geeksforgeeks.org/collections-sort-java-examples/
        Collections.sort(facultyRatingList);
        return facultyRatingList;
    }  

    public void printAllTeacherRatingsBySemester(String semester) {
        System.out.println("\t\t\tFaculty Name: " + person.getPersonId());
        ArrayList<FacultyRating> sortedFacultyRatingList = getSortedListOfFacultyRating(semester);
        if(sortedFacultyRatingList.size() > 0) {
            for(FacultyRating fr : sortedFacultyRatingList) {
                System.out.println("\t\t\t\t" + 
                        fr.getFacultyAssignment().getCourseName()  
                        + " : " + fr.getCourseRating());
            } 
        } else {
            System.out.println("\t\t\t\tNo course taught");
        }

    }

    public Person getPerson() {
        return person;
    }
    
    public ArrayList<FacultyAssignment> getFacultyassignments() {
        return facultyassignments;
    }
    
    public Set<String> getAllCoursesByFaculty(){
        Set<String> courseSet = new HashSet<>();
        for(FacultyAssignment fa : this.getFacultyassignments()){
            if(fa.getCourseoffer().getCourseSchedule().getSemester().equalsIgnoreCase("2021 Fall"))
                courseSet.add(fa.getCourseoffer().getCourse().getCourseNumber());
        }
        System.out.println("coursesList for faculty : " + courseSet);
        return courseSet;
    }
}
