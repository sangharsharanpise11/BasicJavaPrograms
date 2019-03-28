package Com.BridgeIt.ObjectOrientedPrograms.AddressBookNew.Services;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface AddressInterfaces 
	{
		public void CreateFile();

		public void AddPerson(String Name) throws JsonParseException, JsonMappingException, IOException;

		public void Savefile();

		public void Closefile();

		public void EditPerson() throws JsonParseException, JsonMappingException, IOException;

		public void SaveAs() throws JsonParseException, JsonMappingException, IOException;

		public void DeletePerson() throws JsonParseException, JsonMappingException, IOException;

		public void LoadFileName();

		void OpenFile() throws JsonParseException, JsonMappingException, IOException;
	}

