package Com.BridgeIt.DesignPattern.CreationalDesignPattern.SingletonPattern;


	public class StaticBlockSingleton {

	    private StaticBlockSingleton() {
	        System.out.println("In Static Block Singleton constructor");
	    }
	    private static StaticBlockSingleton instance;
	    static {
	        try {
	            instance=new StaticBlockSingleton();
	        }catch (Exception e) {
	            throw new RuntimeException("Exception Occured in creating singleton instance");
	        }
	    }
	    public static StaticBlockSingleton getInstance() {
	        return instance;
	    }
	    @Override
	    public String toString() 
	    {
	        return "StaticBlockSingleton [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
	                + super.toString() + "]";
	    }
	}

	

