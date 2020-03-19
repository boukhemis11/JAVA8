package projPOO01.Controles;

import java.text.SimpleDateFormat;
import java.util.Date;

import projPOO01.Exceptions.ExceptionContratAgence;
import projPOO01.Exceptions.ExceptionDate;
import projPOO01.Exceptions.ExceptionDuree;
import projPOO01.Exceptions.ExceptionInt;

/**
 * Classe qui control les donnees saisi
 * 
 * @author Boukhemis Dib
 * @date 18/03/2020
 *
 */
public class Controles {

	public static Date CtrlDate(String d) throws ExceptionDate{
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		sd.setLenient(false);
		Date dt = new Date();
		try {
			dt =sd.parse(d);
			
		}catch(Exception e) {
			throw new ExceptionDate("Mauvais format de date saisi");
		}
		return dt;
	}
	
	public static void CtrlInt(String ns) throws ExceptionInt{
		int n=0;
		try {
			 n = Integer.parseInt(ns);
			
		}catch(Exception e) {
			throw new ExceptionInt("Veuillez saisir un entier");
		}
		
		}
	

	
}
