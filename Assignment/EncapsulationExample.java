import java.util.Scanner;

class Bank{
private String accountName;
private int accountNum;
private float amount;
	
public String getAccountName() {
	return accountName;
}
public void  setAccountName(String accountName) {
	this.accountName = accountName;
}
public int getAccountNum() {
	return accountNum;
}
public void setAccountNum(int accountNum) {
	this.accountNum = accountName;
}
public float getAmt() {
	return Amt;
}
public void setAmt(float amt) {
	this.Amt = Amt;
}

}
public class EncapsulationExample{
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Account name ");
		String accountName = s.nextLine();
		System.out.println("Enter Account number");
		int accountnum = s.nextInt();
		System.out.println("Enter Amount");
		float amt = s.nextFloat();
		
		Bank b = new Bank();
		//setting values
		b.setAccountName(accountName);
		b.setAccountNum(accountnum);
		b.setAmt(amt);
		
		//getting values
		System.out.println("Account Name is :"+b.getAccountName());
		System.out.println("Account Number is:"+b.getAccountNum());
		System.out.println("Account balance is"+b.getAmt());
	}
}
		
	
