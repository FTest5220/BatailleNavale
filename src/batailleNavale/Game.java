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
			
			System.out.println("Quel type de bateau souhaitez-vous placer ? 1 : Fr�gate");
			
			switch(s.nextInt()) {
			case 1 :
				bateau = new FregateHorizontale();
			}
			
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
			
			System.out.println("Voulez-vous ajouter un bateau ? o/n : ");
		
		} while (!s.nextLine().equalsIgnoreCase("n"));
		
//		FregateHorizontale fregate1 = new FregateHorizontale();
//		System.out.println(fregate1.getName());
	}

}
