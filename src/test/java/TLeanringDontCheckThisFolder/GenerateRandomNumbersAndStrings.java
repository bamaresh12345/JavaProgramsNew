package TLeanringDontCheckThisFolder;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class GenerateRandomNumbersAndStrings {

    public static void main(String[] args) {


        //Approach 1
        Random rand = new Random();
        int randNum = rand.nextInt(100); //--> renerates nubmers between 0 to 99
        double randdouble = rand.nextInt(10); //--> renerates nubmers between 0 to 99

        System.out.println(randNum); // 92,56,33
        System.out.println(randdouble); // 92.0,56.0,33.0

        //Approach 2

        System.out.println("Math.random()" + Math.random());  // 0.9270600675279801

        //Approach 3  randomAlphabetic
        String alpha = RandomStringUtils.randomAlphabetic(5);
        System.out.println("RandomStringUtils.randomAlphabetic5--> " + alpha);  //MszJD

        //Approach 3  randomAlphabetic
        String alphaNum = RandomStringUtils.randomAlphanumeric(5);
        System.out.println("RandomStringUtils.randomAlphabetic5--> " + alphaNum);  //BiZc5

        //Approach 3  randomAlphabetic
        String Num = RandomStringUtils.randomNumeric(5);
        System.out.println("RandomStringUtils.randomAlphabetic5--> " + Num);  //84464

    }
}
