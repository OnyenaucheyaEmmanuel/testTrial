package com.company.hotelmanagemetsystem;

public class UnicornHotel {
    public String [] rooms;

    public UnicornHotel(int numberOfRooms){
        this.rooms = new String[numberOfRooms];
    }

  public String bookRoom(String name){
       for(int i = 0; i < rooms.length; i++){
           if (rooms[i] == null){
               rooms[i] = name;
               break;
           }
       }
       return "Room Booked Successfully!";
  }


    public String getRoomGuest(int roomNumber){
        return rooms[roomNumber -1];

    }

    public String[] getRooms() {
    return rooms;
    }
}

