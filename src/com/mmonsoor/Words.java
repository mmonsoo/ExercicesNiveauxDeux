package com.mmonsoor;
import java.util.ArrayList;
import java.util.List;
import  java.util.Random;

public class Words {

	public static char lettreAleatoire() {
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'A'); 
		return c;	
	}	
	public static String motAleatoire(int i) {
		Random r = new Random();
		String s="";
		for(int index=0;index<i;index++) {
			char c = (char)(r.nextInt(26) + 'a');
			s+=c;
			//System.out.println(c);
		}
		return s;
	}
	public static String[] tableauAleatoire(int iLettres, int jMots) {
		//On initiliase le tableau au nombre de mots retournés
		String [] tableauStringAleatoire=new String [jMots];
		for(int index=0;index<jMots;index++) {
			tableauStringAleatoire[index]=motAleatoire(iLettres);
		}
		return tableauStringAleatoire;	
	}
	public static boolean checkVoy(String s, int i) {
		boolean bool=false;
		try {
			char lettre = s.charAt(i);
			//bool=voyelle.contains(lettre); // Marche pas
			if (((lettre == 'a') || (lettre == 'e') || (lettre == 'i') || (lettre == 'o') || (lettre == 'u'))
					&& s.length() > i) {
				bool = true;
			} else {
				bool = false;
			} 
		} catch (Exception e) {
			System.out.println("Attention, le i est supérieur à la taille de la string");
		}
		return bool;	
	}
	public static String GeneratePassword() {
		String mdp="";
		String caracteresSpeciaux="!%@$#&";
		Random r = new Random();
		//On crée une boucle pour générer les lettres du mot de passe
		for (int i=0;i<10;i++) {
			mdp+=getLetter(r.nextInt(4));
		}
		return mdp;
	}
	public static boolean [] checkDico(String s, String[] dico) {
		boolean verificateur=false;
		boolean [] tabVerite=new boolean[s.split(" ").length];
		for (String mot:dico) {
			for(int index=0;index<s.split(" ").length;index++) {
				if( mot.equalsIgnoreCase(s.split(" ")[index])){
					verificateur=true;
				}

			}
			//On checke si le mot est présent ou pas
			if(verificateur) {
				System.out.println("Le mot "+mot+" du dico est présent dans la phrase");
			}
			verificateur=false;
				
		}
		return tabVerite;
	}
	public static String getLetter(int mode) {
		Random r = new Random();
		String letter="";
		String caracteresSpeciaux="!%@$#&";
		switch (mode)
		{
		case 0:
			letter+= (char)(r.nextInt(26) + 'A');
			System.out.println("Cas 0");
			System.out.println(letter);
			break;
		case 1:
			letter+= (char)(r.nextInt(26) + 'a');
			System.out.println("Cas 1");
			System.out.println(letter);
			break;
		case 2:
			letter+=caracteresSpeciaux.charAt(r.nextInt(6));
			System.out.println("Cas 2");
			System.out.println(letter);
			break;
		case 3:
			letter+=r.nextInt(10);
			System.out.println("Cas 3");
			System.out.println(letter);
		}
		return letter;
	}

}
