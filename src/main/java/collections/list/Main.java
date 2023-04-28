package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
//        List<String> list = new ArrayList<>(List.of("John", "Jack", "Kate", "Sara"));
//        for (String s : list) {
//            if (s.equals("Kate")) list.remove(s);
//        }
//
//        System.out.println(list);

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8, 10, 11, 12));
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 == 0) {
//                list.remove(i);
//            }
//        }
        list.removeIf(x -> x % 2 == 0);
        System.out.println(list);
    }
}
