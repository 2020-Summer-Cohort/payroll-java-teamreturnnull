public class PayrollExecutive extends PayrollEmployee implements Bonus, Insurance {

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
