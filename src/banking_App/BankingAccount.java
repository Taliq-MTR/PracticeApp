package banking_App;

import java.util.Scanner;

public class BankingAccount {
	double bal;
	double prevTrans;
	String customerName;
	int customerId;
	
	BankingAccount(String customerName, int customerId){
		this.customerName=customerName;
		this.customerId= customerId;
		
	}
// public static void main () {
//	
//	Scanner sc= new Scanner(System.in);
// }
	
	void deposit(double amount) {
		if(amount!=0) {
			bal+=amount;
			prevTrans=amount;
		}
		
	}
	
	void withdraw (double amnt) {
		if (amnt>bal) {
			System.out.println("Insufficient balance");
			return;
		}
		bal-=amnt;
		prevTrans = -amnt;
		
	}
	 double getbalnace ( ) {
		return this.bal;
		
	}
    double getPrevTrans() {
    	return this.prevTrans;
    }
    
    void menu() {
    	char option;
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Welcome "+customerName);
        System.out.println("Your ID:"+customerId);
        System.out.println("\n");
        System.out.println("a) Check Balance");
        System.out.println("b) Deposit Amount");
        System.out.println("c) Withdraw Amount");
        System.out.println("d) Previous Transaction");
        System.out.println("e) Exit");
        do {
        	System.out.println("Choose an option");
        	option=sc.next().charAt(0);
        	switch(option){
        		case 'a':
        			System.out.println("......................");
                    System.out.println("Balance ="+bal);
                    System.out.println("......................");
                    System.out.println("\n");
                 break;
        		 case 'b':   
        			 System.out.println("............");
        			 System.out.println("Enter the Amount");
        			 double amt=sc.nextDouble();
        			 deposit(amt);
        			 System.out.println("/n");
        	     break;
        		 case 'c':
        			 System.out.println("............");
        			 System.out.println("Enter the Amount");
        			 double amtw=sc.nextDouble();
        			 withdraw(amtw);
        			 System.out.println("/n");

        		 break;	 
        		 case 'd':
        			 
        		 break;
        		 case 'e':
        			 System.out.println("......................");
        		 break;	 
        		 default:
                     System.out.println("Choose a correct option to proceed");	 
                 break;
        	}
        } while (option !='e'); 
        System.out.println("Thank you for using our banking services");    
    }
    
     
}
