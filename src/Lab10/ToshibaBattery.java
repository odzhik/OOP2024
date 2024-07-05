package Lab10;

public class ToshibaBattery extends Battery {
    public double voltage;
    public double currency;
    public double energy;
    public double extraEnergy;

    public ToshibaBattery(double voltage, double currency, double energy, double extraEnergy) {
        this.voltage = voltage;
        this.currency = currency;
        this.energy = energy;
        this.extraEnergy = extraEnergy;
    }

    @Override
    public double getPower() {
        return voltage * currency;
    }

    @Override
    public double getLifeTime() {
        double power = getPower();
        return (energy + extraEnergy) / power;
    }
}



