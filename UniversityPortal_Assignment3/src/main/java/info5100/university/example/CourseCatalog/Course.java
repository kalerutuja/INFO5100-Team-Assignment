/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseCatalog;

/**
 *
 * @author kal bugrara
 */
public class Course {

    String number;
    String name;
    int credits;
    int price = 1500; //per credit hour
    float rating = 0.0f;

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
    public Course(String n, String numb, int ch) {
        name = n;
        number = numb;
        credits = ch;
    }

    public String getCourseNumber() {
        return number;
    }

    public int getCoursePrice() {
        return price * credits;

    }

    public int getCredits() {
        return credits;    
}    

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Course{" + "number=" + number + ", name=" + name + '}';
    }   
}
