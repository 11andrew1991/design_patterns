#   Factory Design Pattern


##  What is the Factory Pattern
>   Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
    
>   In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.
    
<p align="center">
    <img src="https://github.com/11andrew1991/design_patterns/blob/master/Factory/img/factory.PNG" />
</p>


### Product
-   Defines the interface of objects the factory method creates.

### ConcreteProduct
-   Implements the Product interface.

### Creator
-   Declares the factory method, which returns an object of type Product. Creator may also define a default implementation of the
    factory method that returns a default ConcreteProduct object.
-   May call the factory method to create a Product object.

### ConcreteCreator
-   Overrides the factory method to return an instance of a ConcreteProduct.



##  When to use the Factory Pattern
-   A class can’t anticipate the class of objects it must create.
-   A class wants its subclasses to specify the objects it creates.
-   Classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper
    subclass is the delegate.       

[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Factory/app/)


<p align="center">
  <<<a href="https://github.com/11andrew1991/design_patterns#design-patterns">CONTENTS</a>>>
</p>        