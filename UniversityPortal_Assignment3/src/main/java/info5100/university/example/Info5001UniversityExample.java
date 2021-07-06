/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import com.github.javafaker.Faker;
import info5100.university.example.College.College;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Persona.EmploymentHistory.Employment;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.University.University;
import java.util.List;


/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        University testU = createUniversityData(1, 2, 20, 15, 50, 30);
        createCourseOffers("fall2020", testU, 100);
        populateCoursesAndGrades("fall2020", testU);
        populateEmploymentHistory(testU);
        
        createCourseOffers("spring2021", testU, 100);
        populateCoursesAndGrades("spring2021", testU);
        populateEmploymentHistory(testU);

        createCourseOffers("fall2021", testU, 100);
        populateCoursesAndGrades("fall2021", testU);
        populateEmploymentHistory(testU);

        createCourseOffers("spring2022", testU, 100);
        populateCoursesAndGrades("spring2022", testU);
        populateEmploymentHistory(testU);

        createCourseOffers("fall2022", testU, 100);
        populateCoursesAndGrades("fall2022", testU);
        populateEmploymentHistory(testU);

        
    }
    
    public static University createUniversityData(int nOfCol, 
            int nOfDep,
            int nOfFaculty,
            int nOfCourses,
            int nOfStudents,
            int nOfEmployers) {
        Faker faker = new Faker();
        University university = new University(faker.university().name());
        for(int i = 0;i<nOfCol;i++) {
            College c = new College(faker.name().name() + " College");
            university.addNewCollege(c);
            for( int j=0;j<nOfDep;j++) {
                Department d = new Department(faker.name().name() + " Dept.");
                c.addNewDepartment(d);
                PersonDirectory pd = d.getPersonDirectory();
                FacultyDirectory fd = d.getFacultydirectory();
                
                for(int k = 0;k<nOfFaculty;k++) {
                    Person p = createFakePerson(pd, faker);
                    fd.newFacultyProfile(p);
                    System.out.println("Faculty Created : " + p.getFullName() 
                            + " with username : " + p.getId() + " with password : " 
                            + p.getPassword());
                    
                } 
                
                StudentDirectory sd = d.getStudentDirectory();
                for(int k = 0;k<nOfStudents;k++) {
                    Person p = createFakePerson(pd, faker);
                    sd.newStudentProfile(p);
                    System.out.println("Student Created : " + p.getFullName() 
                    + " with username : " + p.getId() + " with password : " 
                    + p.getPassword());
                }
                CourseCatalog cc = d.getCourseCatalog();
                for( int k = 0;k<nOfCourses;k++) {
                    String courseName = faker.name().name() + " course";
                    String courseNumber = d.getName() + faker.code().toString();
                    int credits = 8;
                    cc.newCourse(courseName, courseNumber, credits);
                }
                
                EmployerDirectory ed = d.getEmployerdirectory();
                for(int k=0;k<nOfEmployers;k++) {
                    ed.newEmployerProfile(faker.company().name());
                }     
            }
        }
        return university; 
    }
    
    public static Person createFakePerson(PersonDirectory pd, Faker faker) {
        Person p = pd.newPerson(faker.name().username());
        p.setFullName(faker.name().fullName());
        p.setPassword("password");
        return p;
    }
    
    public static void createCourseOffers(String semesterName, 
            University university,
            int nOfSeats) {
        List<Department> dl = university.getAllDepartments();
        dl.forEach(dept -> {
            FacultyDirectory fd = dept.getFacultydirectory();
            CourseSchedule cs = dept.newCourseSchedule(semesterName);
            List<Course> courses = dept.getCourses();
            courses.forEach(course -> {
                CourseOffer co = cs.newCourseOffer(course.getCourseNumber());
                FacultyProfile fp = fd.getFirstAvailable();
                co.generatSeats(100);
                fp.AssignAsTeacher(co);
            });
        });
    }
    
    public static void populateCoursesAndGrades(String semesterName,
            University university) {
        List<Department> dl = university.getAllDepartments();
        dl.forEach(dept -> {
            CourseSchedule cs = dept.getCourseSchedule(semesterName);
            StudentDirectory sd = dept.getStudentDirectory();
            List<StudentProfile> sl = sd.getStudentlist();
            sl.forEach(student -> {
                CourseLoad cl = student.newCourseLoad(semesterName);
                List<CourseOffer> coList = cs.pickTwoRandomCourseOffer();
                SeatAssignment sa1 = cl.newSeatAssignment(coList.get(0));
                cl.registerStudent(sa1);
                float grade1 = (float)Math.random()*2 + 2;
                sa1.setGrade(grade1);
                SeatAssignment sa2 = cl.newSeatAssignment(coList.get(1));
                cl.registerStudent(sa2);
                float grade2 = (float)Math.random()*2 + 2;
                sa2.setGrade(grade2);
            });
        });
    } 

    private static void populateEmploymentHistory(University testU) {
        Faker faker = new Faker();
        List<Department> dl = testU.getAllDepartments();
        dl.forEach(dept-> {
            StudentDirectory sd = dept.getStudentDirectory();
            List<StudentProfile> sl = sd.getStudentlist();
            EmployerDirectory ed = dept.getEmployerdirectory();
            // we will randomly pick a number between 1 - 5 
            // and choose multiple of it to add employment to students
            int random = (int) Math.random()*4 + 1;
            for(int i = 0;i<sl.size();i++) {
                if(i%random == 0) {
                    StudentProfile sp = sl.get(i);
                    Employment e = sp.newEmployment(faker.company().profession(),
                           ed.pickRandomEmployer());
                    e.addRelevantCourseOffer(sp.pickRandomCourseOffer());       
                }
            }
            
        });

    }
}
