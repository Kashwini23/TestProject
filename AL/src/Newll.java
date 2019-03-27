import java.util.LinkedList;

public class Newll {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("a");
		l.add(null);
		l.set(0, 1);
		//System.out.println(l);
		l.addFirst(1);
		//System.out.println(l);
l.addLast("b");
System.out.println(l);
l.removeLast();
System.out.println(l);
System.out.println(l.getFirst());

	}

}
