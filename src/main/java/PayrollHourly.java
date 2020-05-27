public class PayrollHourly extends PayrollEmployee {
    /*  PayrollHourly
        Contains all PayrollEmployee fields and methods
        No bonus
        No insurance
        Additional fields:
        int hoursWorked (with an accompanying method to set the amount)
        double hourlyRate of 20.00*/
    private int hoursWorked;
    private double hourlyRate;

    public PayrollHourly(String firstName, String lastName, int employeeID, double payCheckTotal,
                         int hoursWorked, double hourlyRate) {
        super(firstName, lastName, employeeID, payCheckTotal);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = 20.00;

    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

}
