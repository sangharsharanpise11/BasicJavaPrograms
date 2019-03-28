/**
 * created by:Sangharsha Ranpise.
 * Date :23/03/2019.
 * Purpose :
 */
package Com.BridgeIt.ObjectOrientedPrograms.CliniqueManagement;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeBindings;
import org.codehaus.jackson.type.TypeReference;
import org.w3c.dom.ls.LSInput;

import Com.BridgeIt.Utility.OopsUtility;
public  class ClincalManagementMethods implements IClincalManagement
{
int personListIndex=0;
ObjectMapper objectMapper=new ObjectMapper();
List<String> filelist=new ArrayList<>();
List<Patient> patientArrayList=new ArrayList<>();
List<Doctor> doctorpatientArray=new ArrayList<>();
List<Appointment>appointmentArray=new ArrayList<>();

public void addDoctor(String fileName) throws JsonParseException, JsonMappingException, IOException
{
	File doctorFileObject=new File(fileName+".json");
	if(doctorFileObject.length()==0) 
	{
		Doctor doc=new Doctor();
		System.out.println("Enter the Name==>");
		doc.setName(OopsUtility.singleStringInput());
		System.out.println("Enter the id==>");
		doc.setId(OopsUtility.singleStringInput());
		System.out.println("Enter the Specialization==>");
		doc.setSpecialization(OopsUtility.singleStringInput());
		System.out.println("Enter the Availability==>");
		doc.setAvailability(OopsUtility.singleStringInput());
		System.out.println(doc);
		doctorpatientArray.add(doc);
		
	}
	else {
		List<Doctor> doctorFileList=objectMapper.readValue(doctorFileObject, new TypeReference<List<Doctor>>() {});	
		doctorFileList.addAll(doctorFileList);
		Doctor doc=new Doctor();
		System.out.println("Enter the Name==>");
		doc.setName(OopsUtility.singleStringInput());
		System.out.println("Enter the id==>");
		doc.setId(OopsUtility.singleStringInput());
		System.out.println("Enter the Specialization==>");
		doc.setSpecialization(OopsUtility.singleStringInput());
		System.out.println("Enter the Availability==>");
		doc.setAvailability(OopsUtility.singleStringInput());
		System.out.println(doc);
		doctorpatientArray.add(doc);
	}
	}
public void addPatient(String fileName) throws JsonParseException, JsonMappingException, IOException {
	File patientFileObject=new File(fileName+".json");
	if(patientFileObject.length()==0) {
		Patient pat=new Patient();
		System.out.println("Enter the Name==>");
		pat.setName(OopsUtility.singleStringInput());
		System.out.println("Enter the id==>");
		pat.setId(OopsUtility.singleStringInput());
		System.out.println("Enter the PhoneNumber==>");
		pat.setPhNumber(OopsUtility.singleStringInput());
		
		System.out.println(pat);
		patientArrayList.add(pat);
		
	}
	
	else {
		List<Patient> patientFileList=objectMapper.readValue(patientFileObject, new TypeReference<List<Patient>>() {});	
		patientFileList.addAll(patientFileList);
		Patient pat=new Patient();
		System.out.println("Enter the Name==>");
		pat.setName(OopsUtility.singleStringInput());
		System.out.println("Enter the id==>");
		pat.setId(OopsUtility.singleStringInput());
		System.out.println("Enter the PhoneNumber==>");
		pat.setPhNumber(OopsUtility.singleStringInput());
	
		System.out.println(pat);
		patientArrayList.add(pat);
}
}

public void deleteDoctor() throws JsonParseException, JsonMappingException, IOException {
	System.out.println("Enter File Name From Which person has to be Deleted:=>");
	String fileName = OopsUtility.singleStringInput();
	String path = fileName + ".json";
	File doctorFileObject = new File(path);
	if (doctorFileObject.length() == 0) 
	{
		System.out.println("File is Empty!");
	} 
	else 
	{
		
//		 List<Person> personFileList
		doctorpatientArray.clear();
		doctorpatientArray= objectMapper.readValue(doctorFileObject, new TypeReference<List<Doctor>>() {});
		System.out.println("Enter Name of Doctor to be deleted");
		String name = OopsUtility.singleStringInput();
		for (int i = 0; i < doctorpatientArray.size(); i++) 
		{
			if (name.equals(((Doctor) doctorpatientArray.get(i)).getName())) 
			{
				doctorpatientArray.remove(i);
				break;
			}
		}
		ClincalMagServices.writeObjectToJson(doctorpatientArray, fileName + ".json");
	}
}
public void deletePatient() throws JsonParseException, JsonMappingException, IOException {
	System.out.println("Enter File Name Form Which patient has to be Deleted:==>");
	String fileName=OopsUtility.singleStringInput();
	String path=fileName+".json";
	File patientFileObject=new File(path);
	if(patientFileObject.length()==0)
	{
		System.out.println("file is empty");
	}
	else {
		patientArrayList.clear();
		patientArrayList=objectMapper.readValue(patientFileObject, new TypeReference<List<Doctor>>() {});
		System.out.println("Enter Name of Patient to be deleted");
		String name=OopsUtility.singleStringInput();
		for(int i=0;i<patientArrayList.size();i++) {
			if(name.equals(((Patient)patientArrayList.get(i)).getName())) {
				patientArrayList.remove(i);
				break;
			}
		}
		ClincalMagServices.writeObjectToJson(patientArrayList, fileName+".json");
	}
}
public void displayDoctors() throws JsonParseException, JsonMappingException, IOException {
	System.out.println("Enter the File Name from which has to be display:=>");
	String fileName = OopsUtility.singleStringInput();
	String path = fileName+".json";
	File doctorFileObject = new File(path);
	if(doctorFileObject.length()==0)
	{
		System.out.println("File is Empty");
	}
	else
	{
		doctorpatientArray.clear();
		List doctorFileList = objectMapper.readValue(doctorFileObject, new TypeReference<List<Doctor>>() {});
		doctorpatientArray.addAll(doctorFileList);
		for(int i=0;i<doctorpatientArray.size();i++)
		{
			System.out.println(doctorpatientArray.get(i));
		}
	}
}
public void displayPatients() throws JsonParseException, JsonMappingException, IOException {
	System.out.println("Enter the File Name which has to be displayed:=>");
	String fileName=OopsUtility.singleStringInput();
	String path=fileName+".json";
	File patientFileObject=new File(path);
	if(patientFileObject.length()==0) {
		System.out.println("File is Empty");
	}
	else {
		patientArrayList.clear();
		List patientFileList=objectMapper.readValue(patientFileObject, new TypeReference<List<Patient>>() {});
       patientArrayList.addAll(patientFileList); 	
	}
}

public void display() throws JsonParseException, JsonMappingException, IOException {
	System.out.println("1.Display Doctor");
	System.out.println("2.Display Patient");
	int ch=OopsUtility.IntegerInput();
	switch(ch) {
	case 1:
		System.out.println("Displaying Doctor");
		displayDoctors();
		break;
	case 2:
		System.out.println("Dispalying Patient");
		displayPatients();
		break;
	default:
		System.out.println("Invalid Input");
		return;
	}
	
}
public void add() throws JsonParseException, JsonMappingException, IOException {
	System.out.println("1.Add Doctor");
	System.out.println("2.Add Patient");
	System.out.println("3.Delete Doctor");
	System.out.println("4.Delete Patient");
	System.out.println("5.Edit Doctor");
	System.out.println("6.Edit Patient");
	System.out.println("7.To get at main menu");
	System.out.println("Enter the Choice:=>");
	int ch = OopsUtility.IntegerInput();
	switch(ch)
	{
	 	case 1:
	 			System.out.println("Enter the File Name:=>");
	 			String doctorFileName = OopsUtility.singleStringInput();
	 			addDoctor(doctorFileName);
	 			break;
	 	case 2:
	 			System.out.println("Enter the File Name:=>");
	 			String patientFileName = OopsUtility.singleStringInput();
	 			addPatient(patientFileName);
 				break;
	 	case 3:
	 	        deleteDoctor();
 				System.out.println("Doctor is Deleted");
 				break;
	 	case 4:
	 		deletePatient();
	 			System.out.println("Patient is Deleted");
	 			break;
	 	case 5:
	 		editDoctor();
 				System.out.println("Doctor is edited");
 				break;
	 	case 6:
	 		editPatient();
	 			System.out.println("Patient is edited");
	 			break;
	 	case 7:
	 			return;}
	}
public void search() throws JsonParseException, JsonMappingException, IOException {
	System.out.println("1.Doctor to search");
	System.out.println("2.Patient to search");
	int ch=OopsUtility.IntegerInput();
	switch(ch) {
	case 1:
		System.out.println("Doctor.........");
		System.out.println("1.DOCTORID ");
		System.out.println("2.DoctorName ");
		System.out.println("3.DoctorAvailablity");
		System.out.println("4.DoctorSpecialization ");
		
		int ch1=OopsUtility.IntegerInput();
		switch(ch1){
		case 1:
			System.out.println("Searching doctor by id");
			searchDoctorById();
			break;
		case 2:
			System.out.println("Searching Doctor by Name");
			searchDoctorByName();
			break;
		case 3:
			System.out.println("Searching Doctor by Avaliablilty");
			searchDoctorByAvailability();
			break;
		case 4:
			System.out.println("Searching Doctor by Specilaization");
			searchDoctorBySpecialization();
			break;
		}
		break;
	case 2:
		
		System.out.println("Patient........");
		System.out.println("1.PatientID ");
		System.out.println("2.PatientName ");
		System.out.println("3.Patientphnumber");
		int ch2=OopsUtility.IntegerInput();
		switch(ch2){
		case 1:
			System.out.println("Searching Patient by id");
			searchPatientById();
			break;
		case 2:
			System.out.println("Searching Patient by Name");
			searchPatientByName();
			break;
		case 3:
			System.out.println("Searching Patient by PhoneNumber");
			searchPatientByNumber();
			break;
	    default:
	    	System.out.println("Invalid");
		}break;
	default:
		System.out.println("Invalid");
	}
}

public void searchDoctorByName() throws JsonParseException, JsonMappingException, IOException {
	int cnt=0,i;
	System.out.println("Enter the File Name from which has to be deleted:=>");
	String fileName = OopsUtility.singleStringInput();
	String path = fileName+".json";
	File doctorFileObject = new File(path);
	if(doctorFileObject.length()==0)
	{
		System.out.println("File is Empty");
	}
	else
	{
		System.out.println("Enter the name Doctor has to be searched:=>");
		String name = OopsUtility.singleStringInput();
		doctorpatientArray.clear();
		List doctorFileList = objectMapper.readValue(doctorFileObject, new TypeReference<List<Doctor>>() {});
		doctorpatientArray.addAll(doctorFileList);
		for(i=0;i<doctorpatientArray.size();i++)
		{
			if(name.equals(doctorpatientArray.get(i).getName()))
			{
				cnt++;
				break;
			}
		}
		if(cnt>0)
		{
			System.out.println("Doctor Found!");
			System.out.println("Doctors Report is:=>"+doctorpatientArray.get(i));
		}
		else
		{
			System.out.println("Doctor not Found");
		}
	}
	
}
public void searchDoctorById() throws JsonParseException, JsonMappingException, IOException {
	int cnt=0,i;
	System.out.println("Enter the File Name from which has to be deleted:=>");
	String fileName = OopsUtility.singleStringInput();
	String path = fileName+".json";
	File doctorFileObject = new File(path);
	if(doctorFileObject.length()==0)
	{
		System.out.println("File is Empty");
	}
	else
	{
		System.out.println("Enter the name Doctor has to be searched:=>");
		String name = OopsUtility.singleStringInput();
		doctorpatientArray.clear();
		List doctorFileList = objectMapper.readValue(doctorFileObject, new TypeReference<List<Doctor>>() {});
		doctorpatientArray.addAll(doctorFileList);
		for(i=0;i<doctorpatientArray.size();i++)
		{
			if(name.equals(doctorpatientArray.get(i).getId()))
			{
				cnt++;
				break;
			}
		}
		if(cnt>0)
		{
			System.out.println("Doctor id Found!");
			System.out.println("Doctors Report is:=>"+doctorpatientArray.get(i));
		}
		else
		{
			System.out.println("Doctor not Found");
		}
	}
	
}
public void searchDoctorBySpecialization() throws JsonParseException, JsonMappingException, IOException {
	int cnt=0,i;
	System.out.println("Enter the File Name from which has to be deleted:=>");
	String fileName = OopsUtility.singleStringInput();
	String path = fileName+".json";
	File doctorFileObject = new File(path);
	if(doctorFileObject.length()==0)
	{
		System.out.println("File is Empty");
	}
	else
	{
		System.out.println("Enter the name Doctor has to be searched:=>");
		String name = OopsUtility.singleStringInput();
		doctorpatientArray.clear();
		List doctorFileList = objectMapper.readValue(doctorFileObject, new TypeReference<List<Doctor>>() {});
		doctorpatientArray.addAll(doctorFileList);
		for(i=0;i<doctorpatientArray.size();i++)
		{
			if(name.equals(doctorpatientArray.get(i).getSpecialization()))
			{
				cnt++;
				break;
			}
		}
		if(cnt>0)
		{
			System.out.println("Doctor Found!");
			System.out.println("Doctors Report is:=>"+doctorpatientArray.get(i));
		}
		else
		{
			System.out.println("Doctor not Found");
		}
	}
	
}
public void searchDoctorByAvailability() throws JsonParseException, JsonMappingException, IOException {
	int cnt=0,i;
	System.out.println("Enter the File Name from which has to be deleted:=>");
	String fileName = OopsUtility.singleStringInput();
	String path = fileName+".json";
	File doctorFileObject = new File(path);
	if(doctorFileObject.length()==0)
	{
		System.out.println("File is Empty");
	}
	else
	{
		System.out.println("Enter the name Doctor has to be searched:=>");
		String name = OopsUtility.singleStringInput();
		doctorpatientArray.clear();
		List doctorFileList = objectMapper.readValue(doctorFileObject, new TypeReference<List<Doctor>>() {});
		doctorpatientArray.addAll(doctorFileList);
		for(i=0;i<doctorpatientArray.size();i++)
		{
			if(name.equals(doctorpatientArray.get(i).getAvailability()))
			{
				cnt++;
				break;
			}
		}
		if(cnt>0)
		{
			System.out.println("Doctor Availability Found!");
			System.out.println("Doctors Report is:=>"+doctorpatientArray.get(i));
		}
		else
		{
			System.out.println("Doctor not Found");
		}
	}
	
}
public void searchPatientByName() throws JsonParseException, JsonMappingException, IOException {
	int cnt=0,i;
	System.out.println("Enter the File Name from which has to be deleted:=>");
	String fileName = OopsUtility.singleStringInput();
	String path = fileName+".json";
	File patientFileObject = new File(path);
	if(patientFileObject.length()==0)
	{
		System.out.println("File is Empty");
	}
	else
	{
		System.out.println("Enter the name Doctor has to be searched:=>");
		String name = OopsUtility.singleStringInput();
		patientArrayList.clear();
		List patientFileList = objectMapper.readValue(patientFileObject, new TypeReference<List<Doctor>>() {});
		patientArrayList.addAll(patientFileList);
		for(i=0;i<patientArrayList.size();i++)
		{
			if(name.equals(patientArrayList.get(i).getName()))
			{
				cnt++;
				break;
			}
		}
		if(cnt>0)
		{
			System.out.println("Patient Found!");
			System.out.println("Patient Report is:=>"+patientArrayList.get(i));
		}
		else
		{
			System.out.println("Patient not Found");
		}
	}
}
public void searchPatientById() throws JsonParseException, JsonMappingException, IOException {
	int cnt=0,i;
	System.out.println("Enter the File Name from which has to be deleted:=>");
	String fileName = OopsUtility.singleStringInput();
	String path = fileName+".json";
	File patientFileObject = new File(path);
	if(patientFileObject.length()==0)
	{
		System.out.println("File is Empty");
	}
	else
	{
		System.out.println("Enter the name Doctor has to be searched:=>");
		String name = OopsUtility.singleStringInput();
		patientArrayList.clear();
		List patientFileList = objectMapper.readValue(patientFileObject, new TypeReference<List<Doctor>>() {});
		patientArrayList.addAll(patientFileList);
		for(i=0;i<patientArrayList.size();i++)
		{
			if(name.equals(patientArrayList.get(i).getId()))
			{
				cnt++;
				break;
			}
		}
		if(cnt>0)
		{
			System.out.println("Patient Found!");
			System.out.println("Patient Report is:=>"+patientArrayList.get(i));
		}
		else
		{
			System.out.println("Patient not Found");
		}
	}
	
}
@Override
public void searchPatientByNumber() throws JsonParseException, JsonMappingException, IOException {
	int cnt=0,i;
	System.out.println("Enter the File Name from which has to be deleted:=>");
	String fileName = OopsUtility.singleStringInput();
	String path = fileName+".json";
	File patientFileObject = new File(path);
	if(patientFileObject.length()==0)
	{
		System.out.println("File is Empty");
	}
	else
	{
		System.out.println("Enter the name Doctor has to be searched:=>");
		String name = OopsUtility.singleStringInput();
		patientArrayList.clear();
		List patientFileList = objectMapper.readValue(patientFileObject, new TypeReference<List<Doctor>>() {});
		patientArrayList.addAll(patientFileList);
		for(i=0;i<patientArrayList.size();i++)
		{
			if(name.equals(patientArrayList.get(i).getPhNumber()))
			{
				cnt++;
				break;
			}
		}
		if(cnt>0)
		{
			System.out.println("Patient Found!");
			System.out.println("Patient Report is:=>"+patientArrayList.get(i));
		}
		else
		{
			System.out.println("Patient not Found");
		}
	}
	
}
public void appointment() throws JsonParseException, JsonMappingException, IOException {
	System.out.println("Enter the File Name from appointment:=>");
	String fileName = OopsUtility.singleStringInput();
	String path = fileName+".json";
	File appointmentFileObject = new File(fileName + ".json");
	if (appointmentFileObject.length() == 0) {
		Appointment a = new Appointment();
		System.out.println("Enter the Doctors Name:=>");
		a.setDoctorName(OopsUtility.singleStringInput());
		// setting address of a person
		System.out.println("Enter the Patients Name:=>");
		a.setPatientName(OopsUtility.singleStringInput());
		// setting phone number of a person
		System.out.println("Enter the Date:=>");
		a.setDate(OopsUtility.singleStringInput());
		System.out.println("Enter the Time:=>");
		a.setTime(OopsUtility.singleStringInput());
		System.out.println("Appointment details:=>");
		System.out.println(a);
		// ArrayList personArrayList = new ArrayList();
		appointmentArray.add(a);
		// JsonUtil.writeObjectToJson(personArrayList, fileName+".json");
		ClincalMagServices.writeObjectToJson(appointmentArray, fileName + ".json");
	} 
	else 
	{
		appointmentArray.clear();
		List<Appointment> appointmentFileList = objectMapper.readValue(appointmentFileObject, new TypeReference<List<Appointment>>() {});
		Appointment a = new Appointment();
//		personArrayList.add((Person) personFileList);
		appointmentArray.addAll(appointmentFileList);
		System.out.println("Enter the Doctor Name:=>");
		a.setDoctorName(OopsUtility.singleStringInput());
		// setting address of a person
		System.out.println("Enter the Patients name:=>");
		a.setPatientName(OopsUtility.singleStringInput());
		// setting phone number of a person
		System.out.println("Enter the Date:=>");
		a.setDate(OopsUtility.singleStringInput());
		System.out.println("Enter the Time:=>");
		a.setTime(OopsUtility.singleStringInput());
		System.out.println(a);
		appointmentArray.add(a);
		ClincalMagServices.writeObjectToJson(appointmentArray, fileName + ".json");
	}	
	
}
public void editDoctor() throws JsonParseException, JsonMappingException, IOException {
	System.out.println("Editing Doctor:-");
	System.out.println("Enter File Name from which doctor");
	String fileName=OopsUtility.singleStringInput();
	fileName=fileName+".json";
	File doctorFileObject=new File(fileName);
	if(doctorFileObject.length()==0) {
		System.out.println("file is empty!");
	}
	else {
		System.out.println("Enter Name of person to be edited");
		String name=OopsUtility.singleStringInput();
		List<Doctor> doctorFileList=objectMapper.readValue(doctorFileObject, new TypeReference<List<Doctor>>() {});	
		doctorpatientArray.addAll(doctorFileList);
		System.out.println(doctorpatientArray);
		for(int i=0;i<doctorpatientArray.size();i++) {
			if(name.equals(((Doctor)doctorpatientArray.get(i)).getName())) {
				System.out.println("1.Change name");
				System.out.println("2.Chage id");
				System.out.println("3.Specialization");
				System.out.println("4.Avalibility");
				
				int ch=OopsUtility.IntegerInput();
				switch(ch) {
				case 1:
					System.out.println("Enter the Name to Repalce==>");
					String nametoRepalce=OopsUtility.singleStringInput();
					doctorpatientArray.get(i).setName(nametoRepalce);
					break;
				case 2:
					System.out.println("Enter the Id to change==>");
					String idtoReplace=OopsUtility.singleStringInput();
					doctorpatientArray.get(i).setId(idtoReplace);
					break;
				case 3:
					System.out.println("Enter the Specialization==>");
					String specialization=OopsUtility.singleStringInput();
					doctorpatientArray.get(i).setSpecialization(specialization);
					
					break;
				case 4:
					System.out.println("Enter the Avaliblity");
					String avaliability=OopsUtility.singleStringInput();
					doctorpatientArray.get(i).setAvailability(avaliability);
					break;

				}
				break;
			}
	
		}
	
	}
	
	
}
public void editPatient() throws JsonParseException, JsonMappingException, IOException {
	System.out.println("Editing Patient:-");
	System.out.println("Enter File Name from which Patient");
	String fileName=OopsUtility.singleStringInput();
	fileName=fileName+".json";
	File patientFileObject=new File(fileName);
	if(patientFileObject.length()==0) {
		System.out.println("file is empty!");
	}
	else {
		System.out.println("Enter Name of Patient to be edited");
		String name=OopsUtility.singleStringInput();
		List<Patient>patientFileList=objectMapper.readValue(patientFileObject, new TypeReference<List<Doctor>>() {});	
		patientArrayList.addAll(patientFileList);
		System.out.println(patientArrayList);
		for(int i=0;i<patientArrayList.size();i++) {
			if(name.equals(((Patient)patientArrayList.get(i)).getName())) {
				System.out.println("1.Change name");
				System.out.println("2.Chage id");
				System.out.println("3.PhoneNumber");
			
				
				int ch=OopsUtility.IntegerInput();
				switch(ch) {
				case 1:
					System.out.println("Enter the Name to Repalce==>");
					String nametoRepalce=OopsUtility.singleStringInput();
					patientArrayList.get(i).setName(nametoRepalce);
					break;
				case 2:
					System.out.println("Enter the Id to change==>");
					String idtoReplace=OopsUtility.singleStringInput();
					patientArrayList.get(i).setId(idtoReplace);
					break;
				case 3:
					System.out.println("Enter the Specialization==>");
					String phNumber=OopsUtility.singleStringInput();
					patientArrayList.get(i).setPhNumber(phNumber);
					
					break;
				

				}
				break;
			}
	
		}
	
	}
	
}
public void savefile() {
	System.out.println("Saving the file");
	System.out.println("1.Saving the Person");
	System.out.println("2.Saving the Patient");
	int ch=OopsUtility.IntegerInput();
	switch(ch) {

	case 1:
	System.out.println("Enter the File name to Save:=>");
	String fileName = OopsUtility.singleStringInput();
	System.out.println(doctorpatientArray);
	OopsUtility.writeObjectToJson(doctorpatientArray, fileName + ".json");
	doctorpatientArray.clear();
	break;
	case 2:
	System.out.println("Saving the Patient");
	System.out.println("Enter the File name to Save:=>");
	String fileName1 = OopsUtility.singleStringInput();
	System.out.println(patientArrayList);
	OopsUtility.writeObjectToJson(patientArrayList, fileName1 + ".json");
	patientArrayList.clear();
	break;
	case 3:
		return;
	}
}
public void createFile() {
System.out.println("Enter the file Name:==>");
String filename=OopsUtility.singleStringInput();
String path=filename+".json";
try {
	File file =new File(path);
	boolean created=file.createNewFile();
	if(created) {
		System.out.println("file has been Created");
	}else {
		System.out.println("File is already present");
	}
}catch(IOException e) {
	System.out.println("Exception Occured:"+e);
	e.printStackTrace();
}
filelist.add(filename);
}
}