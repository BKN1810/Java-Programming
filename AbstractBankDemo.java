//AbstractBankDemo.java
abstract class BankAccount {
	//abstract methods
	public abstract void deposit();
	public abstract void withdraw();
}

class SavingsAccount extends BankAccount{
	public void deposit()  {
		System.out.println("This is the concrete deposit method of SavingsAccount"); }
	public void withdraw()  {
		System.out.println("This is the concrete withdraw method of SavingsAccount\n"); }
}

class CurrentAccount extends BankAccount{
	public void deposit()  {
		System.out.println("This is the concrete deposit method of CurrentAccount");   }
	public void withdraw()   {
		System.out.println("This is the concrete withdraw method of CurrentAccount\n");   }
}
//FixedDepositAccount class extends BankAccount class
class FixedDepositAccount extends BankAccount {
	public void deposit()   {
		System.out.println("This is the concrete deposit method of FixedDepositAccount");  }
	public void withdraw()  {
		System.out.println("This is the concrete withdraw method of FixedDepositAccount");  }
}
public class AbstractBankDemo {
	public static void main(String args[])  {
		BankAccount obj = new SavingsAccount();
		obj.deposit();
		obj.withdraw();
		
		BankAccount obj1 = new CurrentAccount();
		obj1.deposit();
		obj1.withdraw();
		
		BankAccount obj2 = new FixedDepositAccount();
		obj2.deposit();
		obj2.withdraw();
   }
}
