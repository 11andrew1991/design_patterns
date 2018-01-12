package singleton.app;

public class SingletonExample {

    private static SingletonExample singletonInstance;

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new SingletonExample();
            System.out.println("CREATED new instance");
        }
        return singletonInstance;
    }

    public void print(){
        System.out.println("Inside print Singleton");
    }
}
