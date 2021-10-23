 class Account
{
	int acc_no;
	String name;
	
	Account(int acc_no,String name)
	{
		this.acc_no=acc_no;
		this.name=name;
	}
}
	class LoanAccount extends Account
	{
		double amount;
		LoanAccount( int acc_no,String name,double amount)
		{
			super(acc_no,name);
		
		    this.amount=amount;
		}
	}
	
	public class Example
	{
		public static void main(String[] args)
		{
			LoanAccount la=new LoanAccount(125975555,"sai",5000);
			System.out.println("account no"+la.acc_no);
			System.out.println("Name is"+la.name);
			System.out.println("Amount is"+la.amount);
			//LoanAccount lal=a
			//LoanAccount 
			Account a=la;//upcasting
			LoanAccount al=(LoanAccount)a;//downcasting
			}

	}
