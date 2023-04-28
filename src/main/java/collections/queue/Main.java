package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(13);
        queue.add(23);
        queue.add(4);
        queue.add(4);
        queue.add(14);
        queue.add(20);

        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
