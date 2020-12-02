/////////////////////collection 1

package brief1;
import java.util.ArrayList;

public class brief1class1 {
	  public static void main(String[] args) {

		  ArrayList<String> monthList = new ArrayList<String>();
		  monthList.add("January");
		  monthList.add("February ");
		  monthList.add("March");
		  monthList.add("April");
		  monthList.add("may");
		  monthList.add("June");
		  monthList.add("July");
		  monthList.add("August");
		  monthList.add("September");
		  monthList.add("October");
		  monthList.add("November");
		  monthList.add("December");
		    System.out.println(monthList);
		  }
}


/////////////////////collection 2
package brief1;
import java.util.ArrayList;

public class brief1class1 {
	  public static void main(String[] args) {

		  ArrayList<String> monthList = new ArrayList<String>();
		  monthList.add("January");
		  monthList.add("February ");
		  monthList.add("March");
		  monthList.add("April");
		  monthList.add("may");
		  monthList.add("June");
		  monthList.add("July");
		  monthList.add("August");
		  monthList.add("September");
		  monthList.add("October");
		  monthList.add("November");
		  monthList.add("December");
		  System.out.println(monthList.get(3));		  }
}



/////////////////////collection 3
package brief1;
import java.util.ArrayList;

public class brief1class1 {
	  public static void main(String[] args) {

		  ArrayList<String> monthList = new ArrayList<String>();
		  monthList.add("January");
		  monthList.add("February ");
		  monthList.add("March");
		  monthList.add("April");
		  monthList.add("may");
		  monthList.add("June");
		  monthList.add("July");
		  monthList.add("August");
		  monthList.add("September");
		  monthList.add("October");
		  monthList.add("November");
		  monthList.add("December");
		  System.out.println(monthList.get(5));		  }
}



/////////////////////collection 4
package brief1;
import java.util.ArrayList;

public class brief1class1 {
	  public static void main(String[] args) {

		  ArrayList<String> monthList = new ArrayList<String>();
		  monthList.add("January");
		  monthList.add("February ");
		  monthList.add("March");
		  monthList.add("April");
		  monthList.add("may");
		  monthList.add("June");
		  monthList.add("July");
		  monthList.add("August");
		  monthList.add("September");
		  monthList.add("October");
		  monthList.add("November");
		  monthList.add("December");
		  for (String i : monthList) {
		        System.out.println(i);
		      }
		  
	  }
}


/////////////////////collection 5

package brief1;
import java.util.ArrayList;

public class brief1class1 {
	  public static void main(String[] args) {

		  ArrayList<String> monthList = new ArrayList<String>();
		  monthList.add("January");
		  monthList.add("February ");
		  monthList.add("March");
		  monthList.add("April");
		  monthList.add("may");
		  monthList.add("June");
		  monthList.add("July");
		  monthList.add("August");
		  monthList.add("September");
		  monthList.add("October");
		  monthList.add("November");
		  monthList.add("December");
		  
		  monthList.set(7, "août");
		    System.out.print(monthList);
		  
	  }
}


/////////////////////collection 6

package brief1;
import java.util.ArrayList;

public class brief1class1 {
	  public static void main(String[] args) {

		  ArrayList<String> monthList = new ArrayList<String>();
		  monthList.add("January");
		  monthList.add("February ");
		  monthList.add("March");
		  monthList.add("April");
		  monthList.add("may");
		  monthList.add("June");
		  monthList.add("July");
		  monthList.add("August");
		  monthList.add("September");
		  monthList.add("October");
		  monthList.add("November");
		  monthList.add("December");
		  
		  monthList.add(0, "Volvo");;
		  System.out.print(monthList);
		  
	  }
}

/////////////////////collection 7

package brief1;
import java.util.ArrayList;

public class brief1class1 {
	  public static void main(String[] args) {

		  ArrayList<String> monthList = new ArrayList<String>();
		  monthList.add("January");
		  monthList.add("February ");
		  monthList.add("March");
		  monthList.add("April");
		  monthList.add("may");
		  monthList.add("June");
		  monthList.add("July");
		  monthList.add("August");
		  monthList.add("September");
		  monthList.add("October");
		  monthList.add("November");
		  monthList.add("December");
		  
		  monthList.add(0, "Volvo");;
		  monthList.remove(2);
		  System.out.print(monthList);
		  
	  }
}



//////////////////////collection 8


package brief1;
import java.util.ArrayList;

