package Com.BridgeIt.DesignPattern.CreationalDesignPattern.SingletonPattern;


	public class ThreadSafeSingleton {
	    private static ThreadSafeSingleton instance;
	    private ThreadSafeSingleton() {
	        
	        System.out.println("In Thread safe Singleton constructor");
	    }
	    //double Checked locking principle
	    public static ThreadSafeSingleton getInstance() {
	        if(instance==null) {
	            synchronized (ThreadSafeSingleton.class) {
	                if(instance==null) {
	                    instance=new ThreadSafeSingleton();
	                }
	            }
	        }
	        return instance;
	    }

	}
		
	

