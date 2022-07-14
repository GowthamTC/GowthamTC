package org.test;

import java.util.ArrayList;
import java.util.List;

public class Amar {
	public static void main(String[] args) {
		List li=new ArrayList();
		
		li.add(25);
		li.add("Amar");
		li.add("up");
		li.add(9838393443843l);
		
		System.out.println(li);
		
		int size = li.size();
		System.out.println(size);
		
		Object q = li.get(2);
		System.out.println(q);
		
		
	}

}
