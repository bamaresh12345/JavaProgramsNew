package LeetCode150Questions;

import java.util.HashMap;
import java.util.Map;

public class Generic6MathNumbersProgram {

    public static void main(String[] args) {


        int n = -3;

        System.out.println(Math.abs(n)); //3
        System.out.println(Math.max(14, 22)); // 22
        System.out.println(Math.min(14, 22));  //14
        System.out.println(Math.pow(2, 3)); //2 power of 3   --> 8  (int)


        System.out.println(Math.round(0.60));  //1
        System.out.println(Math.round(0.40));  //0
        System.out.println(Math.round(5));     //5
        System.out.println(Math.round(5.1));  //5
        System.out.println(Math.round(-5.1));  //-5
        System.out.println(Math.round(-5.9));  //-6

    }
}
