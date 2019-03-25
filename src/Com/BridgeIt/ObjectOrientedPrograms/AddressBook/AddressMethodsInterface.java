package AddressBook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import Com.BridgeIt.Utility.OopsUtility;

interface AddressMethodsInterface
{
  public void createFile(); 
  public void addPerson(String name) throws JsonParseException, JsonMappingException, IOException;
  public void openFile() throws JsonParseException, JsonMappingException, IOException;
  public void saveFile();
  public void closeFile();
  public void EditPerson() throws JsonParseException, JsonMappingException, IOException;
  public void SaveAs();
  public void DeletePerson() throws JsonParseException, JsonMappingException, IOException;
}
class AddressMethods implements AddressMethodsInterface
{
    int personListIndex=0;
	ObjectMapper objectMapper=new ObjectMapper();
	static List<String>fileList=new ArrayList<>();
	List<Person>personArrayList=new ArrayList<>();
    ObjectMapper mapper=new ObjectMapper();
    
	public void createFile()
	{
	System.out.println("Enter File Name :"); 
    String fileName=OopsUtility.singleStringInput();
    String path=fileName+".json";
      try 
      {
    	 File file=new File(path);
    	 boolean created=file.createNewFile();
    	 if(created)
    	 {
    		System.out.println("File is Created...");
    	 }
    	 else
    	 {
    		System.out.println("File already present at specified Location...");
    	 }
      }
     catch(Exception e)
     {
    	e.printStackTrace();
     }
     fileList.add(fileName);
	 }

	@Override
	public void addPerson(String fileName) throws JsonParseException, JsonMappingException, IOException 
	{
		File personFileObject=new File(fileName +".json");
		if(personFileObject.length()==0)
		{
			Person person=new Person();
			System.out.println("Enter Person Name:");
			person.setName(OopsUtility.singleStringInput());
			System.out.println("Enter Person Address:");
			person.setAddress(OopsUtility.singleStringInput());
			System.out.println("Enter Phone Number :");
			person.setPhoneNumber(OopsUtility.singleStringInput());
			System.out.println("Person Details :");
			System.out.println(person);
		}
		else
		{
			List<Person>personFileList=mapper.readValue(personFileObject,new TypeReference<List<Person>>() {});
			personArrayList.addAll(personFileList);
			Person person=new Person();
			System.out.println("Enter Person Name:");
			person.setName(OopsUtility.singleStringInput());
			System.out.println("Enter Person Address:");
			person.setAddress(OopsUtility.singleStringInput());
			System.out.println("Enter Phone Number :");
			person.setPhoneNumber(OopsUtility.singleStringInput());
			System.out.println("Person Details :");
			System.out.println(person);
			personArrayList.add(person);
			
		}
	}

	@Override
	public void openFile() throws JsonParseException, JsonMappingException, IOException 
	{
		System.out.println("File is opened ");
		System.out.println(fileList);
		System.out.println("Enter file Name to Open :");
		String fileName=OopsUtility.singleStringInput();
		fileName=fileName+".json";
		File personFileObject=new File(fileName);
		
		List<Person>fileList=mapper.readValue(personFileObject,new TypeReference<List<Person>>() {});
		System.out.println("File is Opened...");
		System.out.println(fileList.size()+"Person are there...");
		for(int i=0;i<fileList.size();i++)
		{
			System.out.println(fileList.get(i));
		}
	}

	@Override
	public void saveFile() 
	{
		System.out.println("file saving..");
		System.out.println("Saving the Person :");
		System.out.println("Enter FileName to Save :");
		String fileName=OopsUtility.singleStringInput();
		System.out.println(personArrayList);
		OopsUtility.convertJavaToJson(personArrayList, fileName+".json");
		personArrayList.clear();
	}

	@Override
	public void closeFile() 
	{
		System.out.println("Closing  file");
    }

	@Override
	public void EditPerson() throws JsonParseException, JsonMappingException, IOException
	{
	 System.out.println("Editing Person");
	 System.out.println("Enter FileName from Which personhas to be edited");
	 String fileName=OopsUtility.singleStringInput();
	 fileName=fileName+".json";
	 File personFileObject=new File(fileName);
	 if(personFileObject.length()==0)
	 {
		 System.out.println("File is Empty...");
	 }
	 else
	 {
		 System.out.println("Enter Name of person to be edited");
		 String name=OopsUtility.singleStringInput();
		 List<Person>personFileList=mapper.readValue(personFileObject,new TypeReference<List<Person>>() {});
		 personArrayList.addAll(personFileList);
		 System.out.println(personArrayList);
		 for(int i=0;i<personArrayList.size();i++)
		 {
			 if((name.equals(((Person)personArrayList.get(i)).getName())))
			 {
				 System.out.println("1.Name");
				 System.out.println("2.Address");
				 System.out.println("3.Phone Number");
				 System.out.println("4.Enter choice what you have to edit");
				 int choice=OopsUtility.IntegerInput();
				 switch(choice)
				 {
				 case 1:
					 System.out.println("Enter Name to Replace :");
					 String nameToReplace=OopsUtility.singleStringInput();
					 personArrayList.get(i).setName(nameToReplace);
					 break;
				 case 2:
					 System.out.println("Enter Address to Replace :");
					 String addressToReplace=OopsUtility.singleStringInput();
					 personArrayList.get(i).setName(addressToReplace);
					 break;
				 case 3:
					 System.out.println("Enter Phone Number to Replace :");
					 String phoneNumberToReplace=OopsUtility.singleStringInput();
					 personArrayList.get(i).setName(phoneNumberToReplace);
					 break;
				 }break;
			 }
			 else
			 {
				 System.out.println("Person not Found...");
			 }
		 }
	 }
    }

	@Override
	public void SaveAs() 
	{
	 System.out.println("Enter File Name :");
     String fileName=OopsUtility.singleStringInput();
     String path=fileName+".txt";
     boolean created=false;
     try
     {
    	 File personTextFileobject =new File(path);
    	 
     }
     catch(Exception e)
     {
    	 e.printStackTrace();
     }
     if(created)
     {
    	 try 
    	 {
    		 fileList.add(fileName);
    	     File personjsonFileObject=new File(fileName+".json");
    	     List<Person>personFileList=mapper.readValue(personjsonFileObject,new TypeReference<List<Person>>() {});
    	     OopsUtility.convertJavaToJson(personjsonFileObject,path);
    	     System.out.println("File Successfully created...");
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     else
     {
    	 System.out.println("File already present at specified Locetion");
     }
	}

	@Override
	public void DeletePerson() throws JsonParseException, JsonMappingException, IOException 
	{
		System.out.println("enter person to delete :");
		String fileName=OopsUtility.singleStringInput();
		String path=fileName+".json";
		File personObject=new File(path);
		if(personObject.length()==0)
		{
			System.out.println("File is Empty...");
		}
		else
		{
			personArrayList.clear();
			personArrayList=mapper.readValue(personObject,new TypeReference<List<Person>>(){});
			{
			  System.out.println("enter the patient to delete");
			  String name=OopsUtility.singleStringInput();
			  for(int i=0;i<personArrayList.size();i++)
			  {
				  if((name.equals(((Person)personArrayList.get(i)).getName())))
				 
						  {
					        personArrayList.remove(i);
					        break;
						  }
			  }
			}
		}
		
	}

	
}
