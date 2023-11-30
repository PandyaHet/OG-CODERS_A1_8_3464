public class Tester extends Employee{
    private int bugsSolved;

    public Tester(String name, int birthYear, double monthlyIncome, double occupationRate, int bugsSolved) {
        super(name, birthYear, monthlyIncome, occupationRate);
        this.bugsSolved = bugsSolved;
    }

    public int getBugsSolved() {
        return bugsSolved;
    }

    @Override
    public String toString() {
        return super.toString() + ", bugsSolved=" + bugsSolved;
    }
}
