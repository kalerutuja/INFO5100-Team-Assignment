/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.reports;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.Department.Department;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author rutuja
 */
public class CourseRatingData {

    Course course;
    int nOfStudents;
    private static DecimalFormat df = new DecimalFormat("0.00");

    public CourseRatingData(Course course, int nOfStudents) {
        this.course = course;
        this.nOfStudents = nOfStudents;
    }

    public float getRating() {
        return course.getRating();
    }

    @Override
    public String toString() {
        return "CourseRatingData{" + "course=" + course + ", nOfStudents=" + nOfStudents + ", Rating = " + df.format(course.getRating()) + '}';
    }
}
