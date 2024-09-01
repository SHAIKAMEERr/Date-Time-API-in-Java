import java.util.Calendar;
import java.util.GregorianCalendar;
public class GregorianCalendarPractice
{
    public void gregorian()
    {
        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(gc.getTime());
        System.out.println(gc.getTimeZone());
        System.out.println(gc.isLeapYear(2024));
        System.out.println(gc.isWeekDateSupported());
        System.out.println(gc.toZonedDateTime());
        System.out.println(gc.getWeeksInWeekYear());
        System.out.println(gc.getCalendarType());
        System.out.println(gc.getWeekYear());
        System.out.println(gc.getGregorianChange());
    }
}
