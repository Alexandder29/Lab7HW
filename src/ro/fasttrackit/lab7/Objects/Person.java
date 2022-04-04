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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public  boolean isMarried() {
        return married;
    }

    public boolean notMarried() {
        return !married;
    }
}