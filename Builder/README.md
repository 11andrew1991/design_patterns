#   Builder Design Pattern


##  What is the Builder Pattern
>   The intent of the Builder Pattern is to separate the construction of a complex object from its representation, so 
    that the same construction process can create different representations. This type of separation reduces the object 
    size. The design turns out to be more modular with each implementation contained in a different builder 
    object. Adding a new implementation (i.e., adding a new builder) becomes easier. The object construction process 
    becomes independent of the components that make up the object. This provides more control over the object 
    construction process.

![UML diagram](https://github.com/11andrew1991/design_patterns/blob/master/Builder/img/builder.PNG)

    
### Builder
-   Specifies an abstract interface for creating parts of a Product object.

### ConcreteBuilder
-   Constructs and assembles parts of the product by implementing the Builder interface.
-   Defines and keeps track of the representation it creates.
-   Provides an interface for retrieving the product.
 
### Director
-   Constructs an object using the Builder interface.

### Product
-   Represents the complex object under construction. ConcreteBuilder builds the product’s internal representation 
    and defines the process by which it’s assembled.
-   Includes classes that define the constituent parts, including interfaces for assembling the parts into the 
    final result.
        
        
##  When to use the Builder Pattern
-   The algorithm for creating a complex object should be independent of the parts that make up the object and 
    how they’re assembled.
-   The construction process must allow different representations for the object that’s constructed.