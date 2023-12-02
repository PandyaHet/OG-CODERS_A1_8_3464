<<<<<<< HEAD
public class Manager extends Employee{
    private int traveledDays;
    private int newClients;

    private Vehicle vehicle;


    public Manager(String name, int birthYear, int newClients,int traveledDays, double occupationRate) {
        super(name, birthYear, occupationRate,EmployeeType.Manager);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
    }
    public Manager(String name, int birthYear, int newClients,int traveledDays, double occupationRate,Vehicle vehicle) {
        super(name, birthYear, occupationRate,EmployeeType.Manager);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
        this.vehicle = vehicle;
    }

    public Manager(String name, int birthYear, int newClients,int traveledDays) {
        super(name, birthYear, 0,EmployeeType.Manager);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
    }

    public Manager(String name, int birthYear, int newClients,int traveledDays,Vehicle vehicle) {
        super(name, birthYear, 0,EmployeeType.Manager);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
        this.vehicle = vehicle;
    }
    public int getTraveledDays() {
        return traveledDays;
    }

    public int getNewClients() {
        return newClients;
    }

    @Override
    public String toString() {
        return super.toString() + "\n - TraveledDays :" + traveledDays + "\n - NewClients :" + newClients + vehicle.toString();
    }
}
=======
public class Manager extends Employee{
    private int traveledDays;
    private int newClients;

    private Vehicle vehicle;


    public Manager(String name, int birthYear, int newClients,int traveledDays, double occupationRate) {
        super(name, birthYear, occupationRate,EmployeeType.Manager);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
    }
    public Manager(String name, int birthYear, int newClients,int traveledDays, double occupationRate,Vehicle vehicle) {
        super(name, birthYear, occupationRate,EmployeeType.Manager);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
        this.vehicle = vehicle;
    }

    public Manager(String name, int birthYear, int newClients,int traveledDays) {
        super(name, birthYear, 0,EmployeeType.Manager);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
    }

    public Manager(String name, int birthYear, int newClients,int traveledDays,Vehicle vehicle) {
        super(name, birthYear, 0,EmployeeType.Manager);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
        this.vehicle = vehicle;
    }
    public int getTraveledDays() {
        return traveledDays;
    }

    public int getNewClients() {
        return newClients;
    }

    @Override
    public String toString() {
        return super.toString() + "\n - TraveledDays :" + traveledDays + "\n - NewClients :" + newClients + vehicle.toString();
    }
}
>>>>>>> 7f711047cb8cc5bcd34fba9b9da1f5ab28053413
