package Com.BridgeIt.DesignPattern.CreationalDesignPattern.SingletonPattern;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private SerializedSingleton() {
        System.out.println("In Serialized Singleton constructor");
    }
    private static class SingletonHelper{
        private static final SerializedSingleton instance=new SerializedSingleton();
    }
    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

}