package TakingInput;

/**
 * Created by skrockybulhasanrasel 26/07/18.
 */
import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = scr.nextInt();

//        System.out.println("Enter a number");
//        int b = scr.nextInt();

        //int result = a+b;
        System.out.println("The Result is: " + a);


//        System.out.println("Enter a number");
//        double c = scr.nextDouble();
//
//        System.out.println("Enter a number");
//        double d = scr.nextDouble();
//
//        double result2 = c+d;
//        System.out.println("The Result is: " + result2);
    }
}
