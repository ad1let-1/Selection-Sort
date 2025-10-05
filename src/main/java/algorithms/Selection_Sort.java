package algorithms;

import metrics.Metrics;

public class Selection_Sort {

    private final Metrics metrics;

    public Selection_Sort(Metrics metrics) {
        this.metrics = metrics;
    }

    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                metrics.incrementComparisons();
                metrics.incrementArrayAccesses(2);
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                swap(arr, i, minIndex);
                metrics.incrementSwaps();
                metrics.incrementArrayAccesses(4);
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

