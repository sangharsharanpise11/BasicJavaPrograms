package Com.BridgeIt.ObjectOrientedPrograms.CliniqueManagementNew.Model;

public class Patient 
{
	private String name;
	private String id;
	private String phNumber;
	public String toString() 
	{
		return "Patient [name=" + name + ", id=" + id + ",PhoneNumber=" +phNumber+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

	}

