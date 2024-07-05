package Lab7;

public class Teacher extends Worker {
    private double tiredness;

    public Teacher(String fullName, double energy, double power, double efficiency, double tiredness) {
        super(fullName, energy, power, efficiency);
        this.tiredness = tiredness;
    }

    public double getTiredness() {
        return tiredness;
    }

    public void setTiredness(double tiredness) {
        this.tiredness = tiredness;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fullName='" + getFullName() + '\'' +
                ", energy=" + getEnergy() +
                ", power=" + getPower() +
                ", efficiency=" + getEfficiency() +
                ", tiredness=" + tiredness +
                '}';
    }

    @Override
    public double toWork(int time) {
        double totalWork = 0;
        double currentEfficiency = getEfficiency();

        for (int i = 0; i < time; i++) {
            if (getEnergy() <= 0) {
                break;
            }
            double workDone = (getPower() * 1) * currentEfficiency; //
            if (getEnergy() < workDone) {
                workDone = getEnergy(); //
            }
            setEnergy(getEnergy() - workDone);
            totalWork += workDone;
            currentEfficiency -= tiredness; //
            if (currentEfficiency < 0) {
                currentEfficiency = 0; //
            }
        }
        return totalWork;
    }
}
