public class HashUtilities {
	
	public static void main(String[] args) {
		while(true){
			
		System.out.println("Give me a string and I will calculate its hash code");
		String str = System.console().readLine();
		int hash = str.hashCode();
		//int smallHash = HashUtilities.shortHash(hash);
		System.out.println("0 < " + hash + " < 1000");
		}
		
	}
	
	public static int shortHash(int numby) {
		
		
		
	}
	
}