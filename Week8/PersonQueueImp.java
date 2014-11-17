public class PersonQueueImp implements PersonQueue {
	private PersonQueue q = null;

	public void insert(Person p){
		if (q == null){
			q = p;
		} else {
			//newP.setNext(q);

			q = newP;
		}
	}
	public Person retrieve(){
		Person fakeP = new Person("Nobody");
		if (q == null){
			return fakeP;
		}

	}

}