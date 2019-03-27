import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Newhm {

	public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put("a",1);
	hm.put("b", 2);
	System.out.println(hm);
	/*
	Set s=hm.keySet();
	Iterator it=s.iterator();
	while(it.hasNext()){
		String k=(String)it.next();
		System.out.println(k)
		};
	Set s=hm.entrySet();
	Iterator it=s.iterator();
	while(it.hasNext()){
		Map.Entry m1=(Map.Entry)it.next();
		System.out.println(m1.getKey()+" "+m1.getValue());
	}*/
	Collection c=hm.values();
	Iterator it=c.iterator();
	while(it.hasNext()){
		Object k=(Object)it.next();
		System.out.println(k);
	}
	
	
	}

	}


