/**
 * Created By:Sangharsha Ranpise.
 * Date :29/03/2019.
 * Purpose :CustomAnnotations.
 */
package Com.BridgeIt.DesignPattern.CustomAnnotations;

//Creating annotation  
import java.lang.annotation.*;  
import java.lang.reflect.*;  

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@Inherited
@interface MyAnnotation
{  
  int value();  
}  

//Applying annotation  
class Hello
{  
 @MyAnnotation(value=10)  
 public void sayHello()
 {
	 System.out.println("hello annotation");
 }  
}  


class hi extends Hello
{
	public void sayHello()
	 {
		 System.out.println("hello annotation");
	 } 
}
//Accessing annotation  
class TestCustomAnnotation
{  
public static void main(String args[])throws Exception
{  

  Hello h=new Hello();  
  Method m=h.getClass().getMethod("sayHello"); 
  MyAnnotation manno=m.getAnnotation(MyAnnotation.class);  
  System.out.println("value is: "+manno.value()); 
  hi obj=new hi();
  Method n=h.getClass().getMethod("sayHello");
}
}  
