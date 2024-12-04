package bankTask;

public class Customer {
    private String customerName;
    private double balance;
    private String customer_ID;

    public Customer(String customerName,
                    double balance,
                    String customer_ID) {
        this.customerName = customerName;
        this.balance = balance;
        this.customer_ID = customer_ID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(String customer_ID) {
        this.customer_ID = customer_ID;
    }


}
