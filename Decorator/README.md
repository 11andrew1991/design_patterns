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

<p align="center">
    <img src="https://github.com/11andrew1991/design_patterns/blob/master/Decorator/img/decorator-pattern.png" />
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



##  Decorator Design Pattern in Java
-   java.io.BufferedInputStream(InputStream)
-   java.io.DataInputStream(InputStream)
-   java.io.BufferedOutputStream(OutputStream)
-   java.util.zip.ZipOutputStream(OutputStream)
-   java.util.Collections#checked List|Map|Set|SortedSet|SortedMap()

[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Decorator/app/)


<p align="center">
  <<<a href="https://github.com/11andrew1991/design_patterns#design-patterns">CONTENTS</a>>>
  <<<a href="https://github.com/11andrew1991/design_patterns/tree/master/Flyweight#flyweight-design-pattern">Next Structural Pattern (Flyweight)</a>>>
</p>        