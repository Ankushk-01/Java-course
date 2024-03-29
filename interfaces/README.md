# Interfaces

Interfaces are the blueprint of an idea means we know what to do but now no idea how to implement it. so we create the interface to bind the idea in some form.

## Types: 
we have 3 types of interfaces :
1. Normal interface: in this type of interfaces we have only normal method definations only.

2. SAM or functional interfaces : SAM stands for Single Abstract method interface means if we have only one function defination in a entire interface block it is called SAM or functional interface

We can only use the lambda expression for the functional interfaces. For more info [Interfaces.java](./Demo.java)

3. Marker interface: 
The empty interface is called marker interface. We create an empty interface if we want to store the objects or data of the object in the hard drive and then distroy the object. 
We do it when we want to use that data or object later in future.

By default we are not allowed to save data of an object in hard drive that is why we use interface to do so.

### Example : serializable interface 

## Serialization 
when we save the interface data on the hard drive it is called serialization 

## De-Serialization 

When we load the saved local drive data in the java program it is called de-serialization.

## Errors 

The bugs which can not be fixed or ignored while doing copilation or while runing the code. 
Different types of the Errors : 

1. Compile time error : those error which can be found by compiler are called compile time errors. **Example** : syntex error or data type mismatch or dead code etc.

2. Runtime error : Those errors which come at run time are called run time erros it is also called `Exceptions` we can handle the exceptions as we can cover the edge cases where our code can fails. 
This process is called `Exception handling` and it may rise if we trying to read the a text file or dividing an value with 0 etc.

3. Logical errors : Every thing is working fine on compile time and run time but the expected output is different from the actual output. we call it a bug. to solve this we do `debugging`.

## Exceptions

Exceptions are the run time errors which we can handle.

Tree of Exception class :

1. Object: it is the top or base class of every class in java so it is `shemo` in java.

2. Throwable : it is the class which extends the `object` class and it is the top level or parent class of both `Exception` and `Error` class.

3. Exception : it is the base class of each and every Exception class in java. 
**Example** : SQLException,IOException etc.
They are also called `checked exceptions` as the compiler force you to handle that exceptions.

4. RunTimeException: the exceptions comes in this cetagory are also called `un-checked` excptions means compiler will never force use to handle that exceptions and are comes only at run time and comipler can not find it while writing the code.
**Example:** ArithmeticException,NullPointerException,IndexOutOfBoundException etc..

Error class: we may have error in our program which we can not handle like : IO error means file not found or can not able to read or Thread Dead error etc. 

## throw keyword 

it is used to raise a Exception and we can do so by creating the object of the Exception and pass the message in the constructor of the object. 

it is used when we want to execute the catch block when some condition satisfied.