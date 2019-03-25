package CliniqueManagement;

import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;

/**
 * created by:Sangharsha Ranpise.
 * Date :23/03/2019.
 * Purpose :
 */
import com.fasterxml.jackson.core.JsonParseException;

public interface IClincalManagement 
{
	public void add() throws JsonParseException, JsonMappingException, IOException;
	public void display() throws JsonParseException, JsonMappingException, IOException;
	public void search() throws JsonParseException, JsonMappingException, IOException;
	public void addDoctor(String doctorFileName) throws JsonParseException, JsonMappingException, IOException;
	public void deleteDoctor() throws JsonParseException, JsonMappingException, IOException;
	public void addPatient(String patientFileName) throws JsonParseException, JsonMappingException, IOException;
	public void deletePatient() throws JsonParseException, JsonMappingException, IOException;
	public void editDoctor() throws JsonParseException, JsonMappingException, IOException;
	public void editPatient() throws JsonParseException, JsonMappingException, IOException;
	public void searchDoctorByName() throws JsonParseException, JsonMappingException, IOException;
	public void searchDoctorById() throws JsonParseException, JsonMappingException, IOException;
	public void searchDoctorBySpecialization() throws JsonParseException, JsonMappingException, IOException;
	public void searchDoctorByAvailability() throws JsonParseException, JsonMappingException, IOException;
	public void searchPatientByName() throws JsonParseException, JsonMappingException, IOException;
	public void searchPatientById() throws JsonParseException, JsonMappingException, IOException;
	public void searchPatientByNumber() throws JsonParseException, JsonMappingException, IOException; 
	public void displayDoctors() throws JsonParseException, JsonMappingException, IOException; 
	public void displayPatients() throws JsonParseException, JsonMappingException, IOException;
	public void appointment() throws JsonParseException, JsonMappingException, IOException;
	public void savefile();
	public void createFile();

}
