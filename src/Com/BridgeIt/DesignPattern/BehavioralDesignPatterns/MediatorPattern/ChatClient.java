/**
 * Created by :Sangharsha Ranpise.
 * Date :25/03/2019.
 * Purpose :BehavioralDesignPatterns(MediatorPattern)
 */
package Com.BridgeIt.DesignPattern.BehavioralDesignPatterns.MediatorPattern;

public class ChatClient
{
public static void main(String[] args)
{
	ChatMediator mediator=new ChatMediatorImpl();
    User user1=new UserImpl(mediator,"sangharsha");
    User user2=new UserImpl(mediator,"raviraj");
    User user3=new UserImpl(mediator,"priya");
    User user4=new UserImpl(mediator,"bodhi");
    mediator.addUser(user1);
    mediator.addUser(user2);
    mediator.addUser(user3);
    mediator.addUser(user4);
    user1.send("Hi All");
    
    
}
}
