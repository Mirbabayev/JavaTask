package meneger;

public class Director extends Manager {
    final double DIRECTOR_SALARY = 1500;

    public Director(int ID, String employeeName, String department, int serviceYear) {
        super(ID, employeeName, department, serviceYear);
    }

    @Override
    public String fixSalary() {
        if (getServiceYear() <= 0) {
            System.out.println("melumati dogru daxil edin !!!");
        } else if (getServiceYear() > 1 && getServiceYear() < 5) {
            salary = (DIRECTOR_SALARY * 0.50) + DIRECTOR_SALARY;
        } else if (getServiceYear() >= 5 && getServiceYear() < 10) {
            salary = (DIRECTOR_SALARY * 0.75) + DIRECTOR_SALARY;
        } else if (getServiceYear() >= 10) {
            salary = DIRECTOR_SALARY * 3;
        } else {
            salary = DIRECTOR_SALARY;
        }
        return getDepartment() + " : " + getEmployeeName() +"\nEmek haqqi: " + salary + " manat";
    }

    @Override
    public double calculateSalary() {
        return salary + bonus + BASE_SALARY;
    }

    @Override
    public String annualSalary() {
        return super.annualSalary();
    }

    @Override
    public String currentStatus(Boolean current) {
        return super.currentStatus(current);
    }


}
