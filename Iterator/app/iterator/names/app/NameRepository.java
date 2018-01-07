package iterator.names.app;

/**
 * ConcreteAggregate - Implements the Iterator creation interface to return an instance of the proper ConcreteIterator.
 */
public class NameRepository implements Container {

    public static String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
}
