import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Room> rooms = new ArrayList<>();
//        var standart = new StandardRoom(12, 25);
//
//        var suite = new SuiteRoom(2, 50, true);
//
//        var deluxe = new DeluxeRoom(5, 75, true);
        Room room = new Room(1, 155, RoomType.DELUXE);
        Room room2 = new Room(4, 70, RoomType.SUITE);
        Room room3 = new Room(7, 45, RoomType.STANDART);
        rooms.add(room);
        rooms.add(room2);
        rooms.add(room3);
        System.out.println(rooms);
//        Room[]rooms=new Room[3];
//        rooms[0]=standart;
//        rooms[1]=suite;
//        rooms[2]=deluxe;
//       suite.reserved();
//        System.out.println("------------------");
        for (Room r : rooms) {
//            if (r.isBooked()) {
//                r.displayInfo();
//            }
            System.out.println(r);

        }


    }


}
