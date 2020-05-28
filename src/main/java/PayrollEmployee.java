public class PayrollEmployee {

    private String firstName;
    private String lastName;
    private int employeeID;
    protected double payCheckTotal;

    public PayrollEmployee(String firstName, String lastName, int employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getPayCheckTotal() {
        return payCheckTotal;
    }

    public void setPayCheckTotal(double checkValue) {
        this.payCheckTotal = checkValue;
    }
}
