public class Person {

	private String name;
	private Person nextPerson;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Person getNext() {
		return nextPerson;
	}
	
	public void setNext(Person nextPerson) {
		this.nextPerson = nextPerson;
	}
}
