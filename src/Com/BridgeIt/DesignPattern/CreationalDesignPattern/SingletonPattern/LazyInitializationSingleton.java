package Com.BridgeIt.DesignPattern.CreationalDesignPattern.SingletonPattern;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;
    private LazyInitializationSingleton() {
        System.out.println("In Lazy Initialization Singleton constructor");
    }
    public static LazyInitializationSingleton getInstance() {
        if(instance==null) {
            instance =new LazyInitializationSingleton();
        }
        return instance;
    }

}