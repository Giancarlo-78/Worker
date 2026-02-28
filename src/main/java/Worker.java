import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;
    // this field should be used by the subclasses so it is protec

    public Worker(

    ) {}

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }


    public int getAge(){
        //int birthDateYear = Integer.parseInt(this.birthDate.substring(6, 10));
        int birthDateYear2 = Integer.parseInt(this.birthDate.split("/")[2]);
        int currentDate = 2026;
        return currentDate-birthDateYear2;
    }
    public double collectPay(){
        return 400.0;
    }

    public String terminate(){
        return "Terminated " + this.name + " on " + this.endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
