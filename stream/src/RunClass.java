import java.util.Arrays;

public class RunClass {
    public static void main(String[] args) {

        var customer = new Customer("Muxtar", 600);
        var customer2 = new Customer("Elcin", 500);
        var customer3 = new Customer("Surxay", 300);
        var customer4 = new Customer("Gunay", 200);
        var customer5 = new Customer("Merdan", 700);


        var custList = Arrays.asList(customer, customer2, customer3, customer4, customer5);
        var a = custList.stream()
                .filter(t -> t.getCusBorc() > 350)
                .peek(t -> t.setCusBorc((t.getCusBorc() * 0.5) + t.getCusBorc()))
                .toList();
        System.out.println(a);


    }

}
