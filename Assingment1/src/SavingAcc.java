
public class SavingAcc extends BankAccount {
	 private float balance;
	 
	 public SavingAcc(String accNumber, String accName, double rate) {
			super(accNumber, accName);
			
		}
	 public boolean deposit(float amount) {
			if (amount > 0) {
				balance = balance + amount;
				return true;
			} else {
				return false;
			}
		}

		
		public boolean withdraw(float amount) {
			if (amount > balance) {
				return false;
			} else {
				balance = balance - amount;
				return true;
			}
		}
}
	    
