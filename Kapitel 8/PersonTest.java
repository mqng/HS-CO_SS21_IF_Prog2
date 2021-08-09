import java.util.*;
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[] { new Person("Ted", "Neward", 41), new Person("Charlotte", "Neward", 41),
                new Person("Michael", "Neward", 19), new Person("Matthew", "Neward", 13),
                new Person("Adam", "Pfeiffer", 43) };

                Arrays.sort(people,Comparator.comparing(Person::getFirstName));
                Arrays.sort(people,Comparator.comparing(p -> p.getFirstName()));
                Arrays.sort(people,(fn1,fn2) -> fn1.getFirstName().compareTo(fn2.getFirstName()));
    }

}

class Person {
    private final String firstName;
    private String lastName;
    private final int age;

    public Person(String f, String l, int a) {
        firstName = f;
        lastName = l;
        age = a;
    }


    public String getFirstName() {
        return firstName;
    }

    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }
}
