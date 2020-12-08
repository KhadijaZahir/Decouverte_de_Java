////////////////LOOP1
	
package brief1;
class brief1class1  
{  
public static void main(String[] args)  
{  
	for (int i = 0; i < 10; i++) {
	      System.out.println(i);
	    }
}
}  
}
////////////////loop3
package brief1;
class brief1class1  
{  
public static void main(String[] args)  
{  
	for (double i = 0; i < 5; i += 0.5) {
	      System.out.println(i);
	    }  
}
}

	
////////////////loop2
	package brief1;
class brief1class1  
{  
public static void main(String[] args)  
{  
	int i = 1;
	int j=11;
	int k;
	if(j>2 && j<100){
	while (i < 30) {
		  k = j*i;
	      System.out.println(k);
	      i ++;
	}
	} 
}
}


///////////////////////////////////////////////////
package brief1;
class brief1class1  
{  
public static void main(String[] args)  
{  
////////////////loop4
int i= 120;
if (i>1 && i< 15){
for(i=1;i<15 ;i++){
System.out.println(i + " On y arrive presque");
}
}


////////////////LOOP5
else if (i>0 && i< 20){
for(i=20;i>0 ;i--){
System.out.println(i + " C'est presque bon...");
}
}


////////////////LOOP6
else if (i>1 && i< 100){
for(i=1;i<100 ;i+= 15){
System.out.println(i + " On tient le bon bout...");
}
}


////////////////LOOP7
else if (i>0 && i< 200){
for(i=200;i>0 ;i-= 12){
System.out.println(i + " Enfin !!");
}
}
}

}