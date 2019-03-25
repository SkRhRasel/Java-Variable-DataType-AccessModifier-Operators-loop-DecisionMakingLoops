package DecisionMakingLoops;

/**
 * Created by skrockybulhasanrasel 27-07-18.
 */

import java.util.Scanner;

public class HomeSwitch {

    public static void main(String[] args){

        System.out.println("Enter switch no: ");
        Scanner scanner = new Scanner(System.in);
        int home_switch = scanner.nextInt();

        switch (home_switch){
            case 0:
                System.out.println("Turn on light");
                break;
            case 1:
                System.out.println("Turn on fan");
                break;
            case 2:
                System.out.println("Turn on table light");
                break;
            case 3:
                System.out.println("Turn on AC");
                break;
            default:
                System.out.println("No valid!");
                break;
        }


    }

}
