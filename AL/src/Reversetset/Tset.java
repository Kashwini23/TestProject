package Reversetset;

import java.util.TreeSet;

public class Tset {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new Mycompar());
		t.add(10);
		t.add(1);
		t.add(3);
		t.add(15);
		t.add(9);
		t.add(2);
		System.out.println(t);
	}

}
