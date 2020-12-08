package brief2OOP;

public class Chien {
	private static String manger(String qlqc) {
		return qlqc;
	}

	private static String aboyer(String sens) {
		return sens;
	}
	public static void main(String[] args) {
            
		Main obj1 = new Main();
		Main obj2 = new Main();
		obj1.nom = "Rex";
		obj2.nom = "Max";
        System.out.println(obj1.nom +" :Je suis en colère." + aboyer("Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! ") + manger("- Je mange de la viande"));
        System.out.println(obj2.nom +" :Je ne suis pas du tout en colère."+ aboyer("Iwiw !! awaw !! ") + manger(" - Je mange du poisson"));      
	}

	
}
