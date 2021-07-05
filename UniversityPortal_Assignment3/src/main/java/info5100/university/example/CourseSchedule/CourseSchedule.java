/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kal bugrara
 */
public class CourseSchedule {

    CourseCatalog coursecatalog;

    ArrayList<CourseOffer> schedule;
    String semester;

    public CourseSchedule(String s, CourseCatalog cc) {
        semester = s;
        coursecatalog = cc;
        schedule = new ArrayList();

    }

    public CourseOffer newCourseOffer(String n) {

        Course c = coursecatalog.getCourseByNumber(n);
        if(c==null) return null;
        CourseOffer co = new CourseOffer(c);
        co.setCourseSchedule(this);
        schedule.add(co);
        return co;
    }

    public CourseOffer getCourseOfferByNumber(String n) {

        for (CourseOffer co : schedule) {

            if (co.getCourseNumber().equals(n)) {
                return co;
            }
        }
        return null;
    }

    public int calculateTotalRevenues() {
        int sum = 0;
        for (CourseOffer co : schedule) {

            sum = sum + co.getTotalCourseRevenues();

        }
        return sum;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    // we assume we will have more than 1 course in course offer list.
    public List<CourseOffer>  pickTwoRandomCourseOffer() {
        List<CourseOffer> coList = new ArrayList<>();
        int count = schedule.size();
        int randomIndex = (int)Math.random()*count;
        int randomIndex1 = 0;
        coList.add(schedule.get(randomIndex));
        if(randomIndex > 0) {
            randomIndex1 = randomIndex - 1;
        } else {
            randomIndex1 = randomIndex + 1;
        }
        coList.add(schedule.get(randomIndex1));
        return coList;
    }
    
    

}
