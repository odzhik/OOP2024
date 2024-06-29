package Lab7;

public class Worker {
    private String fullName;
    private double energy; // in kilojoules - KJ
    private double power; // in kilowatts - KW
    private double efficiency; // efficiency coefficient, from 0.1 to 0.4

    // Default constructor
    public Worker() {
    }

    // Parameterized constructor
    public Worker(String fullName, double energy, double power, double efficiency) {
        this.fullName = fullName;
        this.energy = energy;
        this.power = power;
        this.efficiency = efficiency;
    }

    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "fullName='" + fullName + '\'' +
                ", energy=" + energy +
                ", power=" + power +
                ", efficiency=" + efficiency +
                '}';
    }

    public double toWork(int time) {
        double totalWork = 0;

        for (int i = 0; i < time; i++) {
            if (energy <= 0) {
                break;
            }
            double workDone = (power * 1) * efficiency; // work done in 1 hour
            if (energy < workDone) {
                workDone = energy; // adjust work done if energy is insufficient
            }
            energy -= workDone;
            totalWork += workDone;
        }
        return totalWork;
    }
}
