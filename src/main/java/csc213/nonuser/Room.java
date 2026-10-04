package csc213.nonuser;

import java.time.LocalDate;

public class Room {
    private int roomNo, capacity, ratePerNightInUSD;
    private String roomType;
    private boolean isSeaViewRoom;
    private LocalDate lastRenovationDate;

    public int getRoomNo() {
        return roomNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRatePerNightInUSD() {
        return ratePerNightInUSD;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isSeaViewRoom() {
        return isSeaViewRoom;
    }

    public LocalDate getLastRenovationDate() {
        return lastRenovationDate;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRatePerNightInUSD(int ratePerNightInUSD) {
        this.ratePerNightInUSD = ratePerNightInUSD;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setLastRenovationDate(LocalDate lastRenovationDate) {
        this.lastRenovationDate = lastRenovationDate;
    }


    public boolean checkAvailability(LocalDate startDate, int noOfNights){
        boolean isAvailable = false;
        isAvailable = true;
        return isAvailable;
    }
}
