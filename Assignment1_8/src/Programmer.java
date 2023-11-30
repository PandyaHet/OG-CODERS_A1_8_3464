public class Programmer extends Employee{
    private int projectsCompleted;

    public Programmer(String name, int birthYear, double monthlyIncome, double occupationRate, int projectsCompleted) {
        super(name, birthYear, monthlyIncome, occupationRate);
        this.projectsCompleted = projectsCompleted;
    }

    public int getProjectsCompleted() {
        return projectsCompleted;
    }

    @Override
    public String toString() {
        return super.toString() + ", projectsCompleted=" + projectsCompleted;
    }
}
