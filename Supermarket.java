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
	}
	
	public String servePerson() {
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
	}
}
