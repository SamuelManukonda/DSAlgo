## Singleton Design Pattern

Allows you to create a class for which only one object can be created.

Why?
- A class which is having  a shared resource  behind the scenes.\
- Creation of this object is expensive

Steps to create a Singleton Pattern
- Create a private constructor.
- Create a static method to create an instance 
- check if instance is already created, if yes return that instance else create a new instance.

PROS:
1. Resource Efficiency
2. Creating a new object is inefficient 

CONS
1. Difficulty in testing a class.
