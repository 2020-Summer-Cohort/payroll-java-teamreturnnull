public class PayrollExecutive extends PayrollEmployee implements Bonus, Insurance {

    private double payPeriodEarnings;
    private double insurance;
    private boolean payInsurance;
    private boolean payBonus;

    public PayrollExecutive(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
        this.payPeriodEarnings = 20000.00;
        this.insurance = -10.00;
        this.payBonus = true;
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

    public boolean getPayBonus() {
        return payBonus;
    }

    public void setPayBonus(boolean payBonus) {
        this.payBonus = payBonus;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }
}
