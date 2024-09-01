import java.util.GregorianCalendar;
public class TimeClass
{
    public static void main(String []args)
    {
        gregorian();
    }
    public static void gregorian()
    {
        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(gc.getCalendarType());
        System.out.println(gc.getWeeksInWeekYear());
        System.out.println(gc.isLeapYear(2024));
        System.out.println(gc.getTimeZone());
        System.out.println(gc.getGregorianChange());
        gc.set(2026,10,24);
        System.out.println(gc.toZonedDateTime());
        System.out.println(gc.isWeekDateSupported());
    }
}
