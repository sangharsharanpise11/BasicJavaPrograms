package Com.BridgeIt.DesignPattern.CreationalDesignPattern.FactoryPattern;

public class Server extends Computer
{
 private String ram;
 private String hdd;
 private String cpu;
public Server(String ram, String hdd, String cpu)
{
	super();
	this.ram = ram;
	this.hdd = hdd;
	this.cpu = cpu;
}
public String getRam() {
	return ram;
}

public String getHdd() {
	return hdd;
}

public String getCpu() {
	return cpu;
}
@Override
public String getRAM() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String getHDD() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String getCPU() {
	// TODO Auto-generated method stub
	return null;
}
 
}
