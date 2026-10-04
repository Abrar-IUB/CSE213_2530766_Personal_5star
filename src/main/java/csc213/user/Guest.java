package csc213.user;

import csc213.nonuser.Room;

import java.time.LocalDate;

public class Guest {
    public void bookRoom(){
        Room r = new Room();
        int noOfNights;
        if(r.checkAvailability(LocalDate.now(), noOfNights:3))
    }
}
