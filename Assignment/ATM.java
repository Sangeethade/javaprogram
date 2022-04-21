import java.util.Scanner;
public class ATM{
public static void main(String[]args){
int bal =5000,withdraw,deposit;
Scanner s = new Scanner(System.in);
{
System.out.println("1:withdraw");
System.out.println("2:deposit");
System.out.println("3:checkbal");
System.out.println("4:exit");
int ch = s.nextInt();
switch(ch){
case 1:
    System.out.println("Enter amount of withdraw:");
	withdraw = s.nextInt();
	if(bal>=withdraw){
	System.out.println("collect money");
	System.out.println("bal is:"+bal);
	}
	else
	{
	System.out.println("insufficient bal");
	System.out.println("");
	}
	break;
case 2:
     System.out.println("Enter amount to deposit:");
	 deposit=s.nextInt();
	 bal =bal+deposit;
	 System.out.println("bal is:"+bal);
	 System.out.println("");
	 break;
case 3:
     System.out.println("bal is:"+bal);
	 System.out.println("");
	 break;
case 4:
	 System.exit(0);
	 break;
}
}
}
}