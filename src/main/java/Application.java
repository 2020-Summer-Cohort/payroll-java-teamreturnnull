import java.util.Collection;
import java.util.Scanner;

public class Application {
    private static Scanner userInput = new Scanner(System.in);
    private static CompanyRoster roster = new CompanyRoster();

    public static void main(String[] args) {

        System.out.println("Welcome to your payroll application. XYZZZZZZZZ");
        roster.generateEmployees();
        roster.showAllEmployees();
    }

    private static void showEmployees() {
        Collection<PayrollEmployee> listOfEmployees = roster.employeeRoster();
        for (PayrollEmployee employee : listOfEmployees){
            System.out.println(employee.getFirstName()+" "+employee.getLastName());
        }
    }



}
