package lab_06;

import java.util.ArrayList;
import java.util.List;

public class MinuteCalculation {

    public static void main(String[] args) {
        String inputString = "2hrs and 5 minutes";
        int minute = 0;
        String[] timeArray = new String[2];
        timeArray = inputString.split("and");
        for (int index = 0; index < timeArray.length; index++) {
            if (timeArray[index].contains("hrs")) {
                String hoursString = "";
                hoursString = timeArray[index].replaceAll("[^0-9]", "");
                minute += Integer.valueOf(hoursString) * 60;
            } else if (timeArray[index].contains("minutes")) {
                String minuteString = "";
                minuteString = timeArray[index].replaceAll("[^0-9]", "");
                minute += Integer.valueOf(minuteString);
            }
        }
        System.out.printf("Total is: %d minutes\n", minute);
    }

}
