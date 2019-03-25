package Variable;
/**
 * Created by skrockybulhasanrasel 26/07/18.
 */
public class MyVariable2 {

    static int year = 2016;

    public static void main(String[] args){

        System.out.println("Year is: "+year);

        int age = 19;
        System.out.println("Age is: "+age);

        String name = "Hasan";
        System.out.println("Name is: "+name);

        my_cgpa();

    }

    static void my_cgpa(){
        double cgpa = 3.5;
        System.out.println("CGPA is: "+cgpa);
    }

}
