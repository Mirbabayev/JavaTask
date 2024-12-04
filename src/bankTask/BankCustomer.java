package bankTask;

public class BankCustomer extends BankOperation implements PaymentService{
    private Customer customer;

    public BankCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void checkBalance() {
        System.out.println(customer.getBalance());
    }

    @Override
    public double addBalance(double a) {
        return customer.getBalance()+a;
    }

    @Override
    public void pay(double amount) {

    }

    @Override
    public void refund(double amount) {

    }
}
