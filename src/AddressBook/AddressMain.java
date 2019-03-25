package AddressBook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class AddressMain 
{
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
 {
	AddressMethodsInterface object=new AddressMethods();
	Scanner scanner=new Scanner(System.in);
    System.out.println("****************Welcome To AddressBook************************");
    System.out.println();
 
 do{  
   System.out.println("1.Create new AddressBook");
   System.out.println("2.Open AddressBook");
   System.out.println("3.Save AddressBook");
   System.out.println("4.Close AddressBook");
   System.out.println("5.Add Person In AddressBook");
   System.out.println("6.Delete Person In AddressBook");
   System.out.println("7.Edit Person In AddressBook");
   System.out.println("8.Save As");
   System.out.println("9.Quite Program");
   System.out.println("Enter Your choice :");
   int choice=scanner.nextInt();
   switch(choice)
   {
   case 1:
	   object.createFile();
	   break;
   case 2:
	   object.openFile();
	   break;
   case 3:
	   object.SaveAs();
	   break;
   case 4:
	   object.closeFile();
	   break;
   case 5:
	   System.out.println("enter file name :");
	   String name=scanner.next();
	   object.addPerson(name);
	   break;
   case 6:
	   object.DeletePerson();
	   break;
   case 7:
	   
	   object.EditPerson();
	   break;
   case 8:
	   
	   object.SaveAs();
	   break;
   case 9:
	   System.out.println("Program is Quite.....");
	   return;
   case 10:
	   BufferedWriter bw = new BufferedWriter(new FileWriter(new File("holi.txt")));
		for (int i = 0; i < AddressMethods.fileList.size(); i++) {
			bw.write(AddressMethods.fileList.get(i) + " ");
		}
		System.out.println("Program Quited!");
		return;
   }
 }while(true);
 }
}
