#   Chain of Responsibility Design Pattern


##  What is the Chain of Responsibility Pattern
>   The Chain of Responsibility pattern is a behavior pattern in which a group of objects is chained together in a sequence and a
    responsibility (a request) is provided in order to be handled by the group. If an object in the group can process the particular
    request, it does so and returns the corresponding response. Otherwise, it forwards the request to the subsequent object in the
    group.

>   The intent of this pattern is to avoid coupling the sender of a request to its receiver by giving more than one object a chance to
    handle the request. We chain the receiving objects and pass the request along the chain until an object handles it.
    
>   This pattern is all about connecting objects in a chain of notification; as a notification travels down the chain, it’s handled by the
    first object that is set up to deal with the particular notification.    

![UML diagram](https://github.com/11andrew1991/design_patterns/blob/master/ChainOfResponsibility/img/chainofresponsibility-2.PNG)
![UML diagram](https://github.com/11andrew1991/design_patterns/blob/master/ChainOfResponsibility/img/chainofresponsibility.PNG)


### Handler
-   Defines an interface for handling requests.
-   (Optionally) Implements the successor link.

### ConcreteHandler
-   Handles requests it is responsible for.
-   Can access its successor.
-   If the ConcreteHandler can handle the request, it does so; otherwise it forwards the request to its successor.

### Client
-   Initiates the request to a ConcreteHandler object on the chain.
       
        
##  When to use the Adapter Pattern
-   More than one objects may handle a request, and the handler isn’t known a priori. The handler should be ascertained automatically.
-   You want to issue a request to one of several objects without specifying the receiver explicitly.
-   The set of objects that can handle a request should be specified dynamically.


[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/ChainOfResponsibility/app/)


<p align="center">
  <a href="https://github.com/11andrew1991/design_patterns#design-patterns">CONTENTS</a>
</p>