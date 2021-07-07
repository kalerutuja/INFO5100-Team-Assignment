/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.reports;

/**
 *
 * @author Surbhi
 */
public enum GradeRange {
    aboveThreePointSeven(4, 3.7f),
    TwoPointSevenTillThreePointSeven(3.7f, 2.7f),
    OnePointSevenTillTwoPointSeven(2.7f,1.7f),
    OneTillOnePointSeven(1.7f,1);

    public static GradeRange determineGradeRangeFromGrade(float grade) {
        for(GradeRange gr : GradeRange.values()) {
            if(grade >= gr.low && grade < gr.high) {
                return gr;
            }
        }
        return OneTillOnePointSeven;
    }
    float high;
    float low;
    
    GradeRange(float high, float low) {
        this.high = high;
        this.low = low;
    }  

    public float getHigh() {
        return high;
    }

    public float getLow() {
        return low;
    }
    
    @Override
    public String toString() {
        return String.valueOf(low) + "-" + String.valueOf(high);
    }
    
    
}
