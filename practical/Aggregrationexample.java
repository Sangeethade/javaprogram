class Address{
String street, city, state, country;
int pincode;

public Address( String street, String city, String state, String country, int){
this.street = street;
this.city = city;
this.state = state;
this.country = country;
this.pincode = pincode;

 }
}
class Student{
int studentId;
String studentName, courseName, centerName;
Address addr; //aggregration

public Student(int studentId,String studentName,String courseName,String centerName,Address addr){
    this.studentId = studentId;
	this.studentName = studentName;
	this.courseName = courseName;
	this.centerName = centerName;
	this.addr = addr;
	
public void display(){	
System.out.println("Id is:"+studentId + " " +"Name is:" + studentName + " " + "course is:" + courseName+ " ");
System.out.println(addr.street + " " +addr.city + " " + addr.state + " " + addr.country + " " + addr.pincode);
}
}
class Aggregrationexanple{
public static void main(String[]args){
Address a = new Address("XYZ street","mumbai","MH","India",400065);
Address a1 = new Address("ABC road","chennai","TN","India",600053);
student s = new student (101,"mamta","java","chennai",a);
student s1 = new student (102,"ram",".net","kolkata",a1);
s.display();
s1.display();
}	 
}