package singleton.app;

public class Main {

    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        singletonExample.print();

        SingletonExample singletonExample1 = SingletonExample.getInstance();
        singletonExample1.print();
    }
}
