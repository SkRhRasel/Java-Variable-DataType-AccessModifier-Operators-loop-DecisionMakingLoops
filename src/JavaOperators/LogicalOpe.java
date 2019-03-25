package JavaOperators;

/**
 * Created by skrockybulhasanrasel 27-07-18.
 */
public class LogicalOpe {
    public static void main(String[] args){

        boolean p = false;
        boolean q = true;

        boolean resultOfAndIs = p && q;
        boolean resultOfOrIs = p || q;
        boolean resultOfNotIs = !(p && q);

        System.out.println(resultOfAndIs);
        System.out.println(resultOfOrIs);
        System.out.println(resultOfNotIs);

    }
}
