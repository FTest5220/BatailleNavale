package batailleNavale;

import java.util.Scanner;

public class Game
{

	public static int length;
	public static int width;
	public static Grille grille;
	
	public static void main(String[] args)
	{
		Bateau bateau = null;
		int x;
		int y;		
		boolean ok;
		Scanner s;
		s = new Scanner(System.in);
		
		System.out.println("Indiquez la longueur de grille souhait�e : ");
		length = s.nextInt();
		
		System.out.println("Indiquez la largeur de grille souhait�e : ");
		width = s.nextInt();
		
		grille = new Grille(length, width);
		
		do {
			
			System.out.println("Quel type de bateau souhaitez-vous placer ? 1 : Torpilleur Horizontal 2 : Torpilleur Vertical 3 : Croiseur Horizontal 4 : Croiseur Vertical 5 : Porte-Avion Horizontal 6 : Porte-Avion Vertical");
			
			switch(s.nextInt()) {
			case 1 :
				bateau = new Bateau("Torpilleur Horizontal", 2, 1);
			case 2 :
				bateau = new Bateau("Torpilleur Vertical", 1, 2);
			case 3 :
				bateau = new Bateau("Croiseur Horizontal", 4, 1);
			case 4 :
				bateau = new Bateau("Croiseur Vertical", 1, 4);
			case 5 :
				bateau = new Bateau("Porte-Avion Horizontal", 5, 1);
			case 6 :
				bateau = new Bateau("Porte-Avion Vertical", 1, 5);
			default :
				System.out.println("Merci de saisir une valeur pr�sente dans la liste");
			}
			
			//To do : mettre �a dans une liste ? V�rifier que le num�ro saisi est propos� dans la liste, sinon redemander
			
			System.out.println("Veuillez entrer les coordonn�es du coin inf�rieur gauche du bateau : ");
			System.out.print("x : ");
			x = s.nextInt();
			System.out.print("y : ");
			y = s.nextInt();
			
			s.nextLine();
			
			ok = grille.placeBateau(bateau, x, y);
			if(ok == false) {
				System.out.println("Impossible de placer le bateau � cet endroit !");
			}else{
				System.out.println("Bateau plac� ! :)");
			}
			
			grille.fire(1, 1);
			grille.fire(2, 1);
			
			System.out.println("Voulez-vous ajouter un bateau ? o/n : ");
		
		} while (!s.nextLine().equalsIgnoreCase("n"));
		
//		FregateHorizontale fregate1 = new FregateHorizontale();
//		System.out.println(fregate1.getName());
	}

}
