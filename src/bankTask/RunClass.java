package bankTask;

public class RunClass {
    public static void main(String[] args) {

        BankCustomer cus = new BankCustomer(new Customer("hesen",245,"123456"));
        cus.checkBalance();
        System.out.println(cus.addBalance(24));

    }
}
