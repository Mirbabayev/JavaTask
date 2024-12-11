public class DeluxeRoom extends Room {
    private boolean isBalkon;

    public DeluxeRoom(int roomNumber, double price,boolean isBalkon,RoomType roomType) {
        super(roomNumber, price,roomType);
        this.isBalkon = isBalkon;
    }


    @Override
    public void displayInfo() {
        System.out.println("Otaq nomresi: " + getRoomNumber() + "\n" + "Otaq qiymeti: " + getPrice()
                + "\n" + "Balkon: " + (isBalkon ? "var" : "yoxdur"));
    }

    @Override
    public String toString() {
        return "DeluxeRoom{" +
                "isBalkon=" + isBalkon +
                '}';
    }
}
