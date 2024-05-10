package calculator;

import java.util.Scanner;

public class CalculatorApp {

    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean condition= true;
		while(condition) {
		System.out.println("Please Choose The Operation");
		System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
		
		int ch= sc.nextInt();
		
		switch(ch) {
		case 1:
			addition ();
			System.out.println("Thank you For Using the calculator");
			break;
		case 2:
			subtraction();
			System.out.println("Thank you For Using the calculator");
			break;
		case 3:

			multiplication();
			System.out.println("Thank you For Using the calculator");
			break;
		case 4:
			division();
			System.out.println("Thank you For Using the calculator");
			break;
		case 5:
			System.out.println("Thank you For Using the Application");
			condition =false;
			break;
		default:
			System.out.println("Please Insert Right Input");
			break;
		}
		}

//		if (a==1) {
//			
//			
//			addition ();
//			System.out.println("Thank you For Using the calculator");
//		
//		      }
//		else if (a==2) {
//			
//			subtraction();
//			System.out.println("Thank you For Using the calculator");
//		      }
//		else if (a==3) {
//			
//			multiplication();
//			System.out.println("Thank you For Using the calculator");
//	      }
//		else if (a==4) {
//			
//			division();
//			System.out.println("Thank you For Using the calculator");
//	      }
//		else  {
//			
//			System.out.println("PLease Select Right Operation");
//			
//	      }
//		
		

		
		}
     public static void addition () 
       {
	   System.out.println("Please Enter Your First Number");
	   double b= sc.nextDouble();
	   System.out.println("Please Enter Your Second Number");
	   double c= sc.nextDouble();
	   double d= b+c;
	   
	   System.out.println("Addition"+" "+"Of"+" "+b+" "+"and"+" "+c+" "+"is"+" "+d);
	
	   }
     
     public static void subtraction () 
     {
	   System.out.println("Please Enter Your First Number");
	   double e= sc.nextDouble();
	   System.out.println("Please Enter Your Second Number");
	   double f= sc.nextDouble();
	   double g= e-f;
	   
	   System.out.println("Subtraction"+" "+"Of"+" "+e+" "+"and"+" "+f+" "+"is"+" "+g);
	
	   }
     
     public static void multiplication () 
     {
	   System.out.println("Please Enter Your First Number");
	   double g= sc.nextDouble();
	   System.out.println("Please Enter Your Second Number");
	   double h= sc.nextDouble();
	   double i= g*h;
	   
	   System.out.println("Multiplication"+" "+"Of"+" "+g+" "+"and"+" "+h+" "+"is"+" "+i);
	
	   }
     
     
     public static void division () 
     {
	   System.out.println("Please Enter Your First Number");
	   double j= sc.nextDouble();
	   System.out.println("Please Enter Your Second Number");
	   double k= sc.nextDouble();
	   if (k>0) {
	   double l= j/k;
	   
	   System.out.println("Division"+" "+"Of"+" "+j+" "+"and"+" "+k+" "+"is"+" "+l);
	   }
	   else {
		   System.out.println("Please enter Natural number");
	   }
	   }


}