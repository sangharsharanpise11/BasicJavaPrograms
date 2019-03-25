package Com.BridgeIt.ObjectOrientedPrograms;

import java.io.Serializable;

public class Rice implements Serializable
{
  private String name;
  private double price;
  private int weight;
public String getName()
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public double getPrice() 
{
	return price;
}
public void setPrice(double price) 
{
	this.price = price;
}
public int getWeight()
{
	return weight;
}
public void setWeight(int weight)
{
	this.weight = weight;
}
@Override
public String toString() {
	return "Rice [name=" + name + ", price=" + price + ", weight=" + weight + "]";
}
  
}