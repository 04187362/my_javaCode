package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("4435C");

	}

}


class BankAccount{
	//properties
	private  static int id=101;
	private String accountNumber;
	private String routingNumber;
	private String name;
	private String SSN;
	private double balance;
	
	//the constructor
	public BankAccount(String SSN){
		System.out.println("New account created");
	}
	
	public void setAccountNumber(){
		
	}
	
}
