package di;

public class CreditCard implements Card{
  int limit;
  String bankname;
  public CreditCard(int limit,String bankname)
  {
	  this.limit=limit;
	  this.bankname=bankname;
  }
	public void details() {
		System.out.println("This is Credit Card "+limit+ " from "+bankname);
	}
}
