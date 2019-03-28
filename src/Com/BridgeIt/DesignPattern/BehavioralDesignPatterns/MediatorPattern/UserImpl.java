package Com.BridgeIt.DesignPattern.BehavioralDesignPatterns.MediatorPattern;

public class UserImpl extends User 
{
	UserImpl(ChatMediator med,String name)
	{
		super(med, name);
	}
	public void send(String msg)
	{
		System.out.println(this.name+" Sending message :"+msg);
	}
	public void receive(String msg)
	{
		System.out.println(this.name+" receiving message :"+msg);
	}
}
