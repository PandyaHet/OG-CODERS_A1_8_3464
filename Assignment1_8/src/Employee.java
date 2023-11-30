import java.util.Calendar;

public class Employee {
    private String name;
    private int birthYear;
    private double monthlyIncome;
    private double occupationRate;

    public Employee(String name, int birthYear, double monthlyIncome, double occupationRate) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlyIncome = monthlyIncome;
        setOccupationRate(occupationRate);
        System.out.println("We have a new employee: " + this);
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

    public double getMonthlyIncome() {
        return monthlyIncome;
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

    @Override
    public String toString() {
        return "Employee[name=" + name + ", age=" + getAge() + ", monthlyIncome=" + monthlyIncome +
                ", occupationRate=" + occupationRate + "%]";
    }
}
