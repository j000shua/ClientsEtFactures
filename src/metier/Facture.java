package metier;

import java.time.LocalDate;

public class Facture
{
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	
	Client client;
	
	int montant;
	
	LocalDate date;
	
	boolean estRegle;
	
	public Facture(Client client, int montant, boolean estRegle) { ///////////////
		this.client = client;
		this.montant = montant;
		this.estRegle = estRegle;
	}
	
	public Client getClient() /////////////////
	{
		return client;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant() //////////////
	{
		return montant;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee() ////////////
	{
		return estRegle;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return date;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie() ////////////
	{
		return new Facture(this.client, this.montant, this.estRegle);
	}
}