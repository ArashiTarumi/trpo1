/**
 * Created by admin on 07.05.2018.
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class DataISO

{
    public static void main(String[] args) throws ParseException {
        DateFormat date = new SimpleDateFormat("YYYY-MM-DD'T'HH:mm:ss'Z'");
        String s = "2018-01-12T12:12:43Z";
        Date result = date.parse(s);
        System.out.println(result);
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        cal.add(Calendar.DATE, 1);
        Null.zeroing(cal);
        System.out.println("Next day ");
        System.out.println(cal.getTime());
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(result);
        cal1.add(Calendar.MONTH, 1);
        Null.zeroing(cal1);
        System.out.println("Next month ");
        System.out.println(cal1.getTime());
        while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY){
            cal.add(Calendar.DATE, -1);
        }
        Null.zeroing(cal);
        System.out.println("Beginning of the week");
        System.out.println(cal.getTime());
        while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)
        {
            cal.add(Calendar.DATE, 1);
        }
        Null.zeroing(cal);
        System.out.println("End of the week:");
        System.out.println(cal.getTime());

    }
}