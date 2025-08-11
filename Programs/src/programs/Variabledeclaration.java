package programs;

public class Variabledeclaration {
	boolean value;
	char ch;
	byte a;
	short b;
	int c;
	long d;
	float e;
	double g;
	public   void print()
	{
		System.out.println("boolean::: "+value);
		System.out.println("char::"+ch);
		System.out.println("byte::"+a);
		System.out.println("short::"+b);
		System.out.println("int::"+c);
		System.out.println("long::"+d);
		System.out.println("float::"+e);
		System.out.println("double::"+g);
	
	}
	
	public static void main(String args[]) {
		Variabledeclaration vd=new  Variabledeclaration();
		vd.print();
		
	}

}
