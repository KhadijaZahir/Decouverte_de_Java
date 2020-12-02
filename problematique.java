package brief1;
import java.util.Scanner; // import the Scanner class 


public class TanteFortune {

	public static void main(String[] args) {		
		
		//demander à l'utilisateur d'entrer la somme d'argent
		Scanner myObj = new Scanner(System.in);
	    int argentRecu;
	    
	    // Enter argentRecu and press Enter
	    System.out.println("Combien avez-vous reçu d'argent (MAD) ?"); 
	    argentRecu = myObj.nextInt();   
	       
	    System.out.println("vous avez reçu d'argent (MAD) ?: " + argentRecu + " MAD"); 

		
		//déclarer et initialiser les variables
          double livreFourniture = 0.75 * argentRecu;
          int cafe = 10;
          int trame = 8 ;
          int recharge = 10;
          double argentRest = argentRecu - (cafe + livreFourniture + trame + recharge);
          
  		System.out.println("Vous avez achter des Livre et Fournitures : " + livreFourniture + " MAD");
  		System.out.println("et il vous restera " + argentRest + "MAD pour les roses blanches");
	}

}

