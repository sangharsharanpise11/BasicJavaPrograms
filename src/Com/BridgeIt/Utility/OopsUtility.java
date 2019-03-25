/**
 * created by:Sangharsha Ranpise.
 * Date :23/03/2019.
 * Purpose :this utility class for Object oriented programming.
 */
package Com.BridgeIt.Utility;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import CliniqueManagement.Doctor;

public class OopsUtility 
{
	
	/**
	 * this method is used for convert java object to json object.
	 * @param list
	 * @param filename
	 */
 private static ObjectMapper mapper;
 static
   {
	   mapper=new ObjectMapper();
   }
   public static String convertJavaToJson(Object object)
   {
	   String jsonResult=" ";
	   try 
	    {
			jsonResult=mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) 
	    {
			System.out.println("error is occured while converting java object to json..."+e.getMessage());
		} catch (JsonMappingException e)
	    {
			System.out.println("error is occured while converting java object to json..."+e.getMessage());
		} catch (IOException e) 
	   {
			System.out.println("error is occured while converting java object to json..."+e.getMessage());
		}

	   return jsonResult;
   }
/**********************************************************************************************************************/
   /**
    * this method is used for getting String input from user.
    * @return that String.
    */
   public static String singleStringInput()
{
	Scanner scanner=new Scanner(System.in);
	return scanner.next();
}
/************************************************************************************************************************/
/**
 * this method is used for getting integer input from user.
 * @return that value.
 */
public static int IntegerInput()
{
	Scanner scanner=new Scanner(System.in);
	return scanner.nextInt();

}
 
/************************************************************************************************************************/
/**
 * this method is used for write java object to json object.
 * @param list
 * @param filename
 */
private static ObjectMapper mapper1;
static
  {
	   mapper=new ObjectMapper();
  }
  public static String convertJavaToJson(Object object, String path)
  {
	   String jsonResult=" ";
	   try 
	    {
			jsonResult=mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) 
	    {
			System.out.println("error is occured while converting java object to json..."+e.getMessage());
		} catch (JsonMappingException e)
	    {
			System.out.println("error is occured while converting java object to json..."+e.getMessage());
		} catch (IOException e) 
	   {
			System.out.println("error is occured while converting java object to json..."+e.getMessage());
		}

	   return jsonResult;
  }
/****************************************************************************************************************/
/**
 * this method is used for write java object to json object.
 * @param list
 * @param filename
 */
  public static void writeObjectToJson(List list, String filename) 
{
   	 Object[] arr= list.toArray();
   	 ObjectMapper om = new ObjectMapper();
   	 try {
   		 om.writeValue(new File(filename), arr);
   	 }
   	 catch(Exception e) {
   		 e.printStackTrace();
   	 }
    }
	
}




