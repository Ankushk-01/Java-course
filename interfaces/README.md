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