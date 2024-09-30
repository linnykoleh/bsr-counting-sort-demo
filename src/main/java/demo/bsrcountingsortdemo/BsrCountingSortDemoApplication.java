package demo.bsrcountingsortdemo;

import java.util.Random;

public class BsrCountingSortDemoApplication {

    public static void main(String[] args) {

        var tree = new BalancedBinarySearch();
        var random = new Random();

        for (var i = 0; i < 100; i++) {
            var dataset = new int[1000];
            for (var j = 0; j < dataset.length; j++) {
                dataset[j] = random.nextInt(10000);
            }

            // Measure time to insert
            var startTime = System.nanoTime();
            for (var value : dataset) {
                tree.root = tree.insert(tree.root, value);
            }
            var endTime = System.nanoTime();
            System.out.println("Insertion time for dataset " + i + ": " + (endTime - startTime) + " ns");

            startTime = System.nanoTime();
            for (int value : dataset) {
                tree.root = tree.delete(tree.root, value);
            }
            endTime = System.nanoTime();
            System.out.println("Deletion time for dataset " + i + ": " + (endTime - startTime) + " ns");
        }
    }
}
