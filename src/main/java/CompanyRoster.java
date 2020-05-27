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

    public Collection<PayrollEmployee> fetchingEmployeePay() {
        return rosterMap.values();
    }

    public void calculatePay() {

    }

}

