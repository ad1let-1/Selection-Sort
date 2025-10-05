# Assignment 2 – Selection Sort Algorithm  
Student B: Mustafa Nuradilet  
Group: SE-2438
Pair 1 – Basic Quadratic Sorts  
Partner Algorithm: Insertion Sort 

---

## 📘 Overview
This project implements the Selection Sort algorithm with an early-termination optimization.  
Selection Sort repeatedly finds the minimum element from the unsorted part of the array and places it at the beginning.

---

## ⚙️ Features
- Early termination if the array is already sorted  
- Metrics tracking (comparisons and swaps)  
- Benchmark runner that exports results to CSV  
- Unit tests for correctness and edge cases

---

## 🧮 Algorithm Description
Core idea:  
For each index *i* from 0 to n – 1:  
1. Find the smallest element in the unsorted part.  
2. Swap it with the element at position *i*.  
3. Stop early if no swaps are needed.

Complexity analysis
| Case | Time Complexity | Space Complexity |
|:----|:----------------|:----------------|
| Best | O(n²) | O(1) |
| Average | O(n²) | O(1) |
| Worst | O(n²) | O(1) |

Selection Sort is in-place and requires no extra memory.

---

## 🧾 Empirical Results
| n | time (ms) | comparisons | swaps |
|--:|--:|--:|--:|
| 100 | 0.665 | 4950 | 94 |
| 1 000 | 14.346 | 499 500 | 993 |
| 10 000 | 144.689 | 49 995 000 | 9 986 |
| 100 000 | 4 331.443 | 4 999 950 000 | 99 973 |

---


## 📊 Performance Plot
![Selection Sort Performance]
![photo_5411532577212331364_y (1)](https://github.com/user-attachments/assets/8add6e4f-52a1-4582-86ab-f21e7eecb75c)


---

## 🧠 Partner Cross-Review
Compared to Insertion Sort, Selection Sort shows:
- Higher number of comparisons but fewer swaps  
- Stable performance even for reverse-sorted data  
- No benefit for nearly-sorted inputs (unlike Insertion Sort)

---

## 🗂 Project Structure

assignment2-selectionsort/
├── src/main/java/
│ ├── algorithms/Selection_Sort.java
│ ├── metrics/Metrics.java
│ └── cli/BenchmarkRunner.java
├── src/test/java/algorithms/Selection_SortTest.java
├── docs/
│ ├── analysis-report.pdf
│ └── performance-plots/selection_sort_performance.png
├── results.csv
└── README.md
