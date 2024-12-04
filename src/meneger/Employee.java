package meneger;

public class Employee implements CalculationMethods {
    private int ID;
    private String employeeName;
    private int serviceYear;
    private String department;
    final double BASE_SALARY = 500;
    double salary = 0;
    double bonus = 0.0;

    public Employee(int ID, String employeeName, String department, int serviceYear) {
        this.ID = ID;
        this.employeeName = employeeName;
        this.department = department;
        this.serviceYear = serviceYear;
    }

    @Override
    public String fixSalary() {
        if (serviceYear <= 0) {
            System.out.println("melumati dogru daxil edin !!!");
        } else if (serviceYear > 1 && serviceYear < 5) {
            salary = (BASE_SALARY * 0.50) + BASE_SALARY;
        } else if (serviceYear >= 5 && serviceYear < 10) {
            salary = (BASE_SALARY * 0.75) + BASE_SALARY;
        } else if (serviceYear >= 10) {
            salary = BASE_SALARY * 3;
        } else {
            salary = BASE_SALARY;
        }
        return getDepartment() + " : " + getEmployeeName() + "\nEmek haqqi: " + salary + " manat";
    }

    @Override
    public String bonus(String bonus_OK, double bonusAmount) {

        if (bonus_OK == "Ok") {
            bonus = salary + (salary * bonusAmount) / 100;
        }
        return "bonus + maas " + bonus + " manat";
    }

    @Override
    public String currentStatus(Boolean current) {
        if (current) {
            return "isdedir";
        } else {
            return "isde deyil";
        }
    }

    @Override
    public void print(String print) {

        System.out.println("" + print);
    }

    @Override
    public String annualSalary() {

        return "illik fix qazanc " + (salary * 12) + " manat";
    }

    @Override
    public double calculateSalary() {
        return salary + bonus + BASE_SALARY;
    }


    public int getServiceYear() {
        return serviceYear;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

}
