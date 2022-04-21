public interface Baank{
double Savings();
double Deposit();
}
class InterfaceExample{
class SBI implements Baank{
@override
public double Savings(){
return 6.5;
}
@override
public double Deposit(){
return 5.1;
}

}
class Axiss implements Baank{
@override
public double Savings(){
return 5.6;
}
@override
public double Deposit(){
return 4.8;
}
}
}
public class InterfaceExample{
public static void main(String[]args){
Baank b = new SBI();
System.out.println("Deposit is:" +b.Deposit()+"Savings is:" +b.Savings());
Baank b1 = new Axiss();
System.out.println("Deposit is:" +b.Deposit()+"Savings is:" +b.Savings());
}
}