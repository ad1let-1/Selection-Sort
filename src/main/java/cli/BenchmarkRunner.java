package cli;

import algorithms.Selection_Sort;
import metrics.Metrics;

import java.util.Random;
import java.util.Scanner;

public class BenchmarkRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100000);
        }

        Metrics metrics = new Metrics();
        Selection_Sort sorter = new Selection_Sort(metrics);

        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();

        System.out.println("Sorting completed.");
        System.out.println("Time elapsed (ms): " + (endTime - startTime) / 1_000_000.0);

        metrics.printMetrics();
    }
}





