package CliniqueManagement;

import java.io.File;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class ClincalMagServices 
{
public static void writeObjectToJson(List list,String fileName) 
{
Object[] arr =list.toArray();
ObjectMapper om=new ObjectMapper();
try 
{
  om.writeValue(new File(fileName), arr);
}
catch(Exception e) 
{
	e.printStackTrace();
}
}
}
