package ro.fasttrackit.lab7.Objects;

public class Product {
    String name;
    double price;
    int quantity;
    String category;

    Product(String getName, double getPrice, int getQuantity, String getCategory) {
        this.name = getName;
        this.price = getPrice;
        this.quantity = getQuantity;
        this.category = getCategory;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        return quantity != 0;
    }

    boolean isCategory(String category) {
        return this.category.equals(category);
    }

}
