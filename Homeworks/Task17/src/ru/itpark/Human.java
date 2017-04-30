package ru.itpark;

public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static Human[] sortByAge(Human[] human) {
        for(int i = 0; i < human.length; i++) {
            for(int j = human.length - 1; j > i; j --) {
                if(human[j].getAge() < human[j-1].getAge()) {
                    Human temp = human[j];
                    human[j] = human[j-1];
                    human[j-1] = temp;
                }
            }
        }
        return human;
    }
}
