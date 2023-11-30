import java.util.ArrayList;
import java.util.List;
public class Management {
    static double workingDaysPerMonth = 20.0;

    List<Employee> employees = new ArrayList<>();


    // constructor for Motorcycle
    // make, plate, color, category, sidecar
    Motorcycle m1 = new Motorcycle("Kawasaki", "Custom Plate", "Yellow", VehicleCategory.RACE, false);
    Motorcycle m2 = new Motorcycle("Honda", "Custom Plate", "Black", VehicleCategory.NOT_FOR_RACE, true);

    // constructor for Car
    // make, plate, color, category, gear, type
    Car vt1 = new Car("Lamborghini", "Custom Plate", "White", VehicleCategory.FAMILY, GearType.MANUAL, CarType.SPORT);
    Car vt2 = new Car("BMW", "Custom Plate", "Black", VehicleCategory.FAMILY, GearType.AUTOMATIC, CarType.SEDAN);
    Car vt3 = new Car("Renault Clio", "Custom Plate", "Blue", VehicleCategory.FAMILY, GearType.MANUAL, CarType.HATCHBACK);
    Car vt4 = new Car("Mazda", "Custom Plate", "White", VehicleCategory.FAMILY, GearType.AUTOMATIC, CarType.SUV);

    //    Employee constructors
    // Manager: name, birthYear, nbClients, nbTravelDays, rate
    // Programmer: name, birthYear, nbProjects, rate
    // Tester: name, birthYear, nbBugs, rate
    void hireTest1() {
        employees.add(new Manager("Serge", 1985, 30, 4));
        employees.add(new Manager("Cindy", 1974, 20, 6, 80));
        employees.add(new Programmer("Paul", 1993, 3, 75));
        employees.add(new Tester("Pierre", 1987, 124, 50));
        employees.add(new Programmer("Matt", 1981, 5, 110));
        employees.add(new Programmer("Sarah", 1986, 3));
    }

    //    Employee constructors
    // Manager: name, birthYear, nbClients, nbTravelDays, rate, employeeVehicle
    // Programmer: name, birthYear, nbProjects, rate, employeeVehicle
    // Tester: name, birthYear, nbBugs, rate, employeeVehicle
    void hireTest2() {
        employees.clear();
        employees.add(new Manager("Serge", 1985, 30, 4, vt1));
        employees.add(new Manager("Cindy", 1974, 20, 6, 80, vt2));
        employees.add(new Programmer("Paul", 1993, 3, 75, m1));
        employees.add(new Tester("Pierre", 1987, 124, 50, m2));
        employees.add(new Programmer("Matt", 1981, 5, 110, vt4));
        employees.add(new Programmer("Sarah", 1986, 3, vt3));
        for (Employee employee : employees) {
            System.out.println("-------------------------");
            System.out.println(employee);
            System.out.println("-------------------------");
        }
    }

}
