/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Degree;
import info5100.university.example.Employer.EmployerProfile;
import info5100.university.example.Persona.EmploymentHistory.Employment;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistory;
import java.util.ArrayList;
import java.util.List;    

/**
 *
 * @author kal bugrara
 */
public class StudentProfile {

    Person person;
    Transcript transcript;
    EmploymentHistory employmenthistory;
    Degree degree;

    public StudentProfile(Person p) {

        person = p;
        transcript = new Transcript(this);
        employmenthistory = new EmploymentHistory(this);
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
    
    public Employment newEmployment(String job, EmployerProfile ep, String startDate, String endDate) {
        return employmenthistory.newEmployment(job, ep, startDate,endDate);
    }

    public CourseOffer pickRandomCourseOffer() {
        CourseLoad cl = transcript.getCurrentCourseLoad();
        List<CourseOffer> coList = cl.getCourseOffers();
        int randomIndex = (int) Math.random()*coList.size();
        return coList.get(randomIndex);
    }


    public Transcript getTranscript() {
        return transcript;
    }

    public EmploymentHistory getEmploymenthistory() {
        return employmenthistory;
    }
    

    public boolean hasValidInternship() {
        return employmenthistory.hasValidInternship();
    }

    public int getCredits() {
        return transcript.calculateTotalCredits();
    }

    public List<SeatAssignment> getSeatAssignments() {
        return transcript.getSeatAssignments();
    }

    @Override
    public String toString() {
        return person.getFullName();
    }
}
