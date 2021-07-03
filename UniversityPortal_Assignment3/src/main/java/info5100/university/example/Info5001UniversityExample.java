/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.College.College;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Degree;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.University.University;
import java.util.ArrayList;


/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        // Created 3 departments
        Department departmentIS = new Department("Information Systems");
        Department departmentCS = new Department("Computer Science");
        Department departmentTSM = new Department("Telecommunication Systems");
        
        //Created 3 studentDirectory of all the 3 departments
        StudentDirectory sdOfInformationSystems = departmentIS.getStudentDirectory();
        StudentDirectory sdOfComputerScience = departmentCS.getStudentDirectory();
        StudentDirectory sdOfTelecommunicationSystems = departmentTSM.getStudentDirectory();
        
        //Created 3 personDirectory for all the 3 departments 
        PersonDirectory pd = departmentIS.getPersonDirectory();
        PersonDirectory pdSecond = departmentCS.getPersonDirectory();
        PersonDirectory pdThird = departmentTSM.getPersonDirectory();
        
        //Created 3 faculty directory for all the 3 departments
        FacultyDirectory fdOfInformationSystems = departmentIS.getFacultydirectory();
        FacultyDirectory fdOfComputerScience = departmentCS.getFacultydirectory();
        FacultyDirectory fdOfTelecommunicationSystems = departmentTSM.getFacultydirectory();

        //Created 4 people for student directory
        Person person = pd.newPerson("Surbhi");
        Person personTwo = pd.newPerson("Vivek");
        Person personThree = pdSecond.newPerson("Rutuja");
        Person personFour = pdThird.newPerson("Vaibhav");
        
        //Create 4 people for faculty directory
        Person personFive = pd.newPerson("Prof. Thomas");
        Person personSix = pd.newPerson("Prof. Shillman");
        Person personSeven = pdSecond.newPerson("Prof. Bugrara");
        Person personEight = pdThird.newPerson("Prof. Archill");
        
        // Created four facultyProfile
        FacultyProfile fp = fdOfInformationSystems.newFacultyProfile(personFive);
        FacultyProfile fpTwo = fdOfInformationSystems.newFacultyProfile(personSix);
        FacultyProfile fpThree = fdOfComputerScience.newFacultyProfile(personSeven);
        FacultyProfile fpFour = fdOfTelecommunicationSystems.newFacultyProfile(personEight);   
        
        //Created four studentsProfile
        StudentProfile student = sdOfInformationSystems.newStudentProfile(person);
        StudentProfile studentTwo = sdOfInformationSystems.newStudentProfile(personTwo);
        StudentProfile studentThree = sdOfComputerScience.newStudentProfile(personThree);
        StudentProfile studentFour = sdOfTelecommunicationSystems.newStudentProfile(personFour);
       
        //Created 3 courseCatalog for all the 3 departments
        CourseCatalog courseCatalog = departmentIS.getCourseCatalog();
        CourseCatalog coursecatalogTwo = departmentCS.getCourseCatalog();
        CourseCatalog coursecatalogThree = departmentTSM.getCourseCatalog();
        
        //Created courses
        Course appEng = courseCatalog.newCourse("App eng", "INFO 5100", 8);
        Course compEng = coursecatalogTwo.newCourse("Computer Eng", "CS 1100", 8);
        Course dataNet = coursecatalogThree.newCourse("Data networking", "TSM 5330", 8);
        Course dataScience = courseCatalog.newCourse("Data Science", "INFO 5500", 8);
        Course dbms = courseCatalog.newCourse("DBMS", "INFO 6600", 8);
        Course advancedDbms = courseCatalog.newCourse("Advance DBMS", "INFO 5511", 8);
        Course ba = courseCatalog.newCourse("Business Analysis", "INFO 7001", 8);

        //Created course schedule for all the 3 departments for fall offering
        CourseSchedule cs1 = departmentIS.newCourseSchedule("Fall2020");
        CourseSchedule cs2 = departmentCS.newCourseSchedule("Fall2020");
        CourseSchedule cs3 = departmentTSM.newCourseSchedule("Fall2020");
        
        CourseSchedule cs4 = departmentIS.newCourseSchedule("Spring2021");
        CourseSchedule cs5 = departmentCS.newCourseSchedule("Spring2021");
        CourseSchedule cs6 = departmentTSM.newCourseSchedule("Spring2021");
        
        
        //Created courseOffer for fall
        CourseOffer co1 = cs1.newCourseOffer("INFO 5100");
        fpTwo.AssignAsTeacher(co1);
        CourseOffer co20 = cs1.newCourseOffer("INFO 5500");
        fpTwo.AssignAsTeacher(co20);
        CourseOffer co21 = cs1.newCourseOffer("INFO 6600");
        fpTwo.AssignAsTeacher(co21);
        
        CourseOffer co2 = cs2.newCourseOffer("CS 1100");
        fpThree.AssignAsTeacher(co2);
        CourseOffer co3 = cs3.newCourseOffer("TSM 5330");
        fpFour.AssignAsTeacher(co3);
        
        // Creating seats for all the courseOfferings 
        if (co1!=null) co1.generatSeats(2);
        if(co2!=null) co2.generatSeats(1); 
        if(co3!=null) co3.generatSeats(1);
        if(co20!=null) co20.generatSeats(2);
        if(co21!=null) co21.generatSeats(4);
        
        //Created courseLoad
        CourseLoad courseload = student.newCourseLoad("Fall2020"); 
        CourseLoad courseloadTwo = studentTwo.newCourseLoad("Fall2020");
        CourseLoad courseloadThree = studentThree.newCourseLoad("Fall2020");
        CourseLoad courseloadFour = studentFour.newCourseLoad("Fall2020");
        
        
        //Register students in class
        SeatAssignment sa =  courseload.newSeatAssignment(co1); 
        SeatAssignment sa2=courseloadTwo.newSeatAssignment(co1);
        SeatAssignment sa3=courseloadThree.newSeatAssignment(co2);
        SeatAssignment sa4=courseloadFour.newSeatAssignment(co3);
        
        SeatAssignment sa20 = courseload.newSeatAssignment(co20);
        SeatAssignment sa21 = courseloadTwo.newSeatAssignment(co21);
        
        courseload.registerStudent(sa);
        courseload.registerStudent(sa20);
        courseload.registerStudent(sa21);
        courseloadTwo.registerStudent(sa2);
        courseloadThree.registerStudent(sa3);
        courseloadFour.registerStudent(sa4);
        
        // Set grades to the students
        sa.setGrade(90);
        sa2.setGrade(80);
        sa3.setGrade(85);
        sa4.setGrade(70);       
        sa20.setGrade(67);
        sa21.setGrade(78);
        
        // Set Rating for the faculty (between 1 to 5)
        sa.setFacultyEval(5);
        sa2.setFacultyEval(4);
        sa3.setFacultyEval(5);
        sa4.setFacultyEval(4);
        sa20.setFacultyEval(3);
        sa21.setFacultyEval(1);
        
        //--------------------------
        
       
        // Created courseOffer for Spring
        CourseOffer co4 = cs4.newCourseOffer("INFO 6600");
        fp.AssignAsTeacher(co4);
        CourseOffer co30 = cs4.newCourseOffer("INFO 5511");
        fp.AssignAsTeacher(co30);
        CourseOffer co31 = cs4.newCourseOffer("INFO 7001");
        fp.AssignAsTeacher(co31);
        
        CourseOffer co5 = cs5.newCourseOffer("CS 1100");
        fpThree.AssignAsTeacher(co5);
        CourseOffer co6 = cs6.newCourseOffer("TSM 5330");
        fpFour.AssignAsTeacher(co6);
        
        // Creating seats for all the 3 courseOfferings 
        if (co4!=null) co4.generatSeats(2);
        if(co5!=null) co5.generatSeats(1);
        if(co6!=null) co6.generatSeats(1);
        if(co30!=null) co30.generatSeats(2);
        if(co31!=null) co31.generatSeats(4);
        
        //Created courseLoad
        CourseLoad courseloadFive = student.newCourseLoad("Spring2021"); 
        CourseLoad courseloadSix = studentTwo.newCourseLoad("Spring2021");
        CourseLoad courseloadSeven = studentThree.newCourseLoad("Spring2021");
        CourseLoad courseloadEight = studentFour.newCourseLoad("Spring2021");
        
        
        //Register students in class
        SeatAssignment sa5 = courseloadFive.newSeatAssignment(co4); 
        SeatAssignment sa6 = courseloadSix.newSeatAssignment(co4);
        SeatAssignment sa7 = courseloadSeven.newSeatAssignment(co5);
        SeatAssignment sa8 = courseloadEight.newSeatAssignment(co6);
        
        SeatAssignment sa30 = courseload.newSeatAssignment(co30);
        SeatAssignment sa31 = courseloadTwo.newSeatAssignment(co31);
        
        courseloadFive.registerStudent(sa5);
        courseloadFive.registerStudent(sa30);
        courseloadFive.registerStudent(sa31);
        courseloadSix.registerStudent(sa6);
        courseloadSeven.registerStudent(sa7);
        courseloadEight.registerStudent(sa8);
        
        // Set grades to the students
        sa5.setGrade(91);
        sa6.setGrade(78);
        sa7.setGrade(70);
        sa8.setGrade(67);
        sa30.setGrade(78);
        sa31.setGrade(87);
        
        
        // Set Rating for the faculty (between 1 to 5)
        sa5.setFacultyEval(2);
        sa6.setFacultyEval(3);
        sa7.setFacultyEval(2);
        sa8.setFacultyEval(3);
        sa30.setFacultyEval(5);
        sa31.setFacultyEval(4);

        
        System.out.println("------------Part One: calculation of GPA for a student-----------------");
        student.printTranscript();
        System.out.println("=================");
        studentTwo.printTranscript();
        
        System.out.println("------------Part Two: calculation of total revenue at the college and university levels------------------");
