# Threads

Threads are used to run the process or some task in parallel.
We have two ways to create a new Thread by extending `Thread` class or by implementing `Runnable` interface.

1. Thread Class : It also implements the Runnable interface but also add the lots of methods to with it.

We calls the `start()` method of an Thread class and it required to override the `run()` method in the child class which implements the `Thread` class.

2. Runnable interface : We can use this interface to implements the Threads we also needs to ovveride the `run()` method in the child class.
But if we need to run the `start()` method and the methods of Thread class we can create the Thread class object from the Runnable interface class by passing the object reference in Thread class constructor.

Note : 1. We can optimize the Threads but can't decide the exicution of the thread as it depends on the OS of the system and the Schedular Algorithm to which thread to pick.

2. Lambda Expressions only works on Functional Interfaces.