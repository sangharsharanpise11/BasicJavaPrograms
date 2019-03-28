package Com.BridgeIt.DesignPattern.CreationalDesignPattern.SingletonPattern;

public enum EnumSingleton {
    INSTANCE,START;
    public static void doSomething() {
        System.out.println("In Enum Singleton doSomething");
    }
    
    EnumSingleton() {
        System.out.println("In Enum Singleton Constructor");
    }
}

