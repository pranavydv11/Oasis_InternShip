package TestClasses;
import Classes.Seat;

public class SeatTest {

    public static void main(String[] args) {
       
        Seat seat2 = new Seat("C09", false);
        System.out.println("\n"+ seat2);
        
        //test getters
        System.out.println(seat2.getSeatID());
        System.out.println(seat2.isStatus());
    }
    
}
