/*OOP Payroll Application
        Project Specifications For Module 1 Group Project
        Project Description
        You have been contracted to create payroll software for a bustling new startup. They know their company is set to grow, so they want this program built in a fashion that will allow them to add additional complexity and functionality without having to rebuild the application. This means you will be using strong OOP principles in your design. Inheritance and polymorphism will be integral to your design.
        The program you design will list employees in the company roster, prompt you for information about the pay period such as if a bonus was given and how many hours the hourly employees work, and then output the list of employees longside the amount on their paycheck for the pay period.
        To do this project successfully, you will have to make use of Java’s interface and subclassing features. Look for commonalities between the different employee classes to find where to apply said features.

        PayrollEmployee
        Fields:
        int employeeId
        String firstName
        String lastName
        double paycheckTotal
        Methods:
        Access methods
        setPaycheckTotal

        PayrollSales
        Contains all PayrollEmployee fields and methods
        Receives bonus (receiveBonus method)
        No insurance
        Additional fields:
        double sales commission (with an accompanying method to set the amount)
        double payPeriodEarnings of 3,000.00

        PayrollHourly
        Contains all PayrollEmployee fields and methods
        No bonus
        No insurance
        Additional fields:
        int hoursWorked (with an accompanying method to set the amount)
        double hourlyRate of 20.00

        PayrollDeveloper
        Contains all PayrollEmployee fields and methods
        Receives Bonus (receiveBonus method)
        Has insurance with fee of 80.00 (payInsurance method)
        Additional fields:
        double payPeriodEarnings of 9,000

        PayrollExecutive
        Contains all PayrollEmployee fields and methods
        Receives bonus at triple the bonus amount given to the rest of the company (receiveBonus method)
        Has insurance fee of 10.00 (payInsurance method)

        Additional Fields:
        double payPeriodEarnings of 20,000
        CompanyRoster class
Contains a Collection of PayrollEmployees. When the program starts, populate the collection with 1 PayrollExecutive
 objects, 3 PayrollDeveloper,  1 PayrollSales, and 2 PayrollHourly objects.
        calculatePay() method that will set the paycheckTotal field in each employee based on their salary, bonuses,
        insurance fees, and hours worked if applicable.
        PayrollApp class
When the user starts the program, the console will print the list of employees in the CompanyRoster, then prompt the
user to enter information about the pay period. The user will enter the hours worked for each PayrollHourly employee, set
the sales commission amounts in the PayrollSales employees, and specify the bonus for the pay period. Your program will then
execute your calculatePay() method, which will iterate through the company roster and set the paycheckTotal field in each
employee based on their information. For example, for a PayrollExecutive you would set their paycheckTotal to their
payPeriodAmount and then call the payInsurance() and receiveBonus() methods on that object. Use OOP and the “instanceof”
operator to know which employees in your company roster it is appropriate to call those methods on.*/

