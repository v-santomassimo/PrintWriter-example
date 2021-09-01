package main;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

import model.Person;
import printer.PersonPrinter;

public class Application {
	
	public static String path = "C:/Users/User/Desktop/";
	public static String file = "ListOfPersons";

	
	
	public static void main(String[] args) {
		List<Person> listOfPersons = Arrays.asList(new Person("Valentina","Santomassimo",27, "Napoli"),
												   new Person("Francesco","Balsamo",17, "Napoli"),
												   new Person("Simone","Giacobbe",23, "Napoli"),
												   new Person("Alessandro","De Biase",27, "Napoli"));
		
		String nomeFile = path + file +".txt";
		
		try {
			PersonPrinter.printPerson(nomeFile, listOfPersons);
			
			System.out.println("Nome File: "+nomeFile);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
