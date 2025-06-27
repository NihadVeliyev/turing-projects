package model;

import exception.RoomOccupiedException;

public class Room {
    private int roomNumber;
    private boolean isOccupied;
    private Patient patient;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public void assignPatient(Patient patient) throws RoomOccupiedException {
        if (this.isOccupied) {
            throw new RoomOccupiedException("Room " + roomNumber + " is already occupied.");
        }
        this.patient = patient;
        this.isOccupied = true;
    }
    public void clearRoom() {
        this.patient = null;
        this.isOccupied = false;
    }


}
