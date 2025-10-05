package algorithms;

import metrics.Metrics;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Selection_SortTest {

    @Test
    public void testEmptyArray() {
        Metrics metrics = new Metrics();
        Selection_Sort sorter = new Selection_Sort(metrics);
        int[] arr = {};
        sorter.sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testSingleElement() {
        Metrics metrics = new Metrics();
        Selection_Sort sorter = new Selection_Sort(metrics);
        int[] arr = {42};
        sorter.sort(arr);
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    public void testSortedArray() {
        Metrics metrics = new Metrics();
        Selection_Sort sorter = new Selection_Sort(metrics);
        int[] arr = {1, 2, 3, 4, 5};
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testReverseArray() {
        Metrics metrics = new Metrics();
        Selection_Sort sorter = new Selection_Sort(metrics);
        int[] arr = {5, 4, 3, 2, 1};
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testDuplicates() {
        Metrics metrics = new Metrics();
        Selection_Sort sorter = new Selection_Sort(metrics);
        int[] arr = {4, 2, 4, 1, 2};
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 2, 4, 4}, arr);
    }
}







