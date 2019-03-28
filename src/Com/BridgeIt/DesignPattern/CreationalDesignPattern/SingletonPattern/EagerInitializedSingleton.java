package Com.BridgeIt.DesignPattern.CreationalDesignPattern.SingletonPattern;

public class EagerInitializedSingleton {
    private EagerInitializedSingleton() {
        System.out.println("In Eager Initialized Singleton constructor");
    }
    private static final EagerInitializedSingleton instance=new EagerInitializedSingleton();
    
    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}