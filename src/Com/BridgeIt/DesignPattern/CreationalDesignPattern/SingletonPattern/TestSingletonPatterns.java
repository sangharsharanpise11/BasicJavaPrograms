/**
 * Created by :Sangharsha Ranpise.
 * Date :25/03/2019.
 * Purpose :Creational Design Pattern(SingletonPattern)
 */
package Com.BridgeIt.DesignPattern.CreationalDesignPattern.SingletonPattern;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;

public class TestSingletonPatterns {
static EagerInitializedSingleton eager;
static StaticBlockSingleton staticBlock;
static LazyInitializationSingleton lazy;
static BillPughSingleton billPugh;
static ThreadSafeSingleton thread;
static EnumSingleton enumSngltn;
static SerializedSingleton serializ;
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        System.out.println("********************Test Singleton Patterns***********************");
        eager=EagerInitializedSingleton.getInstance();
        System.out.println("Eager instance hashcode: "+eager.hashCode());
        eager=EagerInitializedSingleton.getInstance();
        System.out.println("Eager instance hashcode: "+eager.hashCode());
        System.out.println("--------------------------------------------");
        staticBlock=StaticBlockSingleton.getInstance();
        System.out.println("Static Block instance hashcode: "+staticBlock.hashCode());
        staticBlock=StaticBlockSingleton.getInstance();
        System.out.println("Static Block instance hashcode: "+staticBlock.hashCode());
        System.out.println("--------------------------------------------");
        lazy=LazyInitializationSingleton.getInstance();
        System.out.println("Lazy  instance hashcode: "+lazy.hashCode());
        lazy=LazyInitializationSingleton.getInstance();
        System.out.println("Lazy  instance hashcode: "+lazy.hashCode());
        System.out.println("--------------------------------------------");
        thread=ThreadSafeSingleton.getInstance();
        System.out.println("Thread Safe instance hashcode: "+thread.hashCode());
        thread=ThreadSafeSingleton.getInstance();
        System.out.println("Thread Safe instance hashcode: "+thread.hashCode());
        System.out.println("--------------------------------------------");
        billPugh=BillPughSingleton.getInstance();
        System.out.println("Bill pugh instance hashcode: "+thread.hashCode());
        billPugh=BillPughSingleton.getInstance();
        System.out.println("Bill pugh instance hashcode: "+thread.hashCode());
        System.out.println("--------------------------------------------");
         System.out.println("Using Reflection to destroy Singleton Pattern\n"+eager.hashCode());
         EagerInitializedSingleton instanceTwo = null;
            try {
                Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
                for (Constructor constructor : constructors) {
                    //Below code will destroy the singleton pattern
                    constructor.setAccessible(true);
                    instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                   break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Eager instance hashcode: "+eager.hashCode());
            System.out.println("Eager instance hashcode: "+instanceTwo.hashCode());
            System.out.println("--------------------------------------------");
            enumSngltn=EnumSingleton.INSTANCE;
            System.out.println("Enum instance hashcode "+enumSngltn.hashCode());
            enumSngltn=EnumSingleton.INSTANCE;
            System.out.println("Enum instance hashcode "+enumSngltn.hashCode());
            enumSngltn=EnumSingleton.START;
            System.out.println("Enum start hashcode "+enumSngltn.hashCode());
            enumSngltn=EnumSingleton.START;
            System.out.println("Enum start hashcode "+enumSngltn.hashCode());
            enumSngltn.doSomething();
            System.out.println("--------------------------------------------");
            serializ=SerializedSingleton.getInstance();
            System.out.println("Serialization instance hashcode "+serializ.hashCode());
            serializ=SerializedSingleton.getInstance();
            System.out.println("Serialization instance hashcode "+serializ.hashCode());
            System.out.println("--------------------------------------------");
           /* SerializedSingleton instanceOne = SerializedSingleton.getInstance();
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                    "filename.ser"));
            out.writeObject(instanceOne);
            out.close();
            
            //deserailize from file to object
            ObjectInput in = new ObjectInputStream(new FileInputStream(
                    "filename.ser"));
            SerializedSingleton instanceTo = (SerializedSingleton) in.readObject();
            in.close();
            
            System.out.println("instanceOne hashCode="+instanceOne.hashCode());
            System.out.println("instanceTwo hashCode="+instanceTo.hashCode());
        */
    }
    

}





