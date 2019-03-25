package AccessModifire.Teacher;

import AccessModifire.Students.Student1;
import AccessModifire.Students.Student2;
/**
 * Created by skrockybulhasanrasel 26-07-18.
 */
public class Teacher1 {

    public static void main(String[] a){
        int r1 = Student1.roll;
        int r2 = Student2.roll;

        System.out.println("Roll 1 :"+r1);
        System.out.println("Roll 2 :"+r2);

        String dus = Teacher2.d;
        System.out.println("Boring from teacher 1: "+dus);

    }

}
