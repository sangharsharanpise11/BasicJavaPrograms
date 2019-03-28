package Com.BridgeIt.DesignPattern.BehavioralDesignPatterns.ObserverPattern;

public class MyTopicSubscriber implements Observer 
{
    private String name;
   private  Subject topic;
   
	public MyTopicSubscriber(String name) 
	{
	 super();
	 this.name = name;
	}
	@Override
	public void update() 
	{
		String msg=(String)topic.getUpdate(this);
		if(msg==null)
		{
			System.out.println(name+" ::No new Message");
		}
		else
		{
			System.out.println(name+" ::Consuming message "+msg);
		}
	}

	@Override
	public void setSubject(Subject sub) 
	{
		this.topic=sub;
	}

}
