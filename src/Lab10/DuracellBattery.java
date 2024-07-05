package Lab10;

public class DuracellBattery extends Battery {
    public double voltage;
    public double currency;
    public double energy;
    public double internalVoltage;

    public DuracellBattery(double voltage, double currency, double energy, double internalVoltage) {
        this.voltage = voltage;
        this.currency = currency;
        this.energy = energy;
        this.internalVoltage = internalVoltage;
    }

    @Override
    public double getPower() {
        return voltage * currency;
    }

    @Override
    public double getLifeTime() {
        double power = getPower();
        return energy / power;
    }
}