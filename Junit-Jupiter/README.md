# Junit Jupiter

`@TestInstance(TestInstance.Lifecycle.PER_CLASS)` this line tells the junit compiler to create the instance of the class must be one, by default for each test case the class instance is created so to remove this behavior we do the above line of code.

We need to make the `BeforeAll` and `AfterAll` method to be static as it is called before the creation of the object of the class so it have to be `static` but if we change the behavior of the class to create one object we don't need to do so.