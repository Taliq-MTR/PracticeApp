package banking_App;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
        System.out.println("Please Enter your name");
        String getName=sca.nextLine();
        System.out.println("Please Enter your id");
        int getId=sca.nextInt();

         BankingDatabase data = new BankingDatabase();
         
         
         data.get_customer_data();
		  for(int i=0; i<data.nameList.size(); i++) {
			  if (getName == data.nameList.get(i).getName()) {
				  
				  
			  }
			  
//			 System.out.println(data.nameList.get(i).getName() +  " "+ data.nameList.get(i).getId());
			  
			   }
		  
		  
		  System.out.println("Please Enter Valid Credential name")
	
	}

}

