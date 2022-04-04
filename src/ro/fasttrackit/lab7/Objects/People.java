package ro.fasttrackit.lab7.Objects;

public class People {
    public static void main(String[] args) {
        Person alex = new Person("Balaj Alexandru", 29, false);
        Person alin = new Person("Dragos Alin", 28, true);
        Person andrei = new Person("Pop Andrei", 32, false);

        printName(alex);
        printName(alin);
        printName(andrei);
    }

    public static void printName(Person names) {
        if (names.isMarried()) {
            System.out.println(names.getName() + " of " + names.getAge() + " years old is married. " + names.isMarried());
        } else {
            System.out.println(names.getName() + " of " + names.getAge() + " years old is married. " + names.isMarried());
        }
    }
}