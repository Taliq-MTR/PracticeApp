package banking_App;

import java.util.ArrayList;
import banking_App.Client_Details;
public class BankingDatabase {
	
	
	public static void main(String[] args) {
	
		
		Client_Details c1= new Client_Details("Tushar", 3546);
		Client_Details c2= new Client_Details("Nikhil", 1546);
		Client_Details c3= new Client_Details("MTR", 13546);
		Client_Details c4= new Client_Details("Snehal", 97468);
		Client_Details c5= new Client_Details("Shubhangi", 24);
		Client_Details c6= new Client_Details("Sheldon", 5468);
		Client_Details c7= new Client_Details("Tal", 7481);

//	   Creating an array list of Client_Details type
	   ArrayList <Client_Details> nameList= new ArrayList<>();

	   nameList.add(c1);
	   nameList.add(c2);
	   nameList.add(c3);
	   nameList.add(c4);
	   nameList.add(c5);
	   nameList.add(c6);
	   nameList.add(c7);
	   System.out.println(nameList.toString());
	   for(int i=0; i<nameList.size(); i++) {
		   System.out.println(nameList.get(i).getName() +  "  "+ nameList.get(i).getId());
		   

	   }
	}

}
