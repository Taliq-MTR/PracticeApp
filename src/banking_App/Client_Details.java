package banking_App;

public class Client_Details {
	String name;
	int id;
	
//	Creating getters for Client_Details class
	public  String getName() {
		return name;
	}
	
	
	public  int getId() {
		return id;
	}
//	Parameterized constructor for Client_Details class
	public Client_Details (String name, int id) {
		this.name= name;
		this.id= id;
	}
	
}
