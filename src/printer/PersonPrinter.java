package printer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import model.Person;


public class PersonPrinter {
	
	
	public static void printPerson(String nomeFile, List<Person> listOfPersons) throws FileNotFoundException, UnsupportedEncodingException {
		System.out.println("Creazione lista persone...");
		
		PrintWriter writer = new PrintWriter(nomeFile, "UTF-8");
		
		/*stampo header del csv*/
		writer.println("Nome;Cognome;Eta;CittaDiProvenienza");
		
		/*costruisco una stringa con i valori di ogni oggetto in formato csv*/
		
		for(Person p : listOfPersons) {
			String record = "";
			
			record += "" + p.getName() + ";";
			record += "" + p.getLastname() + ";";
			record += "" + p.getAge() + ";";
			record += "" + p.getHometown() + ";";
			
			writer.println(record);
			
		}
		
		writer.close();
		
		System.out.println("Lista creata correttamente!");
	}
	
	
}
