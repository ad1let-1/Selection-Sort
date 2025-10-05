 Assignment 2 — Selection Sort (with Metrics & Early Termination)
 Overview

This project implements Selection Sort in Java with metrics tracking and early termination optimization.
The optimization stops the algorithm if the remaining portion of the array is already sorted, improving performance on nearly-sorted data.

The program also collects comparisons, swaps, and array accesses for analysis and benchmarking.

⚙️ Features

📊 Metrics Tracking: comparisons, swaps, array accesses

🧾 CSV Export: saves metrics for benchmarking and analysis

🧮 CLI Interface: configurable input sizes for testing

🧠 Early Termination Detection: skips unnecessary iterations if array is sorted

✅ Unit Tests: using JUnit 5 for correctness validation

💾 In-place Sorting: memory-efficient implementation

🚀 Usage

Run from terminal using Maven:

mvn compile exec:java -Dexec.mainClass="cli.BenchmarkRunner" -Dexec.args="1000"


Replace 1000 with your desired array size.

Example Output:

Array sorted successfully.
Comparisons: 499500
Swaps: 999
Array accesses: 2000000
Time: 2.314 ms
Metrics saved to metrics.csv

🧩 Optimization: Early Termination

Normally, selection sort always performs n²/2 comparisons even on nearly-sorted arrays.
This implementation detects sorted sequences and stops early:

if (minIndex == i) {
    boolean sorted = true;
    for (int k = i; k < n - 1; k++) {
        if (arr[k] > arr[k + 1]) {
            sorted = false;
            break;
        }
    }
    if (sorted) break;
}


This reduces unnecessary operations and improves performance for partially sorted data.

📊 Complexity Analysis
Case	Time Complexity	Space Complexity	Notes
Best (sorted input)	O(n)	O(1)	Early termination triggers
Average	O(n²)	O(1)	Standard selection sort behavior
Worst (reversed input)	O(n²)	O(1)	Fully reversed input
Stable	❌	—	Selection sort is not stable
🧪 Testing

Run unit tests:

mvn test


Covers:

Empty array

Single element

Randomized input

Already sorted array

Reverse-sorted array

Arrays with duplicates

🧾 CSV Metrics Example
size,comparisons,swaps,arrayAccesses,time(ms)
1000,499500,999,2000000,2.314

📦 Project Structure
Selection-Sort/
 ├── pom.xml
 ├── README.md
 ├── src/
 │   ├── main/java/algorithms/Selection_Sort.java
 │   ├── main/java/cli/BenchmarkRunner.java
 │   └── main/java/metrics/Metrics.java
 └── src/test/java/algorithms/Selection_SortTest.java
