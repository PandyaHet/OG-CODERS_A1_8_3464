public class Main {
    public static void main(String[] args) {
        System.out.println("Test 1: ");
        Management management = new Management();
        management.hireTest1();
        System.out.println("Test 2: ");
        System.out.println("Employees description: ");
        management.hireTest2();

        // Example demonstrating contract changes and accumulated salary calculation
        Employee employee = management.getEmployees().get(0); // Get the first employee (adjust index as needed)

        // Assuming changing contract from temporary to permanent for demonstration
        int daysWorked = 15;
        double monthlySalary = 5000;
        int children = 1;
        boolean married = true;
        double childrenPremium = 450;
        double hourlyWage = 30; // Example hourly wage for temporary contract
        double hoursWorked = 100; // Example hours worked for temporary contract

        employee.convertToPermanent(daysWorked, monthlySalary, children, married, childrenPremium);

        // Calculate and display the accumulated salary after the contract change
        double newAccumulatedSalary = employee.accumulatedSalary();
        System.out.println("Accumulated Salary after contract change: $" + newAccumulatedSalary);
    }
}
