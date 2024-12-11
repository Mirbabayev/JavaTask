public class SuiteRoom extends Room {
    private boolean isKitchen;

    public SuiteRoom(int roomNumber, double price, boolean isKitchen,RoomType roomType) {
        super(roomNumber, price,roomType);
        this.isKitchen = isKitchen;
    }

    @Override
    public void displayInfo() {
        System.out.println("Otaq nomresi: " + getRoomNumber() + "\n" + "Otaq qiymeti: " + getPrice()
                + "\n" + "Metbex: " + (isKitchen ? "var" : "yoxdur"));
    }

    @Override
    public String toString() {
        return "SuiteRoom{" +
                "isKitchen=" + isKitchen +
                '}';
    }
}
