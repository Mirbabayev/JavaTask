package bank_task;

public class RunClass {
    public static void main(String[] args) {

        var operation = new BankAccount("23456745", 234);
//        System.out.println(operation.getBalance());
        operation.depozit(798);

        System.out.println("----------------");
        operation.withdraw(678);
        System.out.println("----------------");


    }
}
