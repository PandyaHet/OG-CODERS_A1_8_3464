<<<<<<< HEAD
public class Tester extends Employee{
    private int bugsSolved;
    private  Vehicle vehicle;

    public Tester(String name, int birthYear, double occupationRate, int bugsSolved) {
        super(name, birthYear, occupationRate,EmployeeType.Tester);
        this.bugsSolved = bugsSolved;
    }

    public Tester(String name, int birthYear, double occupationRate, int bugsSolved, Vehicle vehicle) {
        super(name, birthYear, occupationRate,EmployeeType.Tester);
        this.bugsSolved = bugsSolved;
        this.vehicle = vehicle;
    }

    public int getBugsSolved() {
        return bugsSolved;
    }

    @Override
    public String toString() {
        return super.toString() + ", bugsSolved :" + bugsSolved +"\n"+ vehicle.toString();
    }
}
=======
public class Tester extends Employee{
    private int bugsSolved;
    private  Vehicle vehicle;

    public Tester(String name, int birthYear, double occupationRate, int bugsSolved) {
        super(name, birthYear, occupationRate,EmployeeType.Tester);
        this.bugsSolved = bugsSolved;
    }

    public Tester(String name, int birthYear, double occupationRate, int bugsSolved, Vehicle vehicle) {
        super(name, birthYear, occupationRate,EmployeeType.Tester);
        this.bugsSolved = bugsSolved;
        this.vehicle = vehicle;
    }

    public int getBugsSolved() {
        return bugsSolved;
    }

    @Override
    public String toString() {
        return super.toString() + ", bugsSolved :" + bugsSolved +"\n"+ vehicle.toString();
    }
}
>>>>>>> 7f711047cb8cc5bcd34fba9b9da1f5ab28053413
