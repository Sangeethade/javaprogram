import java.util.ArrayList;
import java.util.Iterator;
public class Bank {
	long accountNo;
	String customerName;
	double balance;
	int customerAge;
	
	public Bank (long accountNo,String customerName,double balance,int customerAge) {
	super();
	this.accountNo=accountNo;
	this.customerName = customerName;
	this.balance = balance;
	this.customerAge = customerAge;

}
}

public class ArrayListusingUserdefinedCL {

	public static void main(String[] args) {
		//creating user defined class object
		Bank b = new Bank(12345,"mamta",5000.67,20);
		Bank b1 = new Bank(12346,"ram",7000.67,21);
		Bank b2 = new Bank(12347,"sam",5400.67,30);
		Bank b3 = new Bank(12348,"karan",67000.67,50);
		Bank b4 = new Bank(12349,"priya",24000.67,55);
		Bank b5 = new Bank(12350,"pooja",45000.67,38);
		
		//creating arraylist
		ArrayList<Bank> al = new ArrayList<>();
		al.add(b);
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(b5);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Bank obj =(Bank) itr.next();
			System.out.println(obj.accountNo +" "+obj.customerName+" "+obj.balance+" "+obj.customerAge+" ");
		}
		
	}

}
