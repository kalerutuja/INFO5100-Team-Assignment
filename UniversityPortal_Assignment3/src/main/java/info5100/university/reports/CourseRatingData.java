/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.reports;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.University.University;
import static java.lang.Math.random;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 *
 * @author rutuja
 */
public class CourseRatingData {

    String courseNumber;
    float rating = 0.0f;
    int studentsRated = 0;
    private static Random random = new Random();

    private static DecimalFormat df = new DecimalFormat("0.00");

    public int getStudentsRated() {
        return studentsRated;
    }

    public void setStudentsRated(int studentsRated) {
        this.studentsRated = studentsRated;
    }

    public float getCourseRating() {
        return rating;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "CourseRatingData{" + "courseNumber=" + courseNumber + ", rating=" + rating + ", studentsRated=" + studentsRated + '}';
    }

  
}
