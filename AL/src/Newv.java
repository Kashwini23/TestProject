import java.util.Vector;

public class Newv {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement("a");
		System.out.println(v);
System.out.println(v.capacity());
for(int i=1; i<11;i++){
	v.addElement(i);
}
System.out.println(v);
System.out.println(v.capacity());
	}

}
