
public class BankAccount {
	
private String ownerName;
private String accountNumber;
	private Address address;
	private double balance;
	private String createDate;
	private STATUS status;
	
	public void issue() {
		if (status == STATUS.INACTIVE) {
			throw new RuntimeException("YOUR CURRENT ACCOUNT IS NOT ACTIVE");
		}
		
		
		this.status = STATUS.ACTIVE;
	}
	public BankAccount(String accNumber, String accName) {
		accountNumber = accNumber;
		ownerName = accName;
		balance = 0;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}

	
}
