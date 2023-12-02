import java.util.Calendar;
import java.util.Enumeration;

public class Employee {
    private String name;
    private int birthYear;
    private double monthlyIncome;
    private double occupationRate;

    private EmployeeType employee;


    public enum ContractType {
        PERMANENT,
        TEMPORARY
    }

    private ContractType contractType;

    // Getter and setter for contractType
    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }


    private static final double GAIN_FACTOR_CLIENT = 500;
    private static final double GAIN_FACTOR_TRAVEL = 100;
    private static final double GAIN_FACTOR_ERROR = 10;
    private static final double GAIN_FACTOR_PROJECTS = 200;

//    private ContractType contractType;

    // Additional attributes for permanent employees
    private int daysWorkedInMonth;
    private double fixedMonthlySalary;
    private int numberOfChildren;
    private boolean isMarried;
    private double childrenPremium;

    // Additional attributes for temporary employees
    private double hourlyWages;
    private double hoursWorkedInMonth;
    public Employee(String name, int birthYear, double monthlyIncome, double occupationRate) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlyIncome = monthlyIncome;
        setOccupationRate(occupationRate);
        System.out.println("We have a new employee: " + this);
    }

    public Employee(String name, int birthYear, double occupationRate) {
        this.name = name;
        this.birthYear = birthYear;
        setOccupationRate(occupationRate);
        System.out.println("We have a new employee: " + this);
    }
    public Employee(String name, int birthYear, double occupationRate,EmployeeType employee) {
        this.name = name;
        this.birthYear = birthYear;
        setOccupationRate(occupationRate);
        this.employee = employee;
        System.out.println("We have a new employee: " + name +" a,"+employee);
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
    }

    public double getAnnualIncome() {
        if (this instanceof Manager) {
            Manager manager = (Manager) this;
            return   (manager.getNewClients() * GAIN_FACTOR_CLIENT) +
                    (manager.getTraveledDays() * GAIN_FACTOR_TRAVEL);
        } else if (this instanceof Tester) {
            Tester tester = (Tester) this;
            return (tester.getBugsSolved() * GAIN_FACTOR_ERROR);
        } else if (this instanceof Programmer) {
            Programmer programmer = (Programmer) this;
            return (programmer.getProjectsCompleted() * GAIN_FACTOR_PROJECTS);
        } else {
            return 0;
        }
    }

    public double getOccupationRate() {
        return occupationRate;
    }

    public void setOccupationRate(double occupationRate) {
        if (occupationRate < 10) {
            this.occupationRate = 10;
        } else if (occupationRate > 100) {
            this.occupationRate = 100;
        } else {
            this.occupationRate = occupationRate;
        }
    }

    public double calculatePermanentSalary() {
        double childrenBonus = numberOfChildren > 0 ? childrenPremium * numberOfChildren : 0;
        return fixedMonthlySalary + (isMarried ? childrenBonus : 0);
    }

    public double calculateTemporarySalary() {
        return hourlyWages * hoursWorkedInMonth;
    }

    public double accumulatedSalary() {
        if (contractType == ContractType.PERMANENT) {
            return daysWorkedInMonth * calculatePermanentSalary() / Management.workingDaysPerMonth;
        } else {
            return calculateTemporarySalary();
        }
    }

    // Methods to change contract types
    public void convertToPermanent(int daysWorked, double monthlySalary, int children, boolean married, double childrenPremium) {
        this.contractType = ContractType.PERMANENT;
        this.daysWorkedInMonth = daysWorked;
        this.fixedMonthlySalary = monthlySalary;
        this.numberOfChildren = children;
        this.isMarried = married;
        this.childrenPremium = childrenPremium;
        this.hourlyWages = 0; // Reset temporary employee attributes
        this.hoursWorkedInMonth = 0;
    }

    public void convertToTemporary(double hourlyWage, double hoursWorked) {
        this.contractType = ContractType.TEMPORARY;
        this.hourlyWages = hourlyWage;
        this.hoursWorkedInMonth = hoursWorked;
        // Reset permanent employee attributes
        this.daysWorkedInMonth = 0;
        this.fixedMonthlySalary = 0;
        this.numberOfChildren = 0;
        this.isMarried = false;
        this.childrenPremium = 0;
    }

    public double calculateAccumulatedSalaryWhenChangingContract(ContractType newContractType, int daysWorked,
                                                                 double monthlySalary, int children, boolean married,
                                                                 double childrenPremium, double hourlyWage,
                                                                 double hoursWorked) {
        double accumulatedSalary = 0;
        if (newContractType == ContractType.PERMANENT) {
            // Calculate accumulated salary for permanent contract
            double childrenBonus = children > 0 ? childrenPremium * children : 0;
            double permanentSalary = monthlySalary + (married ? childrenBonus : 0);
            accumulatedSalary = daysWorked * permanentSalary / Management.workingDaysPerMonth;
        } else if (newContractType == ContractType.TEMPORARY) {
            // Calculate accumulated salary for temporary contract
            accumulatedSalary = hourlyWage * hoursWorked;
        }
        return accumulatedSalary;
    }

    @Override
    public String toString() {
        return "Employee name :" + name + "\n - Age :" + getAge() + "\n - AnnualIncome :" + getAnnualIncome() +
                "\n - OccupationRate :" + occupationRate + "%";
    }
}
