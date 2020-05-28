public class PayrollHourly extends PayrollEmployee {
    private double hourlyRate;
    private int hoursWorked;

    public PayrollHourly(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
        this.hourlyRate = 20.00;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
