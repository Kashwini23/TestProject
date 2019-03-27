import java.util.HashSet;

public class Newse {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("b");
		hs.add("a");
		hs.add(null);
		System.out.println(hs.add("b"));
System.out.println(hs);
hs.add("c");
System.out.println(hs.add(null));
System.out.println(hs);
	}

}
