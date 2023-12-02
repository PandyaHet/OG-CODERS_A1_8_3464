import java.util.ArrayList;
import java.util.List;
public class Management {
    static double workingDaysPerMonth = 20.0;

    public enum ContractType {
        PERMANENT,
        TEMPORARY
    }

    List<Employee> employees = new ArrayList<>();


    Motorcycle m1 = new Motorcycle("Kawasaki", "Custom Plate", "Yellow", VehicleCategory.RACE, false);
    Motorcycle m2 = new Motorcycle("Honda", "Custom Plate", "Black", VehicleCategory.NOT_FOR_RACE, true);

    Car vt1 = new Car("Lamborghini", "Custom Plate", "White", VehicleCategory.FAMILY, GearType.MANUAL, CarType.SPORT);
    Car vt2 = new Car("BMW", "Custom Plate", "Black", VehicleCategory.FAMILY, GearType.AUTOMATIC, CarType.SEDAN);
    Car vt3 = new Car("Renault Clio", "Custom Plate", "Blue", VehicleCategory.FAMILY, GearType.MANUAL, CarType.HATCHBACK);
    Car vt4 = new Car("Mazda", "Custom Plate", "White", VehicleCategory.FAMILY, GearType.AUTOMATIC, CarType.SUV);


    void hireTest1() {
        employees.add(new Manager("Serge", 1985, 30, 4));
        employees.add(new Manager("Cindy", 1974, 20, 6, 80));
        employees.add(new Programmer("Paul", 1993, 3, 75));
        employees.add(new Tester("Pierre", 1987, 124, 50));
        employees.add(new Programmer("Matt", 1981, 5, 110));
        employees.add(new Programmer("Sarah", 1986, 3));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    void hireTest2() {
        if (!employees.isEmpty()) {

            Employee employee = employees.get(0);
            double accumulatedSalaryBeforeChange = employee.accumulatedSalary();

            int daysWorked = 15;
            double monthlySalary = 5000;
            int children = 1;
            boolean married = true;
            double childrenPremium = 450;
            double hourlyWage = 30; // Example hourly wage for temporary contract
            double hoursWorked = 100; // Example hours worked for temporary contract

            double newAccumulatedSalary = employee.calculateAccumulatedSalaryWhenChangingContract(
                    Employee.ContractType.PERMANENT, daysWorked, monthlySalary, children, married,
                    childrenPremium, hourlyWage, hoursWorked);

            System.out.println("Accumulated Salary Before Contract Change: $" + accumulatedSalaryBeforeChange);
            System.out.println("Accumulated Salary After Contract Change: $" + newAccumulatedSalary);
        }
        else{
            System.out.println("No employees hired yet."); // Handle the case where the list is empty

        }
    }
    }