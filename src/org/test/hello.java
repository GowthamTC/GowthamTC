package org.test;

public class hello {
	public static void main(String[] args) {
		
		String z="Gowtham Tamilmani";
		
		 int length = z.length();
		 System.out.println(length);
		 
		 char charAt = z.charAt(8);
		 System.out.println(charAt);
	
		String upperCase = z.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = z.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = z.startsWith("Gow");
		System.out.println(startsWith);
		
		boolean endsWith = z.endsWith("oni");
		System.out.println(endsWith);
		
		boolean empty = z.isEmpty();
		System.out.println(empty);
		
		int indexOf = z.indexOf('h');
		System.out.println(indexOf);
		
		int lastIndexOf = z.lastIndexOf('m');
		System.out.println(lastIndexOf);
		
		int indexOf2 = z.indexOf('m', 8);
		System.out.println(indexOf);
		
		for (int i = 0; i <z.length(); i++) {
			
			char pro=z.charAt(i);
			
			System.out.println(pro);
			
		}
		
		
		
}
}