public class brief1class1 {
	  public static void main(String[] args) {

		  ArrayList<String> monthList = new ArrayList<String>();
		  monthList.add("January");
		  monthList.add("February ");
		  monthList.add("March");
		  monthList.add("April");
		  monthList.add("may");
		  monthList.add("June");
		  monthList.add("July");
		  monthList.add("August");
		  monthList.add("September");
		  monthList.add("October");
		  monthList.add("November");
		  monthList.add("December");
		  
		  monthList.add(0, "Volvo");;
		  monthList.remove(2);
		  int ele =monthList.indexOf("Volvo"); 
		  System.out.println("\nThe element volvo is at index : " + ele);
		  
	  }
}

/////////////////////collection 9

package brief1;
import java.util.ArrayList;
import java.util.Collections;

public class brief1class1 {
	  public static void main(String[] args) {

		  ArrayList<String> monthList = new ArrayList<String>();
		  monthList.add("January");
		  monthList.add("February ");
		  monthList.add("March");
		  monthList.add("April");
		  monthList.add("may");
		  monthList.add("June");
		  monthList.add("July");
		  monthList.add("August");
		  monthList.add("September");
		  monthList.add("October");
		  monthList.add("November");
		  monthList.add("December");
		  
		  monthList.add(0, "Volvo");;
		  monthList.remove(2);
		  Collections.sort(monthList);  // Sort monthList
	      System.out.println(monthList);
		  
	  }
}


/////////////////////Collection 10


package brief1;
import java.util.ArrayList;//Import the ArrayList class
public class brief1class1 {
	 public static void main(String args[]) {  
		    
		 // Create a LIST
		 ArrayList<String> monthList= new ArrayList<String>();
		 //add elements to LIST
		 monthList.add("January");
		  monthList.add("February ");
		  monthList.add("March");
		  monthList.add("April");
		  monthList.add("may");
		  monthList.add("June");
		  monthList.add("July");
		  monthList.add("August");
		  monthList.add("September");
		  monthList.add("October");
		  monthList.add("November");
		  monthList.add("December");
		     // Create another LIST
		     ArrayList<String> monthList2 = new ArrayList<String>();	 
		     // Copying one LIST "monthList" to another LIST
		     monthList2.addAll(monthList);
		     // Displaying LIST "2" content
		     System.out.println("LIST 2 contains: "+ monthList2);
		     System.out.println("LIST 1 contains: "+ monthList);		   
		  }
		}


//////////////////////collection 11
/////////////////////collection 12
package brief1;
import java.util.ArrayList;//Import the ArrayList class
public class brief1class1 {
	 public static void main(String args[]) {  
		    
		 // Create a LIST
		 ArrayList<String> monthList= new ArrayList<String>();
		 //add elements to LIST
		 monthList.add("January");
		  monthList.add("February ");
		  monthList.add("March");
		  monthList.add("April");
		  monthList.add("may");
		  monthList.add("June");
		  monthList.add("July");
		  monthList.add("August");
		  monthList.add("September");
		  monthList.add("October");
		  monthList.add("November");
		  monthList.add("December");
		     // Create another LIST
		     ArrayList<String> monthList2 = new ArrayList<String>();	 
		     // Copying one LIST "monthList" to another LIST
		     monthList2.addAll(monthList);
		     // Create another LIST
		     ArrayList<String> monthList3 = new ArrayList<String>();	 
		     // Copying one LIST "monthList" to another LIST
		     monthList3.addAll(monthList2);
		     // Displaying LIST "2" content
		     System.out.println("LIST 1 contains: "+ monthList);
		     System.out.println("LIST 2 contains: "+ monthList2);
		     System.out.println("LIST 3 contains: "+ monthList3);
		  }
		}



/////////////////////collection 13

package brief1;
//Import the HashSet class
import java.util.HashSet;

public class brief1class1 {
	public static void main(String[] args) {
	    HashSet<String> monthList = new HashSet<String>();
	    monthList.add("january ");
	    monthList.add("march");
	    monthList.add("april");
	    monthList.add("May");
	    monthList.add("Juin");
	    monthList.add("july");
         
	   System.out.println(monthList);
	  }
	}


/////////////////////collection 14

package brief1;
//Import the HashSet class
import java.util.HashSet;

