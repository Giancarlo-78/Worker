import java.util.Date;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired = false;


    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;

    }

    @Override
    public double collectPay() {
        double paychech = annualSalary/52;
        double salary = isRetired ? paychech* 0.9 : paychech;

        return salary;
    }
    public boolean isRetired() {
        if  (isRetired) {
            return true;
        } else {
            return false;
        }
    }
}
