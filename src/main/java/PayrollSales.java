public class PayrollSales extends PayrollEmployee implements Bonus {

    private double payPeriodEarnings;
    private double commission;

    public PayrollSales(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
        this.payPeriodEarnings = 3000.00;

    }

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}

