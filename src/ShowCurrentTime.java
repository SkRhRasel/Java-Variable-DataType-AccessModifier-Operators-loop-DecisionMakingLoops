/**
 * Created by skrockybulhasanrasel 26/07/18.
 */

public class ShowCurrentTime {

    public static void main(String[] args) {
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = (int)(totalSeconds % 60); // Obtain the total minutes
        long totalMinutes = totalSeconds / 60; // Compute the current minute in the hour
        long currentMinute = (int)(totalMinutes % 60); // Obtain the total hours
        long totalHours = totalMinutes / 60; // Compute the current hour
        long currentHour = (int)(totalHours % 24); // Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }

}
