package mock;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App {
//	System.out.println(i++ + ":-\u001B[32m " + que.getKey()+"\u001B[0m");

	public static void questions(List<Map.Entry<String, String>> list, char ch, int limit) {

		int i = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("+------------------------------------------+");
		System.out.println("|            QUESTIONS LIST                |");
		System.out.println("+------------------------------------------+");

		for (Map.Entry<String, String> que : list) {

			if (que.getKey().charAt(0) == ch) {

				String color = "";

				switch (ch) {
				case 'E':
					color = "\u001B[32m";
					break; // Green
				case 'M':
					color = "\u001B[33m";
					break; // Yellow
				case 'H':
					color = "\u001B[31m";
					break; // Red
				}

				System.out.println("| " + i++ + " | " + color + que.getKey() + "\u001B[0m");

				System.out.println("|------------------------------------------|");
				System.out.println("| Press ENTER to view answer               |");
				System.out.println("|------------------------------------------|");

				sc.nextLine();

				System.out.println("| Answer: ");
				System.out.println("| " + que.getValue());
				System.out.println("+------------------------------------------+");

			}

			if (i == limit + 1)
				break;
		}
	}

	public static void questions(List<Map.Entry<String, String>> list, char ch1, char ch2, int limit) {

		int i = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("+------------------------------------------+");
		System.out.println("|            QUESTIONS LIST                |");
		System.out.println("+------------------------------------------+");

		for (Map.Entry<String, String> que : list) {

			char level = que.getKey().charAt(0);

			// check both conditions in ONE place
			if (level == ch1 || level == ch2) {

				String color = "";
				String label = "";

				switch (level) {
				case 'E':
					color = "\u001B[32m";
					label = "EASY";
					break;
				case 'M':
					color = "\u001B[33m";
					label = "MEDIUM";
					break;
				case 'H':
					color = "\u001B[31m";
					label = "HARD";
					break;
				}

				System.out.println("| " + i + " | " + color + que.getKey() + "\u001B[0m");
				System.out.println("|------------------------------------------|");
				System.out.println("| Level : " + label);
				System.out.println("| Press ENTER to view answer               |");
				System.out.println("+------------------------------------------+");

				i++;

				sc.nextLine(); // wait for user

				System.out.println("| Answer: ");
				System.out.println("| " + que.getValue());
				System.out.println("+------------------------------------------+");
			}

			if (i > limit)
				break;
		}
	}

	public static void hardQuestions(List<Map.Entry<String, String>> list, char ch1, char ch2, int limit) {
		int i = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("+------------------------------------------+");
		System.out.println("|        MEDIUM + HARD QUESTIONS           |");
		System.out.println("+------------------------------------------+");

		for (Map.Entry<String, String> que : list) {

			if (que.getKey().charAt(0) == ch1) {

				System.out.println("| " + i++ + " | \u001B[33m" + que.getKey() + "\u001B[0m");
				System.out.println("|------------------------------------------|");
				System.out.println("| Press ENTER to view answer               |");
				System.out.println("+------------------------------------------+");

				sc.nextLine();

				System.out.println("| Answer:");
				System.out.println("| " + que.getValue());
				System.out.println("+------------------------------------------+");
			}

			if (que.getKey().charAt(0) == ch2) {

				System.out.println("| " + i++ + " | \u001B[31m" + que.getKey() + "\u001B[0m");
				System.out.println("|------------------------------------------|");
				System.out.println("| Press ENTER to view answer               |");
				System.out.println("+------------------------------------------+");

				sc.nextLine();

				System.out.println("| Answer:");
				System.out.println("| " + que.getValue());
				System.out.println("+------------------------------------------+");
			}

			if (i == limit + 1)
				break;
		}

		System.out.println("|-------------- END OF LIST ---------------|");
		System.out.println("+------------------------------------------+");
	}

	public static void questions(List<Map.Entry<String, String>> list, int limit) {
		int i = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("+------------------------------------------+");
		System.out.println("|            QUESTIONS LIST                |");
		System.out.println("+------------------------------------------+");

		for (Map.Entry<String, String> que : list) {

			char level = que.getKey().charAt(0);

			if (level == 'E')
				System.out.println("| " + i + " | \u001B[32m" + que.getKey() + "\u001B[0m");

			if (level == 'M')
				System.out.println("| " + i + " | \u001B[33m" + que.getKey() + "\u001B[0m");

			if (level == 'H')
				System.out.println("| " + i + " | \u001B[31m" + que.getKey() + "\u001B[0m");

			System.out.println("|------------------------------------------|");
			System.out.println("| Press ENTER to view answer               |");
			System.out.println("+------------------------------------------+");

			i++; // increment after printing

			sc.nextLine();

			System.out.println("| Answer:");
			System.out.println("| " + que.getValue());
			System.out.println("+------------------------------------------+");

			if (i > limit)
				break;
		}

		System.out.println("|-------------- END OF LIST ---------------|");
		System.out.println("+------------------------------------------+");
	}

	public static void printAll(LinkedHashMap<String, String> list) {
		int i = 1;

		System.out.println("+------------------------------------------+");
		System.out.println("|             ALL QUESTIONS                |");
		System.out.println("+------------------------------------------+");

		for (Map.Entry<String, String> que : list.entrySet()) {

			char level = que.getKey().charAt(0);

			if (level == 'E')
				System.out.println("| " + i++ + " | \u001B[32m" + que.getKey() + "\u001B[0m");

			if (level == 'M')
				System.out.println("| " + i++ + " | \u001B[33m" + que.getKey() + "\u001B[0m");

			if (level == 'H')
				System.out.println("| " + i++ + " | \u001B[31m" + que.getKey() + "\u001B[0m");

			System.out.println("|------------------------------------------|");
			System.out.println("| Answer:");
			System.out.println("| " + que.getValue());
			System.out.println("+------------------------------------------+");
		}

		System.out.println("|-------------- END OF LIST ---------------|");
		System.out.println("+------------------------------------------+");
	}

	public static void questions(List<Map.Entry<String, String>> list) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the question you have to search");
		String search = sc.nextLine().toLowerCase();

		String[] words = search.split(" ");

		int i = 1;
		int shown = 0;

		System.out.println("+------------------------------------------+");
		System.out.println("|            QUESTIONS LIST                |");
		System.out.println("+------------------------------------------+");

		for (Map.Entry<String, String> que : list) {

			String question = que.getKey().toLowerCase();

			int matchCount = 0;
			for (String word : words) {
				if (question.contains(word)) {
					matchCount++;
				}
			}

			if ((question.contains(search) || matchCount >= Math.ceil(words.length * 0.75)) && shown < 5) {

				char ch = que.getKey().charAt(0);
				String color = "";

				switch (ch) {
				case 'E':
					color = "\u001B[32m";
					break;
				case 'M':
					color = "\u001B[33m";
					break;
				case 'H':
					color = "\u001B[31m";
					break;
				}

				System.out.println("| " + i++ + " | " + color + que.getKey() + "\u001B[0m");

				System.out.println("| Answer:");
				System.out.println("| " + que.getValue());
				System.out.println("+------------------------------------------+");

				shown++;
			}
		}

		if (shown == 0) {
			System.out.println("| No matching questions found              |");
			System.out.println("+------------------------------------------+");
		}
	}

	public static void main(String[] args) throws InterruptedException {

		LinkedHashMap<String, String> question = new LinkedHashMap<String, String>();

		String start = "\u001B[103m";
		String end = "\u001B[0m";
		// String start = "\u001B[48;5;217m"; // light pink background

		// String start = "\u001B[38;5;213m"; // light pink foreground

		// Main Method
		question.put("Easy:- What is a programming language",
				"A programming language is a language \u001B[103m DESIGNED IN SUCH A WAY THAT A COMPUTER CAN UNDERSTAND\u001B[0m it.");

		// Types of programming language
		question.put("Easy:- Types of programming language", """
				\u001B[103mLOW LEVEL / MACHINE LEVEL\u001B[0m
				\u001B[103mMID LEVEL / ASSEMBLY LEVEL\u001B[0m
				\u001B[103mHIGH LEVEL\u001B[0m
				""");

		question.put("Easy:- What is a low level language", "A language which is " + start
				+ " UNDERSTANDABLE BY MACHINE\u001B[0m, readable, and executable is called a low-level language.");

		question.put("Easy:- What is a mid level language",
				"It is a language which consists of \u001B[103mPREDEFINED SET OF WORDS\u001B[0m. Such a language is called a mid-level language.");

		question.put("Easy:- What is mnemonics",
				" \u001B[103m Predefined words \u001B[0m in the instruction set are called mnemonics .");

		question.put("Easy:- What is a high level language",
				"A language which is very easy to \u001B[103mUNDERSTAND BY PROGRAMMER\u001B[0m, read, and execute is called a high-level language.");

		question.put("Easy:- What is a binary language",
				"Binary (machine) language consists of only \u001B[103m0s and 1s\u001B[0m and is directly understood by the computer.");

		question.put("Easy:- What is an assembly level language",
				"It is a language which consists of \u001B[103mWORDS LIKE MOV, ADD, SUB\u001B[0m. Such a language is called an assembly-level language.");

		question.put("Easy:- What is an assembler",
				"An assembler is a program that \u001B[103mCONVERTS ASSEMBLY LANGUAGE → MACHINE CODE\u001B[0m.");

		question.put("Easy:- Which language machine can understand",
				"A computer can understand only \u001B[103mMACHINE LANGUAGE (BINARY)\u001B[0m.");

		question.put("Easy:- In assembly language, what is the intermediate software",
				"\u001B[103mASSEMBLER\u001B[0m is the intermediate software used.");

		question.put("Easy:- In high level language, what is the intermediate software",
				"\u001B[103mCOMPILER / INTERPRETER\u001B[0m is the intermediate software used.");

		question.put("Medium:- What is the difference between compiler and interpreter",
				"\u001B[103mCOMPILER\u001B[0m → Entire program at once\n"
						+ "\u001B[103mINTERPRETER\u001B[0m → Line by line execution");

		question.put("Medium:- What is the difference between compiler, interpreter and assembler",
				"\u001B[103mCOMPILER\u001B[0m → High-level → Machine (whole program)\n"
						+ "\u001B[103mINTERPRETER\u001B[0m → High-level → Machine (line by line)\n"
						+ "\u001B[103mASSEMBLER\u001B[0m → Assembly → Machine");

		// Java
		question.put("Medium:- What is Java?",
				"Java is a " + start + "WIDELY USED OBJECT-ORIENTED PROGRAMMING LANGUAGE" + end + " known for its "
						+ start + "PORTABILITY AND SECURITY FEATURES" + end + ". It is commonly used for " + start
						+ "DEVELOPING WEB AND MOBILE APPLICATIONS AS WELL AS ENTERPRISE-LEVEL SOFTWARE" + end
						+ ". Java applications run on the " + start + "JAVA VIRTUAL MACHINE (JVM)" + end
						+ ", allowing them to execute on " + start + "MULTIPLE PLATFORMS WITHOUT MODIFICATION" + end
						+ ".");

		// Features of Java
		question.put("Easy:- Features of Java",
				start + "PLATFORM INDEPENDENT" + end + " – Runs on any OS using JVM\n" + start + "OBJECT-ORIENTED" + end
						+ " – Uses classes and objects\n" + start + "SECURE" + end
						+ " – No direct memory access, runs in sandbox\n" + start + "ROBUST" + end
						+ " – Strong memory management and exception handling\n" + start + "MULTITHREADED" + end
						+ " – Can perform multiple tasks at once\n" + start + "PORTABLE" + end
						+ " – Same behavior on all platforms");

		// Platform Independent
		question.put("Easy:- What is platform independent?",
				"Platform independent means a program can run on " + start + "ANY OPERATING SYSTEM WITHOUT CHANGES"
						+ end + ". Java achieves this using " + start + "BYTECODE AND JVM" + end + ".");

		// WORA
		question.put("Easy:- What is full form of WORA", start + "WRITE ONCE RUN ANYWHERE" + end);

		// Web Applications
		question.put("Easy:- Web applications created using Java", start + "AMAZON" + end + ", " + start + "FLIPKART"
				+ end + ", and many " + start + "BANKING WEBSITES" + end + " use Java in the backend.");

		question.put("Easy:- Where is Java used in mobile applications?",
				start + "ANDROID APPLICATIONS" + end + " such as WhatsApp and Spotify, " + "and many " + start
						+ "BANKING APPS" + end + " use Java for backend services and Android development.");

		// Why Java is widely used
		question.put("Hard:- Why Java is a widely used object-oriented programming language?",
				"Java is widely used because of its " + start + "PLATFORM INDEPENDENCE, SECURITY, AND SCALABILITY" + end
						+ ". It supports " + start + "OBJECT-ORIENTED PROGRAMMING" + end
						+ ", making code reusable and easy to maintain. It is also widely used in " + start
						+ "ENTERPRISE AND BANKING SYSTEMS" + end + ".");

		// Games
		question.put("Easy:- Which games are created using Java",
				start + "MINECRAFT" + end + " and " + start + "RUNESCAPE" + end);

		// Enterprise Software
		question.put("Easy:- Which enterprise-level software are created using Java", start + "FINACLE" + end + ", "
				+ start + "TEMENOS" + end + ", and many " + start + "BANKING SYSTEMS" + end + " are built using Java.");

		// JVM
		question.put("Easy:- What is full form of JVM", start + "JAVA VIRTUAL MACHINE" + end);

		// why java is platform independent

		question.put("Easy:- Why C is a platform dependent language",
				"Whenever we write a program using C in a particular operating system,\n "
						+ "the code is compiled using a compiler. The compiler converts the .c file into\n " + start
						+ "MACHINE-SPECIFIC EXECUTABLE FILE (like .exe)" + end
						+ ".\n This executable runs only on that " + start
						+ "PARTICULAR OPERATING SYSTEM AND HARDWARE\n" + end + ". Therefore, C is called a " + start
						+ "PLATFORM DEPENDENT LANGUAGE" + end + ".");

		question.put("Hard:- Why Java is platform independent?",
				"Whenever we write code in Java, it is given to the COMPILER. The compiler converts the .java file into a .class file. "
						+ "The .class file contains BYTECODE, which is an INTERMEDIATE CODE that is not directly understood by the machine. "
						+ "This bytecode is executed by the JVM (Java Virtual Machine). " + start
						+ "SINCE JVM IS AVAILABLE ON EVERY SYSTEM, JAVA BECOMES PLATFORM INDEPENDENT, BUT JVM ITSELF IS PLATFORM DEPENDENT."
						+ end);

		question.put("Easy:- Which code is an intermediate code?", start + "BYTECODE" + end);

		question.put("Easy:- What is intermediate code?",
				"Intermediate code is a code that is not directly understood by the machine and needs a VIRTUAL MACHINE or INTERPRETER to execute.");

		question.put("Easy:- Which code is not understood by both machine and human?", start + "BYTECODE" + end);

		question.put("Easy:- What does a Java source file contain?", "JAVA SOURCE CODE");

		question.put("Easy:- Which file is generated by the compiler?", start + ".CLASS FILE" + end);

		question.put("Easy:- What is the work of JVM?",
				"JVM converts " + start + "BYTECODE into MACHINE-LEVEL (BINARY) CODE" + end + " and executes it.");

		question.put("Easy:- Can a machine directly understand .class file?",
				start + "NO" + end + ", a machine cannot directly understand BYTECODE without JVM.");

		question.put("Easy:- If JVM is not present in the system, is it platform independent?",
				start + "NO, JAVA REQUIRES JVM TO RUN ." + end + " Without JVM, Java programs cannot execute.");

		question.put("Hard:- What is bytecode?", "BYTECODE is an" + start + " INTERMEDIATE CODE " + end
				+ " generated by the JAVA COMPILER, which is not directly understood by the machine and is executed by the JVM.");

		question.put("Easy:- Why is JVM required in a system?",
				start + "JVM CONVERTS BYTECODE INTO MACHINE-LEVEL CODE AND EXECUTES IT." + end);

		question.put("Easy:- What is the structure of bytecode?", "BYTECODE is a combination of " + start
				+ "INSTRUCTIONS, NUMBERS, and SYMBOLIC REFERENCES " + end + " that follow JVM specifications.");

		question.put("Hard:- What is the difference between C and Java in terms of platform dependency?",
				"In C language, the code is compiled into" + start + " MACHINE-SPECIFIC BINARY (.exe) FILES," + end
						+ "\n" + " which run only on a specific operating system, making it PLATFORM DEPENDENT.\n "
						+ start
						+ "IN JAVA, THE CODE IS COMPILED INTO BYTECODE (.class), WHICH RUNS ON JVM AVAILABLE ON MULTIPLE PLATFORMS,\n"
						+ " MAKING JAVA PLATFORM INDEPENDENT." + end);

		question.put("Easy:- Can interpreter convert .java file to .class file?",
				start + " NO, AN INTERPRETER CANNOT CONVERT A .JAVA FILE INTO A .CLASS FILE.\n" + end
						+ " Only the COMPILER converts .java source code into BYTECODE (.class file).");

//			------------------ Structure of java ---------------------------

		question.put("Easy:- If we write code in Java, what is the file extension?",
				"The file extension for a Java source file is " + start + ".JAVA" + end);

		question.put("Easy:- What is the meaning of a source file in Java?", "A source file is a file that contains "
				+ start + "JAVA CODE WRITTEN BY THE PROGRAMMER" + end + " and has a .java extension.");

		question.put("Easy:- Inside a source file, what can we create?", "Inside a source file, we can create " + start
				+ "CLASSES, INTERFACES, ENUMS, AND ANNOTATIONS" + end + ".");

		question.put("Easy:- What is a keyword in Java?", "A keyword is a " + start + "RESERVED WORD" + end
				+ " in Java that has a predefined meaning and cannot be used as an identifier. Example: class, int, if, return.");

		question.put("Easy:- What is a declaration statement?", "A declaration statement is used to " + start
				+ "DECLARE VARIABLES, METHODS, OR CLASSES" + end + " by specifying their name and type.");

		question.put("Easy:- What is an initializer?", "An initializer is used to " + start
				+ "ASSIGN AN INITIAL VALUE TO A VARIABLE" + end + " when it is created.");

		question.put("Easy:- Inside a declaration statement, what do we have?",
				"In a declaration statement, we define " + start + "VARIABLES, METHODS, AND ENUMS" + end + ".");

		question.put("Easy:- What are the types of initializers in Java?",
				"Java has " + start + "STATIC INITIALIZERS, INSTANCE INITIALIZERS, AND CONSTRUCTORS" + end + ".");

		question.put("Easy:- What is a variable?", "A variable is a " + start + "NAMED MEMORY BLOCK" + end
				+ " used to store data. It has a data type and a value.");

		question.put("Easy:- What is a method?", "A method is a " + start + "BLOCK OF CODE" + end
				+ " that performs a specific task. It can take input (parameters) and may return a value.");

		question.put("Easy:- For every application, which two things are important?",
				start + "DATA AND BEHAVIOR (ACTIONS)" + end + ".");

		question.put("Easy:- Can we name a class starting with uppercase?",
				"Yes, by convention class names should follow " + start + "PASCALCASE (START WITH UPPERCASE)" + end
						+ ", but it is not mandatory.");

		question.put("Easy:- Can we use a keyword as a class name?",
				"No, we cannot use Java keywords as class names because they are " + start + "RESERVED WORDS" + end
						+ ".");

//			------------------------- Main Method   -----------------------------------

		question.put("Easy:- What is the main method?", "The main method is the " + start
				+ "ENTRY POINT OF A JAVA APPLICATION" + end + ". The JVM starts execution from this method.");

		question.put("Easy:- Execution starts from where?",
				"Execution of a Java program starts from the " + start + "MAIN METHOD" + end + ".");

		question.put("Easy:- Who fetches the main method?", "The " + start + "JVM (JAVA VIRTUAL MACHINE)" + end
				+ " loads the class and looks for the main method.");

		question.put("Easy:- Who calls the main method?", "The " + start + "JVM" + end + " calls the main method.");

		question.put("Easy:- What is the syntax of the main method?",
				start + "PUBLIC STATIC VOID MAIN(STRING[] ARGS)" + end);

		question.put("Easy:- In the syntax of main method, can we change the order of public static?",
				"Yes, we can change the order of " + start + "PUBLIC AND STATIC" + end
						+ " because both are modifiers. Example: static public void main(String[] args) is valid.");

		question.put("Easy:- In the syntax of main method, can we write 'public void static main'?",
				"No, we cannot write it because the correct order is " + start
						+ "ACCESS MODIFIER → NON-ACCESS MODIFIER → RETURN TYPE → METHOD NAME" + end + ".");

		question.put("Easy:- In main method, how many modifiers are used?",
				"Two modifiers are used: " + start + "PUBLIC AND STATIC" + end + ".");

		question.put("Easy:- Can main method have a block? What is it called?",
				"Yes, the main method has a block enclosed in {} called the " + start + "METHOD BODY" + end + ".");

		question.put("Easy:- Can we write the main method outside a class?",
				"No, every method in Java must be inside a class. So " + start + "MAIN METHOD CANNOT BE OUTSIDE A CLASS"
						+ end + ".");

		question.put("Easy:- How many main methods can we create inside a class?",
				"We can create " + start + "MULTIPLE MAIN METHODS (METHOD OVERLOADING)" + end
						+ ", but only one with the exact signature is used as the entry point.");

		question.put("Easy:- In main method arguments, instead of 'args' can we use another name?",
				"Yes, we can use any valid variable name instead of args. Example: " + start + "STRING[] INPUT" + end
						+ ".");

		question.put("Easy:-  Can we call main method?  ", start + "  Yes, we can call. " + end);

		// compile and execute
		question.put("Easy:- What is the syntax to compile a Java file?", start + "javac FileName.java" + end);

		question.put("Easy:- What is the syntax to execute a Java program?", start + "java ClassName" + end);

		question.put("Easy:- Can we compile a class without a main method?", start + "Yes," + end
				+ " a class can be compiled without a main method because compilation only checks syntax.");

		question.put("Easy:- Can we execute a class without a main method?",
				start + "NO, EXECUTION REQUIRES A MAIN METHOD " + end + " as it is the entry point of the program.");

		question.put("Easy:- What happens if we try to execute a class without a main method?",
				start + "THE JVM THROWS AN ERROR: 'MAIN METHOD NOT FOUND IN CLASS CLASSNAME." + end);

		question.put("Easy:- What is the difference between compilation and execution?",
				"Compilation converts source code (.java) into bytecode (.class) using the javac compiler, \n"
						+ "while execution runs the bytecode using the JVM with the java command.");

		question.put("Easy:- Who performs compilation in Java?",
				"The" + start + " JAVAC COMPILER" + end + " performs compilation.");

		question.put("Easy:- Who is responsible for execution in Java?",
				"The " + start + "JVM (Java Virtual Machine)" + end + " is responsible for execution.");

		question.put("Medium:- Can we run a program without javac?",
				start + "Yes, if the .class file is already available, \n"
						+ "WE CAN DIRECTLY RUN IT USING THE JAVA COMMAND." + end);

		/////////// Printing statement

		question.put("Easy:- What is a printing statement in Java?",
				"A printing statement is used to " + start + "display output on the console." + end);

		question.put("Easy:- Types of printing statements in Java",
				"There are mainly four types of printing statements:\n" + "" + start + " 1. System.out.print()\n"
						+ "2. System.out.println()\n" + "3. System.out.printf()\n" + "4. System.err.println()" + end);

		question.put("Easy:- What is the use of System.out.print()?",
				"It prints the data and keeps the " + start + "cursor on the same line." + end);

		question.put("Easy:- What is the use of System.out.println()?",
				"It prints the data and moves the " + start + "cursor to the next line." + end);

		question.put("Easy:- What is the use of System.err.println()?", "It " + start + "prints error messages" + end
				+ " to the standard error stream. It is usually displayed in red in many IDEs.");

		question.put("Easy:- What is the use of System.out.printf()?",
				"It is used to " + start + "print formatted output, similar to C language printf." + end);

		question.put("Easy:- Difference between print() and println()",
				"print() prints output on the same line, while println() prints output and moves the cursor to the next line.\n"
						+ "println() can be used without arguments to print a blank line, but print() cannot be used without arguments.");

		question.put("Easy:- Which printing statement cannot be used without arguments?", start + "System.out.print() "
				+ end + "cannot be used without arguments. It will give a compilation error.");

		question.put("Easy:- Which printing statement is used to print error messages (usually shown in red)?",
				start + "System.err.println()" + end + " is used to print error messages.");

		question.put("Easy:- Difference between System.out.print(), System.out.println(), and System.err.println()",
				"System.out.print() prints data on the same line.\n"
						+ "System.out.println() prints data and moves the cursor to the next line.\n"
						+ "System.err.println() prints error messages using a separate error stream.");

		question.put("Easy:- Which printing statement moves the cursor to the next line?",
				start + "System.out.println()" + end);

		question.put("Easy:- Which printing statement is similar to C language?", start + "System.out.printf()" + end);

		//////// --------------------comments
		question.put("Easy:- What is comment?", "A comment is a non-executable part of the " + start
				+ " CODE THAT IS IGNORED BY THE COMPILER" + end + " and used to explain the code.");

		question.put("Easy:- Types of comment.", "There are three types of comments in Java:" + start
				+ " single-line (//), multi-line (/* */),\n and documentation comments (/** */)." + end);

		question.put("Easy:- Comment is visible for whom?",
				"Comments are visible only to developers and not to the compiler or end users.");

		question.put("Easy:- When we use comments.", "Comments are used to " + start
				+ "EXPLAIN LOGIC, IMPROVE READABILITY, AND PROVIDE INFORMATION" + end + " for developers.");

		question.put("Easy:- What is the difference between single line and multi line comments?",
				"Single-line comments (//) are used for one line, while multi-line comments (/* */) are used for multiple lines of code.");

		question.put("Easy:- When we have to use single line comments and when we have to use multi line comments?",
				start + "Single-line comments are used for short explanations," + end + " while " + start
						+ "multi-line comments are used for longer descriptions" + end + " or multiple lines.");

		question.put("Easy:- Can we write comment inside a comment?", start
				+ "Yes, we can write a single-line comment inside a multi-line comment, but we cannot nest multi-line comments."
				+ end + "");

		question.put("Easy:- Give me the example where we use comments.", "Comments are used to explain " + start
				+ " code logic, for example: // calculating sum of two numbers" + end);

		/// ---------------Escape Character
		question.put("Easy:- What is the escape character?",
				"An escape character is a special character used to represent characters that " + start
						+ " cannot be typed directly, such as newline (\\n) or tab (\\t)." + end);

		question.put("Easy:- When we have to use escape character?",
				"Escape characters are used when we want to format text or include special characters inside strings.");

		question.put("Easy:- Give me the example of escape character.",
				"Examples: \\n (new line), \\t (tab), \\\" (double quote), \\\\ (backslash).");

		/// ------------------------ Token

		question.put("Easy:- What is a token?",
				"A token is the " + start + "smallest unit of a Java program " + end
						+ " that the compiler understands. "
						+ "Examples of tokens include keywords, identifiers, literals, operators, and separators.");

		question.put("Easy:- Types of tokens in Java?", "There are 5 types of tokens in Java: " + start
				+ "Keywords, Identifiers, Literals, Operators, and Separators." + end);

		question.put("Easy:- What is a keyword?",
				"Keywords are reserved words in Java that have predefined meanings for the compiler. "
						+ "They cannot be used as identifiers. Keywords are always written in lowercase.");

		question.put("Easy:- Keywords are written in lowercase or uppercase?",
				"Keywords are always written in "+start+"lowercase."+end);

		question.put("Easy:- Total keywords in Java?",
				"There are "+start+"50 keywords in Java "+end+", including 'goto' and 'const', which are reserved but not used.");

		
		 start = "\u001B[103m";
		 end = "\u001B[0m";
		
		 question.put("Easy:- Which keywords are not used in Java?",
			        "The keywords " + start + " GOTO AND CONST " + end + " are reserved but not used in Java.");

			question.put("Easy:- Give examples of keywords.",
			        "Examples of keywords are: " + start + " PUBLIC, STATIC, VOID, INT, CLASS " + end + ".");

			question.put("Easy:- Is 'main' a keyword?",
			        start + " NO, 'MAIN' IS NOT A KEYWORD. " + end +
			        "It is a method name used as the entry point of a Java program.");

			question.put("Easy:- Can we use a keyword as a class name?",
			        start + " NO, WE CANNOT USE A KEYWORD AS A CLASS NAME. " + end +
			        "Keywords are reserved words in Java.");

			question.put("Easy:- What is a reserved word in Java?",
			        "A reserved word is a word that has a " + start +
			        " PREDEFINED MEANING IN JAVA AND CANNOT BE USED AS AN IDENTIFIER. " + end);

			question.put("Easy:- What is a predefined word in Java?",
			        "A predefined word is a word that " + start +
			        " ALREADY HAS A FIXED MEANING IN JAVA. " + end +
			        "Keywords are predefined words.");

			question.put("Easy:- What is meant by 'compiler-aware word'?",
			        start + " IT IS NOT A STANDARD TERM. " + end +
			        "The correct term is " + start + " RESERVED WORD (KEYWORD). " + end);

			question.put("Easy:- Are keywords case sensitive? Yes or No?",
			        start + " YES, ALL KEYWORDS ARE CASE SENSITIVE. " + end);

			question.put("Easy:- Which keywords are case sensitive?",
			        start + " ALL KEYWORDS IN JAVA ARE CASE SENSITIVE. " + end);

			question.put("Easy:- Can an identifier be a keyword?",
			        start + " NO, AN IDENTIFIER CANNOT BE A KEYWORD. " + end);

			question.put(
			"Easy:- If we write one class with a main method and one print statement, how many keywords are there?",
			"Example:\n" +
			"public class Test {\n" +
			"    public static void main(String[] args) {\n" +
			"        System.out.println(\"Hello\");\n" +
			"    }\n" +
			"}\n\n" +

			"KEYWORDS ARE:\n" +
			start + " PUBLIC, CLASS, PUBLIC, STATIC, VOID " + end + "\n\n" +

			"TOTAL KEYWORDS = " + start + " 5 " + end
			);

		// ------ Identifier
			question.put("Easy:- What is an identifier?",
			        "An identifier is the " + start +
			        " NAME GIVEN BY THE PROGRAMMER TO VARIABLES, METHODS, CLASSES, ETC. " + end);

			question.put("Easy:- Total how many identifiers are there in Java?",
			        start + " THERE IS NO LIMIT. " + end +
			        "We can create identifiers as per requirement.");

			question.put("Easy:- Difference between keywords and identifiers?",
			        start + " KEYWORDS " + end + " → Reserved words with predefined meaning.\n" +
			        start + " IDENTIFIERS " + end + " → User-defined names.");

			question.put("Easy:- Does the compiler know keywords or identifiers?",
			        start + " COMPILER KNOWS KEYWORDS DIRECTLY. " + end +
			        "Identifiers are " + start + " USER-DEFINED NAMES RECOGNIZED DURING COMPILATION. " + end);

			question.put(
			"Easy:- We have one class, one main method, and one print statement. How many identifiers are there?",
			"Example:\n" +
			"public class Test {\n" +
			"    public static void main(String[] args) {\n" +
			"        System.out.println(\"Hello\");\n" +
			"    }\n" +
			"}\n\n" +

			"IDENTIFIERS ARE:\n" +
			start + " TEST, MAIN, STRING, ARGS, SYSTEM, OUT, PRINTLN " + end + "\n\n" +

			"TOTAL IDENTIFIERS = " + start + " 7 " + end
			);

			question.put("Easy:- Tell me the rules of identifiers.",
			        start + " RULES: " + end + "\n" +
			        "1. Can contain letters, digits, _ , $\n" +
			        "2. Cannot start with a digit\n" +
			        "3. Cannot be a keyword\n" +
			        "4. Case-sensitive\n" +
			        "5. No spaces allowed");

			question.put("Easy:- In a class name, can we use special characters?",
			        start + " ONLY '_' AND '$' ARE ALLOWED. " + end);

			question.put("Easy:- Which special characters are allowed in identifiers in Java?",
			        start + " ONLY '_' AND '$'. " + end);

			question.put("Easy:- Which special characters are not allowed in identifiers in Java?",
			        start + " ALL OTHER SPECIAL CHARACTERS ARE NOT ALLOWED. " + end);

			question.put("Easy:- Why are only '_' and '$' allowed in identifiers?",
			        start + " BECAUSE OTHER SYMBOLS HAVE SPECIAL MEANING IN JAVA SYNTAX. " + end);
			
			
			
			
			
			

			question.put("Easy:- Can we use a keyword as an identifier?",
			        start + " NO, KEYWORDS CANNOT BE USED AS IDENTIFIERS. " + end);

			question.put("Easy:- If I want to use a keyword-like name as an identifier, what should I do?",
			        start + " CHANGE THE CASE (JAVA IS CASE-SENSITIVE). " + end +
			        "Example: " + start + "      class   |  Class       " + end);

			question.put("Easy:- What is the meaning of convention? Which convention should we follow?",
			        "A convention is an " + start +
			        " INDUSTRY-STANDARD NAMING PRACTICE. " + end +
			        "It improves readability but " + start + " DOES NOT CAUSE COMPILE ERROR IF NOT FOLLOWED. " + end);

			question.put("Easy:- Why should a class name start with an uppercase letter?",
			        start + " BY CONVENTION, CLASS NAMES START WITH UPPERCASE. " + end +
			        "It helps distinguish them from variables and methods.");

			question.put("Easy:- Tell me some identifier names.",
			        start + " run, jump, student, employee, calculateSum, totalMarks " + end);

			question.put("Easy:- What is camel casing in Java?",
			        start + " CAMEL CASE = EACH WORD STARTS WITH CAPITAL LETTER. " + end +
			        "Used mainly for class names. Example: " + start + " StudentDetails " + end);
//			 ------------- Litterals
			question.put("Easy:- What are literals in Java?",
			        "Literals are " + start +
			        " FIXED VALUES (CONSTANTS) USED DIRECTLY IN A PROGRAM. " + end +
			        "Examples: " + start + " 10, 'A', \"Hello\", true " + end);

			question.put("Easy:- Types of literals in Java?",
			        start + " NUMERIC, CHARACTER, STRING, BOOLEAN, NULL " + end);

			question.put("Easy:- How do we write numeric literals in a print statement?",
			        start + " WITHOUT QUOTES " + end +
			        " → Example: System.out.println(10);");

			question.put("Easy:- How do we write character literals in a print statement?",
			        start + " SINGLE QUOTES (' ') " + end +
			        " → Example: System.out.println('A');");

			question.put("Easy:- What are character literals in Java?",
			        "Character literals represent " + start +
			        " A SINGLE CHARACTER " + end +
			        " enclosed in single quotes. Examples: " + start + " 'A', 'b', '1', '@' " + end);

			question.put("Easy:- How do we write string literals in a print statement?",
			        start + " DOUBLE QUOTES (\" \") " + end +
			        " → Example: System.out.println(\"Hello\");");

			question.put("Easy:- How do we write boolean literals in a print statement?",
			        start + " true OR false (NO QUOTES) " + end +
			        " → Example: System.out.println(true);");

			question.put("Easy:- What is a null literal?",
			        start + " NULL REPRESENTS NO OBJECT / EMPTY REFERENCE. " + end);

		
			
			question.put("Easy:- Difference between keywords, identifiers, and literals?",
			        start + " KEYWORDS " + end + " → Reserved words (cannot be used as names)\n" +
			        start + " IDENTIFIERS " + end + " → User-defined names\n" +
			        start + " LITERALS " + end + " → Fixed values (constants)");

			question.put("Easy:- Boolean literal is represented by what?",
			        start + " true AND false (NO QUOTES) " + end);

			question.put("Easy:- In character literals, can we write 77?",
			        start + " NO, ONLY ONE CHARACTER IS ALLOWED. " + end +
			        "Example: " + start + " '7'   |  '77'  " + end);

			question.put("Easy:- Difference between character literal and string literal?",
			        start + " CHAR " + end + " → Single character ('A')\n" +
			        start + " STRING " + end + " → Multiple characters (\"Hello\")");

			question.put("Easy:- Example of character literal and string literal.",
			        start + " 'A' (CHAR)  |  \"Hello\" (STRING) " + end);

			question.put("Easy:- Example of boolean literal.",
			        start + " true, false " + end);

			question.put("Easy:- Example of string literal.",
			        start + " \"Name\", \"Address\", \"Java\" " + end);

			question.put("Easy:- Example of numeric literal.",
			        start + " 10, 25, 2024, 3.14 " + end);

			question.put("Easy:- In the main method, how many literals are there?",
			        "Example:\n" +
			        "public static void main(String[] args) {\n" +
			        "    System.out.println(\"Hello\");\n" +
			        "}\n\n" +
			        "LITERAL:\n" +
			        start + " \"Hello\" " + end + "\n\n" +
			        "TOTAL LITERALS = " + start + " 1 " + end);
			
			
			/// variable and datatype
		question.put("Easy:- What is a variable? ",
		        "A variable is a " + start + " NAMED MEMORY LOCATION USED TO STORE DATA " + end + ".");

		question.put("Easy:- How to access a variable? ",
		        "We can " + start + " ACCESS (FETCH) THE VALUE USING THE VARIABLE NAME " + end + ".");

		question.put("Easy:- What is the use of a variable? ",
		        "A variable is used to " + start + " STORE, RETRIEVE, AND MODIFY DATA " + end + " during program execution.");

		question.put("Easy:- Syntax of variable declaration? ",
		        start + " DATATYPE VARIABLENAME; " + end);

		question.put("Easy:- Syntax of variable initialization? ",
		        start + " VARIABLENAME = VALUE; " + end);

		question.put("Easy:- Syntax of declaration and initialization? ",
		        start + " DATATYPE VARIABLENAME = VALUE; " + end);

		question.put("Easy:- Can we use a local variable without initializing? ",
		        start + " NO, LOCAL VARIABLES MUST BE INITIALIZED BEFORE USE. " + end);

		question.put("Easy:- What happens if we use an uninitialized local variable? ",
		        start + " COMPILE-TIME ERROR OCCURS. " + end);

		question.put("Easy:- Can we modify a variable? ",
		        start + " YES, VARIABLE VALUES CAN BE MODIFIED DURING EXECUTION. " + end);

		question.put("Easy:- Can we create variables with the same name? ",
		        start + " NO, NOT IN THE SAME SCOPE. " + end);

		question.put("Easy:- What happens if we declare variables with the same name in same scope? ",
		        start + " COMPILE-TIME ERROR (DUPLICATE VARIABLE). " + end);
		
		
		
		
		
		
		
		
		question.put("Easy:- What happens if variables have same name in different scopes? ",
				"It is allowed. The local variable will override (shadow) the outer variable.");

		question.put("Easy:- Are variables temporary or permanent? ",
				"Variables are "+start+" temporary; "+end+" they exist only during their scope/lifetime.");

		question.put("Easy:- Do variables have a lifespan? ", start+"Yes,"+end+" each variable has a lifetime based on its scope.");

		question.put("Easy:- What is scope? ", "Scope defines where a variable can be accessed "+start+" (its visibility)."+end);

		question.put("Easy:- Types of variables in Java? ",
				start+"Local variables, instance variables, and static variables."+end);

		question.put("Easy:- Difference between local and instance variable? ",
				"Local variables are declared inside methods and must be initialized. Instance variables are declared inside class but outside methods and get default values.");

		question.put("Easy:- What is a default value of instance variables? ",
				"Instance variables get default values like 0, false, null depending on the type.");

		question.put("Easy:- Do local variables get default values? ",
				"No, local variables must be initialized before use.");

		question.put("Easy:- Where are local variables stored? ", "Local variables are stored in "+start+"stack memory."+end);
		
		
		
		
		
		
		

		//------------/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/----------------- -----
		question.put("Easy:- What is a data type? ",
				"A data type "+start+" defines the type of data a variable can store "+end+"and the operations that can be performed on it.");

		question.put("Easy:- Types of data types in Java? ",
				"Primitive data types and non-primitive (reference) data types.");

		question.put("Easy:- What is a primitive data type? ",
				"Primitive data types store simple values directly in memory.");

		question.put("Easy:- What is a non-primitive data type? ",
				"Non-primitive data types store references (addresses) to objects.");

		question.put("Easy:- Types of primitive data types? ", "byte, short, int, long, float, double, char, boolean.");

		question.put("Easy:- Types of non-primitive data types? ", "Classes, Arrays, Strings, Interfaces, etc.");

		question.put("Easy:- How many primitive data types are there? ", "There are 8 primitive data types in Java.");

		question.put("Easy:- What is 'var' in Java? ",
				"'var' is a local variable type inference keyword introduced in Java 10. The compiler automatically determines the variable type.");

		question.put("Easy:- Which data type stores true/false values? ", "boolean data type.");

		question.put("Easy:- Which data type is used for conditions? ", "boolean data type.");

		question.put("Easy:- What is the size and range of byte? ", "Size: 1 byte (8 bits). Range: -128 to 127.");

		question.put("Easy:- What is the size and range of short? ",
				"Size: 2 bytes (16 bits). Range: -32,768 to 32,767.");

		question.put("Easy:- What is the size and range of int? ",
				"Size: 4 bytes (32 bits). Range: -2,147,483,648 to 2,147,483,647.");

		question.put("Easy:- What is the size and range of long? ",
				"Size: 8 bytes (64 bits). Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.");

		question.put("Easy:- Difference between short and char? ",
				"Both are 2 bytes. short is signed (-32,768 to 32,767), while char is unsigned (0 to 65,535) and stores Unicode characters.");

		question.put("Easy:- Why does char have a different range than short? ",
				"Because char is unsigned (no sign bit), while short is signed (includes a sign bit).");

		question.put("Easy:- What is the range of char? ", "0 to 65,535 (unsigned 16-bit).");

		question.put("Easy:- How are characters represented as numbers? ",
				"Characters are stored using Unicode values (not just ASCII). Each character maps to a numeric code.");

		question.put("Easy:- Among byte, short, and int, which has higher priority? ",
				"int has higher priority in arithmetic operations.");

		question.put("Easy:- byte + byte results in which type? ", "int (due to type promotion).");

		question.put("Easy:- short + short results in which type? ", "int (due to type promotion).");

		question.put("Easy:- What is the purpose of 'var' in Java? ",
				"'var' is a local variable type inference keyword. The compiler determines the variable type based on the assigned value.");

		question.put("Easy:- Can 'var' store multiple types dynamically? ",
				"No. Once assigned, its type is fixed and cannot change.");

		question.put("Easy:- Which data type is suitable for storing contact numbers? ",
				"String is preferred, because phone numbers are not used for calculations and may contain leading zeros or symbols.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		List<Map.Entry<String, String>> list = new ArrayList<>(question.entrySet());

		Collections.shuffle(list);

		Scanner sc = new Scanner(System.in);

		int limit = 15;

		System.out.println("+------------------------------------------+");
		System.out.println("|---------- QUESTION SELECTION ------------|");
		System.out.println("|------------------------------------------|");
		System.out.println("|  1 | Easy                                |");
		System.out.println("|  2 | Medium                              |");
		System.out.println("|  3 | Hard                                |");
		System.out.println("|  4 | Easy + Medium                       |");
		System.out.println("|  5 | Medium + Hard                       |");
		System.out.println("|  6 | Mix (Easy, Medium, Hard)            |");
		System.out.println("|  7 | Print All Questions                 |");
		System.out.println("|  8 | Search Question                     |");
		System.out.println("|------------------------------------------|");
		System.out.println("|        PLEASE ENTER YOUR CHOICE          |");
		System.out.println("+------------------------------------------+");
		System.out.print("            > ");

		int choice = sc.nextInt();
		sc.nextLine();

		if (choice < 1 || choice > 8) {
			System.out.println("Invalid choice!");
			return;
		}

		if (choice != 7 && choice != 8) {
			System.out.print("Enter total questions: ");
			limit = sc.nextInt();
			sc.nextLine();
		}

		switch (choice) {
		case 1 -> questions(list, 'E', limit);
		case 2 -> questions(list, 'M', limit);
		case 3 -> questions(list, 'H', limit);
		case 4 -> questions(list, 'E', 'M', limit);
		case 5 -> hardQuestions(list, 'M', 'H', limit);
		case 6 -> questions(list, limit);
		case 7 -> printAll(question);
		case 8 -> questions(list);

		default -> System.out.println("Invalid choice");
		}

	}

}
