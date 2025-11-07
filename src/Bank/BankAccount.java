package Bank;

public class BankAccount {

	private String accountNo;
	private String accountHolder;
	private double balance;
	private String accountType;
	private String ifscCode;
	private String branch; 
	
	public BankAccount(String accountNumber, String accountHolder, double balance, String accountType, String ifscCode, String branchName) {
		this.accountHolder = accountHolder;
		this.accountNo = accountNumber;
		this.balance = balance;
		this.accountType = accountType;
		this.ifscCode = ifscCode;
		this.branch = branch;
	}
	
	public void deposite(double depositeAmount) {
		System.out.println("Deposite Money " + depositeAmount);
		balance += depositeAmount;
		System.out.println("Successfully deposited ₹" + depositeAmount);
	}
	
	public void withdraw(double withdrawAmount) {
		if(balance >= withdrawAmount) {
			System.out.println("Withdraw Money " + withdrawAmount);
			balance -= withdrawAmount;
			System.out.println("Successfully deposited ₹" + withdrawAmount);
		} else {
			System.out.println("Insufficient Balance..!");
		}
	}
	
	public void transfer(String accountNo, double transferAmount) {
		if(transferAmount <= this.balance) {
			System.out.println("tranfer amount " + transferAmount);
			balance -= transferAmount;
			System.out.println("Amount transfer sucessfully");
		} else {
			System.out.println("Insufficient Balance..!");
		}
	}
	
	public void balance() {
		System.out.println("Bank Balance " + this.balance);
	}
	
    public void display() {
        System.out.println("Account Number : " + accountNo);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Branch Name    : " + branch);
        System.out.println("IFSC Code      : " + ifscCode);
        System.out.println("Current Balance: ₹" + balance);
    }

}
