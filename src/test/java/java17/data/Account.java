package java17.data;

public class Account {

    /** Constructeur
	 * @param owner
	 * @param balance
	 */
	public Account(Person owner, Integer balance) {
		super();
		this.owner = owner;
		this.balance = balance;
	}

	private Person owner;
    private Integer balance;

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
