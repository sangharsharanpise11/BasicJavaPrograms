/**
 * created by :Sangharsha Ranpise.
 * Date :23/03/2019.
 * Purpose :Write a program to read in Stock Names, Number of Share, Share Price. Print a Stock Report with total 
 * value of each Stock and the total value of Stock.
*/
package Com.BridgeIt.ObjectOrientedPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class StockReport 
{
 public static void main(String[] args) throws IOException
 {
   Scanner scanner=new Scanner(System.in);
   String path=("/home/bridgelabz/Download/JavaPrograms/Stock.json");
   File file=new File(path);
   
   ObjectMapper mapper=new ObjectMapper();
   try
   {
	   JsonNode jsonnode=mapper.readTree(file);
	   JsonNode details=jsonnode.get("Stock");
	   System.out.println("Stock Report.....");
	   for(JsonNode node:details)
	   {
		   String name=node.path("Stock Name").asText();
		   int share=node.path("Number of Share").asInt();
		   int price=node.path("Share Price").asInt();	  
		   
		   System.out.println("Stock Names:"+name);
		   System.out.println("Number of Share:"+share);
		   System.out.println("Share Price:"+price);
		   System.out.println("total :"+share*price);
		   System.out.println();
	  }
   }
   catch(Exception e)
   {
	   e.printStackTrace();
   }
 }
}