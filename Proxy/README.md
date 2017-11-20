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
1.  A remote proxy provides a local representative for an object in a different address space [Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Proxy/app/remoteapp)
2.  A virtual proxy creates expensive objects on demand [Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Proxy/app/virtualapp)
3.  A protection proxy controls access to the original object. Protection proxies are useful when objects should have different access rights [Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Proxy/app/protectionapp)


##  When to use the Proxy Design Pattern
-   A remote proxy provides a local representative for an object in a different address space.
-   A virtual proxy creates expensive objects on demand.
-   A protection proxy controls access to the original object. Protection proxies are useful when objects should have different access rights.


##  Other Proxies
-   **Cache Proxy/Server Proxy:** To provide the functionality required to store the results of most frequently used target operations.
    The proxy object stores these results in some kind of a repository. When a client object requests the same operation, the proxy
    returns the operation results from the storage area without actually accessing the target object.
-   **Firewall Proxy:** The primary use of a firewall proxy is to protect target objects from bad clients. A firewall proxy can also be
    used to provide the functionality required to prevent clients from accessing harmful targets.
-   **Synchronization Proxy:** To provide the required functionality to allow safe concurrent accesses to a target object by different
    client objects.
-   **Smart Reference Proxy:** To provide the functionality to prevent the accidental disposal/deletion of the target object when
    there are clients currently with references to it. To accomplish this, the proxy keeps a count of the number of references to the
    target object. The proxy deletes the target object if and when there are no references to it.
-   **Counting Proxy:** To provide some kind of audit mechanism before executing a method on the target object.