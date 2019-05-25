package ru.job4j.tracker;

/**
 Необходимо создать модель User с полями name, age.

 Класс User должен реализовать интерфейс Comparable.
 */

public class User implements Comparable<User> {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        return Integer.compare(this.age, o.age);
    }
}
