#   Flyweight Design Pattern


##  What is the Flyweight Pattern
>   The intent of the Flyweight Pattern is to use shared objects to support large numbers of fine-grained objects efficiently.

>   Flyweight design pattern is used when we need to create a lot of Objects of a class. Since every object consumes memory space that can be crucial for low memory devices, such as mobile devices or embedded systems, flyweight design pattern can be applied to reduce the load on memory by sharing objects.

<p align="center">
    <img src="https://github.com/11andrew1991/design_patterns/blob/master/Flyweight/img/flyweight.png" />
</p>


### Flyweight
-   Declares an interface through which flyweights can receive and act on extrinsic state.

### ConcreteFlyweight
-   Implements the Flyweight interface and adds storage for intrinsic state, if any. A ConcreteFlyweight object must be sharable.
    Any state it stores must be intrinsic; that is, it must be independent of the ConcreteFlyweight object’s context.
    
### FlyweightFactory
-   Creates and manages flyweight objects.
-   Ensures that flyweights are shared properly. When a client requests a flyweight, the FlyweightFactory object supplies an
    existing instance or creates one, if none exists.

### Client
-   Maintains a reference to flyweight(s).
-   Computes or stores the extrinsic state of flyweight(s).



##  When to use the Flyweight Pattern
-   An application uses a large number of objects.
-   Storage costs are high because of the sheer quantity of objects.
-   Most object state can be made extrinsic.
-   Many groups of objects may be replaced by relatively few shared objects once extrinsic state is removed.
-   The application doesn’t depend on object identity. Since flyweight objects may be shared, identity tests will return true for
    conceptually distinct objects.
    
    
    
##  Flyweight in the JDK
-   java.lang.Integer#valueOf(int) (also on Boolean, Byte, Character, Short and Long)


[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Flyweight/app/)


<p align="center">
    <<<a href="https://github.com/11andrew1991/design_patterns/tree/master/Facade#facade-design-pattern">Next Structural Pattern (Facade)</a>>>
    <<<a href="https://github.com/11andrew1991/design_patterns#design-patterns">CONTENTS</a>>>  
</p>