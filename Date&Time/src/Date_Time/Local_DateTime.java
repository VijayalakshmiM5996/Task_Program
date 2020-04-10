package Date_Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter; 
public class Local_DateTime {
 public static void main(String[] args) {  
	 //Date class
    LocalDate date = LocalDate.now();  
    LocalDate yesterday = date.minusDays(1);  
    LocalDate tomorrow = yesterday.plusDays(2);  
    System.out.println("Today date: "+date);  
    System.out.println("Yesterday date: "+yesterday);  
    System.out.println("Tommorow date: "+tomorrow); 
    //Time class
    System.out.println("Checking current year is leapyear ? : "+date.isLeapYear());  
    LocalDateTime datetime = date.atTime(10,50,9); 
    System.out.println(datetime);
    LocalTime time1 = LocalTime.now(); 
    System.out.println("Current Time : "+time1);  
    LocalTime time2=time1.minusHours(2);  
    LocalTime time3=time2.plusMinutes(30);
    System.out.println("Two hours before : "+time2);
    System.out.println("30 min plus : "+time3);
    //DateTime class
    LocalDateTime datetime1 = LocalDateTime.of(2020, 04 , 07 , 10, 34);  
    LocalDateTime datetime2 = datetime1.plusDays(120);  
    System.out.println("Before Formatting: " + datetime1);  
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
    String formatDateTime = datetime2.format(format);   
    System.out.println("After Formatting: " + formatDateTime ); 
 
    //MonthDay class
    MonthDay month = MonthDay.now();  
    LocalDate datee = month.atYear(1996); 
    System.out.println(datee); 
    boolean b = month.isValidYear(1);  
    System.out.println("valid year? : "+b);  
   
  }  
}  