package coll.UserAccounts;

public class BankAccount {
	
	private User user;
	private double funds;
	
	
	/**
	 * Constructs a bank object with $0.0 funds and assigns the given User as the
	 * owner.
	 * @param owner
	 */
	public BankAccount(User owner) {
		this.user = owner;
		this.funds = 0.0;
	}

	/**
	 * Gets the total funds in the account.
	 * @return
	 */
	public double getFunds() {
		return funds;
	}

	/**
	 * Deposits money into the account.
	 * @param deposit. The sum of money in $ to be deposited.
	 */
	public void deposit(double deposit) {
		funds+=deposit;
	}

	/**
	 * Withdraws money from the account. Only the owner can withdraw funds.
	 * @param user. The user attempting to withdraw funds.
	 * @param withdrawal. The amount to be withdrawn.
	 * @throws UserException if anyone but the owner is attempting to withdraw funds.
	 * @throws FundsException if there are insufficient funds in the account.
	 */
	public void withdraw(User user, double withdrawal) throws UserException, FundsException {
		if (this.user == user) {
			if (funds > withdrawal) {
				funds -= withdrawal;
			} else {
				throw new FundsException();
			}
		} else {
			throw new UserException();
		}
	}
}