package metier;

import java.time.LocalDate;

public class Facture
{
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	
	private Client client;
	
	private int montant;
	
	private LocalDate date;
	
	private boolean estRegle;
	
	public Facture(Client client, int montant, boolean estRegle, LocalDate date) { ///////////////
		this.client = client;
		this.montant = montant;
		this.estRegle = estRegle;
		this.date = date;
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
	
	public LocalDate getDate() ////////////
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
		Facture f;
		if(this.estRegle) {
			f = this.client.createFacture(this.montant, this.estRegle);
			f.date = this.date;
			return f;
		}
		else {
			f = this.client.createFacture(this.montant);
			f.date = this.date;
			return f;
		}
	}
}