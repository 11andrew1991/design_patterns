#   Facade Design Pattern


##  What is the Facade Pattern
>   The Facade Pattern makes a complex interface easier to use, using a Facade class. The Facade Pattern provides a unified interface
    to a set of interface in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
    
>   The Facade unifies the complex low-level interfaces of a subsystem in-order to provide a simple way to access that interface. It
    just provides a layer to the complex interfaces of the sub-system which makes it easier to use.

>   The Facade do not encapsulate the subsystem classes or interfaces; it just provides a simplified interface to their functionality. A
    client can access these classes directly. It still exposes the full functionality of the system for the clients who may need it.

>   A Facade is not just only able to simplify an interface, but it also decouples a client from a subsystem. It adheres to the Principle
    of Least Knowledge, which avoids tight coupling between the client and the subsystem. This provides flexibility: suppose in the
    above problem, the company wants to add some more steps to start or stop the Schedule Server, that have their own different interfaces.

<p align="center">
    <img src="https://github.com/11andrew1991/design_patterns/blob/master/Facade/img/facade.png" />
</p>


##  When to use the Factory Pattern
-   You want to provide a simple interface to a complex subsystem. Subsystems often get more complex as they evolve. Most
    patterns, when applied, result in more and smaller classes. This makes the subsystem more reusable and easier to customize,
    but it also becomes harder to use for clients that don’t need to customize it. A facade can provide a simple default view of
    the subsystem that is good enough for most clients. Only clients needing more customizability will need to look beyond the
    facade.
-   There are many dependencies between clients and the implementation classes of an abstraction. Introduce a facade to decouple
    the subsystem from clients and other subsystems, thereby promoting subsystem independence and portability.
-   You can layer your subsystems. Use a facade to define an entry point to each subsystem level. If subsystems are dependent,
    then you can simplify the dependencies between them by making them communicate with each other solely through their
    facades.


[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Facade/app/)


<p align="center">
  <<<a href="https://github.com/11andrew1991/design_patterns#design-patterns">CONTENTS</a>>>  
</p>        