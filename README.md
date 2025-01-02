# ArrayIndexOutOfBoundsException in Java

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`. The code attempts to access an array element that doesn't exist, causing a runtime error.

## Bug Description

The `bug.java` file contains a `for` loop that iterates one element past the end of the array. This leads to an `ArrayIndexOutOfBoundsException` when accessing `arr[5]`.

## Solution

The `bugSolution.java` file corrects the issue by changing the loop condition to `i < arr.length`, preventing access to the non-existent sixth element.  This ensures the loop only iterates up to, but not including, the array's final index.