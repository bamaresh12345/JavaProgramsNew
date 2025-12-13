package JavaGenerices;

public class Generic6MathNumbersProgram {

    public static void main(String[] args) {
/*
        The Math.max(x,y) method can be used to find the highest value of x and y:
        The Math.min(x,y) method can be used to find the lowest value of x and y:
        The Math.pow(x,y) method returns the x to the power of y
        The Math.abs(x) method returns the absolute (positive) value of x:
        The Math.round(x) method returns the rounded value of x:  x = 23.345  --> 23
        The Math.sqrt(x) method returns the square root of x:
        Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):

         int max=Integer.MAX_VALUE;   // OUTPUT max = 2147483647
          int min=Integer.MIN_VALUE;  // OUTPUT min = -2147483647

 */

        int n = -3;

        System.out.println(Math.abs(n)); //3
        System.out.println(Math.max(14, 22)); // 22
        System.out.println(Math.min(14, 22));  //14
        System.out.println(Math.pow(2, 3)); //2 power of 3   --> 8  (int)

        // TODO Auto-generated method stub
        int a=12;
        int b=50;
        int c = -123;
        double d = 12.67;
        double x = 81.0;

        System.out.println(Math.max(a, b)); //sdsdds
        System.out.println(Math.min(a, b));

        System.out.println(Math.abs(c));

        System.out.println(Math.round(d));
        System.out.println(Math.sqrt(x));

        double z = 5;
        double y = 4;
        //returns 5 power of 4 i.e. 5*5*5*5
        System.out.println(Math.pow(z, y));

        System.out.println(Math.round(0.60));  //1
        System.out.println(Math.round(0.40));  //0
        System.out.println(Math.round(5));     //5
        System.out.println(Math.round(5.1));  //5
        System.out.println(Math.round(-5.1));  //-5
        System.out.println(Math.round(-5.9));  //-6

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.println("Max value " + max);  //OUTPUT 2147483647
        System.out.println("Min value " + min);   //OUTPUT -2147483648

    }
}
