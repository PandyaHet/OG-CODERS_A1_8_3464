public class Manager extends Employee{
    private int traveledDays;
    private int newClients;

    public Manager(String name, int birthYear, double monthlyIncome, double occupationRate,
                   int traveledDays, int newClients) {
        super(name, birthYear, monthlyIncome, occupationRate);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
    }

    public int getTraveledDays() {
        return traveledDays;
    }

    public int getNewClients() {
        return newClients;
    }

    @Override
    public String toString() {
        return super.toString() + ", traveledDays=" + traveledDays + ", newClients=" + newClients;
    }
}
