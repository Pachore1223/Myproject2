import java.util.Scanner;
 class Account{
	private double balance;
	  public Account(double intialbalance) {
		  this.balance=intialbalance;
	  
	  }
	  public double getbalance() {
		  return balance;
		  
	  }
	  public void deposit(double amount ) {
		  if(amount>0) {
			  System.out.println("deposit amount is"+amount+" sucessfull and your current amount is"+balance);
		  }
		  else {
			  System.out.println("Invalid deposit amount");
			  
		  }
	  }
	  public void withdraw(double amount) {
		  if(amount>0&&amount<=balance) {
			  System.out.println("withdraw of $"+amount+"sucessfull and your current balance is "+balance);
		  
		  
		  }
		  else {
			  System.out.println("Insufficient balance in your account");
			  
		  }
		  
	  }
	
}
 class ATM {
	private Account bankAccount;
	
	 public ATM(Account bankAccount){
		 this.bankAccount=bankAccount;
	 }
	 public void display() {
		 System.out.println("ATM menu");
		 System.out.println("1.check Balance");
		 System.out.println("2. Deposit");
		 System.out.println("3. Withdraw ");
		 System.out.println("4. Exit");
	 }
	 public void performTranscation(int choice ,Scanner scanner) {
		 switch(choice){
			 case 1:
				 System.out.println("Current amount  $"+bankAccount.getbalance());
				 break;
			 case 2 :
				 System.out.println("Enter deposit amount");
				 double depositAmount=scanner.nextDouble();
				 bankAccount.deposit(depositAmount);
				 
			 case 3:
				 System.out.println("Enter withdraw amount ");
				 double withdrawAmount=scanner.nextDouble();
				 bankAccount.withdraw(withdrawAmount);
			 case 4:
				 System.out.println("Exit ATM . Thankyou");
				 scanner.close();
				 System.exit(0);
				 default :
					 System.out.println("Invalid choice by user");
		 }
	 }
}
public class  Atm_interface{
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter intial account Balance:");
		double intialbalance=scanner.nextDouble();
		Account account=new Account(intialbalance);
		  ATM atm=new ATM(account);
		  
		  while(true) {
			  atm.display();
			  System.out.println("Please select OPtion");
			  int choice= scanner.nextInt();
			  atm.performTranscation(choice, scanner);
			  
			  
		  }
		
		
	}
	
}

		 
		 
	
		 
		 
		 
		 
	



