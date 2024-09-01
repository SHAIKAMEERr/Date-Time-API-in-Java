import java.util.Date;
public class DateClass
{
    public static void main(String[] args)
    {
        date();
    }
    public static void date()
    {
        Date d=new Date();
        System.out.println(d);
        System.out.println("Year From 1900 : "+d.getYear());
        System.out.println("Month : "+d.getMonth());
        System.out.println("Day : "+d.getDay());
        System.out.println("Hour : "+d.getHours());
        System.out.println("Minutes : "+d.getMinutes());
        System.out.println("Seconds : "+d.getSeconds());
        System.out.println("TimeZone : "+d.getTimezoneOffset());
        System.out.println("GMT Time : "+d.toGMTString());
        d.setYear(2025);
        System.out.println("Set year : "+d.getYear());
    }
}
