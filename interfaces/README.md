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

