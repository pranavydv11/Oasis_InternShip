

package Classes;

import java.io.Serializable;

public class Airline implements Serializable {
    private String airlineID;
    private String airlineName;

    
    public Airline() {
        this.airlineID = "";
        this.airlineName = "";
    }

    public Airline(String airlineID, String name) {
        setAirlineID(airlineID);
        setAirlineName(name);
    }

    public void setAirlineID(String airlineID) {
        try {
            if (airlineID.matches("[a-zA-Z]+$") && airlineID.length() == 2) {
                this.airlineID = airlineID.toUpperCase();
            } else {
                throw new IllegalArgumentException("Invalid Airline ID");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setAirlineName(String airlineName) {
        try {
            if (airlineName.matches("[a-zA-Z ]+$")) {
                this.airlineName = airlineName;
            } else {
                throw new IllegalArgumentException("Invalid Airline Name");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getAirlineID() {
        return airlineID; // returns airlineID in capitals
    }

    public String getAirlineName() {
        return airlineName;
    }

    @Override
    public String toString() {
        return getAirlineID() + "," + getAirlineName();
    }
}