public class brief1class1 {
	public static void main(String[] args) {
	    HashSet<String> monthList = new HashSet<String>();
	    monthList.add("january ");
	    monthList.add("march");
	    monthList.add("april");
	    monthList.add("May");
	    monthList.add("Juin");
	    monthList.add("july");
         
	    //System.out.println(monthList);
	    for (String i : monthList) {
	    	  System.out.println(i);
	    	}
	  }
	}

/////////////////////collection 15

package brief1;
//Import the HashSet class
import java.util.HashSet;

public class brief1class1 {
	public static void main(String[] args) {
	    HashSet<String> monthList = new HashSet<String>();
	    monthList.add("january ");
	    monthList.add("march");
	    monthList.add("april");
	    monthList.add("May");
	    monthList.add("Juin");
	    monthList.add("july");
         
	    //HashSet Size
	    System.out.println(monthList.size());
	   
	  }
	}

/////////////////////collection 16 & 17

package brief1;
//Import the HashSet class
import java.util.HashSet;

public class brief1class1 {
	public static void main(String[] args) {
	    HashSet<String> monthList = new HashSet<String>();
	    monthList.add("january ");
	    monthList.add("march");
	    monthList.add("april");
	    monthList.add("May");
	    monthList.add("Juin");
	    monthList.add("july");
         //****display hashset****
		  // System.out.println(monthList);
	    //****loop thought item of hashset****
	    //for (String i : monthList) {
	    //  System.out.println(i);
	    //}
	    //****HashSet Size****
	   // System.out.println(monthList.size());  
	    //****empty the hashset****
	    monthList.clear();
	    System.out.println(monthList);
	   
	  }
	}

/////////////////////collection 18

package brief1;
import java.util.HashMap; //Import the HashMap class

public class brief1class1 {
	 public static void main(String args[]) {  
		// Create a HashMap object called people
		    HashMap<String, Integer> HashMapITEM = new HashMap<String, Integer>();

		    // Add keys and values (Name, Age)
		    HashMapITEM.put("khadija", 27);
		    HashMapITEM.put("andy", 18);

		    for (String i : HashMapITEM.keySet()) {
		      System.out.println("Name: " + i + " Age: " + HashMapITEM.get(i));
		    }
		  }
		}


/////////////////////collection 19

package brief1;
import java.util.HashMap; //Import the HashMap class

public class brief1class1 {
	 public static void main(String args[]) {  
		// Create a HashMap object called people
		    HashMap<String, Integer> HashMapITEM = new HashMap<String, Integer>();

		    // Add keys and values (Name, Age)
		    HashMapITEM.put("khadija", 27);
		    HashMapITEM.put("andy", 18);
      
		    /*for (String i : HashMapITEM.keySet()) {
		      System.out.println("Name: " + i + " Age: " + HashMapITEM.get(i));
		    }*/
		    
		    //size of this hashmap
		    System.out.println(HashMapITEM.size());

		  }
		}

///////////////////// collection 20
package brief1;
import java.util.HashMap; //Import the HashMap class

public class brief1class1 {
	 public static void main(String args[]) {  
		    
		 // Create a HashMap
		     HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		 
		     //add elements to HashMap
		     hmap.put(1, "AA");
		     hmap.put(2, "BB");
		     hmap.put(3, "CC");
		     hmap.put(4, "DD");
		 
		     // Create another HashMap
		     HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
		 
		     // Adding elements to the recently created HashMap
		     hmap2.put(11, "Hello");
		     hmap2.put(22, "Hi");
		 
		     // Copying one HashMap "hmap" to another HashMap "hmap2"
		     hmap2.putAll(hmap);
		 
		     // Displaying HashMap "hmap2" content
		     System.out.println("HashMap 2 contains: "+ hmap2);
		  }
		}



/////////////////////collection 21

package brief1;
import java.util.HashMap; //Import the HashMap class
public class brief1class1 {
	 public static void main(String args[]) {  
		    
		 // Create a HashMap
		     HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		 
		     //add elements to HashMap
		     hmap.put(1, "AA");
		     hmap.put(2, "BB");
		     hmap.put(3, "CC");
		     hmap.put(4, "DD");
		 
		     // Create another HashMap
		     HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
		 
		     // Adding elements to the recently created HashMap
		     hmap2.put(11, "Hello");		 
		     // Copying one HashMap "hmap" to another HashMap "hmap2"
		     hmap2.putAll(hmap);
		 
		     // Displaying HashMap "hmap2" content
		     System.out.println("HashMap 2 contains: "+ hmap2);
		     hmap2.clear();
		     System.out.println(hmap2); 
		  }
		}

