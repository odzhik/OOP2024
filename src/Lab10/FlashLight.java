package Lab10;

// FlashLight.java
public class FlashLight {
    private Battery[] batteries;

    public FlashLight() {
        this.batteries = new Battery[0];
    }

    public FlashLight(Battery[] batteries) {
        this.batteries = batteries;
    }

    public Battery[] getBatteries() {
        return batteries;
    }

    public void setBatteries(Battery[] batteries) {
        this.batteries = batteries;
    }

    public double getTotalPower() {
        double totalPower = 0;
        for (Battery battery : batteries) {
            totalPower += battery.getPower();
        }
        return totalPower;
    }

    public double getTotalEnergy() {
        double totalEnergy = 0;
        for (Battery battery : batteries) {
            totalEnergy += battery instanceof ToshibaBattery ?
                    ((ToshibaBattery) battery).energy :
                    ((DuracellBattery) battery).energy;
        }
        return totalEnergy;
    }

    public double getTotalLifeTime() {
        double totalEnergy = getTotalEnergy();
        double totalPower = getTotalPower();
        if (totalPower != 0) {
            return totalEnergy / totalPower;
        } else {
            return 0;
        }
    }
}
