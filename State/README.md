#   State Design Pattern


##  What is the State Design Pattern
>   The State Design Pattern allows an object to alter its behavior when its internal state changes. The object will appear to change
    its class.

>   The State pattern is useful in designing an efficient structure for a class, a typical instance of which can exist in many different
    states and exhibit different behavior depending on the state it is in. In other words, in the case of an object of such a class, some
    or all of its behavior is completely influenced by its current state. In the State design pattern terminology, such a class is referred
    to as a Context class. A Context object can alter its behavior when there is a change in its internal state and is also referred
    as a Stateful object.
    
>   The State pattern suggests moving the state-specific behavior out of the Context class into a set of separate classes referred to as State classes. Each of the many different states that a Context object can exist in can be mapped into a separate State class. 
    
![UML diagram](https://github.com/11andrew1991/design_patterns/blob/master/State/img/state.PNG)


### Context
-   Defines the interface of interest to clients.
-   Maintains an instance of a ConcreteState subclass that defines the current state.

### State
-   Defines an interface for encapsulating the behavior associated with a particular state of the Context.

### ConcreteState subclasses
-   Each subclass implements a behavior associated with a state of the Context.


##  When to use the State Design Pattern
-   An object’s behavior depends on its state, and it must change its behavior at run-time depending on that state.
-   Operations have large, multipart conditional statements that depend on the object’s state. This state is usually represented by
    one or more enumerated constants. Often, several operations will contain this same conditional structure. The State pattern
    puts each branch of the conditional in a separate class. This lets you treat the object’s state as an object in its own right that can
    vary independently from other objects.
    
    
[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/State/app/)

Another example is [GOOGLE MAPS APP](https://www.google.ro/maps/@46.7686526,23.61344,15z?hl=ro)


<p align="center">
  <a href="https://github.com/11andrew1991/design_patterns">CONTENTS</a>
</p>    