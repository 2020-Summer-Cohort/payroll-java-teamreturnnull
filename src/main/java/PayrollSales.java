public class PayrollSales extends PayrollEmployee implements Bonus {
    /*  PayrollSales
        Contains all PayrollEmployee fields and methods
        Receives bonus (receiveBonus method)
        No insurance
        Additional fields:
        double sales commission (with an accompanying method to set the amount)
        double payPeriodEarnings of 3,000.00
        */
    private double payPeriodEarnings;


    public PayrollSales(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
        this.payPeriodEarnings = 3000.00;

    }

    public double getPayPeriodEarnings() {

        return payPeriodEarnings;
    }
}

