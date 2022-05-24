public class IgnoreCaseString {

	public static void main(String[] args) {
		String person1 = "Stephen Edwin King";
		String person2 = "Walter Winchell";
		String person3 = "stephan edwin king";
		
		
		boolean equals1 = person1.equalsIgnoreCase(person2);
		boolean equals2 = person1.equalsIgnoreCase(person3);
		
		System.out.println(" "+person1 + "equals" +person2+ " "+equals1);
		System.out.println(" "+person1 + "equals" +person3+ " "+equals2);
	}

}
