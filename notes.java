package learningJava;

public class Notes {
	public static void Language() {
		System.out.println("\033[1mJAVA\033[0m");
		System.out.println("Java is a programming language.");
		System.out.println("\n\n\033[1mLANGUAGE:\033[0m");
		System.out.println("- Language is a medium of communication between two entities.");
		System.out.println("- If one person wants to communicate with another person they can use language to communicate with eachother.");
	}
	public static void progLanguage() {
		System.out.println("\n\n\033[1mPROGRAMMING LANGAUGE:\033[0m");
		System.out.println("- Programmming Language is used to communicate with/ instruct computers.");
		System.out.println("- It is the medium of communication between humans and machines.");
	}
	public static void Levels() {
		System.out.println("\n\n\033[1mLEVELS OF PROGRAMMING LANGUAGES\033[0m");
		System.out.println("\n\033[1m1. LOW LEVEL LANGUAGE\033[0m");
		System.out.println("-The language that machine/computer understands are Low Level Languages.\n- LLL are not intelligible to humans.\nE.g. Machine Code(0,1)");
		System.out.println("\n\033[1m2. ASSEMBLY LEVEL LANGUAGES\033[0m");
		System.out.println("-Assembly language is a low-level language that helps to communicate directly with computer hardware. \n- It uses mnemonics to represent the operations that a processor has to do.\n- It uses hexadecimal and binary values, and it is readable by humans.\nE.g. x86, ARM, MIPS etc.");
		System.out.println("\n\033[1m3. HIGH LEVEL LANGUAGE\033[0m");
		System.out.println("- High-level languages allow programmers to write instructions in a language that is easier to understand than low-level languages.\n- These languages resemble human language, making them more readable and intuitive.\nE.g. Python uses words like ‘print,’ ‘if,’ and ‘while’ to form instructions, creating code that looks like abbreviated English sentences.");
	}
	public static void javaFeatures() {
		System.out.println("\n\n\033[1mFEATURES OF JAVA\033[0m");
		System.out.println("\033[1m1.	Simple:\033[0m Java has made life easier by removing all the complexities such as pointers, operator overloading, etc. as we see in C++ or other programming languages.");
		System.out.println("\033[1m2.	Dynamic:\033[0m It has the ability to adapt to an evolving environment, which supports dynamic allocation, due to which memory wastage is reduced and performance of the application is increased.");
		System.out.println("\033[1m3.	Interpreted:\033[0m Java is compiled to bytecode, which is interpreted by a Java runtime environment.");
		System.out.println("\033[1m4.	Portable:\033[0m Java is platform-independent which means that any application written on one platform can be easily ported to another platform.");
		System.out.println("\033[1m5.	High Performance:\033[0m Java achieves high performance through the use of Just-In-Time (JIT) compilers, which convert bytecode into native machine code at runtime, optimizing execution speed.");
		System.out.println("\033[1m6.	Multi Threading:\033[0m Java Platform is designed with multi-threading capabilities built into the language, which allows users to build applications with many concurrent threads of activity resulting in highly interactive and responsive applications.");
		System.out.println("\033[1m7.	Platform-Independent:\033[0m Java is compiled in intermediate format (bytecode) which can be executed on any system for which Java Virtual Machine (JVM) is ported.");
		System.out.println("\033[1m8.	Architecturally Neutral:\033[0m Java’s bytecode is designed to be neutral with respect to the underlying architecture, meaning it can run on any processor or operating system without modification.");
		System.out.println("\033[1m9.	Object Oriented:\033[0m Everything is considered to be an " + '\u0022' + "object" + '\u0022' + " which possesses same state, behaviour and all the operations are performed using these objects.");
		System.out.println("\033[1m10.	Distributed:\033[0m Java has a comprehensive set of APIs that make it easy to develop distributed applications, allowing multiple computers to work together on a network.");
		System.out.println("\033[1m11.	Secure:\033[0m The Java platform is designed with security features built into the language and runtime system such as static type checking and runtime checking (security manager), which let you create apps that can't be invaded from outside.");
		System.out.println("\033[1m12.	Robust:\033[0m Java has a strong memory management system. It helps in eliminating error as it checks the code during compile and runtime.");
	}
  public static void main(String[] args) {
	Language();
	progLanguage();
	Levels();
	javaFeatures();
  }
  }
