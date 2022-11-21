package metier;

import java.util.ArrayList;
import java.util.List;

public class Client
{
	/** 
	 * Crée un client.
	 * @param nom le nom du client. 
	 */
	
	private String nom; //////////
	
	private List<Facture> factures = new ArrayList<>();
	private List<Facture> facturesReglees = new ArrayList<>();
	private static List<Client> clients = new ArrayList<>();
	
	private int somme=0;
	
	public Client(String nom) //////////
	{
		this.nom = nom;
		clients.add(this);
	}

	/**
	 * Retourne le nom du client.
	 * @return le nom du client.
	 */
	
	public String getNom()   //////////
	{
		return nom;
	}
	
	/**
	 * Modifie le nom du client.
	 * @param nom le nom du client.
	 */
	
	public void setNom(String nom)   ////////////
	{
		this.nom = nom;
	}
	
	/**
	 * Créé une facture.
	 * @param montant Le montant de la facture.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant) ////////////
	{
		Facture fac = new Facture(this, montant, false, java.time.LocalDate.now());
		this.factures.add(fac);
		this.somme += montant;
		return fac;
	}
	
	/**
	 * Retourne une copie de la liste des factures du client. 
	 * @return une copie de la liste des factures du client.
	 */

	public List<Facture> getFactures()
	{	
		return this.factures;
	}
	
	/**
	 * Retourne la somme des montants des factures.
	 * @return la somme des montants des factures.
	 */
	
	public int sommeMontants()
	{
		return this.somme;
	}

	/**
	 * Créé une facture en précisant si elle est reglée.
	 * @param montant Le montant de la facture.
	 * @param reglée Vrai si la facture est reglée.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant, boolean reglee) /////////
	{
		Facture facR = new Facture(this, montant, reglee, java.time.LocalDate.now());
		//this.factures.add(facR);
		if(reglee)
			this.facturesReglees.add(facR);
		this.somme += montant;
		return facR;
	}	
	
	/**
	 * Retourne la liste des factures reglées. 
	 * @return la liste des factures reglées.
	 */

	public List<Facture> facturesReglees()
	{
		return this.facturesReglees;
	}
	

	/**
	 * Retourne tous les clients créés.
	 * @return une copie de la liste de tous les clients.
	 */
	public static List<Client> tous()
	{
		return null;
	}
	
	/**
	 * Supprime le client.
	 */
	
	public void delete()
	{
		clients.remove(this);
	}
}
