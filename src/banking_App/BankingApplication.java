package banking_App;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Please Enter Customer name");
		String getName = sca.nextLine();
		System.out.println("Enter the Customer Id");
		int getId = sca.nextInt();
		BankingDatabase data = new BankingDatabase();

		data.get_customer_data();
		
		boolean isUserFound = false;
		for (int i = 0; i < data.nameList.size(); i++) {
			if (getName.equals(data.nameList.get(i).getName())  && getId== data.nameList.get(i).getId()) {
				isUserFound=true;
				break; // End lopp
			}
		}
		
		if(isUserFound) {
			System.out.println("Welcome on board...");
		}else {
			System.out.println("User not found");
		}
		 
			
		


		
//		data.get_customer_data();
//		for (int i = 0; i < data.nameList.size(); i++) {
//			if (getId == data.nameList.get(i).getId()) {
////				System.out.println("Enter the Customer Id");
//				break; // End lopp
//			}
//
//			else {
//				System.out.println("Id not found");
//			}
//
//		}

//		System.out.println("Please Enter Valid Credential name");

	}

}
