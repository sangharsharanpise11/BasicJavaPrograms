package AddressBook;

public class Person 
{
private String name;
private String phoneNumber;
private String  Address;

public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public String getPhoneNumber() 
{
	return phoneNumber;
}
public void setPhoneNumber(String string) 
{
	this.phoneNumber = string;
}
public String getAddress() 
{
	return Address;
}
public void setAddress(String address) 
{
	Address = address;
}
@Override
public String toString() 
{
	return "Person [name=" + name + ", phoneNumber=" + phoneNumber + ", Address=" + Address + "]";
}

}
