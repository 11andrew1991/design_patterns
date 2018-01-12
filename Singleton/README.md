#   Singleton Design Pattern


##  What is the Singleton Pattern
>   Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.

>   The singleton class must provide a global access point to get the instance of the class.

>   Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.

>   Singleton pattern is used for logging, drivers objects, caching and thread pool.   

<p align="center">
    <img src="https://github.com/11andrew1991/design_patterns/blob/master/Singleton/img/singleton.png" />
</p>


##  When to use the Singleton Pattern
-   There must be exactly one instance of a class, and it must be accessible to clients from a well-known access point.
-   When the sole instance should be extensible by sub-classing, and clients should be able to use an extended instance without
    modifying their code.


### Singleton in JDK
-   java.lang.Runtime, java.awt.Desktop


[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Singleton/app/)


<p align="center">
    <<<a href="https://github.com/11andrew1991/design_patterns#design-patterns">CONTENTS</a>>>
</p>        