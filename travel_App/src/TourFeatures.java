public class TourFeatures {
    private int tourId;
    private String tourName;
    private double price;
    private boolean isReserved;
    private TourPackage tourPackage;

    public TourFeatures(int tourId, String tourName, double price, TourPackage tourPackage) {
        this.tourId = tourId;
        this.tourName = tourName;
        this.price = price;
        this.isReserved = false;
        this.tourPackage = tourPackage;
    }

    public void isReserved() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Tour " + tourName + " has been reserved.");
        } else {
            System.out.println("Tour " + tourName + " is already reserved.");
        }

    }

    public void cancelReserved() {
        if (!isReserved) {
            isReserved = false;
            System.out.println("Reservation for tour " + tourName + " is canceled.");
        } else {
            System.out.println("Tour " + tourName + " is not reserved.");
        }

    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getIsReserved() {
        return isReserved;
    }

    public void setIsReserved(boolean reserved) {
        isReserved = reserved;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }
}
