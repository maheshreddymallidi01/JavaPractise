package Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByCity {

	public static void main(String[] args) {
		List<EmployeeLocation> emp = new ArrayList<>();
		emp.add(new EmployeeLocation("Amar","Pune"));
		emp.add(new EmployeeLocation("Raj","Pune"));
		emp.add(new EmployeeLocation("Neha","Mumbai"));
		emp.add(new EmployeeLocation("Sam","Mumbai"));
		
		
		Map<String,List<EmployeeLocation>> employee = emp.stream().collect(Collectors.groupingBy(EmployeeLocation::getCity)); 
		System.out.println(employee);

	}

}
