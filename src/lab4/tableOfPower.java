package lab4;

import java.util.Scanner;

public class tableOfPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scnr = new Scanner(System.in);
    
      String cont;
      do { 
      System.out.println("Choose a number.");
      
      int num= scnr.nextInt();
      
      System.out.printf("number");
   
      System.out.printf("%10s","Squared");
     
      System.out.printf("%10s", "Cubed");
      System.out.println();
      System.out.printf("______");
      System.out.printf("%10s","______");
      System.out.printf("%10s","______");
    
    	
  	 
      System.out.println();
    	 //Calculate  square and cubed
      for (int i= 1; i <= num; i++){ 
    	 
    	  System.out.printf("%-10s", i);
    	  System.out.printf("%-10s", i*i);
    	  System.out.printf( "%-15s",i*i*i);
    	  System.out.println();
    	  
    	 // if(num== num) { 
    	//	  break;
    	  }
      
      System.out.println();
      System.out.println("Do you want to continue? (y/n)");
      
       cont = scnr.next();
      
     } while (cont.equalsIgnoreCase("y"));
       
      System.out.println ("Goodbye!");
      
      scnr.close();
      
	}

}
