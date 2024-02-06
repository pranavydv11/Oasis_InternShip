package TestClasses;

import Classes.Address;
import Classes.Name;
import Classes.Passenger;
import Classes.Reservation;
import Classes.Seat;


public class ReservationTest {

    public static void main(String[] args) {
        // test constructor01
//        Reservation reservation1 = new Reservation();
        //System.out.println(reservation1);
        
        Seat seat1 = new Seat("A1", true);
        Seat seat2 = new Seat("A2", true);
//        Seat seat3 = new Seat("A3", true);
        
        Name name1 = new Name("Madhushi","Welikala");
        Address address1 = new Address("Madulawa", "Padukka");
        Passenger passenger1 = new Passenger(name1, address1, "071 683 6774");
        
        Name name2 = new Name("Sajini","Senaratna");
        Address address2 = new Address("HighLevel Rd.", "Kottawa");        
        Passenger passenger2 = new Passenger(name2, address2, "071 683 6774");
        
 
        Passenger[] passengers1 =  {passenger1, passenger2};                                         //new Passenger[2];
        Seat[] reservedSeats1 = {seat1, seat2};                             //new String[2];
        Reservation reservation1 = new Reservation(6, 2, passengers1, "ML654", "28 dec 2016", reservedSeats1);
        System.out.println(reservation1);
        
        
        

    }
    
}
