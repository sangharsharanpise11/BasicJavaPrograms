/**
 * Created by :Sangharsha Ranpise.
 * Date :25/03/2019.
 * Purpose :StructuralDesignPatterns(AdapterPattern)
 */
package Com.BridgeIt.DesignPattern.StructuralDesignPatterns.AdapterPattern;

public class AdapterPatternDemo 
{

	public static void main(String[] args) {
		CreditCard targetInterface=new BankCustomer();  
		targetInterface.giveBankDetails();  
		System.out.print(targetInterface.getCreditCard());  
	}
}