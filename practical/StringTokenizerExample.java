import java.util.StringTokenizer;

 class StringTokenizerExample {
	 public void myy() {
		 StringTokenizer t = new StringTokenizer("Anudip Foundation and career Development Center"," ");
		 while (t.hasMoreTokens()) {
			 System.out.println(t.nextToken());
		 }
		 StringTokenizer st = new StringTokenizer(" I am Mamta,staying in Mumbai,working in Anudip");
		 while(st.hasMoreTokens()) {
			 System.out.println("Next Token:"+st.nextToken(","));
		
		 }
	 }

	public static void main(String[] args) {
		StringTokenizerExample m = new StringTokenizerExample();
		m.myy();

	}

}
