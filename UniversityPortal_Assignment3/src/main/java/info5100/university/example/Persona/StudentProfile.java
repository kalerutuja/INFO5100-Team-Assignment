/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.Department.Degree;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistroy;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile {

    Person person;
    Transcript transcript;
    EmploymentHistroy employmenthistory;
    Degree degree;

    public StudentProfile(Person p) {

        person = p;
        transcript = new Transcript(this);
        employmenthistory = new EmploymentHistroy();
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {

        return transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s){
        
        return transcript.newCourseLoad(s);
    }
    
    public void printTranscript(){
        //Print name of student
        //For each smester
        // print sem name
        // for each course load 
        // print course name ,credit hours, grade  
        System.out.println("Name of the person " + this.getPerson().getPersonId());
        transcript.print();
        System.out.println("CGPA: " + this.getGPA());      
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public float getGPA(){
    
        return transcript.calculateGPA();
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }
     public boolean hasFullFilledDegreeRequirements(){
        //1.  Check the required courses
        boolean requiredCoursesReqMet =  true;
        for(Course c: degree.getRequired()){
            if(!transcript.getCoursesTaken().contains(c))
                requiredCoursesReqMet = false;
        }
        //2.  credits and electives     
        int totalCredits=0;
         
        for(Course c : transcript.getCoursesTaken()){
            if((degree.getRequired().contains(c)) || (degree.getElectives().contains(c)))
                 totalCredits+= c.getCredits();
        }
        boolean creditHoursReqMet = (totalCredits>=32);
        return requiredCoursesReqMet && creditHoursReqMet;
     }
}