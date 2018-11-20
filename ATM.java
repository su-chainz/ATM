import java.util.Scanner;
public class ATM {
	
	private bankAccount account;
	
	public ATM(bankAccount account) {
		this.account = account;
	}
	
	
	public static void main(String[] args) {
		
		ATM atm = new ATM(new bankAccount(new User("Suchetan", 9085146648L, "9 New Providence Ave"), 0, 100000001, 6304));
		atm.showMenu();
		
		
	}
	public bankAccount BankAccountget() {
		return account;
	}
	public void BankAccountset(bankAccount input) {
		account = input;
	}
	
	public void showMenu() {
		
		Scanner in = new Scanner(System.in);
		int choice = 0;
		int PINCheck;
		int BankAccountNumCheck;
		System.out.println("Welcome to the ATM. Happy to be at your service :)");
		
		System.out.println("Pin: ");
		PINCheck = in.nextInt();
		System.out.println("Account Number: ");
		BankAccountNumCheck = in.nextInt();
		if( PINCheck == account.PINget() && BankAccountNumCheck == account.accountNumberget()) {
			
			while (choice != 4) {
				System.out.println("What would you like to do? \n\n 1 \t Withdraw \n 2 \t Deposit \n 3 \t Balance \n 4 \t Exit \n\n Please enter the number corresponding number of an action. \n");
				choice = in.nextInt();
				if (choice == 1) {
					System.out.println("How much you would like to withdraw?");
					double withdrawAmount_ = in.nextDouble();
					if(withdrawAmount_ <= account.balanceGet() ) {
						account.withdraw(withdrawAmount_);
						System.out.println("Current Balance: $" + account.balanceGet());
					}
					else {
						System.out.println("Insufficient funds! Perhaps next time!");
						System.out.println("Current Balance: $" + account.balanceGet());
					}
				}
				else if (choice == 2) {
					System.out.println("How much you would like to deposit?");
					double depositAmount_ = in.nextDouble();
					account.deposit(depositAmount_);
					System.out.println("Current Balance: $" + account.balanceGet());
				}
				else if (choice == 3) {
					System.out.println("Current Balance: $" + account.balanceGet());
				} else if (choice > 4) {
					System.out.println("Please enter a number from the options presented.");
				}
			}
			System.out.println("Have a nice day! Enjoy this nyan cat ~=[,,_,,]:3");
		} else {
			System.out.println("Please provide a valid pin number and account number.");
		}
	}
}