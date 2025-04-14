package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PatientByDisease {

	public static void main(String[] args) {
		Patient p1 = new Patient("P1", 23, "Corona", 29000);
		Patient p2 = new Patient("P2", 25, "fever", 9000);
		Patient p3 = new Patient("P3", 22, "Corona", 20000);
		Patient p4 = new Patient("P4", 27, "Corona", 18000);
		
		List<Patient> patients = Arrays.asList(p1,p2,p3,p4);
		patients.stream().filter(p->p.getDisease().equals("Corona")&&p.getAge()>22).forEach(System.out::println);
		
		Double averageBill = patients.stream().filter(p->p.getDisease().equals("Corona")).collect(Collectors.averagingDouble(Patient::getBllPaid));
		System.out.println(averageBill);
	}

}
