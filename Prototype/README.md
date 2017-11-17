#   Prototype Design Pattern


##  What is the Prototype Design Pattern
>   The Prototype design pattern is used to specify the kinds of objects to create using a prototypical instance, and create new objects
    by copying this prototype.
    The concept is to copy an existing object rather than creating a new instance from scratch, something that may include costly
    operations. The existing object acts as a prototype and contains the state of the object. The newly copied object may change
    same properties only if required. This approach saves costly resources and time, especially when the object creation is a heavy
    process.
    
![UML diagram](https://github.com/11andrew1991/design_patterns/blob/master/Prototype/img/prototype.PNG)


### Prototype
-   Declares an interface for cloning itself.

### ConcretePrototype
-   Implements an operation for cloning itself.

### Client
-   Creates a new object by asking a prototype to clone itself.


##  When to use the Prototype Design Pattern
-   When the classes to instantiate are specified at run-time, for example, by dynamic loading.
-   To avoid building a class hierarchy of factories that parallels the class hierarchy of products.
-   When instances of a class can have one of only a few different combinations of state. It may be more convenient to install a
    corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate
    state.
