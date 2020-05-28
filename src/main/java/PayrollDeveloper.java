public class PayrollDeveloper extends PayrollEmployee implements Bonus, Insurance {
    /* PayrollDeveloper
  Contains all PayrollEmployee fields and methods
  Receives Bonus (receiveBonus method)
  Has insurance with fee of 80.00 (payInsurance method)
  Additional fields:
  double payPeriodEarnings of 9,000
*/
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