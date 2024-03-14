New Courese i have started to learn java with spring and many more

After the jdk 9 we can run the java code with out creating the java file and we can do so by running the code in `java Shell` by running the following command on CMD:

```bash
    jshell
```

Diffrent types of Integers 

1. `Int` which have 4 bytes 
2. `long` which have 8 bytes
3. `short` which have 2 bytes
4. `byte` which have 1 byte which means it can store values between -128 to 127

Diffrent types of float

1. `float` which have 4 bytes
2. `double` which have 8 bytes

java by default support `double` for decimal values as it don't know the preciding values of an decimal value or it may be storing the scientific values

we need to tell the compiler explicitly that store this value as `float` by adding f at the end of the line.

# Literals 

The values assigned to the variables are called `literals` and we can do many things with them as show in file [Literls.java](./Literals.java).

# Casting 

When we do the explicit casting of an data type then it is called `Casting` and we can do it only with comapatable types like we cant do it with bool to char or visa versa

1. We can't do the casting with boolean data type to float or int it is not possible
2. We can do it when the first type is of `int,float,short,byte` to `double,long`

# Type Permossion 

When we do some computation and the data type excedded then the java automatically permote the type to upper data type like from `byte` to `int` for example see this file [Casting.java](Casting.java).

## Terniory Operator 

It is used to ruplicate the simple condition within one line but it is not the alternative of if else we can use it when the computation is small on condition

## Veriable 

1. `Inatance Veriable` : The variable define in the class and outside any method is called instance variables and when the object is created each time this variable is assigned to them.
if we update the varaible of an one object it will not affect the other object's varialbes.

2. `Local veriables` : The variable defined in side the method it is called the local variable and it is created and deleted when the method called.

the instace variable created in Heap memory and the local variable created in stack memory.

## Exceptions

Exceptions are come at run time that means it compile and show no error but when we run the code it show errors. Famous exceptions are :`IndexOutOfBound` Exception `NullPointerException`
etc.

## String Constant Pool
Types : 
1. Mutable Strings : We can use different classes to create mutable string `StringBuilder` or `StringBuffer` 
`StringBuffer` it is tread safe but `StringBuilder` is not.

2. Imutable Strings : By default the strings are Immutalble.

When the Object is created two steps are followed :
1. Class Loaded 
2. Object Initalized 

But the class loaded at one and there is a special area where all the classes are loaded and it is called `Class Loader` so that is why the static block is loaded once because it static block belongs to the class.


## Static method 

we can access the static variables in the static method but can not the instance variables we can do that we take object of that class then use the instace variables of that Ref. [StaticMethod.java](./Classes/StaticMethod.java)
and also we need to set the method access to public then the method can be accessable to the child or other classess.

## Encapsulation 

Encapsulation in Simple words like we have doors to enter in our house so that the thinks 