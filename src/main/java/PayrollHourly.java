public class PayrollHourly extends PayrollEmployee {
    /*  PayrollHourly
        Contains all PayrollEmployee fields and methods
        No bonus
        No insurance
        Additional fields:
        int hoursWorked (with an accompanying method to set the amount)
        double hourlyRate of 20.00*/
    private double hourlyRate;

    public PayrollHourly(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
        this.hourlyRate = 20.00;

    }

    public double getHourlyRate() {
        return hourlyRate;
    }

}
