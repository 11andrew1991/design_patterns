#   Decorator Design Pattern


##  What is the Decorator Pattern
>   The intent of the Decorator Design Pattern is to attach additional responsibilities to an object dynamically. Decorators provide a
    flexible alternative to sub-classing for extending functionality.

>   The Decorator Pattern is used to extend the functionality of an object dynamically without having to change the original class
    source or using inheritance. This is accomplished by creating an object wrapper referred to as a Decorator around the actual
    object.
    
<p align="center">
    <img src="https://github.com/11andrew1991/design_patterns/blob/master/Decorator/img/decorator.PNG" />
</p>


### Component
-   Defines the interface for objects that can have responsibilities added to them dynamically.

### ConcreteComponent
-   Defines an object to which additional responsibilities can be attached.

### Decorator
-   Maintains a reference to a Component object and defines an interface that conforms to Component’s interface.

### ConcreteDecorator
-   Adds responsibilities to the component.


##  When to use the Decorator Pattern
-   To add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects.
-   For responsibilities that can be withdrawn.
-   When extension by sub-classing is impractical. Sometimes a large number of independent extensions are possible and would
    produce an explosion of subclasses to support every combination. Or a class definition may be hidden or otherwise unavailable
    for sub-classing.