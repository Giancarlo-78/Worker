public class HourlyEmployee extends Employee {
    private double hourlyRate;

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyRate=" + hourlyRate +
                "} " + super.toString();
    }

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyRate) {
        super(name, birthDate,  hireDate);
        this.hourlyRate = hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyRate;
    }

    public double getDoublePay() {
        return 40 * hourlyRate * 2;

    }

}
