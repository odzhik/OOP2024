package Lab7;

public class Programmer extends Worker {
    private double moralMotivation; // from 0.5 to 2

    // Default constructor
    public Programmer() {
    }

    // Parameterized constructor
    public Programmer(String fullName, double energy, double power, double efficiency, double moralMotivation) {
        super(fullName, energy, power, efficiency);
        this.moralMotivation = moralMotivation;
    }

    // Getters and Setters
    public double getMoralMotivation() {
        return moralMotivation;
    }

    public void setMoralMotivation(double moralMotivation) {
        this.moralMotivation = moralMotivation;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "fullName='" + getFullName() + '\'' +
                ", energy=" + getEnergy() +
                ", power=" + getPower() +
                ", efficiency=" + getEfficiency() +
                ", moralMotivation=" + moralMotivation +
                '}';
    }

    @Override
    public double toWork(int time) {
        double totalWork = 0;

        for (int i = 0; i < time; i++) {
            if (getEnergy() <= 0) {
                break;
            }
            double workDone = (getPower() * 1) * getEfficiency() * moralMotivation; // work done in 1 hour
            if (getEnergy() < workDone) {
                workDone = getEnergy(); // adjust work done if energy is insufficient
            }
            setEnergy(getEnergy() - workDone);
            totalWork += workDone;
        }
        return totalWork;
    }
}
