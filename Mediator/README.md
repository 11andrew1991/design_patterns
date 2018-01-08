#   Mediator Design Pattern


##  What is the Mediator Pattern
>   The Mediator Pattern defines an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by
    keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.           

>   Rather than interacting directly with each other, objects ask the Mediator to interact on their behalf which results in reusability
    and loose coupling. It encapsulates the interaction between the objects and makes them independent from each other. This allows
    them to vary their interaction with other objects in a totally different way by implementing a different mediator. The Mediator
    helps to reduce the complexity of the classes. Each object no longer has to know in detail about how to interact with the other
    objects. The coupling between objects goes from tight and brittle to loose and agile.

<p align="center">
    <img src="https://github.com/11andrew1991/design_patterns/blob/master/Mediator/img/mediator.png" />
</p>

### Mediator
-   Defines an interface for communicating with Colleague objects.

### ConcreteMediator
-   Implements cooperative behavior by coordinating Colleague objects. It also knows and maintains its colleagues.

### Colleague Classes
-   Each Colleague class knows its Mediator object. Each colleague communicates with its mediator whenever
    it would have otherwise communicated with another colleague.  



##  When to use the Mediator Pattern
-   A set of objects communicate in well-defined but complex ways. The resulting interdependencies are unstructured and difficult
    to understand.
-   Reusing an object is difficult because it refers to and communicates with many other objects.
-   A behavior that’s distributed between several classes should be customizable without a lot of sub-classing.

    
    
##  Mediator in the JDK
-   java.util.concurrent.ScheduledExecutorService (all scheduleXXX() methods)
-   java.util.concurrent.ExecutorService (the invokeXXX() and submit() methods)
-   java.util.concurrent.Executor#execute()
-   java.util.Timer (all scheduleXXX() methods)
-   java.lang.reflect.Method#invoke()


[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Mediator/app/)


<p align="center">
  <<<a href="https://github.com/11andrew1991/design_patterns/tree/master/Memento#memento-design-pattern">Next Behavior Pattern (Memento)</a>>>
  <<<a href="https://github.com/11andrew1991/design_patterns#design-patterns">CONTENTS</a>>>  
</p>