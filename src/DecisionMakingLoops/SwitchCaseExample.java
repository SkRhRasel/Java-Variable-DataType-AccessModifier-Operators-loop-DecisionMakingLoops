package DecisionMakingLoops;

import java.util.Scanner;

public class SwitchCaseExample {

    public static void main(String args[]) {
        // char grade = args[0].charAt(0);

        System.out.println("Enter a Character between (A to F)");
        Scanner reader = new Scanner(System.in);
        char ch = reader.next(".").charAt(0);

        switch(ch) {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + ch);
    }
}