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
			    double montantHt, TTC;
			    double TVA = 0.2;
			    double remise;
			    String accord;
			    Scanner mntHt = new Scanner(System.in);
		        System.out.println("saisit un montant HT");
		        montantHt = mntHt.nextDouble();
			    Scanner acc = new Scanner(System.in);
		        System.out.println("voulez-vous une remise? repondre par oui ou non");
		        accord =acc.nextLine();		      
		        //System.out.println(accord.equals("oui"));
		        //System.out.println(accord.equals("OUI"));

		        if(accord.equalsIgnoreCase("oui") || accord.equalsIgnoreCase("yes")){
				    Scanner rem = new Scanner(System.in);
                    System.out.println("combien la remise: choisir de 5% ou 20% ?");
			        remise = rem.nextInt();
		        	 if(remise>0 && remise<=20){
		        		    remise = (montantHt * remise)/100;
		        		    double net = montantHt - remise;
		        		    TVA = net * TVA;
		        		    TTC = net + TVA;
				            System.out.println("voila votre montant " + TTC + " DH. avec une remise");
				        }
		  
				}else if(accord.equalsIgnoreCase("non") || accord.equalsIgnoreCase("no")){
        		    TVA = montantHt * TVA;
        		    TTC = montantHt + TVA;
				    System.out.println("voila votre montant " + TTC + " Aucune remise n'a été appliquée");
				}

			    }
		}