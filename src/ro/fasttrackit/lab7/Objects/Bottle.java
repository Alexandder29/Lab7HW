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

    public boolean getClose() {
        return !open;
    }

    public void open() {
        if (!getOpen()) {
            this.open = true;
            System.out.println("You opened the bottle.");
        } else {
            System.out.println("Bottle already opened.");
        }
    }

    public void close() {
        if (getClose()) {
            System.out.println("Bottle already closed.");
        } else {
            this.open = false;
            System.out.println("You closed the bottle.");
        }
    }

    public String toDrink(int howMuch) {
        if (getClose()) {
            return "First you need to open the bottle";
        }

        if (availableLiquid < howMuch) {
            return "There's not enough liquid.";
        }
        availableLiquid = availableLiquid - howMuch;
        return "You've dranked " + howMuch + " liquid. There's " + availableLiquid + " left.";
    }
}
