public interface PersonQueue {

	/*
	Adds another person to the queue.
	*/

	void addPerson(Person customer);

	/*
	Removes a person from the queue.
	*/

	String servePerson();

}
