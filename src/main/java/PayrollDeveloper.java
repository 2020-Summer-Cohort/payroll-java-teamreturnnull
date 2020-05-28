public class PayrollDeveloper extends PayrollEmployee implements Bonus, Insurance {

    private double payPeriodEarnings;
    private double insurance;

    public PayrollDeveloper(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
        this.payPeriodEarnings = 9000.00;
        this.insurance = -80.00;
    }

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }

    public double getInsurance() {
        return insurance;
    }
}