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
    
    
}
