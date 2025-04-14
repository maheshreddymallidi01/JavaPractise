package TCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeInterviewImpl {

	public static void main(String[] args) {
		List<EmployeeInterview> empList = Arrays.asList(
				new EmployeeInterview(1, "Mahesh", "Hyderabad"),
				new EmployeeInterview(2, "Sai", "Hyderabad"),
				new EmployeeInterview(3, "Abhinav", "Bangalore"),
				new EmployeeInterview(4, "rahul", "Kolkata"),
				new EmployeeInterview(5, "Vinay", "Bangalore"),
				new EmployeeInterview(6, "Devi", "Kolkata"));
		
		Map<String, List<EmployeeInterview>> empSort = empList.stream().collect(Collectors.groupingBy(EmployeeInterview::getCity));
		System.out.println(empSort);
	}

}
