package collections.map;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    @SneakyThrows
    private void run() {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("file.txt"))) {
            Map<String, Integer> map = new HashMap<>();
            String line;
            while ((line = reader.readLine()) != null) {
                map.merge(line, 1, Integer::sum);
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        PriorityQueue<String> queue = new PriorityQueue<>();
    }
}
