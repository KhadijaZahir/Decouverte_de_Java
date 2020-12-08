//////////////variable 1


package brief1;

import java.util.Scanner;

public class brief1class1 {
	public static void main(String[] args)
	  {
		  	Scanner sc= new Scanner(System.in);
		  	System.out.print("Quel est votre prénom ?");  
		  	String name= sc.nextLine();    //create var by "type variable = value;"
		  	System.out.print("Bonjour, "+ name +"!");  
		  }
		  
		}


//////////////variable 2

package brief1;

import java.util.Scanner;

public class brief1class1 {	
		public static void main(String[] args) {
		 Scanner reader = new Scanner(System.in);

			        double     HT = 0, TVA = 0.2 , TTC = 0.0, r =0;


			        System.out.println("le prix de produit (dh):");
			        HT = reader.nextDouble();
			        System.out.println("le pourcentage de remise :");
			        r = reader.nextDouble();
			        if (r == 0) {
			            TTC = HT + (HT * TVA);
			            System.out.println("TTC = " + TTC + "dh");
			        }
			        else if(r>0 && r<10 || r>0 && r<0.1){
			            r = HT * r;
			            TTC = HT + (HT * TVA) - r;
			            System.out.println("TTC = " + TTC + "dh");
			        }
			        else{
			        	System.out.println("you must choose a remise between 0 and 10%");
			        }
			    }
		}

