import java.util.Scanner;
class IfElseIfExample{
public void show(){
Scanner s = new Scanner(System.in);
System.out.println("Enter time");
int time = s.nextInt();
if (time<12){
System.out.println("hi...gud mrng");
}
else if (time<17){
System.out.println("hi...gud afternoon");
}
else if (time<21){
System.out.println("hi...gud eve");
}
else{
System.out.println("bye....gud nyt");
}
}
public static void main(String[]args){
IfElseIfExample e =  new IfElseIfExample();
e.show();
}
}