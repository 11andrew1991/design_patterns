#   Strategy Design Pattern


##  What is the Strategy Design Pattern
>   The Strategy pattern is useful when there is a set of related algorithms and a client object needs to be able to dynamically pick
    and choose an algorithm from this set that suits its current need. The Strategy pattern suggests keeping the implementation of
    each of the algorithms in a separate class. Each such algorithm encapsulated in a separate class is referred to as a strategy.
    An object that uses a Strategy object is often referred to as a context object. 

>   With different Strategy objects in place, changing the behavior of a Context object is simply a matter of changing its Str
    ategy object to the one that implements the required algorithm. To enable a Context object to access different Strategy
    objects in a seamless manner, all Strategy objects must be designed to offer the same interface. In the Java programming
    language, this can be accomplished by designing each Strategy object either as an implementer of a common interface or as
    a subclass of a common abstract class that declares the required common interface.

    
![UML diagram](https://github.com/11andrew1991/design_patterns/blob/master/Strategy/img/strategy.PNG)


### Strategy
-   Declares an interface common to all supported algorithms. Context uses this interface to call the algorithm defined by a
    ConcreteStrategy.
    
### ConcreteStrategy
-   Implements the algorithm using the Strategy interface

### Context
-   Is configured with a ConcreteStrategy object.
-   Maintains a reference to a Strategy object.
-   May define an interface that lets Strategy access its data.


##  When to use the Strategy Design Pattern
-   Many related classes differ only in their behavior. Strategies provide a way to configure a class with one of many behaviors.
-   You need different variants of an algorithm. For example, you might define algorithms reflecting different space/time trade-offs.
    Strategies can be used when these variants are implemented as a class hierarchy of algorithms.
-   An algorithm uses data that clients shouldn’t know about. Use the Strategy pattern to avoid exposing complex, algorithm specific
    data structures.
-   A class defines many behaviors, and these appear as multiple conditional statements in its operations. Instead of many conditionals,
    move related conditional branches into their own Strategy class.


[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Strategy/app/)

Another example is [GOOGLE MAPS APP](https://www.google.ro/maps/@46.7686526,23.61344,15z?hl=ro)


<p align="center">
  <a href="https://github.com/11andrew1991/design_patterns">CONTENTS</a>
</p>
    