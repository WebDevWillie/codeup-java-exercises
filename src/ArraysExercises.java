import java.util.Arrays;

import java.util.Arrays;
public class ArraysExercises {


    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[newPeople.length - 1] = person;
        people = newPeople;
        return people;
    }

    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Bob");
        people[1] = new Person("Joe");
        people[2] = new Person("Sally");

        for (Person person : people) {
            System.out.println(person.getName());
        }

        people = addPerson(people, new Person("Will"));


        System.out.println(Arrays.toString(people));

    }

}
