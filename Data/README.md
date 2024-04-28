# Big O notation

1. O (1) : constant time
2. O (log n) : Logarithmic time
3. O (n) : Linear time
4. O (n log n) : Linearithmic time 
5. O (n^2) : Quadratic time
6. O (2^n) : Exponential time
7. O (n!) : Factorial time

In this notations we follow the worst case scenarios.

# Time complexity 
It measures the how the running time of an Algorithm increases with the size of input data.

# Linear Search 
in linear Search we iterate over each element of the array and if the value match with the input then it return the index of that value so that is the reason the the time complexity of the Linear search is O (n).
Where n means the number of elements. 
It not need the sorted array it can work on un sorted array. For small size data it is works good but for larger number of data it take time.

# Binary Search

In binary search the time complexity is o (log n). which means that it not truly depends upon the size of the input data.
but the drawback is it works only on sorted array.

It works well as compare to linear search when the data is large.
for more info refer to [BinarySearch.java](./BinarySearch.java)

# Bubble sort
In bubble sort we compare two elements and if the first is smaller then one we do swap and we do this until we reach the array length.
The time complexity of the algorithm is O (n^2).

# Selection Sort 
In the selection sort we only do the swapping when we find the largest or smallest value of the array and we move that value to the first or last of the array as per our need.
it also have the time complexity of O (n^2).
but it is better then the bubble sort as it is not doing swapping at every interval.

for more info refer to [SelectionSOrt.java](./SelectionSort.java)