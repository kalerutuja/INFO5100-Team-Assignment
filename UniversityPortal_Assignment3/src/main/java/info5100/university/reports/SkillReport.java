/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.reports;

import java.util.Random;

/**
 *
 * @author rutuja
 */
public enum SkillReport {
    
    JAVA, //SkillSet
    PYTHON,
    MONGODB,
    PHP,
    HTML,
    SQL;
    
    public static SkillReport getRandomStudent(){ //pick random students and assign skills 
        Random random = new Random();
            return values()[random.nextInt(values().length)]; 
    }
    
}

