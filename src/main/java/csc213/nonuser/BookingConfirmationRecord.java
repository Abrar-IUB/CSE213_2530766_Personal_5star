package csc213.nonuser;

import java.time.LocalDate;

public class BookingConfirmationRecord {
    private int bookingNo;
    private int bookedRoomNo;


    public void generatePDFofThisRecord(){
        //Room r = retrieve Room object from database using bookedRoomNo
        Room r = new Room();
        r.getRoomType();
        r.checkAvailability(LocalDate.now(), noOfNights:3)
    }
}
