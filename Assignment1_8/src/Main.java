public class Main {
    public static void main(String[] args) {
        System.out.println("Test 1: ");
        Management management = new Management();
        management.hireTest1();
        System.out.println("Test 2: ");
        System.out.println("Employees description: ");
        management.hireTest2();

        Employee employee = management.getEmployees().get(0);

        int daysWorked = 15;
        double monthlySalary = 5000;
        int children = 1;
        boolean married = true;
        double childrenPremium = 450;
        double hourlyWage = 30;
        double hoursWorked = 100;

        employee.convertToPermanent(daysWorked, monthlySalary, children, married, childrenPremium);

        double newAccumulatedSalary = employee.accumulatedSalary();
        System.out.println("Accumulated Salary after contract change: $" + newAccumulatedSalary);
    }
}
