package learningJava;

public class incop{
	public static void main(String[] args) {
		
		//1.
		int a = 10;
		a++; //First store then increment; Value taken = 10; Incremented Value = 11
		System.out.println("a = " + a); //Updated Value = 11
		
		
		//2.
		int b = 20;
		++b; //First increment then store; Value = 21
		System.out.println("b = " + b); //Updated value = 21
		
		
		//3.
		int c = 10;
		c = c++; //First store then increment; Value = 10
		System.out.println("c = " + c); //Unchanged value = 10
		
		
		//4.
		int d = 40;
		int e = 50;
		d= d++ + ++e; //d: FSTI(40); e:FITS(51)
		System.out.println("d = " + d); //updated value = 91
		
		
		//5.
		short s = 20;
		byte t = 25;
		s++; //FSTI(20)
		++t; //FITS(26)
		System.out.println(s+t); //Final value = 47
		
		
		//6.
		int a1 = 100;
		short a2 = 150;
		int a3 = 350;
		long a4 = 200;
		
		//Widening: short to int; Narrowing: long to int
		//FSTI-FITS+FSTI-FITS
		//100-151+350-201
		int res = (a1++) - (int)(++a2) + a3++ - (int)(++a4);
		System.out.println("res = " + res);
	}
}
