Exercise 1: Array of Objects
Bruce Eckel emphasizes that arrays of objects store references, not objects themselves.
Task
1. Create a class Book with fields title and author.
2. Create an array of 3 Book references.
3. Initialize each element with a new Book object.
4. Print out the titles of all books.
💡 Edge Case: What happens if you try to print before initializing?
Exercise 2: Static vs Dynamic Initialization
Demonstrating array initialization styles.
Task
1. Create an integer array of size 5 using dynamic allocation and fill it with squares of
indices.
2. Create another integer array using static initialization: {10, 20, 30, 40, 50}.
3. Print both arrays using Arrays.toString().
💡 Checkpoint: What’s the difference in memory allocation between the two approaches?
Exercise 3: Jagged Arrays
Bruce shows arrays of arrays where rows can have different lengths.
Task
1. Create a jagged array with 3 rows.
○ Row 1 → 2 elements
○ Row 2 → 4 elements
○ Row 3 → 3 elements
2. Fill it with sequential numbers.
3. Print it row by row.
💡 Challenge: Print in matrix form neatly formatted.
Exercise 4: Returning Arrays
Inspired by Bruce’s method-returning examples.
Task
1. Write a method generatePrimes(int n) that returns an array of the first n prime
numbers.
2. Print the array in main().
💡 Modern Twist: Solve the same with IntStream (Java 8+).
Exercise 5: Copying Arrays
Illustrates that = copies references, not contents.
Task
1. Create an array {1, 2, 3}.
2. Assign it to another variable and modify the second array.
3. Print both arrays.
4. Use Arrays.copyOf() to make a real copy and show the difference.
💡 Checkpoint: Explain why shallow copy vs deep copy matters in object arrays.
Exercise 6: Sorting & Searching
Using java.util.Arrays.
Task
1. Create an array {7, 2, 9, 4, 1}.
2. Sort it using Arrays.sort().
3. Search for 4 using Arrays.binarySearch().
4. Print the sorted array and index of 4.
💡 Challenge: Try Arrays.parallelSort() and compare runtime on a large dataset.
Exercise 7: Multidimensional Array
Bruce explains how Java supports 2D arrays.
Task
1. Create a 3x3 2D array.
2. Fill it with multiplication table values (e.g., arr[i][j] = (i+1)*(j+1)).
3. Print the 2D array in matrix form.
💡 Challenge: Extend it to n x n matrix (user input).
Exercise 8: Array of Strings
Bruce often mixes primitives with objects.
Task
1. Create an array of String with 5 names.
2. Write a method findName(String[] arr, String name) that returns true if
the name exists.
3. Test it with different names.
💡 Modern Twist: Use Arrays.stream(arr).anyMatch(name::equals)
Exercise 9: Reverse an Array
A classic array manipulation task.
Task
1. Create an array {1, 2, 3, 4, 5}.
2. Write a method to reverse it in-place.
3. Print original and reversed arrays.
💡 Challenge: Solve with recursion.
Exercise 10: Matrix Diagonal Sum
A slightly advanced exercise.
Task
1. Create a 3x3 matrix.
2. Fill it with numbers 1–9.
3. Find the sum of the primary diagonal.
4. Find the sum of the secondary diagonal.
💡 Checkpoint: What happens if matrix is not square
