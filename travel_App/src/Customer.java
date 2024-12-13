import java.util.ArrayList;

public class Customer {
    private int customerId;
    private String name;
    private ArrayList<TourFeatures> cusReserveTours;


    public Customer(int customerId, String name, ArrayList<TourFeatures> cusReserveTours) {
        this.customerId = customerId;
        this.name = name;
        this.cusReserveTours = cusReserveTours;
    }
//    musterinin aldigi turlar
    void reservedTour(TourFeatures tour){
        cusReserveTours.add(tour);

    }
//    musterinin imtina etdiya turlar
    void canceledTour(){

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<TourFeatures> getCusReserveTours() {
        return cusReserveTours;
    }

    public void setCusReserveTours(ArrayList<TourFeatures> reserveTours) {
        this.cusReserveTours = reserveTours;
    }


}
