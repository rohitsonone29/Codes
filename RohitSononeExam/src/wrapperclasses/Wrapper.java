/*
 Rohit Sonone
 Group C
 2) Wrapper classes and use all important conversion methods of wrapper classes
int -> byte, double, long, float

int -> string,

string-> int (depict how will you take care of NumberFormatException)

char -> string

string -> 1st char from string

string -> stringbuilder -> call some methods stringbuilder -> string*/

package wrapperclasses;

public class Wrapper {
	
	public static void main(String[] args) {
		
		//Int to Double
		int n1=20;
		double d=n1;
		System.out.println(d);
	
		//Int to Long
		int n2=60;
		Long l=Long.valueOf(n2);
		System.out.println(l);
		
		//Int To Byte
		Integer n=10;
		byte b = n.byteValue();	
		System.out.println("Byte: "+b);
		
		//Int to Float
		Integer n3=40;
		float f=n3.floatValue();
		System.out.println(f);
		
		//Int to String
		Integer n4=50;
		String s=n4.toString();
		System.out.println("String:"+s);
		
		//String To Int
		String s1=" 123";
		int num=Integer.parseInt(s1.trim());
		System.out.println(num);
		
		//Char to String
		char c1='A';
		String s2=String.valueOf(c1);
		System.out.println(s2);
		
		//First Character
		String s3="Rohit";
		char c2=s3.charAt(0);
		System.out.println(c2);
		
		//StringBuilder
		StringBuilder sb=new StringBuilder("Rohit");
		
		sb.append(" Sonone");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	
	}

}
