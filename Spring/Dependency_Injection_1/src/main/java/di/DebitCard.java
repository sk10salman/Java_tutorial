package di;

public class DebitCard implements Card{
	public Address address;
	public DebitCard(Address address)
	{
		this.address=address;
	}
	public void details() {
		System.out.println("This is Debit Card");
	}

}
