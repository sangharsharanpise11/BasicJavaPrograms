/**
 * created by:Sangharsha Ranpise.
 * Date :23/03/2019.
 * Purpose :Clinique Management Programme. This programme is used to manage a list of Doctors associated with the Clinique.
 * This also manages the list of patients who use the clinique. It manages Doctors by Name, Id, Specialization and Availability
 *(AM,  PM or both). It manages Patients by Name, ID, Mobile Number and Age. The Program allows users to search Doctor by
 * name, id, Specialization or Availability. Also the programs allows users to search patient by name, mobile number or 
 * id. The programs allows patients to take appointment with the doctor. A doctor at  any availability time can see only 
 * 5 patients. If exceeded the user can take appointment for patient at different date or availability time. Print the Doctor Patient Report. Also show which Specialization is popular in the Clinique as well as which Doctor is popular. For .NET Engineers use the following
   ADO.NET Connection Pooling to maintain Doctor, Patient and Appointment Info in the Database
   Use Log4NET to Log Data
   Read Patient and Doctor Data from JSON File using File IO and latter with Firebase. Use Factory Pattern and Interface Approach to read Doctor and Patient information.
*/
package Com.BridgeIt.ObjectOrientedPrograms.CliniqueManagementNew.Controller;

import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;

import com.fasterxml.jackson.core.JsonParseException;

import Com.BridgeIt.ObjectOrientedPrograms.CliniqueManagementNew.Service.ClincalManagementMethods;
import Com.BridgeIt.ObjectOrientedPrograms.CliniqueManagementNew.Service.IClincalManagement;
import Com.BridgeIt.Utility.OopsUtility;

public class ClincalManagementMain 
	{
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
{
	        IClincalManagement iclinic=new ClincalManagementMethods();
	        do {
	        System.out.println("1.Add to list");
	        System.out.println("2.Display");
	        System.out.println("3.Search");
	        System.out.println("4.Appointment");
	        System.out.println("5.Exit");
	        System.out.println("6.Save");
	        System.out.println("7.CreateNewFile");
	        System.out.println("Enter the Choice:-");
	        int ch=OopsUtility.IntegerInput();
	        switch(ch) 
	        {
	        case 1:
	            System.out.println("Adding to list");
	            iclinic.add();
	            break;
	        case 2:
	            System.out.println("Display to list");
	            iclinic.display();
	            break;
	        case 3:
	            System.out.println("Searching");
	            iclinic.search();
	            break;
	        case 4:
	            System.out.println("Appointment");
	            iclinic.appointment();
	            break;
	        case 5:
	            System.out.println("Exit");
	            break;
	        case 6:
	            System.out.println("saving the file");
	            
	           iclinic.savefile();
	           break;
	        case 7:
	            System.out.println("Create new file");
	            iclinic.createFile();
	            break;
	        case 8:
	            System.out.println("Program is Quited");
	            return;
	           }
	    }while(true);

	  }

	}


