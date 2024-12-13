import java.util.ArrayList;

public class TravelCompany {
//    company name
//    tour list
//    costumer list
    private String companyName;
    private ArrayList<TourFeatures> tours;
    private ArrayList<Customer>customers;

    public TravelCompany(String companyName, ArrayList<TourFeatures> tours, ArrayList<Customer> customers) {
        this.companyName = companyName;
        this.tours = tours;
        this.customers = customers;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<TourFeatures> getTours() {
        return tours;
    }

    public void setTours(ArrayList<TourFeatures> tours) {
        this.tours = tours;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
