package domain;
import factory.DAOFactory;

public class Person 
{
	String name;
	
	public static void main(String[] args) 
	{
		DAOFactory dao = new DAOFactory();
		dao.setSource(EInstance.DB);
		System.out.println(DAOFactory.inst.getName());
		dao.setSource(EInstance.XML);
		System.out.println(DAOFactory.inst.getName());
		DAOFactory.inst.setName("New name");
		System.out.println(DAOFactory.inst.getName());
		dao.setSource(EInstance.DB);
		System.out.println(DAOFactory.inst.getName());
		dao.setSource(EInstance.XML);
		System.out.println(DAOFactory.inst.getName());
	}
}
