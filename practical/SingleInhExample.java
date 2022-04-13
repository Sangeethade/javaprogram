class Vehicle{
String type="4WHEELER";
String name="FORD";
}
class Car extends Vehicle{
String modelname="123abc";
}
class SingleInnExample{
public static void main(String[]args){
Car c = new Car();
System.out.println("Car brand is: " +c.brand);
System.out.println("Car model is: " +c.modelname);
}
}

