import java.util.Scanner;
class SwitchExample{
public void show(){
Scanner s = new Scanner(System.in);
System.out.println("Enter day");
int day = s.nextInt();
switch(day){
case 1:
system.out.println("Its me monday...");
break;
case 2:
system.out.println("Its me tuesday...");
break;
case 3:
system.out.println("Its me wednesday...");
break;
case 4:
system.out.println("Its me thursday...");
break;
case 5:
system.out.println("Its me friday...");
break;
case 6:
system.out.println("Its me saturaday...");
break;
case 7:
system.out.println("Its me sunday...");
break;
default:
System.out.println("incorrecr day...");
}
}
public static void main(String args[]){
SwitchExample s = new SwitchExample();
s.show();
}
}