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

    public void calculatePay(double hoursWorked, double bonus, double commission) {
        double payCheckTotal = 0;
        for (PayrollEmployee employee : rosterMap.values()) {
            if (employee instanceof PayrollHourly) {
                payCheckTotal = ((PayrollHourly) employee).getHourlyRate()
                        * hoursWorked;
            } else if (employee instanceof PayrollSales) {
                payCheckTotal = bonus +
                        ((PayrollSales) employee).getPayPeriodEarnings() + commission;
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

    public void generateEmployees() {
        PayrollEmployee executive1 = new PayrollExecutive("Kyle", "Wang", 3183);
        PayrollEmployee developer1 = new PayrollDeveloper("Riley", "Adkins", 8754);
        PayrollEmployee developer2 = new PayrollDeveloper("John", "Robson", 6984);
        PayrollEmployee developer3 = new PayrollDeveloper("Christin", "Banerjee", 4842);
        PayrollEmployee sales1 = new PayrollSales("Travis", "Pettrey", 1234);
        PayrollEmployee hourly1 = new PayrollHourly("Ben", "Williams", 9876);
        PayrollEmployee hourly2 = new PayrollHourly("Lacey", "Nichols", 0456);

        addEmployee(executive1);
        addEmployee(developer1);
        addEmployee(developer2);
        addEmployee(developer3);
        addEmployee(sales1);
        addEmployee(hourly1);
        addEmployee(hourly2);
    }
    public void showAllEmployees() {
        for (int employee : rosterMap.keySet())
            System.out.println(employee);
    }
}
