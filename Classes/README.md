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