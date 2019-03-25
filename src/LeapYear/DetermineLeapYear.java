package LeapYear;

import java.util.Scanner;

/**
 * Created by skrockybulhasanrasel 27-07-18.
 */

public class DetermineLeapYear {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = scr.nextInt();       //year we want to check

        //if year is divisible by 4, it is a leap year

        if( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Year " + year + " is a leap year");
        else
            System.out.println("Year " + year + " is not a leap year");
    }
}