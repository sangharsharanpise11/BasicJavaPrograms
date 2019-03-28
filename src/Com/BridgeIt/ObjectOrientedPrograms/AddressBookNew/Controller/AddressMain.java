package Com.BridgeIt.ObjectOrientedPrograms.AddressBookNew.Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import Com.BridgeIt.ObjectOrientedPrograms.AddressBook.Address;
import Com.BridgeIt.ObjectOrientedPrograms.AddressBookNew.Services.AddressInterfaces;
import Com.BridgeIt.ObjectOrientedPrograms.AddressBookNew.Services.AddressMethod;

public class AddressMain 
{

 public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
 {
	Scanner scanner = new Scanner(System.in);
	AddressInterfaces implObj = new AddressMethod();
    (implObj).LoadFileName();
			do {
				System.out.println("1.Create");
				System.out.println("2.Open");
				System.out.println("3.Save");
				System.out.println("4.Close");
				System.out.println("5.Add a Person");
				System.out.println("6.Delete a Person");
				System.out.println("7.Edit a Person");
				System.out.println("8.Save as");
				System.out.println("9.Quit Program");
				System.out.println("Enter the Choice:=");
				int ch = scanner.nextInt();
				switch (ch)
				{
				// Case 1 to create a File.
				case 1:
					implObj.CreateFile();
					break;
				// Case 2 to create a OpenFile.
				case 2:
					implObj.OpenFile();
					break;
				// Case 3 to create a SaveFile.
				case 3:
					implObj.Savefile();
					System.out.println("File is Saved!");
					break;
				// Case 4 to create a closeFile.
				case 4:
					implObj.Closefile();
					break;
				// Case 5 Enter the file name.
				case 5:
					System.out.println("Enter the File Name:=>");
					String fileName = scanner.next();
					implObj.AddPerson(fileName);
					break;
				// Case 6 To Delete the Person.
				case 6:
					implObj.DeletePerson();
					System.out.println("Person is Deleted!");
					break;
				// Case 7 To Edit the Person.
				case 7:
					implObj.EditPerson();
					break;
				case 8:
					implObj.SaveAs();
					break;
				case 9:
	                // To Write the file
					BufferedWriter bw = new BufferedWriter(new FileWriter(new File("AddressFile.txt")));
					for (int i = 0; i < AddressMethod.fileList.size(); i++)
					{
						bw.write(AddressMethod.fileList.get(i) + " ");
					}
					System.out.println("Program Quited!");
					return;

				}
			} while (true);

		}

	}

