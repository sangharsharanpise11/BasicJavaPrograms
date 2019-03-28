/**
 * Created by :Sangharsha Ranpise.
 * Date :25/03/2019.
 * Purpose :StructuralDesignPatterns(FascadePattern)
 */
package Com.BridgeIt.DesignPattern.StructuralDesignPatterns.FascadePattern;

public class FacadeMain 
{
    public static void main(String[] args)
    {
        ShapeMaker maker=new ShapeMaker();
        maker.drawCircle();
        maker.drawRectangle();
        maker.drawSquare();
    }

}

