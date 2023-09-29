package org.eu.w1thrd.jlt;

import java.lang.reflect.Method;

/** Main menu for program, picks a class file to start 
* @author W1THRD
* @author www.w1thrd.eu.org
* @version 2.0
*/
public class Main {
	
	public static Method m;
	
	public static void main(String[] args) {
			if(args.length > 1) {
				System.out.println("Error: too many arguments (run -h for help)");
			}else if(args.length < 1) {
				printHelpText();
			}else {
				switch(args[0]){
					case "-h": printHelpText(); break;
					case "--help": printHelpText(); break;
					default: runClass(args[0]); break;
				}
				
			}
	}
	
	public static void printHelpText() {
		System.out.println("For info on the classes, check the Javadoc");
		System.out.println("Only classes with main methods and javadoc annotations can be executed");
		System.out.println("To run a class, do LJT <class name>");
		System.out.println("Options -h and --help show this help text");
	}
	
	public static void runClass(String toRun) {
		try {       
		    Class<?> c = Class.forName(toRun);
		    m = c.getMethod("main", String[].class); // Needs parameter class list
		    String[] input = new String[] { };
		    m.invoke(m, (Object) input);
		}           
		catch (Exception e) {
		  e.printStackTrace();
		}
	}

}
