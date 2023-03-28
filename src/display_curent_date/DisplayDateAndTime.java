package display_curent_date;
import java.time.LocalDate;
import java.time.LocalTime;
public class DisplayDateAndTime {
    public static void main(String[] args) {
        LocalDate obj = LocalDate.now(); // for Date

        LocalTime obj2= LocalTime.now();// for Time

        System.out.println("Today Date is: "+obj);
        System.out.println("Current Time is: "+obj2);
    }
}
