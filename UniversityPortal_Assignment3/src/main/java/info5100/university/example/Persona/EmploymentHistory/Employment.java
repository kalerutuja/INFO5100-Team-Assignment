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
    Employment nextemployment;  //next job so they are in a sequence 
    EmployerProfile employerProfile;
    
    public Employment(String j, EmployerProfile employerProfile){
        this.employerProfile = employerProfile;
        relevantcourseoffers = new ArrayList();    
    }
    
    public void addRelevantCourseOffer(CourseOffer co) {
        relevantcourseoffers.add(co);
    }
    
}
