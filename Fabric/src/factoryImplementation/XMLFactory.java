package factoryImplementation;
import factory.IFactory;

public class XMLFactory implements IFactory
{
	String name = "XML";
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
}
