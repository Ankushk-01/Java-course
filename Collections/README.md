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

## Stream 

it is work on collection api and it is used to work with the collections and it now apply any changes on the real data it just used the type which created it and apply the functionality  and then return the result.

It have lots of functions which we can use to do operations on the data structure 

Note : 
1. we can use stream only once and after that it give error that the stream is closed.
2. Do not apply the sort method to the `ParallelStream` as it work on multi- threading and for sort method we need all the values at once to do sorting 

Example : [Streams](./StreamApi.java)

We used the following methods :

1. `filter():` it is used to do the filtration on the upcoming element of the data structure 
it needs the object of `Predicate` interface to decide what to filter form the stream. 


2. `map() : ` this method do the functionality of on the upcoming stream data we can write any logic for that and it also return the stream as a result.

3. `reduce():` this method do the functionality on the elements and it returns the datatype not the stream and it take two arguments.
* starting value : in our case it was 0
* lambda expression : what to do with the data. in our case we are adding the dat so it have 2 values 1. `c` which means carry which is the last result of the computation and `e` which stands for element which comes from the stream.
