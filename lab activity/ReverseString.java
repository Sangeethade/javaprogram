import java.util.*;  
public class ReverseString  {
  
public static void main(String[] arg)  
{  
ReverseString rs=new ReverseString();  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a string: ");  
String str=sc.nextLine();    
System.out.println("Reverse of a String  is : "+ReverseString.reversestr(str));           
}  

static String reversestr(String s)  
{  
String r="";  
for(int i=s.length();i>0;--i)          
{  
r=r+(s.charAt(i-1));   
}  
return r;  
}  
}  