New Course i have started to learn java with spring and many more

After the jdk 9 we can run the java code without creating the java file and we can do so by running the code in `java Shell` by running the following command on CMD:

```bash
    jshell
```

Different types of Integers 

1. `Int` which have 4 bytes 
2. `long` which have 8 bytes
3. `short` which have 2 bytes
4. `byte` which have 1 byte which means it can store values between -128 to 127

Different types of float

1. `float` which have 4 bytes
2. `double` which have 8 bytes

java by default support `double` for decimal values as it don't know the preceding values of an decimal value or it may be storing the scientific values

we need to tell the compiler explicitly that store this value as `float` by adding f at the end of the line.

# Literals 

The values assigned to the variables are called `literals` and we can do many things with them as show in file [Literals.java](./Literals.java).

# Casting 

When we do the explicit casting of data type then it is called `Casting` and we can do it only with compatible types like we can't do it with bool to char or visa versa

1. We can't do the casting with boolean data type to float or int it is not possible
2. We can do it when the first type is of `int,float,short,byte` to `double, long`

# Type Permission  

When we do some computation and the data type exceeded then the java automatically promote the type to upper data type like from `byte` to `int` for example see this file [Casting.java](Casting.java).

## Ternary Operator  

It is used to replicate the simple condition within one line but it is not the alternative of if else we can use it when the computation is small on condition

## Variable 

1. `Instance Variable` : The variable define in the class and outside any method is called instance variables and when the object is created each time this variable is assigned to them.
if we update the variable of an one object it will not affect the other object's variables.

2. `Local variables` : The variable defined in side the method it is called the local variable and it is created and deleted when the method called.

the instance variable created in Heap memory and the local variable created in stack memory.

## Exceptions

Exceptions are come at run time that means it compile and show no error but when we run the code it show errors. Famous exceptions are :`IndexOutOfBound` Exception `NullPointerException`
etc.

## String Constant Pool
Types : 
1. Mutable Strings : We can use different classes to create mutable string `StringBuilder` or `StringBuffer` 
`StringBuffer` it is tread safe but `StringBuilder` is not.

2. Immutable Strings : By default the strings are Immutable.

When the Object is created two steps are followed :
1. Class Loaded 
2. Object Initialized 

But the class loaded at one and there is a special area where all the classes are loaded and it is called `Class Loader` so that is why the static block is loaded once because it static block belongs to the class.


## Static method 

we can access the static variables in the static method but can not the instance variables we can do that we take object of that class then use the instance variables of that Ref. [StaticMethod.java](./Classes/StaticMethod.java)
and also we need to set the method access to public then the method can be accessible to the child or other classes.

## Encapsulation 

Encapsulation in Simple words like we have shop and we have one window to deal with peoples no one can purchase our thinks without our permission it needs to be authorized person or pay for that to do so. we set the constraint on it is if it satisfy our condition then you can use it other wise you can't. 
for reference look this file : [Encapsulation](./Classes/StaticMethod.java)

### Private variables and method

The private keyword simply set the scope to the class level only means we can use then inside the class only use in the sense we can set or get values in that only

### this keyword : 
`this keyword` is only used when we have same name of our instance variable and the local variable inside an method so we need to tell the jvm that which one is our instance and local variable and we can do by tell the instance variable by start with `this.` 
Example: 
```
public void setCost(String cost){
        this.cost = cost;
    }
```
`this` keyword is used to refer the current object and we can replicate it via passing the reference of the object and we can do some logic on the instance variables.

## inner class

we can make the inner class as static but can't make the outer class static as only public,abstract or final keyword are allowed for the outer class.
as we need an object to instalize the `child` class. So we need to create the outer class non-static 

## JDBC 
java data base connection 

We need to follow the 7 steps which are given below :

1. Import the package or we can say JDBC dependency
2.  load or register the driver (Optional)
3. Establish the connection
4. create the statement
5. Execute the statement
6. Process the result
7. close the connection 

### Different types of statement

1. Statement
2. PrepareStatement
3. Callable Statement:- It is used for the PL (Procedural Query) or we can say it is used for Store Procedure
