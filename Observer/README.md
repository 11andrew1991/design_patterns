#   Observer Design Pattern


##  What is the Observer Pattern
>   The Observer Pattern is a kind of behavior pattern which is concerned with the assignment of responsibilities between objects.
    The behavior patterns characterize complex control flows that are difficult to follow at run-time. They shift your focus away from
    the flow of control to let you concentrate just on the way objects are interconnected.
    
>   The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents
    are notified and updated automatically.
    
![UML diagram](https://github.com/11andrew1991/design_patterns/blob/master/Observer/img/observer.PNG)


### Subject
-   Which is used to register observers. Objects use this interface to register as observers and also to remove themselves
    from being observers.
    
### Observer
-   Defines an updating interface for objects that should be notified of changes in a subject. All observers need to
    implement the Observer interface. This interface has a method update(), which gets called when the Subject’s state changes.
    
### ConcreteSubject
-   Stores the state of interest to ConcreteObserver objects. It sends a notification to its observers when its state
    changes. A concrete subject always implements the Subject interface. The notifyObservers() method is used to update
    all the current observers whenever the state changes.

### ConcreateObserver
-   Maintains a reference to a ConcreteSubject object and implements the Observer interface. Each observer
    registers with a concrete subject to receive updates.


##  When to use the Observer Pattern
-   When an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in separate objects lets you vary
    and reuse them independently.
-   When a change to one object requires changing others, and you don’t know how many objects need to be changed.
-   When an object should be able to notify other objects without making assumptions about who these objects are. In other words,
    you don’t want these objects tightly coupled.