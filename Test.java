public class Test {

	public static void main(String[] args) {
	
		Supermarket superQueue = new Supermarket();
		
		String str;
		String name;
		
		System.out.println();
		System.out.println("Let's add customers to our queue.");
		System.out.println();
		
		while(true) {
			System.out.print("Enter the name of the customer (end with 0): ");
			name = System.console().readLine();
			if(name.equals("0")) {
				break;
			}
			Person newCustomer = new Person(name);
			superQueue.addPerson(newCustomer);
			//superQueue.prettyPrint();
		}

	}
	
}
