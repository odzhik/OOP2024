package Lab8;

public class Tourist {
    private String name;
    private double incomeMoney;

    public Tourist(String name, double incomeMoney) {
        this.name = name;
        this.incomeMoney = incomeMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(double incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    @Override
    public String toString() {
        return name + " " + incomeMoney;
    }
}


