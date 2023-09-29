package org.eu.w1thrd.jlt.books1to2;
import java.util.*;
import java.io.*;
import java.util.Scanner;

/** Class that validates input with try-catch statements */
public class Exception1 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	throws Exception{
		Integer num;
		try {
			System.out.print("Enter a number: ");
			num = sc.nextInt();
			println("Your number is: " + num);
		} catch(InputMismatchException ee) {
			sc.nextLine();
			println("NO!");
			
		}
		
		num = getValidInteger("Enter another number: ");
		println("Your number is: " + num);
		
		Integer a = getValidInteger("Enter value for a: ");
		Integer b = getValidInteger("Enter value for b: ");
		Integer c;
		String sC = "";
		
		try {
			c = (a/b);
			sC = c.toString();
			
		}catch(Exception e) {
			println("Error message: " + e.getMessage());
			println("Error Stack Trace: " + e.getMessage());
			println("Error String: " + e.toString());
			println("Error Class: " + e.getClass().toString());
			sC = "infinity";
		} finally {
			println("Final result: " + sC);
		}
		
		FileInputStream f;
		try {
			f = open("bad.txt");
			println(f.toString());
		}catch(Exception e) {
			println(e.toString());
		}
		
		throw new Exception();
		
		
	}
	
	public static String prompt(String text) {
		System.out.print(text);
		return(sc.nextLine());
	}
	public static void println(String text) { System.out.println(text); }
	public static Integer getValidInteger(String text) {
		System.out.print(text);
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Incorrect, try again. " + text);
			
		}
		
		return(sc.nextInt());
	}
	public static FileInputStream open(String name)
		throws FileNotFoundException, IOException{
		return(new FileInputStream("name"));
	}
}
