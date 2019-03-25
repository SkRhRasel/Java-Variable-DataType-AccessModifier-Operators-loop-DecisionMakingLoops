package FahrenheitToCelsiusConversion;

import java.util.*;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner far = new Scanner(System.in);

        System.out.println("Enter temperatue in Fahrenheit");
        float temperature = far.nextFloat();

        temperature = ((temperature - 32)*5)/9;

        System.out.println("Temperatuer in Celsius = " + temperature);
    }
}