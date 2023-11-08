package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MapConcepts {
	
	public void mapconceptImplementation()
	{
		//HashMap<Integer,String> HS = new HashMap();
		//LinkedHashMap<Integer,String> HS = new LinkedHashMap();
		TreeMap<Object,String> HS = new TreeMap();
		
		HS.put(5,"Python");
		HS.put(5,"C#");
		HS.put(3,"Python");
		HS.put(4,"JAVA");
		HS.put(2,".Net");
		HS.put(9,"");
		HS.put(10,"sathish");
		System.out.println(HS);
		HS.remove(7,"JAVA");
		System.out.println(HS);
		HS.replace(2, "Ruby");
		HS.replace(7, "Ruby");
		System.out.println(HS);
		System.out.println(HS.size());
		System.out.println(HS.isEmpty());
		System.out.println(HS.keySet());
		System.out.println(HS.values());
		System.out.println(HS.get(8));
		System.out.println(HS.entrySet());
		for(Map.Entry s : HS.entrySet())
		{
			System.out.print(s.getKey()+" , ");
			System.out.println(s.getValue());
		}
		System.out.println(HS.containsKey(4));
		System.out.println(HS.containsValue("JAVA"));
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapConcepts M = new MapConcepts();
		M.mapconceptImplementation();
	}

}
