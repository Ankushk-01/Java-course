# Junit

It is used to do unit testing of the project which means we are going to test our functionality of the project.

we can do it by the testing the functions or classes of the project by this we make sure the functionality or logic of the class or method will remains same and we never change the functionality of the functions in future if we do so the test will fails and show the error.

we write the test cases to make sure that any new feature or enhancement will never change the logic of the method or class.

# Unit means

The unit means the group of functions or the classes which may have dependent logic or collection of them make a major part of the project we call it as a unit

Junit is the platform and the `jupiter` is the api which is used by the project to use Junit literary when not included in the project.

The `Junit5` is not backward compatible which means if we write the code in Junit4 it will not run in Junit5 directly.
We need to use the `vintage` library to run the Junit 4 test cases in Junit 5.

In Junit 5 or Junit Jupiter the test method can be public,protected or default but in Junit 4 the test case must be `public`