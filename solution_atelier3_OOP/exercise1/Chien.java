package brief2OOP;

public class Chien {
	private static String manger() {
		return ".Je mange de la viande";
	}

	private static String aboyer() {
		return " dit wwaaaarf";
	}
	public static void main(String[] args) {
            
		Main obj1 = new Main();
		Main obj2 = new Main();
		obj1.nom = "Rex";
		obj2.nom = "Max";
        System.out.println(obj1.nom + aboyer() + manger());
        System.out.println(obj2.nom + aboyer() + manger());      
	}

	
}
