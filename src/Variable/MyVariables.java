package Variable;
/**
 * Created by skrockybulhasanrasel 26/07/18.
 */
public class MyVariables {

    int year = 2016;
    static int my_salary= 2000;

    public static void main(String[] args) {

        // Declaring variables
        int i;
        String text;

        // initializing variables
        i = 20;
        text = "My Name is Rohim & My age is: ";

        System.out.println(text+i);

        // Understanding Variable kinds

        // 'month' is a local variable
        int month = 12;

        // salary  variable is a staticPoly variable
        System.out.println("My monthly Salary " + my_salary);

    }

    // this is a method
    public void my_method(){

        // 'year' is a Instance Variable
        System.out.println("Year is: "+year);

        // System.out.println("Year is: "+month);
        // 'month' can't be accessed as it's a local variable
    }

}
