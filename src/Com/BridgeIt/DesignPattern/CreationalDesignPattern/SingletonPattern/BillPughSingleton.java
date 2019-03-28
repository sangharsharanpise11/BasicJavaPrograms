package Com.BridgeIt.DesignPattern.CreationalDesignPattern.SingletonPattern;

//import Com.BridgeIt.DesignPattern.CreationalDesignPattern.SingletonPattern.BillPughSingleton.SingletonHelper;

//public class BillPughSingleton
//{
//	private BillPughSingleton () {}
//	private static class SingletonHelper{
//		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
//	}
//	public static BillPughSingleton getInstance() {
//		return SingletonHelper.INSTANCE;
//	}
//	@Override
//	public int hashCode() {
//		return super.hashCode();
//	}
//	
//}
public class BillPughSingleton {
    private BillPughSingleton() {
        System.out.println("In Bill Pugh Singleton constructor");
    }
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE=new BillPughSingleton();
    }
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

}
