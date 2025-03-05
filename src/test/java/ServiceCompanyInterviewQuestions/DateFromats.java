package ServiceCompanyInterviewQuestions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFromats {

    public static void main(String[] args) {

       //Getting today's date
        Date today = new Date();

        //Printing today's date in the default format
        System.out.println("Today is : "+today);  ////Mon Feb 24 16:58:06 EST 2025

        //Formatting today's date in dd MMMM yyyy format
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");

        System.out.println("Today in dd MMMM yyyy format : "+formatter.format(today));  //24 February 2025

        //==================================
        //Formatting today's date in E, dd MMM yyyy format
        SimpleDateFormat formatter2 = new SimpleDateFormat("E, dd MMM yyyy");

        System.out.println("Today in E, dd MMM yyyy format : "+formatter2.format(today)); // Mon, 24 Feb 2025

        //==================================
        //Formatting today's date in dd-MMM-yyyy HH:mm:ss format

        SimpleDateFormat formatter3 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");

        System.out.println("Today in dd-MMM-yyyy HH:mm:ss format : "+formatter3.format(today)); //24-Feb-2025 22:33:34

        //========================================
        //Formatting today's date in EEEE, MMM dd yyyy, hh:mm:ss a format

        SimpleDateFormat formatter4 = new SimpleDateFormat("EEEE, MMM dd yyyy, hh:mm:ss a"); // Monday, Feb 24 2025, 10:33:34 PM

        System.out.println("Today in EEEE, MMM dd yyyy, hh:mm:ss a format : "+formatter4.format(today));

        //=======================================
        //Formatting today's date in dd-MMM-yyyy HH:mm:ss z format

        SimpleDateFormat formatter5 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss z"); //24-Feb-2025 22:33:34 EST

        System.out.println("Today in dd-MMM-yyyy HH:mm:ss z format : "+formatter5.format(today));

        //=========================================
        //Formatting today's date in dd-MMM-yyyy HH:mm:ss Z format

        SimpleDateFormat formatter6 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss Z");

        System.out.println("Today in dd-MMM-yyyy HH:mm:ss Z format : "+formatter6.format(today));  //24-Feb-2025 22:33:34 -0500
    }

}
