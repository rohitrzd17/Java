package learningJava;

public class decop {
  public static void main(String[] args) {
	  
	  //1.
	  int a = 35;
	  a--; //First Store then Increment; 35
	  System.out.println("a = " + a); //Final value = 35
	  
	  
	  //2.
	  int b = 70;
	  --b; //First Increment then Store; 69
	  System.out.println("b = " + b); //Final value = 69
	  
	  
	  int c = 100;
	  c = c--; //FSTI; 100
	  System.out.println("c = " + c); //Final Value = 100
	  
	  
	  int d = 76;
	  int e = 32;
	  d = d-- + --e; //FSTI+FITS; 76 + 31
	  System.out.println("d = " + d); //Final value = 107
	  
	  
	  int a1 = 100;
	  short a2 = 150;
	  int a3 = 350;
	  long a4 = 200;
	  
	  //Widening: short to int; Narrowing: long to int
	  //FSTI-FITS+FSTI-FITS
	  //100-151+350-201
	  int res = (a1--) - (int)(++a2) + (a3--) - (int)(++a4);
	  System.out.println("res = " + res); //Final Value = 98
  }
}
