package Com.BridgeIt.DesignPattern.BehavioralDesignPatterns.VisitorPattern;
public interface ShoppingCartVisitor
{
	int visit(Book book);
	int visit(Fruit fruit);
}

