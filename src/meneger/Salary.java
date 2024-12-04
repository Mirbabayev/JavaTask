package meneger;

public enum Salary {
    BASE_SALARY(500),
    MANAGEMENT_PAYMENT(500);

    private final double  salary;
    private Salary(double salary){
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }
}
