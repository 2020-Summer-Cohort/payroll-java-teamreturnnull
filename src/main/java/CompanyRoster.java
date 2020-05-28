import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CompanyRoster {
    private Map<Integer, PayrollEmployee> rosterMap = new HashMap<>();

    public CompanyRoster() {
    }

    public void addEmployee(PayrollEmployee employee) {
        rosterMap.put(employee.getEmployeeID(), employee);
    }

    public void removeEmployee(int employeeID) {
        rosterMap.remove(employeeID);
    }

    public Collection<PayrollEmployee> employeeRoster() {
        return rosterMap.values();
    }

    public void calculatePay(double bonus, boolean optionPayInsurance) {
        double payCheckTotal = 0;
        for (PayrollEmployee employee : rosterMap.values()) {
            if (employee instanceof Insurance) {
                if (optionPayInsurance == false) {
                    checkPaysInsurance();
                }
            }
            if (employee instanceof PayrollHourly) {
                payCheckTotal = ((PayrollHourly) employee).getHourlyRate()
                        * ((PayrollHourly) employee).getHoursWorked();
            } else if (employee instanceof PayrollSales) {
                payCheckTotal = bonus +
                        ((PayrollSales) employee).getPayPeriodEarnings() +
                        ((PayrollSales) employee).getCommission();
            } else if (employee instanceof PayrollDeveloper) {
                payCheckTotal = bonus +
                        ((PayrollDeveloper) employee).getPayPeriodEarnings() +
                        ((PayrollDeveloper) employee).getInsurance();
            } else if (employee instanceof PayrollExecutive) {
                payCheckTotal = (bonus * 3) +
                        ((PayrollExecutive) employee).getPayPeriodEarnings() +
                        ((PayrollExecutive) employee).getInsurance();
            }
            employee.setPayCheckTotal(payCheckTotal);
        }
    }

    private void checkPaysInsurance() {
        for (PayrollEmployee employee : employeeRoster()) {
            if (employee instanceof PayrollDeveloper) {
                if (((PayrollDeveloper) employee).getPayInsurance()==false)
                ((PayrollDeveloper) employee).setInsurance(0.00);
            }
            if (employee instanceof PayrollExecutive) {
                if (((PayrollExecutive) employee).getPayInsurance()==false)
                ((PayrollExecutive) employee).setInsurance(0.00);
            }
        }
    }
}

