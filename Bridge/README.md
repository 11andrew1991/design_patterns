#   Bridge Design Pattern


##  What is the Bridge Design Pattern
>   The Bridge Pattern’s intent is to decouple an abstraction from its implementation so that the two can vary independently. It puts
    the abstraction and implementation into two different class hierarchies so that both can be extend independently.


<p>If we look into bridge design pattern with example, it will be easy to understand. Lets say we have an interface hierarchy in both interfaces and implementations like below image.</p>
<p align="center">
    <img src="https://github.com/11andrew1991/design_patterns/blob/master/Bridge/img/Bridge-Interface-Hierarchy.png" />
</p>

<p>Now we will use bridge design pattern to decouple the interfaces from implementation. UML diagram for the classes and interfaces after applying bridge pattern will look like below image.</p>
<p align="center">
    <img src="https://github.com/11andrew1991/design_patterns/blob/master/Bridge/img/bridge-shape.png" />
</p>  

<p align="center">
    <img src="https://github.com/11andrew1991/design_patterns/blob/master/Bridge/img/bridge.PNG" />
</p>

### Abstraction
-   An abstraction defines the abstraction’s interface and also maintains a reference to an object of type implementer, and the link between the abstraction and the implementer is called a Bridge.

### Refined Abstraction
-   Refined Abstraction extends the interface defined by the abstraction.

### Concrete Implementer
-   Concrete Implementer implements the Implementer interface and defines its concrete implementation.

### Implementor
-   The Bridge Pattern decouples the interface and the implementation. As a result, an implementation is not bound permanently to an interface. The implementation of an abstraction can be configured at run-time. It also eliminates compile-time dependencies on the implementation. Changing an implementation class doesn’t required recompiling the abstraction class and its clients. The Client only needs to know about the abstraction and you can hide the implementation from them.


##  When to use the Bridge Pattern
-   You want to avoid a permanent binding between an abstraction and its implementation. This might be the case, for example,
    when the implementation must be selected or switched at run-time.
-   Both the abstractions and their implementations should be extensible by sub-classing. In this case, the Bridge pattern lets you
    combine the different abstractions and implementations and extend them independently.
-   Changes in the implementation of an abstraction should have no impact on clients; that is, their code should not have to be
    recompiled.
-   You want to share an implementation among multiple objects (perhaps using reference counting), and this fact should be hidden
    from the client.
    

[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Bridge/app/)


<p align="center">
  <<<a href="https://github.com/11andrew1991/design_patterns#design-patterns">CONTENTS</a>>>
</p>