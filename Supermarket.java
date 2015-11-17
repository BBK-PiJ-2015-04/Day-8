public class Supermarket implements PersonQueue {

	private Person startQueue = null;
	
	public Supermarket() {
		startQueue = null;
	}

	public void addPerson(Person customer) {
		if(startQueue == null) {
			startQueue = customer;
		}
		else {
			Person temp = new Person("Start");
			temp.setNext(startQueue);
			temp.setName(customer.getName());
			startQueue = temp;
		}
		return;
	}

	
	/*public String servePerson() {
		if(startQueue == null) {
			return "null";
		}
		int counter = 1;
		Person current = startQueue;
		while(current.getNext() != null) {
			current = current.getNext();
			counter++;
		}
		// String temp = current.getName();
		current = startQueue;
		for(int i = 1; i < (counter - 1); i++) {
			current = current.getNext();
		}
		current.setNext(null);
		return temp;
	}*/
	
	/*public static void main(String[] args) {
		
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
			superQueue.prettyPrint();
		}
		
	}*/
}
