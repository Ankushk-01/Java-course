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

1. Inatance Veriable : The variable define in the class and outside any method is called instance variables and when the object is created each time this variable is assigned to them.
if we update the varaible of an one object it will not affect the other object's varialbes.