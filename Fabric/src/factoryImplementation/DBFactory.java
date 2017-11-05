package factoryImplementation;
import factory.IFactory;

public class DBFactory implements IFactory
{
	String name = "DB";
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
}
