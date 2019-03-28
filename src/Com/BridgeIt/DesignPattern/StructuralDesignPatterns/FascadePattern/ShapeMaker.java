package Com.BridgeIt.DesignPattern.StructuralDesignPatterns.FascadePattern;

public class ShapeMaker 
{
	    private Shape rectangle;
	    private Shape circle;
	    private Shape square;
	    
	    public ShapeMaker()
	    {
	        rectangle= new Rectangle();
	        circle= new Circle();
	        square= new Square();
	        
	    }
	    public void drawRectangle()
	    {
	        rectangle.draw();
	    }
	    public void drawCircle()
	    {
	        circle.draw();
	    }
	    public void drawSquare()
	    {
	        square.draw();
	    }
	    

	}


