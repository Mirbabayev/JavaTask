package meneger;

public class Manager extends Employee {
    final double MANAGEMENT_SALARY = 750;


    public Manager(int ID, String employeeName,
                   String department, int serviceYear) {
        super(ID, employeeName, department, serviceYear);

    }

//    public String totalSalary(){
//
//    }

    @Override
    public String fixSalary() {
        if (getServiceYear() <= 0) {
            System.out.println("melumati dogru daxil edin !!!");
        } else if (getServiceYear() > 1 && getServiceYear() < 5) {
            salary = (MANAGEMENT_SALARY * 0.50) + MANAGEMENT_SALARY;
        } else if (getServiceYear() >= 5 && getServiceYear() < 10) {
            salary = (MANAGEMENT_SALARY * 0.75) + MANAGEMENT_SALARY;
        } else if (getServiceYear() >= 10) {
            salary = MANAGEMENT_SALARY * 3;
        } else {
            salary = MANAGEMENT_SALARY;
        }
        return getDepartment() + " : " + getEmployeeName() + "\nEmek haqqi: " + salary + " manat";
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
