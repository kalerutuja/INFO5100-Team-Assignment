/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.reports;

/**
 *
 * @author swaroopgupta
 */
public class CourseVsInternshipReportDTO {
    
    String courseName;
    SubReportDTO metrics;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public SubReportDTO getMetrics() {
        return metrics;
    }

    public void setMetrics(SubReportDTO metrics) {
        this.metrics = metrics;
    }

    @Override
    public String toString() {
        return "CourseVsInternshipReportDTO{" + "courseName=" + courseName + ", metrics=" + metrics + '}';
    }
    
    
    
    
}
