package ro.fasttrackit.lab7.Objects;

public class ApplicationBottle {
    public static void main(String[] args) {
        Bottle first = new Bottle(1000, 750, true);
        Bottle second = new Bottle(500, 0, false);
        Bottle third = new Bottle(750, 250, false);

        System.out.println("First bottle has " + first.getTotalCapacity() + " ml and there's " + first.getAvailableLiquid() + " ml liquid left.");
        System.out.println(first.toDrink(300));

        System.out.println("Second bottle has " + second.getTotalCapacity() + " ml and there's " + second.getAvailableLiquid() + " ml liquid left.");
        System.out.println(second.toDrink(100));
        second.open();
        System.out.println(second.toDrink(150));
        second.close();

        System.out.println("Third bottle has " + third.getTotalCapacity() + " ml and there's " + third.getAvailableLiquid() + " ml liquid left.");
        third.open();
        System.out.println(third.toDrink(50));
        third.close();
    }
}
