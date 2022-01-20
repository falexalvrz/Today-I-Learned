package reasoning;
/** *Manage a bank account whose balance must always be positive
 * 
 * @author slashratx
 *@version 1.0
 */
public class BankAccount {
	/*
	 * Bank account owner name
	 */
private String holder;
	/*
	 * Bank account balance
	 */
	private double balance; 
	/**
	 * Deposit money into the account 
	 * 
	 * @param moneyL positive number that is deposited.
	 * for example: balance = 10(called prior_balance)
	 * 				deposit(5) returns balance = 15
	 * 
	 * with money <= 0, does nothing 
	 */
	public void deposit(double money) {
		setBalance(getBalance() + money);
	}
	/*What are the expressions that matches with its meaning for the deposit() method and class:
	 * ANSWERS:
	 * @precondition: money > 0.0 (money that is deposited)
	 * @postcondition: prior_balance < balance <= prior_balance + money
	 * @invariant: holder != null && balance >= 0.0
	 * @statement: balance = prior_blance + money
	 * 
	 * the money to deposit must be greater than 0(precondition). the balance after deposit is equal to the previous balance plus
	 * deposited money(postcondition). The operation that sums money and balance is a program's statement. Finally, the holder
	 * name must not be null and the balance must not be negative(class invariant).
	 */
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
