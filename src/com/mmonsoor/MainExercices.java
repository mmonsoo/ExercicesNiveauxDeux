package com.mmonsoor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class MainExercices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//#####Exercices classe Par référence et par valeur
/*		
		int i=5;
		changeInt(i);
		System.out.println(i);
		Holder h= new Holder();
		h.setDonnee(42);
		System.out.println(h.getDonnee());
		//On donne à changeHolder
		changeHolder(h);
		System.out.println(h.getDonnee());
		Holder h1=new Holder();
		h1.setDonnee(50);
		Holder h2=new Holder();
		h2.setDonnee(50);
		Holder h3=new Holder();
		h3.setDonnee(200);
		SumHolder(h1,h2,h3);
		System.out.println("La valeur de h3 est de :"+h3.getDonnee());
*/		
//#### Exercices String
	/*	
		 String bonj="Bien le bonjour !";
		 System.out.println(bonj.toLowerCase());
		 System.out.println(bonj.toUpperCase());
		 System.out.println(bonj.charAt(1));
		 System.out.println(bonj.indexOf("e"));
		for (String s:bonj.split(" ")) {
			System.out.println(s);
		}
		System.out.println(bonj.substring(8,15));
		char lettreMajusculesAleatoire=Words.lettreAleatoire();
		System.out.println(lettreMajusculesAleatoire);
		//System.out.println(Words.motAleatoire(4));
		String [] tabMotsAleatoire=Words.tableauAleatoire(5, 10);
		for (String s:tabMotsAleatoire) {
			System.out.println(s);
		}
		String motATester="aeuio";
		System.out.println(Words.checkVoy(motATester, 85));
		System.out.println(Words.GeneratePassword());
		String [] dico=new String[] {"Pole","Emploi","MERCI","Papa"};
		String aTester="Le Pole nord est génial, merci papa noel";
		System.out.println(Words.checkDico(aTester,dico));
//### Les opérateurs
		int i1=3,i2=5,i3=10;
		System.out.println((i1+i2)*i3);
		//System.out.println(i3++);
		System.out.println(++i3);
		System.out.println(i3);
		System.out.println((false&&false)|| true);
		System.out.println(false&&(false||true));
		System.out.println((false && false) || true);
		System.out.print(Formes.ligne(10));
		System.out.println(Formes.rectangle(4));
		//System.out.print(Formes.triangleMontant(4));
		System.out.print(Formes.triangleDescendant(4));
		String [] dico=new String[] {"Pole","Emploi","MERCI","Papa"};
		String aTester="Le Pole nord est génial, merci papa noel";
		Words.checkDico(aTester,dico);
		System.out.println(Formes.losange(5)); // Marche pas!!
		System.out.println(Words.GeneratePassword());
			
//#### Les conteneurs
		List <Integer> listeEntiers=new ArrayList<Integer>();
		listeEntiers.add(42);listeEntiers.add(100);listeEntiers.add(500);
		//La boucle For classique
		for(int i=0;i<listeEntiers.size();i++) {
			System.out.println(listeEntiers.get(i));
		}
		//La boucle ForEach
		for(int nb:listeEntiers) {
			System.out.println(nb);
		}
		//Avec des itérateurs
		Iterator <Integer> ite=listeEntiers.listIterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		*/
		TreeSet <String> arbre=new TreeSet<String>();
		arbre.add("Zizou");
		arbre.add("Allo");
		arbre.add("aizou");
		arbre.add("Allo");
		arbre.add("10");
		arbre.add("5");
		arbre.add("1");
		arbre.add("!");
		arbre.add("#");
		arbre.add("@");
		
		
		
		
		//Un for each, ça ne prend pas les doublons
		for(String s:arbre) {
			System.out.println(s);
		}
		
		
		
	}
	//Par valeur
	public static void changeInt(int i) {
		i=10;
		System.out.println("La valeur de i est de :"+i);
		
		
	}
	//Par référence
	public static void changeHolder(Holder h) {
		h.setDonnee(100);
	}
	
	public static void SumHolder(Holder h1,Holder h2,Holder h3) {
		h3.setDonnee(h1.getDonnee()+h2.getDonnee());
		

	}

}
