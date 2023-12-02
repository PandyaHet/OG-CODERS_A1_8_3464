<<<<<<< HEAD
public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String plate, String color, VehicleCategory category, boolean hasSidecar) {
        super(make, plate, color, category);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Employee has a Motorcycle \n - hasSidecar :" + hasSidecar + "\n " + super.toString();
    }
}
=======
public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String plate, String color, VehicleCategory category, boolean hasSidecar) {
        super(make, plate, color, category);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Employee has a Motorcycle \n - hasSidecar :" + hasSidecar + "\n " + super.toString();
    }
}
>>>>>>> 7f711047cb8cc5bcd34fba9b9da1f5ab28053413
