package meneger;

public class RunClass {
    public static void main(String[] args) {

        Employee employee = new Employee(2356, "Eldar",
                "Satici", 1);
        Employee manager = new Manager(2337, "Kamil",
                "Meneger", 5);
        Employee director = new Director(2595, "Tural",
                "Director", 11);

        employee.print(employee.fixSalary());
        employee.print(employee.bonus("Ok",55));
        employee.print(employee.annualSalary());
        employee.print("-------------------------");
        employee.print(manager.fixSalary());
        employee.print(manager.bonus("Ok",80));
        employee.print(manager.annualSalary());
        employee.print("-------------------------");
        employee.print(director.fixSalary());
        employee.print(director.bonus("Ok",80));
        employee.print(director.annualSalary());







    }


}
