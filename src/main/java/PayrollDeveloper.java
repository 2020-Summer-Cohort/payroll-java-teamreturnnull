public class PayrollDeveloper extends PayrollEmployee implements Bonus, Insurance {

    private double payPeriodEarnings;
    private double insurance;
    private boolean payInsurance;

    public PayrollDeveloper(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
        this.payPeriodEarnings = 9000.00;
        this.insurance = -80.00;
        this.payInsurance = true;
    }

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }

    public double getInsurance() {
        return insurance;
    }

    public boolean getPayInsurance() {
        return payInsurance;
    }

    public void setPayInsurance(boolean payInsurance) {
        this.payInsurance = payInsurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }
}