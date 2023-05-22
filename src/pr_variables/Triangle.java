package pr_variables;
// For Printing the Triangle in left side Triangle
import java.util.Scanner;
public class Triangle {
	public static void main (String ags[]) {
//     	print_lefttriangle();
//		pyramid_print();
		mirror_pyramid();
		
	}
	public static void print_lefttriangle()
    {
		System.out.println("Please Enter the number you want to print");
		int num;
	try (Scanner console = new Scanner (System.in)) {
		num = console.nextInt();
	}
	 for (int i = 1; i <=num; i++) {
//        	for outerloop
        	for (int j = num; j>i; j--) {
        		System.out.print(" ");
        	}
//        	for printing pattern
        	for (int j = 1 ; j<=i ; j++ ) {
        		System.out.print(j);
        	}
            System.out.println();
        }
        
      
    }
	public static void pyramid_print() {
		{
			System.out.println("Please Enter the number you want to print");
			int num;
		try (Scanner console = new Scanner (System.in)) {
			num = console.nextInt();
		}
		for (int i=0; i<num; i++ ) {
			for (int j=num-i; j>1; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++) {
				System.out.print("* ");
             }
			System.out.println();
		}
			
			
		}
	}
	public static void mirror_pyramid () {
		{
			System.out.println("Please Enter the number you want to print");
			int num;
		try (Scanner console = new Scanner (System.in)) {
			num = console.nextInt();
		}
//	  	int num = 7;
	    int num1 = num-1;
	    for (int i=0; i<num; i++){
	      for (int j=num1; j>i; j--){
	      	System.out.print(" ");
	      }
	      for (int j=0; j<=i; j++){
	      	System.out.print("* ");
	      }
	    	System.out.println();
	    }
	    
	    for (int i=0; i<num1; i++){

	      for (int j=0; j<=i; j++){
	     	 System.out.print(" ");
	      }
	      for (int j=num1; j>i; j--){
	     	 System.out.print("* ");
	      }
	      
	      System.out.println();
	    }
	  }
   }
	
	
	
	}
