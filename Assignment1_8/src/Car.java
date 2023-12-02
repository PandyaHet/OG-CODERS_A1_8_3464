<<<<<<< HEAD
public class Car extends Vehicle{
    private GearType gear;
    private CarType type;

    public Car(String make, String plate, String color, VehicleCategory category, GearType gear, CarType type) {
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee has a Car \n  - Gear :" + gear + "\n - Type :" + type + "\n " + super.toString();
    }
}
=======
public class Car extends Vehicle{
    private GearType gear;
    private CarType type;

    public Car(String make, String plate, String color, VehicleCategory category, GearType gear, CarType type) {
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee has a Car \n  - Gear :" + gear + "\n - Type :" + type + "\n " + super.toString();
    }
}
>>>>>>> 7f711047cb8cc5bcd34fba9b9da1f5ab28053413
