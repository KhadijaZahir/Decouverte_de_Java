///////////////////function 1

package brief1;
public class brief1class1 {
	  static int myMethod(int x) {
		  System.out.println(x == 10);  
		  return x;
	  }
	  public static void main(String[] args) {
		  myMethod(10);
		  }
	}
///////////////////function 2
package brief1;
public class brief1class1 {
	  static void myMethod(String fname) {
	    System.out.println(fname);
	  }

	  public static void main(String[] args) {
	    myMethod("Liam");
	    myMethod("Jenny");
	    myMethod("Anja");
	  }
	}


///////////////////function 3
package brief1;
public class brief1class1 {
		  static void myMethod(String name, String school) {
		    System.out.println(name + " study in " + school);
		  }

		  public static void main(String[] args) {
		    myMethod("khadija", "youcode");
		    myMethod("Jenny", "1337");
		  }
		}


///////////////////function 4

package brief1;
public class brief1class1 {
		  static void myMethod(int num1, int num2) {
		    if(num1 > num2){
		    System.out.println("Le premier nombre est plus grand");
		    }
		    else if(num1 < num2){
		    System.out.println("Le premier nombre est plus petit");
		    }
		    if(num1 == num2){
		    System.out.println("Les deux nombres sont identiques");
		    }
		  }

		  public static void main(String[] args) {
		    myMethod(5, 4);
		    myMethod(4, 5);
		    myMethod(4, 4);

		  }
		}


///////////////////function 5

package brief1;
public class brief1class1 {
		  static void myMethod(String name, int age) {
		    System.out.println(name + " is " + age);
		  }

		  public static void main(String[] args) {
		    myMethod("khadija", 25);
		    myMethod("sara", 8);
		  }
		}


///////////////////function 6
package brief1;
public class brief1class1 {
		  static void myMethod(String firstname, String lastname, int age) {
		    System.out.println("Bonjour " + firstname + " "+ lastname + ", tu as " + age + "ans");
		  }

		  public static void main(String[] args) {
		    myMethod("khadija", "zahir", 25);
		    myMethod("andy", "smith", 8);
		  }
		}


///////////////////function 7
package brief1;
public class brief1class1 {
	  static void myMethod(String genre, String age) {
		    System.out.println("Vous êtes un " + genre + " et vous êtes " + age);
		  }

		  public static void main(String[] args) {
		    myMethod("Homme", "majeur");
		    myMethod("femme", "majeur");
		    myMethod("Homme", "mineur");
		     myMethod("femme", "mineur");
		  }
		}



///////////////////function 8
package brief1;
public class brief1class1 {
		  static void myMethod(int num1, int num2, int num3) {
		    System.out.println(num1 + num2 + num3);
		  }

		  public static void main(String[] args) {
		    myMethod(5, 4, 5);

		  }
		}
