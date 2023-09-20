package books1to2;

import java.util.Scanner;

// I apologize for this atrocious code
public class CalculatorApp {
	// Initialize a scanner for taking user input
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		println("Welcome to the Calculator App!!!");
		println("Due to the immense complexity of some conversions, only US units will be used.");
		
		// Takes a command from the user, quits program if user tells it to
		for(;;) {
			if(startMode(prompt("CalculatorApp> "))) break;
		}
	}
	
	// I/O Wrapper methods
	public static void println(String text) { System.out.println(text); }
	
	public static String prompt(String text) {
		System.out.print(text);
		return(sc.nextLine());
	}
	
	
	
	// executes a command specified by the user
	public static Boolean startMode(String mode) {
		if(mode.equalsIgnoreCase("help")) help();
		else if(mode.equalsIgnoreCase("quit")) return(true);
		else if(mode.equalsIgnoreCase("temp")) temp();
		else if(mode.equalsIgnoreCase("len")) len();
		else if(mode.equalsIgnoreCase("mass")) mass();
		else if(mode.equalsIgnoreCase("time")) time();
		else if(mode.equalsIgnoreCase("rand")) rand();
		else println("Error, That\'ts not a command");
		
		return(false);
	}
	
	// prints help text
	public static void help() {
		println( "- help: lists commands \n"   
				+ "- quit: closes program \n"  
				+ "- temp: converts temperatures \n"
				+ "- len: converts length \n" 
				+ "- mass: converts mass \n"
				+ "- time: converts time \n"
				+ "- rand: gets a random number within a range"); 
	}
	
	// "temp" command
	public static void temp() {
		// take user input and initialize variables
		String type1 = prompt("Enter type of temperature (K/F/C): ");
		Double temp1 = Double.parseDouble(prompt("Enter temperature: "));
		String type2 = prompt("Enter type to convert to (K/F/C): ");
		Double temp2 = 0d;
		
		// find the right method to convert the data
		if(type1.equalsIgnoreCase("K")) {
			if(type2.equalsIgnoreCase("K")) {
				temp2 = temp1;
			}else if(type2.equalsIgnoreCase("F")) {
				temp2 = ((temp1 - 273.15) * 1.8) + 32;
			}else if(type2.equalsIgnoreCase("C")) {
				temp2 = temp1 - 273.15;
			}else {
				println("Error, that\'s not a unit");
				return;
			}
		}else if(type1.equalsIgnoreCase("F")) {
			if(type2.equalsIgnoreCase("K")) {
				temp2 = (temp1 - 32) * (5/9) + 273.15;
			}else if(type2.equalsIgnoreCase("F")) {
				temp2 = temp1;
			}else if(type2.equalsIgnoreCase("C")) {
				temp2 = (temp1 - 32) * (5/9);
			}else {
				println("Error, that\'s not a unit");
				return;
			}
		}else if(type1.equalsIgnoreCase("C")) {
			if(type2.equalsIgnoreCase("K")) {
				temp2 = temp1 + 273.15;
			}else if(type2.equalsIgnoreCase("F")) {
				temp2 = (temp1 * 1.8) + 32;
			}else if(type2.equalsIgnoreCase("C")) {
				temp2 = temp1;
			}else {
				println("Error, that\'s not a unit");
				return;
			}
		}else {
			println("Error, that\'s not a unit");
			return;
		}
		
		// clean up, return data
		println("Result: " + temp2 + " °" + type2);
	}
	
	// "len" command
	public static void len() {
		// take user input and initialize variables
		String type1 = prompt("Enter type of length (Mi/Yd/Ft/I): ");
		Float len1 = Float.parseFloat(prompt("Enter length: "));
		String type2 = prompt("Enter type to convert to (Mi/Yd/Ft/I): ");
		Float len2 = 0f;
		
		// find the right method to convert the data
		if(type1.equalsIgnoreCase("Mi")) {
				if(type2.equalsIgnoreCase("Mi")) {
					len2 =  len1;
				}else if(type2.equalsIgnoreCase("Yd")) {
					len2 =  len1 * 1760;
				}else if(type2.equalsIgnoreCase("Ft")) {
					len2 =  len1 * 5280;
				}else if(type2.equalsIgnoreCase("I")) {
					len2 =  len1 * 63360;
				}else {
					println("Error, that\'s not a unit");
					return;
				}
		}else if(type1.equalsIgnoreCase("Yd")) {
				if(type2.equalsIgnoreCase("Mi")) {
					len2 =  len1 / 1760;
				}else if(type2.equalsIgnoreCase("Yd")) {
					len2 = len1;
				}else if(type2.equalsIgnoreCase("Ft")) {
					len2 =  len1 * 3;
				}else if(type2.equalsIgnoreCase("I")) {
					len2 =  len1 * 36;
				}else {
					println("Error, that\'s not a unit");
					return;
				}
		}else if(type1.equalsIgnoreCase("Ft")) {
				if(type2.equalsIgnoreCase("Mi")) {
					len2 =  len1 / 5280;
				}else if(type2.equalsIgnoreCase("Yd")) {
					len2 =  len1 / 3;
				}else if(type2.equalsIgnoreCase("Ft")) {
					len2 = len1;
				}else if(type2.equalsIgnoreCase("I")) {
					len2 =  len1 * 12;
				}else {
					println("Error, that\'s not a unit");
					return;
				}
		}else if(type1.equalsIgnoreCase("I")) {
			if(type2.equalsIgnoreCase("Mi")) {
				len2 =  len1 / 63360;
			}else if(type2.equalsIgnoreCase("Yd")) {
				len2 =  len1 / 36;
			}else if(type2.equalsIgnoreCase("Ft")) {
				len2 = len1 / 12;
			}else if(type2.equalsIgnoreCase("I")) {
				len2 = len1;
			}else {
				println("Error, that\'s not a unit");
				return;
			}
		}else {
				println("Error, that\'s not a unit");
				return;
		}
		
		// clean up, return data
		println("Result: " + len2 + " " + type2);
	}
	
	// "mass" command
	public static void mass() {
		// take user input and initialize variables
		String type1 = prompt("Enter type of mass (Tn/Lb/Oz): ");
		Float mass1 = Float.parseFloat(prompt("Enter mass: "));
		String type2 = prompt("Enter type to convert to (Tn/Lb/Oz): ");
		Float mass2 = 0f;
		
		// find the right method to convert the data
		if(type1.equalsIgnoreCase("Tn")) {
			if(type2.equalsIgnoreCase("Tn")) {
				mass2 =  mass1;
			}else if(type2.equalsIgnoreCase("Lb")) {
				mass2 =  mass1 * 2000;
			}else if(type2.equalsIgnoreCase("Oz")) {
				mass2 =  mass1 * 32000;
			}else {
				println("Error, that\'s not a unit");
				return;
			}
		}else if(type1.equalsIgnoreCase("Lb")) {
			if(type2.equalsIgnoreCase("Tn")) {
				mass2 =  mass1 / 2000;
			}else if(type2.equalsIgnoreCase("Lb")) {
				mass2 = mass1;
			}else if(type2.equalsIgnoreCase("Oz")) {
				mass2 =  mass1 * 16;
			}else {
				println("Error, that\'s not a unit");
				return;
			}
		}else if(type1.equalsIgnoreCase("Oz")) {
			if(type2.equalsIgnoreCase("Tn")) {
				mass2 =  mass1 / 32000;
			}else if(type2.equalsIgnoreCase("Lb")) {
				mass2 =  mass1 / 16;
			}else if(type2.equalsIgnoreCase("Oz")) {
				mass2 = mass1;
			}else {
				println("Error, that\'s not a unit");
				return;
			}
		}else {
			println("Error, that\'s not a unit");
			return;
		}
			
			// clean up, return data
			println("Result: " + mass2 + " " + type2);
		}
	
	// "time" command
		public static void time() {
			// take user input and initialize variables
			String type1 = prompt("Enter type of time (H/M/S): ");
			Float time1 = Float.parseFloat(prompt("Enter time: "));
			String type2 = prompt("Enter type to convert to (H/M/S): ");
			Float time2 = 0f;
			
			// find the right method to convert the data
			if(type1.equalsIgnoreCase("H")) {
					if(type2.equalsIgnoreCase("H")) {
						time2 =  time1;
					}else if(type2.equalsIgnoreCase("M")) {
						time2 =  time1 * 60;
					}else if(type2.equalsIgnoreCase("S")) {
						time2 =  time1 * 3600;
					}else {
						println("Error, that\'s not a unit");
						return;
					}
			}else if(type1.equalsIgnoreCase("M")) {
					if(type2.equalsIgnoreCase("H")) {
						time2 =  time1 / 60;
					}else if(type2.equalsIgnoreCase("M")) {
						time2 = time1;
					}else if(type2.equalsIgnoreCase("S")) {
						time2 =  time1 * 60;
					}else {
						println("Error, that\'s not a unit");
						return;
					}
			}else if(type1.equalsIgnoreCase("S")) {
					if(type2.equalsIgnoreCase("H")) {
						time2 =  time1 / 3600;
					}else if(type2.equalsIgnoreCase("M")) {
						time2 =  time1 / 6;
					}else if(type2.equalsIgnoreCase("S")) {
						time2 = time1;
					}else {
						println("Error, that\'s not a unit");
						return;
					}
			}else {
					println("Error, that\'s not a unit");
					return;
			}
			
			// clean up, return data
			println("Result: " + time2 + " " + type2);
		}
		
		// "rand" command
		public static void rand() {
			// get user input, get random number
			Double low = (double) Integer.parseInt(prompt("Enter minimum number: "));
			Double high =  (double) Integer.parseInt(prompt("Enter maximum number: "));
			Integer intLow = low.intValue();
			Integer randNum = ((int) (Math.random() * (high - low + 1)) + intLow);
			
			// clean up, return data
			println("Result: " + randNum);
		}

		
}
