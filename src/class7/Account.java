package class7;

public class Account {
	// Every data inside an object should be private;

	private double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance < 0) {
			throw new IllegalArgumentException(balance + " is balance and it can't be less than 0");
		}
		this.balance = balance;

	}

	public static void main(String args[]) {
		Account a = new Account();
		System.out.println(a.getBalance());
		a.setBalance(100);
		System.out.println(a.getBalance());
		a.setBalance(-100);
		System.out.println(a.getBalance());
		a.balance = -100;
	}
}
