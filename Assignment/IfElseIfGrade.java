import java.util.Scanner;
class IfElseIfGrade{
 public void show(){
 Scanner s = new Scanner(System.in);
 System.out.println("Enter marks");
 int marks = s.nextInt();
 if(marks>=35 && marks<45){
 System.out.println("D grade");
 }
 else if(marks>=45 && marks<55){
 System.out.println("C grade");
 }
 else if(marks>=60 && marks<75){
 System.out.println("B grade");
 }
 else if(marks>=75 && marks<85){
 System.out.println("A grade");
 }
 else if(marks>=85 && marks<100){
 System.out.println("O grade");
 }
 else{
 System.out.println("absent");
 }
 }
 public static void main(String[]args){
 IfElseIfGrade g = new IfElseIfGrade();
 g.show();
 }
 }