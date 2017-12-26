#   Iterator Design Pattern


##  What is the Iterator Pattern
>   The Iterator pattern allows a client object to access the contents of a container in a sequential manner, without having any knowledgeabouttheinternalrepresentationofitscontents. Thetermcontainer,usedabove,cansimplybedeﬁnedasacollection of data or objects. The objects within the container could in turn be collections, making it a collection of collections. 

>   The Iterator pattern enables a client object to traverse through this collection of objects (or the container) without having the container to reveal how the data is stored internally. To accomplish this, the Iterator pattern suggests that a Container object shouldbedesignedtoprovideapublicinterfaceintheformofanIteratorobjectfordifferentclientobjectstoaccessitscontents. An Iterator object contains public methods to allow a client object to navigate through the list of objects within the container.


<p align="center">
    <img src="https://github.com/11andrew1991/design_patterns/blob/master/Iterator/img/iterator.PNG" />
</p>


### Iterator
-   Deﬁnes an interface for accessing and traversing elements.

### ConcreteIterator
-   Implements the Iterator interface. 
-   Keeps track of the current position in the traversal of the aggregate.

### Aggregate
-   Deﬁnes an interface for creating an Iterator object.

### ConcreteAggregate
-   Implements the Iterator creation interface to return an instance of the proper ConcreteIterator.


##  Internal and External Iterators
An iterator can be designed either as an internal iterator or as an external iterator.


### Internal Iterators
-   The collection itself offers methods to allow a client to visit different objects within the collection. For example, the java. util.ResultSet class contains the data and also offers methods such as next to navigate through the item list. 
-   There can be only one iterator on a collection at any given time. 
-   The collection has to maintain or save the state of iteration.


### External Iterators
-   The iteration functionality is separated from the collection and kept inside a different object referred to as an iterator. Usually, the collection itself returns an appropriate iterator object to the client depending on the client input. For example, the java. util.Vector class has its iterator deﬁned in the form of a separate object of type Enumeration. This object is returned to a client object in response to the elements() method call. 
-   There can be multiple iterators on a given collection at any given time.
-   The overhead involved in storing the state of iteration is not associated with the collection. It lies with the exclusive Iterator object.



##  When to use the Iterator Pattern
-   To access an aggregate object’s contents without exposing its internal representation. 
-   To support multiple traversals of aggregate objects. 
-   To provide a uniform interface for traversing different aggregate structures (that is, to support polymorphic iteration).

    
    
##  Iterator in the JDK
-   java.util.Iterator
-   java.util.Enumeration


[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Iterator/app/)


<p align="center">
  <<<a href="https://github.com/11andrew1991/design_patterns#design-patterns">CONTENTS</a>>>  
</p>