package collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Set<Integer> set = new HashSet<>(List.of(1, 2, 3, 5, 6, 4, 7, 8, 10, 16, 32));
        set.add(0);
//        set.add(9);
        System.out.println(set);

        Set<Person> people = new HashSet<>();
        Person jack = new Person("Jack", 25);
        people.add(new Person("John", 24));
        people.add(jack);
        jack.setAge(99);
        people.add(new Person("John", 31));
        people.add(new Person("Jack", 44));

        System.out.println(people.contains(new Person("Jack", 99)));
    }
}
