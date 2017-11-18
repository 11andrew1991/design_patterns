#   Composite Design Pattern


##  What is the Composite Design Pattern
>   The Composite Pattern allows you to compose objects into a tree structure to represent the part-whole hierarchy which means
    you can create a tree of objects that is made of different parts, but that can be treated as a whole one big thing. Composite lets
    clients to treat individual objects and compositions of objects uniformly, that’s the intent of the Composite Pattern.
    
>   The Composite Pattern allows us to build structures of objects in the form of trees that contains both composition of objects and
    individual objects as nodes. Using a composite structure, we can apply the same operations over both composites and individual
    objects. In other words, in most cases we can ignore the differences between compositions of objects and individual objects.    
    
![UML diagram](https://github.com/11andrew1991/design_patterns/blob/master/Composite/img/composite.PNG)


### Component
-   The Component in the below class diagram, defines an interface for all objects in the composition both the composite and the
    leaf nodes. The Component may implement a default behavior for generic methods.

### Composite
-   The Composite’s role is to define the behavior of the components having children and to store child components. The Composite
    also implements the Leaf related operations. These operations may or may not take any sense; it depends on the functionality
    implements using the pattern.

### Leaf
-   A Leaf defines the behavior for the elements in the composition. It does this by implementing the operations the Component
    supports. Leaf also inherits methods, which don’t necessarily make a lot of sense for a leaf node.

### Client
-   The Client manipulates objects in the composition through the Component interface.


##  When to use the Composite Design Pattern
-   When you want to represent part-whole hierarchies of objects.
-   When you want clients to be able to ignore the difference between compositions of objects and individual objects. Clients will
    treat all objects in the composite structure uniformly.
    
    
[Implementation](https://github.com/11andrew1991/design_patterns/tree/master/Composite/app/)    