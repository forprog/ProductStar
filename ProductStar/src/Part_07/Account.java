package Part_07;

public class Account {
	String ownerName;
	int accountSum;

	public Account(String ownerName, int accountSum) {
		super();
		this.ownerName = ownerName;
		this.accountSum = accountSum;
	}

	public void getMoney(String ownerName, int sumToGet) throws NotEnoughMoneyException {
		if (this.ownerName.equals(ownerName)) {
			if (sumToGet <= accountSum) {
				this.accountSum = this.accountSum - sumToGet;
			} else {
				throw new NotEnoughMoneyException("Not enough money");
			}
		} else {
			throw new WrongOwnerException();
		}
	}
	
}
