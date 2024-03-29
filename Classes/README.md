# Classes in java

## The constructor

in every constructor the first line is `super()` it is not visible but it is there when the constructor created or using the by default constructor and it use this method to call the parent class default constructor. which helps th jdk to intalize the parent class in background.

1. IF we have created the paramitarized constuctor it also call the default constructor of parent class by default.

2. Every class in java `extends` the Object class by default so in a single class it also calling its base class means it have super() method and calling it internally.
3. We can call our own construcotor by calling `this()` and it will call the default constructor of the same call and we can aslo call the paramitarized constuctor by passing the values.

| this() | super() |
|--------|----------|
|this is used to call constructor of same class | this is used to call the constructor of the parent class|
| We need to specify it explicitly to call which constructor | we need to specify if we need to call paramitarized constuctor of the parent class | 
--------------------
| `this()` must be the first line in the constructor | `super()` also be the first line of the constructor | 
We can't call the `super()` and `this()` methods both in the same constructor

For more info see this code [Constuctors.java](Constructors.java)

## Method Overriding

We need to make the method return type and parameters to be same so that it overide the parent method only the logic can be changed.

## Polimorphism

The same onject behave different in different places. It is of two types :
1. Compile time Polymorphism or Early binding Polymorphism : 
Example : `method overloading` which will run is decided at compile time.
2. Run time Polymorphism or late binding Polymorphism :
Example : `method overriding` which will run is decided at run time.

`dynamic method dispatch` in this concept which method will be run is decided at run time while seeing the object reference it have. for more info reference : [DynamicMethod.java](./DynamicMethod.java)

Parent class can have child object reference and it will decide at run time which method of which class will run it is also comes under polimorphism.

## final keyword :

final keyword can be used with variable, method and with class but it different functionality in different use case.
### Example :
1. When we are using `final` keyword with a variable it makes the variable constant means we can't re assign the value to it.
2. When we are using `final` keyword with a class we stop the inheritence of the class means we can't inherit or it can't be extends anymore
3. When we are using `final` keyword with a method we stop the method overriding of that method means no sub class can override the method which is final

for more info refer this class [FinalKeyword.java](/Classes/FinalKeyword.java).

## Upcasting and Lowcasting

When we type cast the reference of the child class varible to parent class it is called `upcasting` type casting and doing visa versa it is called `lowcasting` type casting.

## Abstract Keyword

It is used to define an logic which is not implemented yet but in future we need to do so. so we can create an abstract class of it and  define abstract methods in it.

**We can define the abstract class which can have no abstract method**

but we need to create a class abstract if we are defining the abstract method.

For more info [Abstract.java](./Abstract.java)

## Interface

we can not implements the mehtod in a `interface` as we can do it in `abstract` class.
1. Default value :

By default the method defined in interfece have `public and abstract` keyword with them we don't need to write it explicitly

By default the variable defined in `interfaces` are have `static and final` keyword with then because the interface will never going to intalized and have fixed sapce so we can't set values after it is defined.

# IMPORTANT POINT 

1. Class extends the other class
2. class extends the other abstract class
3. class can implements the interfaces
3. interfaces can also extends the other interfaces
