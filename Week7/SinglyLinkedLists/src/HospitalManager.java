
public class HospitalManager {
	private Patient patientListStart = null;
	public static void main(String[] args) {
	// ...
	HospitalManager hm = new HospitalManager();
	// ...
	}
	// ...inside some method, maybe launch()
	Patient firstPatient = new Patient("John", 33, "Tuberculosis");
	patientListStart = firstPatient;
	Patient yetAnotherPatient = new Patient("Mary", 66, "Meningitis");
	patientListStart.addPatient(yetAnotherPatient);
	
}
