package arrays;

import java.util.Arrays;

public class TimeConvertion {
    public static void main(String[] args) {
        String time="07:05:45PM";
        String s = timeConversion(time);
        System.out.println(s);
    }

    public static String timeConversion(String s) {
        // Write your code here
        String time="";
        if(s.contains("PM")){
            String[] ch = s.split(":");
            int i = 24 - Integer.parseInt(ch[0]);
            ch[0]=String.valueOf(i);
            String hourTime= Arrays.toString(ch);
            time=hourTime.substring(0,7);
        }
        return time;

    }
}
