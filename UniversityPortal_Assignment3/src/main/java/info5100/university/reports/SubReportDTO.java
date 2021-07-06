package info5100.university.reports;



/**
 *
 * @author swaroopgupta
 */
public class SubReportDTO {
    
    int noOfStudents = 0;
    int studentsWithInternship = 0;
    double successRate = 0.0;

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public int getStudentsWithInternship() {
        return studentsWithInternship;
    }

    public void setStudentsWithInternship(int studentsWithInternship) {
        this.studentsWithInternship = studentsWithInternship;
    }

    public double getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(double successRate) {
        this.successRate = successRate;
    }
    
    public double calculateSuccessRate(){
        return Double.valueOf(studentsWithInternship/noOfStudents);
    }
}
