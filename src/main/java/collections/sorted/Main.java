package collections.sorted;

import collections.set.Person;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Set<Person> people = new TreeSet<>(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));
        people.add(new Person("John", 22));
        people.add(new Person("John", 20));
        people.add(new Person("Jack", 20));
        people.add(new Person("Mary", 19));
        people.add(new Person("Kate", 20));

        people.forEach(System.out::println);
//        int a = 1_500_000_000;
//        int b = -1_000_000_000;
//        System.out.println(a - b);
    }
}
