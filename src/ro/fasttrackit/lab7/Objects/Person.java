package ro.fasttrackit.lab7.Objects;

public class Person {
    private String name;
    private int age;
    private boolean married;

    Person(String getName, int getAge, boolean isMarried) {
        name = getName;
        age = getAge;
        married = isMarried;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    boolean isMarried() {
        return married;
    }

    boolean notMarried() {
        return !married;
    }
}
