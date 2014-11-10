public class Spy {
	private static int spyCount = 0;
	int ID;
	//int spyID;
	public Spy (int ID){
		spyCount ++;
		this.ID = ID;
		System.out.println(ID);
		System.out.println("There are " + getNumberOfSpies() + " spies");
	}
	public void die(int ID){
		System.out.println("Spy " + ID + " has been detected and eliminated");
		
		spyCount --;
		System.out.println("There are " + getNumberOfSpies() + "spies");
	}
	public static int getNumberOfSpies() {
		return spyCount;
		}
		
	
	public static void main(String[] args) {
		Spy S1 = new Spy(1);
		Spy S2 = new Spy(2);
		Spy S3 = new Spy(3);
		Spy S4 = new Spy(4);
		S1.die(1);

	}

}
