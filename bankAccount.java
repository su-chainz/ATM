public class bankAccount {
	private User user;
	private double balance;
	private int accountNumber;
	private int PIN;
	
	public bankAccount(User user, double balance, int accountNumber, int PIN) {
		this.user = user;
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.PIN = PIN;
	}
	public void deposit(double depositAmount) {
		balanceSet(depositAmount + balanceGet());
	}
	public void withdraw(double withdrawAmount) {
		balanceSet(balanceGet() - withdrawAmount);
	}
	public void showBalance() {
		System.out.println("Balance: $" + balanceGet());
	}
	public void balanceSet(double balanceInput) {
		balance = balanceInput;
	}
	public void accountNumberSet(int accountNumberInput) {
		accountNumber = accountNumberInput;
	}
	public void PINSet(int PINInput) {
		PIN = PINInput;
	}
	public double balanceGet() {
		return balance;
	}
	public int accountNumberget() {
		return accountNumber;
	}
	public int PINget() {
		return PIN;
	}
	public void userSet(User input) {
		user = input;
	}
	public User userGet() {
		return user;
	}
	
	
}