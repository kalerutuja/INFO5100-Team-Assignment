/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

/**
 *
 * @author Surbhi
 */
public class FacultyRating implements Comparable<FacultyRating> {
    FacultyAssignment facultyAssignment;
    Integer courseRating;

    public FacultyRating(FacultyAssignment facultyAssignment, Integer courseRating) {
        this.facultyAssignment = facultyAssignment;
        this.courseRating = courseRating;
    }

    public FacultyAssignment getFacultyAssignment() {
        return facultyAssignment;
    }

    public void setFacultyAssignment(FacultyAssignment facultyAssignment) {
        this.facultyAssignment = facultyAssignment;
    }

    public Integer getCourseRating() {
        return courseRating;
    }

    public void setCourseRating(Integer courseRating) {
        this.courseRating = courseRating;
    }
    
    // in descending order
    // refered this link for implementation 
    // https://www.geeksforgeeks.org/how-to-override-compareto-method-in-java/
    @Override
    public int compareTo(FacultyRating o) {
        if (this.courseRating < o.courseRating) {         
            // if current object is smaller,then return 1 
            return 1; 
        } 
        else if (this.courseRating > o.courseRating) {       
            // if current object is greater,then return -1 
            return -1; 
        } 
        else {        
            // if current object is equal to o,then return 0 
            return 0; 
        } 
    }  
}
