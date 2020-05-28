import java.util.Collection;
import java.util.Scanner;

public class Application {
    private static Scanner userInput = new Scanner(System.in);
    private static CompanyRoster roster = new CompanyRoster();
    private static Collection<PayrollEmployee> listOfEmployees = roster.employeeRoster();

    public static void main(String[] args) {

        System.out.println("Welcome to your payroll application. XYZZZZZZZZ");
        generateEmployees();
        showEmployees();
        setEmployeeHours();
        setCommission();
        calculatePayChecks();
        printDaMoney();
    }

    public static void printDaMoney() {
        for (PayrollEmployee employee : listOfEmployees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " made $"
                    + employee.getPayCheckTotal());
        }
    }

    public static void setEmployeeHours() {
        for (PayrollEmployee employee : listOfEmployees) {
            if (employee instanceof PayrollHourly) {
                System.out.println("How many hours did " + employee.getFirstName() + " " + employee.getLastName() + " work:");
                int hoursClockedIn = userInput.nextInt();
                userInput.nextLine();
                ((PayrollHourly) employee).setHoursWorked(hoursClockedIn);
            }
        }
    }

    public static void setCommission() {

        for (PayrollEmployee employee : listOfEmployees) {
            if (employee instanceof PayrollSales) {
                System.out.println("How much commission did " + employee.getFirstName() + " " + employee.getLastName() + " receive:");
                double commission = userInput.nextDouble();
                userInput.nextLine();
                ((PayrollSales) employee).setCommission(commission);
            }
        }
    }

    public static void calculatePayChecks() {
        System.out.println("How much is the bonus this pay period per person? " +
                "Enter 0.00 if there is not a bonus.");
        double bonus = userInput.nextDouble();
        userInput.nextLine();
        for (PayrollEmployee employee : listOfEmployees) {
            roster.calculatePay(bonus);
        }
    }

    public static void generateEmployees() {
        PayrollEmployee executive1 = new PayrollExecutive("Kyle", "Wang", 3183);
        PayrollEmployee developer1 = new PayrollDeveloper("Riley", "Adkins", 8754);
        PayrollEmployee developer2 = new PayrollDeveloper("John", "Robson", 6984);
        PayrollEmployee developer3 = new PayrollDeveloper("Christin", "Banerjee", 4842);
        PayrollEmployee sales1 = new PayrollSales("Travis", "Pettrey", 1234);
        PayrollEmployee hourly1 = new PayrollHourly("Ben", "Williams", 9876);
        PayrollEmployee hourly2 = new PayrollHourly("Lacey", "Nichols", 4056);

        roster.addEmployee(executive1);
        roster.addEmployee(developer1);
        roster.addEmployee(developer2);
        roster.addEmployee(developer3);
        roster.addEmployee(sales1);
        roster.addEmployee(hourly1);
        roster.addEmployee(hourly2);
    }

    private static void showEmployees() {
        for (PayrollEmployee employee : listOfEmployees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }
    }


}
