package Part_1_7;

public class Main {

	public static void main(String[] args) {
		Account curAccount = new Account("Bob",100);
		
		try {
			curAccount.getMoney("Bob", 10);
		} catch (NotEnoughMoneyException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(curAccount.accountSum);
		}
		
		try {
			curAccount.getMoney("Bob", 100);
		} catch (NotEnoughMoneyException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(curAccount.accountSum);
		}
		
		try {
			curAccount.getMoney("John", 100);
			System.out.println(curAccount.accountSum);
		} catch (NotEnoughMoneyException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(curAccount.accountSum);
		}

	}

}
