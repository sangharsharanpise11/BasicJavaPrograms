package Com.BridgeIt.ObjectOrientedPrograms.AddressBook;

public class Address 
{
 private String StreetName;
 private String BuildingName;
 private int RoomNo;
 private String state;
 private String city;
public String getStreetName() 
{
	return StreetName;
}
public void setStreetName(String streetName) 
{
	StreetName = streetName;
}
public String getBuildingName() 
{
	return BuildingName;
}
public void setBuildingName(String buildingName) 
{
	BuildingName = buildingName;
}
public int getRoomNo() 
{
	return RoomNo;
}
public void setRoomNo(int roomNo) 
{
	RoomNo = roomNo;
}
public String getState() 
{
	return state;
}
public void setState(String state) 
{
	this.state = state;
}
public String getCity() 
{
	return city;
}
public void setCity(String city) 
{
	this.city = city;
}
@Override
public String toString() 
{
	return "Address [StreetName=" + StreetName + ", BuildingName=" + BuildingName + ", RoomNo=" + RoomNo + ", state="
			+ state + ", city=" + city + "]";
}

}
