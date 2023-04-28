package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        List<String> list = new ArrayList<>(List.of("John", "Jack", "Kate"));
        list.add("Sara");

        String[] array = list.toArray(new String[0]);

//        String[] array = new String[0];
//        array = list.toArray(array);
//
//        for (String s : array) {
//            System.out.print(s + " ");
//            if (s != null) System.out.println(s.length());
//            else System.out.println();
//        }

        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 4, 5, 6, 3, 4, 7));
        System.out.println(ints);
        List<Integer> list1 = ints.subList(3, 5);
        list1.add(17);
        list1.set(1, -5);
        System.out.println(list1);
        System.out.println(ints);

        List<Integer> nList = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 0, 7, 8, 9, 10));
        Collections.shuffle(nList, new Random(1));
        System.out.println(nList);

        nList.sort(Comparator.reverseOrder());
        System.out.println(nList);
        int k = Collections.binarySearch(nList, 6, Comparator.reverseOrder());
        System.out.println("k = " + k);
        k = Collections.binarySearch(nList, 3, Comparator.reverseOrder());
        System.out.println("k = " + k);
    }

    public void printList(List<?> list) {
        for (Object x : list) {
            System.out.println(x);
        }
    }

}
