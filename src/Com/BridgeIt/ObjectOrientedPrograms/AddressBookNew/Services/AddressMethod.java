package Com.BridgeIt.ObjectOrientedPrograms.AddressBookNew.Services;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;



import Com.BridgeIt.ObjectOrientedPrograms.AddressBookNew.Model.Person;
import Com.BridgeIt.Utility.OopsUtility;

public class AddressMethod implements AddressInterfaces
{
	Scanner scanner = new Scanner(System.in);
	int personListIndex = 0;
	ObjectMapper objectMapper = new ObjectMapper();
	public static List<String> fileList = new ArrayList<>();
	List<Person> personArrayList = new ArrayList<>();
	ObjectMapper mapper = new ObjectMapper();

	@Override
	public void LoadFileName()
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("holi.txt")));
			String temp;
			while ((temp = br.readLine()) != null) 
			{
				String tm[] = temp.split(" ");
				for (int i = 0; i < tm.length; i++)
				{
					fileList.add(tm[i]);
				}
			}
			System.out.println(fileList);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void CreateFile() 
	{
		System.out.println("Enter the File Name:=>");
		String fileName = scanner.next();
		String path = fileName + ".json";
		try
		{
			File file = new File(path);
			boolean created = file.createNewFile();
			if (created) 
			{
				System.out.println("File has been created successfully");
			} else 
			{
				System.out.println("File already present at the specified location");
			}
		} catch (IOException e) 
		{
			System.out.println("Exception Occurred:");
			e.printStackTrace();
		}
		fileList.add(fileName);
	}

	@Override
	public void AddPerson(String fileName) throws JsonParseException, JsonMappingException, IOException 
	{

		File personFileObject = new File(fileName + ".json");
		if (personFileObject.length() == 0)
		{
			Person p = new Person();
			System.out.println("Enter the Name:=>");
			p.setName(scanner.next());
			// setting address of a person
			System.out.println("Enter the Address:=>");
			p.setAddress(scanner.next());
			// setting phone number of a person
			System.out.println("Enter the phone Number:=>");
			p.setPhnumber(scanner.next());
			System.out.println("Person details:=>");
			System.out.println(p);
			// ArrayList personArrayList = new ArrayList();
			personArrayList.add(p);
			// JsonUtil.writeObjectToJson(personArrayList, fileName+".json");
			System.out.println(personArrayList);
		} 
		else
		{
			List<Person> personFileList = objectMapper.readValue(personFileObject, new TypeReference<List<Person>>(){});
           //personArrayList.add((Person) personFileList);
			personArrayList.addAll(personFileList);
			Person p = new Person();
			System.out.println("Enter the Name:=>");
			p.setName(scanner.next());
			// setting address of a person
			System.out.println("Enter the Address:=>");
			p.setAddress(scanner.next());
			// setting phone number of a person
			System.out.println("Enter the phone Number:=>");
			p.setPhnumber(scanner.next());
			System.out.println("Person details:=>");
			System.out.println(p);
			personArrayList.add(p);
			System.out.println(personArrayList);
		}
	}

	@Override
	public void Savefile() 
	{
		System.out.println("Saving the file");
		System.out.println("Saving the Person");
		System.out.println("Enter the File name to Save:=>");
		String fileName = scanner.next();
		System.out.println(personArrayList);
		OopsUtility.writeObjectToJson(personArrayList, fileName + ".json");
		personArrayList.clear();
	}

	@Override
	public void OpenFile() throws JsonParseException, JsonMappingException, IOException 
	{
		System.out.println("Opening the file");

		System.out.println(fileList);
		System.out.println("Enter File Name to open:=>");
		String fileName = scanner.next();
		fileName = fileName + ".json";
		File personFileObject = new File(fileName);
		List<Person> fileList = objectMapper.readValue(personFileObject, new TypeReference<List<Person>>() {});
		System.out.println("File is Opened!");
		System.out.println(fileList.size() + " Persons are There!");
		for (int i = 0; i < fileList.size(); i++)
		{
			System.out.println(fileList.get(i));
		}
	}

	@Override
	public void Closefile() 
	{
		System.out.println("Closing the file");
	}

	@Override
	public void EditPerson() throws JsonParseException, JsonMappingException, IOException 
	{
		System.out.println("Editting Person ");
		System.out.println("Enter File Name From Which person has to be Edited:=>");
		String fileName = scanner.next();
		fileName = fileName + ".json";
		File personFileObject = new File(fileName);
		if (personFileObject.length() == 0) {
			System.out.println("File is Empty!");
		} 
		else 
		{
			System.out.println("Enter Name of Person to be Edited");
			String name = scanner.next();
			List<Person> personFileList = objectMapper.readValue(personFileObject, new TypeReference<List<Person>>() {});
			personArrayList.addAll(personFileList);
			System.out.println(personArrayList);
			for (int i = 0; i < personArrayList.size(); i++) {
				if (name.equals(((Person) personArrayList.get(i)).getName())) {
					System.out.println("1.Name");
					System.out.println("2.Address");
					System.out.println("3.Phone Number");
					System.out.println("Enter Choice What You Have to Edit?");
					int ch = scanner.nextInt();
					switch (ch) {
					case 1:
						System.out.println("Enter Name to Replace:=>");
						String nameToReplace = scanner.next();
						personArrayList.get(i).setName(nameToReplace);
						break;
					case 2:
						System.out.println("Enter Address to Replace:=>");
						String addressToReplace = scanner.next();
						personArrayList.get(i).setAddress(addressToReplace);
						break;
					case 3:
						System.out.println("Enter Address to Replace:=>");
						String phNumberToReplace = scanner.next();
						personArrayList.get(i).setPhnumber(phNumberToReplace);
						break;
					}
					break;
				} else {
					System.out.println("Person Not Found!");
				}
			}

		}

	}

	@Override

	public void SaveAs() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter the File Name:=>");
		String fileName = scanner.next();
		String path = fileName + ".txt";
		boolean created = false;
		try {
			File personTextFileObject = new File(path);
			created = personTextFileObject.createNewFile();
		} catch (IOException e) {
			System.out.println("Exception Occurred:");
			e.printStackTrace();
		}
		if (created)
		try 
		{
				{
					fileList.add(fileName);
					File personJsonFileObject = new File(fileName + ".json");
					List<Person> personFileList = objectMapper.readValue(personJsonFileObject,new TypeReference<List<Person>>(){});
					OopsUtility.writeObjectToJson(personFileList, path);
					System.out.println("File has been created successfully");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else {
			System.out.println("File already present at the specified location");
		}

	}

	@Override
	public void DeletePerson() throws JsonParseException, JsonMappingException, IOException 
	{
		System.out.println("Enter the Person to delete");
		String fileName = scanner.next();
		String path = fileName + ".json";
		File personObject = new File(path);
		if (personObject.length() == 0)
		{
			System.out.println("file is empty");
		}
		else 
		{
			personArrayList.clear();
			personArrayList = objectMapper.readValue(personObject, new TypeReference<List<Person>>() 
			{
			});
			System.out.println("Enter the patient to delete");
			String name = scanner.next();
			for (int i = 0; i < personArrayList.size(); i++)
			{
				if (name.equals(((Person) personArrayList.get(i)).getName())) 
				{

					personArrayList.remove(i);
					break;
				}
			}
			OopsUtility.writeObjectToJson(personArrayList, fileName + ".json");

		}
	}

}