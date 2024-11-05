import java.util.*;
class BankAccount
{
	double balance;
	BankAccount(double balance)
	{
		this.balance=balance;
	}

	
	
}

class AtmMachine extends BankAccount
{
	AtmMachine(double balance)
	{
		super(balance);
	}
	
	void Deposit()
	{
		Scanner scanner = new Scanner(System.in);
		double debitAmount;
		System.out.print("Enter the Deposit amount = ");
		debitAmount = scanner.nextDouble();
		System.out.println();
		
		balance+=debitAmount;
		
		System.out.println("Rs:"+debitAmount+" is depositted to your bank account Successfully. Your current balance is = "+balance);
		System.out.println();
	}
		
	
	void Withdrawal()
	{
		Scanner scanner = new Scanner(System.in);
		double withDrawalAmount;
		System.out.print("Enter the Withdrawal amount = ");
		withDrawalAmount = scanner.nextDouble();
		System.out.println();
		
		if(withDrawalAmount > balance)
		{
			System.out.println("Insufficient balance.... Your current balance is = "+balance);
		}
		else if(withDrawalAmount == 0)
		{
			System.out.println("Please enter the valid withdrawal amount...");
		}
		else
		{
			balance-=withDrawalAmount;
			
			System.out.println("Rs:"+withDrawalAmount+" is withdrawn from your bank account Successfully. Your current balance is = "+balance);
			System.out.println();
		}
	}

	void checkBalance()
	{
		System.out.println("Your bank account balance is = "+balance);
	}
}

class ATM
{
	public static void main(String[] args)
	{
		System.out.println("=====================================================BANK ATM=======================================================");
	
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the balance of his/her account : ");
		double balance = scanner.nextDouble();
		
		AtmMachine atm = new AtmMachine(balance);
		
		int choice;
		
		boolean exit=false;
		
		while(!exit)
		{
			System.out.println("1. DEPOSIT");
			System.out.println("2. WITHDRAW");
			System.out.println("3. CHECK BALANCE");
			System.out.println("4. Exit");
			System.out.println();
			System.out.print("Enter your choice = ");
			choice=scanner.nextInt();
			System.out.println();
			
			switch(choice)
			{
				case 1:
				atm.Deposit();
				break;
				
				case 2:
				atm.Withdrawal();
				break;
				
				case 3:
				atm.checkBalance();
				break;
				
				case 4:
				exit=true;
				System.out.println("Exiting......");
				break;
				
				default:
				System.out.println("Invalid Choice! . Please try again");
			}
		}
	}
}
				

	
		
		
		
		
	
	