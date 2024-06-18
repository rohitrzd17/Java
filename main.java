public class Main {
  public static void main(String[] args) {
	/* The code will print a lot of things but not this line*/
    System.out.println("Hello World");
	System.out.println("I am learning Java.");
	System.out.println("The above lines are printed using System.out.println command.");
	System.out.println(" ");
	/*System.out.print command*/
	System.out.println("The next two lines are printed using System.out.print command but they will appear as one.");
	System.out.print("A new line ");
	System.out.print("without ln.");
	//Numbers
	System.out.println("\n\nNumbers don't require double quotes.");
	System.out.println(3);
	System.out.println(358);
	System.out.println(50000);
	//Mathematical Equations
	System.out.println("\nMathematical Equations:");
	System.out.println(3 + 3);
	System.out.println(2 * 5);
	//Variables
	System.out.println("\nJava Variables");
	System.out.println("String: stores text. String values are surrounded by double quotes.");
	System.out.println("int: stores integers, without decimals.");
	System.out.println("float: stores floating point numbers, with decimals.");
	System.out.println("char: stores single characters. Char values are surrounded by single quotes.");
	System.out.println("boolean: stores values with two states i.e. True or False.");
	//Variable Declaration
	System.out.println("\nDeclaring/Creating Variables");
	System.out.println("syntax: type variableName = value;");
	System.out.println("type is one of Java Variables, variableName is the name of the variable. The equal sign is used to assign vlues to the variable.");
	System.out.println("String Example:");
	System.out.println("Input:");
	String string = "String name " + '\u003d' + " " + '\u0022' + "John" + '\u0022' + '\u003b' + "\nSystem.out.prinln" + '\u0028' + "name" + '\u0029' + '\u003b';
	System.out.println(string);
	System.out.println("Output:");
	String name = "John";
	System.out.println(name);
	System.out.println("\nint Example");
	System.out.println("Input:");
	String integer = "int myNum " + '\u003d' + " " + 15 + '\u003b' + "\nSystem.out.println" + '\u0028' + "myNum" + '\u0029' + '\u003b';
	System.out.println(integer);
	System.out.println("Output:");
	int myNum = 15;
	System.out.println(myNum);
	/*Unicode used: u003d:= u0022:" u003b:; u0029:) u0028:(*/
	
  }
}
