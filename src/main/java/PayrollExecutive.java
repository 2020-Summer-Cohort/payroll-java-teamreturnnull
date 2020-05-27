public class PayrollExecutive extends PayrollEmployee implements Bonus, Insurance {
    /* PayrollExecutive
        Contains all PayrollEmployee fields and methods
        Receives bonus at triple the bonus amount given to the rest of the company (receiveBonus method)
        Has insurance fee of 10.00 (payInsurance method)

        Additional Fields:
        double payPeriodEarnings of 20,000
       */
    private double payPeriodEarnings;

    public PayrollExecutive(String firstName, String lastName, int employeeID, double payCheckTotal, double payPeriodEarnings) {
        super(firstName, lastName, employeeID, payCheckTotal);
        this.payPeriodEarnings=20000.00;

    }

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }
}
