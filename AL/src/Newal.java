import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;

public class Newal {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add("a");
	al.add(30);
	System.out.println(al);
al.remove(1);
al.add(null);
System.out.println(al);
System.out.println(al instanceof Serializable);
System.out.println(al instanceof Cloneable);
System.out.println(al instanceof RandomAccess);

	}

}