//        int revenueISFall2020 = departmentIS.calculateRevenuesBySemester("Fall2020");
//        int revenueCSFall2020 = departmentCS.calculateRevenuesBySemester("Fall2020");
//        int revenueTSMFall2020 = departmentTSM.calculateRevenuesBySemester("Fall2020");
//        System.out.println("Total Revenue for IS dept for fall2020: " + revenueISFall2020);
//        System.out.println("Total Revenue for CS dept for fall2020: " + revenueCSFall2020);
//        System.out.println("Total Revenue for TSM dept for fall2020: " + revenueTSMFall2020);
//        
//        int total4 = departmentIS.calculateRevenuesBySemester("Spring2021");
//        int total5 = departmentCS.calculateRevenuesBySemester("Spring2021");
//        int total6 = departmentTSM.calculateRevenuesBySemester("Spring2021");
//        System.out.println("Total Revenue for IS dept for Soring2021: " + total4);
//        System.out.println("Total Revenue for CS dept for Spring2021: " + total5);
//        System.out.println("Total Revenue for TSM dept for Spring2021: " + total6);
        
        College collegeCOE = new College("COE");
        College collegeCCIS = new College("CCIS");
        collegeCOE.addNewDepartment(departmentIS);
        collegeCOE.addNewDepartment(departmentTSM);
        collegeCCIS.addNewDepartment(departmentCS);

        University universityNEU = new University("Northeastern University");
        universityNEU.addNewCollege(collegeCOE);
        universityNEU.addNewCollege(collegeCCIS);         
        universityNEU.printRevenueBySemester("Fall2020");
         
        System.out.println("------------Part Three: course rating for teachers-----------------");
        universityNEU.printAllTeacherRatingsBySemester("Fall2020");
        universityNEU.printAllTeacherRatingsBySemester("Spring2021");
        System.out.println("------------Part Four: graduation eligibility requirement-----------------");
        Degree degreeForIS = new Degree("MS in IS", departmentIS);
        degreeForIS.setCredits(8);
        degreeForIS.addRequiredCourse(dbms);
        degreeForIS.addRequiredCourse(appEng);   
        degreeForIS.addElectiveCourse(dataScience);
        degreeForIS.addElectiveCourse(advancedDbms);
        student.setDegree(degreeForIS);
        if(student.hasFullFilledDegreeRequirements()) {
            System.out.println("Student: " + student.getPerson().getPersonId() + " is eligible for graduation");
        } else {
            System.out.println("Student: " + student.getPerson().getPersonId() + " is not eligible for graduation");

        }
        studentTwo.setDegree(degreeForIS);
        if(studentTwo.hasFullFilledDegreeRequirements()) {
            System.out.println("Student: " + studentTwo.getPerson().getPersonId() + " is eligible for graduation");
        } else {
            System.out.println("Student: " + studentTwo.getPerson().getPersonId() + " is not eligible for graduation");

        }
        
    }

}
