/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Employer.EmployerProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Employment {
    ArrayList<CourseOffer> relevantcourseoffers;
    int weight;
    String quality;
    String job;
    String startDate;
    String endDate;
    Employment nextemployment;  //next job so they are in a sequence 
    EmployerProfile employerProfile;

    
    public Employment(String j, EmployerProfile employerProfile,
            String startDate, String endDate){
        this.employerProfile = employerProfile;
        relevantcourseoffers = new ArrayList();   
        this.startDate = startDate;
        this.endDate = endDate;
        this.job = j;
    }
    
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    public ArrayList<CourseOffer> getRelevantcourseoffers() {
        return relevantcourseoffers;
    }

    public void setRelevantcourseoffers(ArrayList<CourseOffer> relevantcourseoffers) {
        this.relevantcourseoffers = relevantcourseoffers;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Employment getNextemployment() {
        return nextemployment;
    }

    public void setNextemployment(Employment nextemployment) {
        this.nextemployment = nextemployment;
    }

    public EmployerProfile getEmployerProfile() {
        return employerProfile;
    }

    public void setEmployerProfile(EmployerProfile employerProfile) {
        this.employerProfile = employerProfile;
    }
 
    public void addRelevantCourseOffer(CourseOffer co) {
        relevantcourseoffers.add(co);
    } 

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    
    @Override
    public String toString() {
        return job;
    }
  
}
