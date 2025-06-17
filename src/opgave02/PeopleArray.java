package opgave02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PeopleArray {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public void printPeople() {
        System.out.println(people);
    }

    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public Person findFirst(Predicate<Person> filter) {
        for (Person person : people) {
            if (filter.test(person)) {
                return person;
            }
        }
        return null;
    }

    public List<Person> findAll (Predicate<Person> filter){
        List<Person> resultatListe = new ArrayList<>();
        for (Person person : people) {
            if (filter.test(person)){
                // tilføj person til liste
                resultatListe.add(person);
            }
        }

        return resultatListe;
    }
}


