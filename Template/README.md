#   Template Design Pattern


##  What is the Template Design Pattern
>   The Template Pattern defines the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method
    lets subclasses to redefine certain steps of an algorithm without changing the algorithm’s structure.
    
>   The Template Method pattern can be used in situations when there is an algorithm, some steps of which could be implemented
    in multiple different ways. In such scenarios, the Template Method pattern suggests keeping the outline of the algorithm in a
    separate method referred to as a template method inside a class, which may be referred to as a template class, leaving out the
    specific implementations of the variant portions (steps that can be implemented in multiple different ways) of the algorithm to
    different subclasses of this class.

>   The Template class does not necessarily have to leave the implementation to subclasses in its entirety. Instead, as part of providing
    the outline of the algorithm, the Template class can also provide some amount of implementation that can be considered as
    invariant across different implementations. It can even provide default implementation for the variant parts, if appropriate. Only
    specific details will be implemented inside different subclasses. This type of implementation eliminates the need for duplicate
    code, which means a minimum amount of code to be written.


<p align="center">
    <img src="https://github.com/11andrew1991/design_patterns/blob/master/Template/img/template.png" />
</p>

### AbstractClass
-   Defines abstract primitive operations that concrete subclasses define to implement steps of an algorithm.
-   Implements a template method defining the skeleton of an algorithm. The template method calls primitive operations as well
    as operations defined in AbstractClass or those of other objects. ConcreteClass.
-   Implements the primitive operations to carry.


##  When to use the Template Design Pattern
-   To implement the invariant parts of an algorithm once and leave it up to subclasses to implement the behavior that can vary.
-   When common behavior among subclasses should be factored and localized in a common class to avoid code duplication. You
    first identify the differences in the existing code and then separate the differences into new operations. Finally, you replace the
    differing code with a template method that calls one of these new operations.
-   To control subclasses extensions. You can define a template method that calls "hook" operations (see Consequences) at specific
    points, thereby permitting extensions only at those points.


##  Template Pattern in JDK
-   java.util.Collections#sort()
-   java.io.InputStream#skip()
-   java.io.InputStream#read()
-   java.util.AbstractList#indexOf()


[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Template/app/)


<p align="center">
  <<<a href="https://github.com/11andrew1991/design_patterns#design-patterns">CONTENTS</a>>>
</p>