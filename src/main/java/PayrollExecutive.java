public class PayrollExecutive extends PayrollEmployee implements Bonus, Insurance {
    /* PayrollExecutive
        Contains all PayrollEmployee fields and methods
        Receives bonus at triple the bonus amount given to the rest of the company (receiveBonus method)
        Has insurance fee of 10.00 (payInsurance method)

        Additional Fields:
        double payPeriodEarnings of 20,000
       */
    private double payPeriodEarnings;
    private double insurance;

    public PayrollExecutive(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
        this.payPeriodEarnings = 20000.00;
        this.insurance = -10.00;

    }

    public double getPayPeriodEarnings() {

        return payPeriodEarnings;
    }

    public double getInsurance() {
        return insurance;
    }
}
