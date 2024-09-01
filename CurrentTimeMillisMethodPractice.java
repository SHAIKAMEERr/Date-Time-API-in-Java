import java.util.Date;
public class CurrentTimeMillisMethodPractice
{
   public void currentMillis()
   {
       System.out.println("Milli Seconds from 1970 : "+System.currentTimeMillis());
       System.out.println("Seconds From 1970 : "+System.currentTimeMillis()/1000);
       System.out.println("Minutes From 1970 : "+System.currentTimeMillis()/1000/60);
       System.out.println("hours From 1970 : "+System.currentTimeMillis()/1000/60/60);
       System.out.println("Days From 1970 : "+System.currentTimeMillis()/1000/60/60/24);
       System.out.println("Years from 1970 : "+System.currentTimeMillis()/1000/60/60/24/365);
       System.out.println("Current Year : "+(System.currentTimeMillis()/1000/60/60/24/365+1970));
   }
}
