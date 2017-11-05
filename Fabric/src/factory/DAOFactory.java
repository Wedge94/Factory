package factory;
import java.util.HashMap;
import java.util.Map;

import domain.EInstance;
import factoryImplementation.DBFactory;
import factoryImplementation.XMLFactory;

public class DAOFactory 
{
	public static IFactory inst = null;
	
	static final Map<EInstance,IFactory> zzz= new HashMap<EInstance,IFactory>()
	{
		private static final long serialVersionUID = 1L;
		{
			put(EInstance.XML, new XMLFactory());
			put(EInstance.DB, new DBFactory());
		}
	};
	
	public void setSource(EInstance ei) 
	{
		inst = zzz.get(ei);
	}
}
