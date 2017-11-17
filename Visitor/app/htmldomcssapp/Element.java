package htmldomcssapp;

public interface Element {

    void accept(Visitor visitor);
}
