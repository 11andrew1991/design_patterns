package iterator.names.app;

/**
 * ConcreteIterator - Implements the Iterator interface.
 * Keeps track of the current position in the traversal of the aggregate.
 */
public class NameIterator implements Iterator {

    private int index;

    @Override
    public boolean hasNext() {
        if (index < NameRepository.names.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return NameRepository.names[index++];
        }
        return null;
    }
}
