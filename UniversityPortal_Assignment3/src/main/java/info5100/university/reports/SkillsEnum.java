/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.reports;

import java.util.Random;

/**
 *
 * @author swaroopgupta
 */
public enum SkillsEnum {
    
        JAVA,
        PYTHON,
        MONGODB,
        PHP,
        HTML,
        SQL,
        ANGULAR,
        REACT,
        CSS3,
        AWS,
        AZURE,
        GIT,
        MAVEN,
        REST_API;

        /**
         * Pick a random value of the Skills enum.
         * @return a random BaseColor.
         */
        public static SkillsEnum getRandomSkill() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
   
    
}
