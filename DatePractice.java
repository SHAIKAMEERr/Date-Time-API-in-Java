import java.util.Date;

public class DatePractice
{
    public void date()
    {
            Date d=new Date();
            Date d1=new Date("09/09/2024");
            System.out.println(d1);
            System.out.println("Current date & time : "+d);
            System.out.println("Current Date and GMT time : "+d.toGMTString());
            System.out.println("Year : "+d.getYear());
            System.out.println("Month : "+d.getMonth());
            System.out.println("Day : "+d.getDay());
            System.out.println("Hour : "+d.getHours());
            System.out.println("Minutes : "+d.getMinutes());
            System.out.println("Seconds : "+d.getSeconds());
            System.out.println("Time : "+d.getTime());
            System.out.println("Time zone : "+d.getTimezoneOffset());
            System.out.println(d.getTimezoneOffset());
    }
}
