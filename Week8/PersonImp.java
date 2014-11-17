public class PersonImp implements Person{
	private String name = "Nobody";
	private PersonImp pointer = null;
	public PersonImp() {
		//personName = "Nobody";
		SetName();
		//GetName();
    }
    public void SetName(String name) {
		//Sets the name of the person
		personName = name;
		}
}