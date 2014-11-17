public class SupermarketImp implements Supermarket{
	public static void main(String[] args) {
		PersonQueue queue = new PersonQueueImp();
	}
	public void addPerson(Person p){
		Person p = new Person();
		insert(p);
	}
	public Person servePerson(){
		return retrieve();
	}
}
