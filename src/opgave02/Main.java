package opgave02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        PeopleArray peopleArray = new PeopleArray();
        addPeople(peopleArray);
        System.out.println();


        peopleArray.findFirst(person -> {
            if (person.getAge() == 44) {
                System.out.println(person);
                return true;
            }
            return false;
        });

        peopleArray.findFirst(person -> {
            if (person.getName().charAt(0) == 'S') {
                System.out.println(person);
                return true;
            }
            return false;
        });

        peopleArray.findFirst(person -> {
            int antalIer = 0;
            String navn = person.getName();

            for (int i = 0; i < navn.length(); i++) {
                if (navn.charAt(i) == 'i') {
                    antalIer++;

                    if (antalIer == 2) {
                        System.out.println(person);
                        return true;
                    }
                }
            }
            return false;
        });


        peopleArray.findFirst(person -> {
            String navn = person.getName();
            int alder = person.getAge() -1 ;
            for (int i = 0; i < navn.length() ; i++) {

                if (i == alder){
                    System.out.println(person);
                    return true;
                }
            }

            return false;
        });




        // ------------ ny del af opgaven, her skal vi finde ALLE personer som opfylder vores lambda-funktion, og en ny metode der returner en liste, fremfor en person er oprettet i Person-klassen


        List<Person> peopleWithanI = peopleArray.findAll(person -> {
            String navn = person.getName();
            for (int i = 0; i < navn.length(); i++) {
                if (navn.charAt(i) == 'i') {

                    return true;
                }
            }

            return false;

        });
        System.out.println(peopleWithanI);


        List<Person> peopleWithAnS = peopleArray.findAll(person -> {

            if(person.getName().charAt(0) == 'S'){
                return true;
            }

            return false;
        });
        System.out.println(peopleWithAnS);


    }

    private static void addPeople(PeopleArray peopleArray) {
        peopleArray.addPerson(new Person("Bent", 25));
        peopleArray.addPerson(new Person("Susan", 34));
        peopleArray.addPerson(new Person("Mikael", 60));
        peopleArray.addPerson(new Person("Klaus", 44));
        peopleArray.addPerson(new Person("Birgitte", 17));
        peopleArray.addPerson(new Person("Liselotte", 9));
    }
}
