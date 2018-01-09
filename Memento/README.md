#   Memento Design Pattern


##  What is the Memento Pattern
>   Memento pattern is used to restore state of an object to a previous state.

<p align="center">
    <img src="https://github.com/11andrew1991/design_patterns/blob/master/Memento/img/memento.png" />
</p>

### Memento
-   Stores internal state of the Originator object. The memento may store as much or as little of the originator’s internal state as
    necessary at its originator’s discretion.
-   Protects against access by objects other than the originator. Mementos have effectively two interfaces. Caretaker sees a narrow
    interface to the Memento-it can only pass the memento to other objects. Originator, in contrast, sees a wide interface, one that
    lets it access all the data necessary to restore itself to its previous state. Ideally, only the originator that produced the memento
    would be permitted to access the memento’s internal state.

### Originator
-   Creates a memento containing a snapshot of its current internal state.
-   Uses the memento to restore its internal state.

### Caretaker
-   Is responsible for the memento’s safekeeping.
-   Never operates on or examines the contents of a memento.
  


##  When to use the Memento Pattern
-   A snapshot of (some portion of) an object’s state must be saved so that it can be restored to that state later.
-   A direct interface to obtaining the state would expose implementation details and break the object’s encapsulation.

    
    
##  Memento in the JDK
-   java.util.Date
-   java.io.Serializable


[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Memento/app/)


<p align="center">
  <<<a href="https://github.com/11andrew1991/design_patterns/tree/master/TemplateMethod#template-method-design-pattern">Next Behavior Pattern (Template Method)</a>>>
  <<<a href="https://github.com/11andrew1991/design_patterns#design-patterns">CONTENTS</a>>>  
</p>