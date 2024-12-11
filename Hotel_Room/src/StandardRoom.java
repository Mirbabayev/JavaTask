public class StandardRoom extends Room {

    private boolean isSingleBad;


    public StandardRoom(int roomNumber, double price,RoomType roomType) {
        super(roomNumber, price,roomType);
        this.isSingleBad = true;
    }

    @Override
    public void displayInfo() {
        System.out.println("Otaq nomresi: " + getRoomNumber() + "\n" + "Otaq qiymeti: " + getPrice()
                + "\n" + "Yataq sayi: " + (isSingleBad ? "Tek yataq" : "Cut yataq"));

    }

    @Override
    public String toString() {
        return "StandardRoom{" +
                "isSingleBad=" + isSingleBad +
                '}';
    }
}
