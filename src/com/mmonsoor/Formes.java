package com.mmonsoor;

public class Formes {
	public static String ligne(int i) {
		String s="";
		for(int index=0;index<i;index++) {
			s+="*";	
		}
		return s;
	}
	public static String ligne(int i,String symbole) {
		String s="";
		for(int index=0;index<i;index++) {
			s+=symbole;	
		}
		return s;
	}
	public static String rectangle(int i) {
		String s="";
		for(int index=0;index<i;index++) {
			for(int j=0;j<i;j++) {
				s+="*";
			}
			s+="\n";
		}
		return s;
	}
	public static String triangleMontant(int i) {
		String s="";
		s+="*\n";
		for(int index=2;index<i;index++) {
			s+=ligne(index)+"\n";
		}
		return s;
	}
	public static String triangleDescendant(int i) {
		String s="";
		s+=ligne(i)+"\n";
		for(int index=i-1;index>0;index--) {
			s+=ligne(index)+"\n";
		}
		return s;
	}
	public static String losange(int nbLignes) {
	/*	
		
		if(nbEtoiles%2==0) {
			nbEtoiles+=1;
		}
		//Boucle générale pour le nombre de lignes
		for(int i=1;i<=(nbEtoiles+1)/2;i++) {
			for(int j=nbEtoiles;j>0;j--) {	
				s+=" ";
			}
			for(int v=1;v<nbEtoiles;v+=2) {
				s+="*";
				//s+="\n";
			}
				
		}
		return s;
		
	*/
		String s="";
		if(nbLignes%2==0) {
			nbLignes++;
		}
		for(int i=1;i<=(nbLignes+10)/2;i++) {
			
		}
		return s;
		
		
		
	}
}
