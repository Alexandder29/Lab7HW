package ro.fasttrackit.lab7.Objects;

public class Food {
    public static void main(String[] args) {
        Product one = new Product("Heets", 16.90, 8, "Tigari");
        Product two = new Product("Coca-Cola 0,5ml", 3.40, 30, "Bauturi");
        Product three = new Product("Pizza", 21.50, 0, "Fast food");
        Product four = new Product("Jack Daniels", 80.70, 2, "Bauturi");

        printFoods(one);
        printFoods(two);
        printFoods(three);
        printFoods(four);
    }

    public static void printFoods(Product food) {
        if (food.isCategory("Tigari")) {
            System.out.println("==== Tutungerie ====");
        } else if (food.isCategory("Bauturi")) {
            System.out.println("==== Bauturi alcoolice si non-alcoolice ====");
        } else {
            System.out.println("Momentan nu exista produse din aceasta categorie! " + "====" + food.getCategory() + "==== ");
        }

        if (food.hasStock()) {
            System.out.println(food.getName() + " disponibil. Costa " + food.getPrice() + " lei. Cantitate disponibila: " + food.getQuantity());
        } else {
            System.out.println(food.getName() + ". Cantitate disponibila: " + food.getQuantity());
        }
    }
}