import java.util.Scanner;
class Factorial{
public static void main(String[]args){
int fact = 1,num,i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the factorial");
num = sc.nextInt();
for(i=1;i<=num;i++){
fact=fact*i;
}
System.out.println("Factorial is");
}
}