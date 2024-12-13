import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TravelRunClass {
    public static void main(String[] args) {
       TourFeatures tour = new TourFeatures(112, "Sunny Beach Holiday",
                1575, TourPackage.BEACH_HOLIDAY);
        Customer cust=new Customer(12,"musa",new ArrayList<>(Arrays.asList(tour)));
        cust.reservedTour(tour);
        System.out.println(cust.getCusReserveTours());
        tour.isReserved();
        System.out.println("------------------");
//        tour.getIsReserved();
        tour.cancelReserved();
        System.out.println("------------------");

        tour.setIsReserved(true);
        System.out.println("------------------");


        tour.isReserved();
        tour.cancelReserved();


    }
}
