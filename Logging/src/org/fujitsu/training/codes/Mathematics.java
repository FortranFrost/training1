package org.fujitsu.training.codes;

import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Mathematics {
	
	// Step 1A: Create the logger 
	private static Logger logger = Logger.getLogger(Mathematics.class.getName());
	
	// Step 1B: Set the default levels in the constructor
	public Mathematics() {
		logger.setLevel(Level.INFO); // default level in development
	
		try {
			// Step 2: Add your desired medium
			FileHandler file = new FileHandler("./src/logs/math.log", true); // the second parameter is for the append
			file.setEncoding("UTF-8"); // for japanese characters
			file.setLevel(Level.WARNING);
			
			// Step 3: Set your own message format on the medium
			SimpleFormatter simple = new SimpleFormatter();
			file.setFormatter(simple);
			
			logger.addHandler(file);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		logger.info("Welcome! Mathematics is created!");
		
	}
	
	public Mathematics(int x) {
		logger.info("Welcome! Mathematics is created! " + x);
	}	
	
	public int add(int x, int y) {
		logger.info("add() called...");
		logger.info("result = " + (x + y));
		logger.info("add() exits...");
		return x + y;
	}
	
	@SuppressWarnings("unused")
	public int div(int x, int y) throws ArithmeticException, Exception {
		logger.info("div() called...");
		
		logger.warning("deprecated Date object used...");
		Date now = new Date(121, 0 , 29);
		
		if(y == 0) {
			logger.severe("division by zero error...");
			throw new ArithmeticException();
		}
		logger.info("div() exits...");
		return x/y;
	}
	
	public static void display() {
		
	}

}
