package Com.BridgeIt.DesignPattern.BehavioralDesignPatterns.VisitorPattern;


public interface ItemElement 
{
	public int accept(ShoppingCartVisitor visitor);
}
