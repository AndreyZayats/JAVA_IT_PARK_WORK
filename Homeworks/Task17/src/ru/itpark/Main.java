package ru.itpark;
import static ru.itpark.Human.sortByAge;

public class Main {

    public static void main(String[] args) {
        Human andrey = new Human(24, "Andrey");
        Human guzeliya = new Human(25, "Guzeliya");
        Human testHuman = new Human(23, "testHuman");
        Human timur = new Human(21, "timur");
        Human albert = new Human(22, "albert");
        Human[] humans = new Human[] {andrey, guzeliya, testHuman, timur, albert};
        sortByAge(humans);

        for(int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].toString());
        }
    }
}
