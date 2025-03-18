# Prototype Design Pattern 

Problem Statement:
- Given object of a class, we need to create a copy of that object.

```java
Student st = new Student();
Student stcopy = st;  --> not a new object

// What we require.

Student st= new Student();
Student stcopy = (get a copy of the Student object with all attributes and values)

```

Steps to create 
1. In a class that you want to have the prototypes declare a method called as clone.
2. This method creates a copy of current object
3. If you have child classes of this class, they should override the clone method
4. Store the prototypes in a registry.
5. Client calls the registry to get the prototype, then calls the copy method and  operates on it.