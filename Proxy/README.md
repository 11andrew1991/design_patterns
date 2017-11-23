#   Proxy Design Pattern


##  What is the Proxy Design Pattern
>   The Proxy Pattern is used to create a representative object that controls access to another object, which may be remote, expensive
    to create or in need of being secured.
    
>   In the Proxy Pattern, a client does not directly talk to the original object, it delegates it calls to the proxy object which calls the methods of the original object. The important point is that the client does not know about the proxy, the proxy acts as an original object for the client.
    
![UML diagram](https://github.com/11andrew1991/design_patterns/blob/master/Proxy/img/proxy.PNG)


### Proxy
-   Maintains a reference that lets the proxy access the real subject. Proxy may refer to a Subject if the RealSubject and Subject interfaces are the same.
-   Provides an interface identical to Subject’s so that a proxy can be substituted for the real subject.
-   Controls access to the real subject and may be responsible for creating and deleting it.

### Subject
-   Defines the common interface for RealSubject and Proxy so that a Proxy can be used anywhere a RealSubject is expected.

### RealSubject
-   Defines the real object that the proxy represents.

## There are three main variations to the Proxy Pattern:
1.  A remote proxy provides a local representative for an object in a different address space.
2.  A virtual proxy creates expensive objects on demand [Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Proxy/app/virtualapp)
3.  A protection proxy controls access to the original object. Protection proxies are useful when objects should have different access rights [Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Proxy/app/protectionapp)


##  When to use the Proxy Design Pattern
-   A remote proxy provides a local representative for an object in a different address space.
-   A virtual proxy creates expensive objects on demand.
-   A protection proxy controls access to the original object. Protection proxies are useful when objects should have different access rights.


[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Proxy/app/)