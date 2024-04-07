# Collection 

We need to pass the datatype in the while defining the collection so that we can get compile time error not run time 
We can use List to do indexing of the data 
In list we can add same values but in set we can't

[Intro.java](First.java)

# Set

HashSet : not give the values in the same order it takes and not save the same value and also not sort the value so it is fast 

TreeSet : sort the value do some sorting in background so it is slow in terms of HashSet

If we want to use synchronized Map then we can use `HashTable` it provide the synchronization by default

We can use the `Collections` class to do the additional functionality on the Collection interface. [Comparator.java](./ComparatorFile.java).

# Comparator 
this is the interface which we can used to define the custom logic to sort the List.
[ComparatorTest.java](./ComparatorTest.java).

We need to specify the custom logic to sort the user defined or on custom class as the Comparator do not know how to sort it. We have two ways to do it by creating the object of `Comparator` interface or we can implements the `Comparable` interface on the custom class.

[CustomComparator.java]


forEach loop in List interface have a very unique way to send the each element of the list
and it send the each element to the `Consumer` interface which decide what to do with the element in background so we can prove this by creating the object of it and pass it to the forEach loop.

Consumer is a functional interface so we can write the lambda expression for it.

For more info [ForEach.java](./ForEach.java)