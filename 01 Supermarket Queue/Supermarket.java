public class Supermarket implements PersonQueue {

	private Person startQueue;
	
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

	public String servePerson() {
		if(startQueue == null) {
			return "null";
		}
		if(size() == 1) {
			String str = startQueue.getName();
			startQueue = null;
			return str;
		}
		Person current = startQueue;
		for(int i = 1; i < size(); i++) {
			current = current.getNext();	
		}
		String str = current.getName();
		current = startQueue;
		for(int i = 1; i < (size() - 1); i++) {
			current = current.getNext();
		}
		current.setNext(null);
		return str;
	}
	
	public int size() {
		if(startQueue == null) {
			return 0;
		}
		int counter = 1;
		Person current = startQueue;
		while(current.getNext() != null) {
			counter++;
			current = current.getNext();
		}
		return counter;
	}
	
	public void prettyPrint() {
		Person current = startQueue;
		System.out.println();
		if(size() == 0) {
			System.out.println("CUSTOMERS QUEUE - Empty!");
			System.out.println();
		}
		else {
			System.out.println("CUSTOMERS QUEUE - Total of " + size() + " customers.");
			System.out.println();
			String[] names = new String[size()];
			for(int i = size(); i > 0; i--) {
				names[i - 1] = current.getName();
				current = current.getNext();
			}
			for(int i = 0; i < size(); i++) {
				if(i == 0){
					System.out.println("Queue postion number " + (i + 1) + " : " + names[i] + " <--- TOP OF THE QUEUE!");
				}
				else {
					System.out.println("Queue postion number " + (i + 1) + " : " + names[i]);
				}
			}
		}
	}

}
