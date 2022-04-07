package ro.fasttrackit.lab7.Objects;

public class Bottle {
    private int totalCapacity;
    private int availableLiquid;
    private boolean open;

    Bottle(int totalCapacity, int availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public boolean getOpen() {
        return open;
    }

}
