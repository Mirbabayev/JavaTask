package bank_task;

public class BankAccount {
    private String accountNumber;
    private double balance;
    final String errorInfo = "Mebleg menfi ola bilmez !!!";

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double addBalance) {

        if (addBalance > 0) {
            this.balance = addBalance;
        } else {
            System.err.println(errorInfo);
        }
    }

    public void depozit(double add) {
        balance = add + balance;
        System.out.println("balansiniz "+balance+" manatdir");
    }

    public void withdraw(double takeOut) {
        String info = "Balansda yeterin qeder deyil !";
        if (takeOut <= this.balance) {
            balance = balance - takeOut;
            System.out.println("balansiniz "+balance+" manatdir");
        } else {
            System.out.println(info);
        }


    }


}
