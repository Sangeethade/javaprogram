public class StringMethodExample {
	public void show() {
		String s = "Anudip Foundation Skill Development";
		String s1 = "ANUDIP";
		System.out.println("UpperCase is:"+ s.upperCase());
		System.out.println("LowerCase is:"+ s.lowerCase());
		System.out.println("Trim is:"+ s.Trim());
		System.out.println("Startswith is:"+ s.startswith("Anu"));
		System.out.println("Endswith is:"+ s.endswith("err"));
		System.out.println("CharAt is:"+ s.charAt(7));
		System.out.println("CharAt is:"+ s.charAt(17));
		System.out.println("Length is:"+ s.length());
		
		int a =20;
		String s2 =String.Valueof(a);
		System.out.println(s2+30);
		System.out.println("Replace is:"+s.replace("Development","Career Development"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringMethodExample obj = new StringMethodExample();
obj.show();
	}

}