public class PayrollDeveloper extends PayrollEmployee implements Bonus, Insurance {
    /* PayrollDeveloper
  Contains all PayrollEmployee fields and methods
  Receives Bonus (receiveBonus method)
  Has insurance with fee of 80.00 (payInsurance method)
  Additional fields:
  double payPeriodEarnings of 9,000
*/
    private double payPeriodEarnings;

    public PayrollDeveloper(String firstName, String lastName, int employeeID, double payCheckTotal, double payPeriodEarnings) {
        super(firstName, lastName, employeeID, payCheckTotal);
        this.payPeriodEarnings=9000.00;
    }

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }
}
