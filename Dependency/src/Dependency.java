class Account1
{
	String accno;
	String name;
	String balance;
	 
	Account1(String accno1,String name1, String balance1)
	{
		accno=accno1;
		name=name1;
		balance=balance1;
	}
	
}
class Transaction1
{
	void deposite(Account1 account1, int amount)
	{
		account1.balance=account1.balance+amount;
		System.out.println("Amount Deposites Succesfully");
		System.out.println("Nmae:" +account1.name);
		System.out.println("Accoount No:" +account1.accno);
		System.out.println("Total Balance:" +account1.balance);
	}
}
public class Dependency {

}
