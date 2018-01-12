#   Abstract Factory Design Pattern


##  What is the Abstract Factory Pattern
>   The Abstract Factory is a design pattern which provides an interface for creating families of related or dependent
    objects without specifying their concrete classes. The Abstract Factory pattern takes the concept of the Factory Method Pattern
    to the next level. An abstract factory is a class that provides an interface to produce a family of objects.
    
>   The Abstract Factory pattern is useful when a client object wants to create an instance of one of a suite of related, dependent
    classes without having to know which specific concrete class is to be instantiated.

    
<p align="center">
    <img src="https://github.com/11andrew1991/design_patterns/blob/master/AbstractFactory/img/abstractfactory.PNG" />
</p>


### AbstractFactory
-   Declares an interface for operations that create abstract product objects.

### ConcreteFactory
-   Implements the operations to create concrete product objects.

### AbstractProduct
-   Declares an interface for a type of product object.

### ConcreteProduct
-   Defines a product object to be created by the corresponding concrete factory.
-   Implements the AbstractProduct interface.

### Client
-   Uses only interfaces declared by AbstractFactory and AbstractProduct classes.


##  When to use the Abstract Factory Pattern
-   A system should be independent of how its products are created, composed, and represented.
-   A system should be configured with one of multiple families of products.
-   A family of related product objects is designed to be used together, and you need to enforce this constraint.
-   You want to provide a class library of products, and you want to reveal just their interfaces, not their implementations.



### Abstract Factory Pattern in JDK
-   java.util.Arrays#asList()
-   java.sql.Connection#createStatement()
-   java.sql.Statement#executeQuery()
-   java.text.NumberFormat#getInstance()
-   javax.xml.transform.TransformerFactory#newInstance()


[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/AbstractFactory/app/)


<p align="center">
    <<<a href="https://github.com/11andrew1991/design_patterns/tree/master/Singleton#singleton-design-pattern">Next Creational Pattern (Singleton)</a>>>
    <<<a href="https://github.com/11andrew1991/design_patterns#design-patterns">CONTENTS</a>>>
</p>        