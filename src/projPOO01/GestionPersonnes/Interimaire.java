/**
 * 
 */
package projPOO01.GestionPersonnes;

import projPOO01.Exceptions.ExceptionContratAgence;
import projPOO01.Exceptions.ExceptionDuree;
import projPOO01.Exceptions.ExceptionSaisieCodePostal;

/**
 * @author Boukhemis DIB
 *
 */
public class Interimaire extends Salarie {
	
	private int duree;
	private String contratAgence;

	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param ville
	 * @param codepostal
	 * @param secu
	 * @param salaire
	 */
	public Interimaire(String nom, String prenom, String adresse, String ville, String codepostal, String secu,
			double salaire, int duree, String contratAgence) {
		
		super(nom, prenom, adresse, ville, codepostal, secu, salaire);
		
		this.contratAgence = contratAgence;
		this.duree = duree;

	}
	
	public static void CtrlContratAgence(String contrat) throws ExceptionContratAgence {

		if (contrat == null) {
			throw new ExceptionContratAgence("Contrat null");
		}

		if (contrat.length() <= 5) {
			throw new ExceptionContratAgence("Veuillez saisir un contrat supérieur à 5 caractaires.");
		}

	}
	
	
	public static void CtrlDuree(int duree) throws ExceptionDuree {
		
		if(duree <= 1) {
			throw new ExceptionDuree("Veuillez saisir une durée de contrat supérieur à 1 mois");
		}
		
	}

	
}
