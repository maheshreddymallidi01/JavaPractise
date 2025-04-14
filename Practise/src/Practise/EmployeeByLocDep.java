package Practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


public class EmployeeByLocDep {

	public static void main(String[] args) {
		EmployeeLocDep empp = new EmployeeLocDep("abc", 26, "male", "IT");
		System.out.println(empp);
		
		List<EmployeeLocDep> emp = Arrays.asList(
				new EmployeeLocDep("abc", 26, "male", "IT"),
				new EmployeeLocDep("xyz", 23, "female", "IT"),
				new EmployeeLocDep("mno", 30, "male", "HR"),
				new EmployeeLocDep("pqr", 22, "female", "HR"));
		
		emp.stream().map(EmployeeLocDep::getDep).distinct().forEach(System.out::println);
		
		Map<String,List<EmployeeLocDep>> empOut = emp.stream().collect(Collectors.groupingBy(EmployeeLocDep::getDep));
		System.out.println(empOut);
		Set<Entry<String,List<EmployeeLocDep>>> entrySet = empOut.entrySet();
		for(Entry<String,List<EmployeeLocDep>> r: entrySet) {
			System.out.println(r.getKey());
			List<EmployeeLocDep> r1 = r.getValue();
			for(EmployeeLocDep r2:r1) {
				System.out.println(r2.toString());
			}
		}
		
		Map<String, EmployeeLocDep> empOut2 = emp.stream().collect(Collectors.groupingBy(EmployeeLocDep::getGender,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(EmployeeLocDep::getAge)), Optional::get)));
		System.out.println(empOut2);
		
		Map<String,Double> empOut3 = emp.stream().collect(Collectors.groupingBy(EmployeeLocDep::getGender,Collectors.averagingInt(EmployeeLocDep::getAge)));
		System.out.println(empOut3);
		Set<Entry<String,Double>> result = empOut3.entrySet();
		for(Entry<String,Double> r : result) {
			System.out.println(r.getKey()+" : "+r.getValue());
		}
		
		Map<String,Map<String,Long>> empOut4 = emp.stream().collect(Collectors.groupingBy(EmployeeLocDep::getDep,Collectors.groupingBy(EmployeeLocDep::getGender,Collectors.counting())));
		System.out.println(empOut4);
		
		Map<Boolean, List<EmployeeLocDep>> empOut5 = emp.stream().collect(Collectors.partitioningBy(e->e.getAge()>23));
		System.out.println(empOut5);
		Set<Entry<Boolean,List<EmployeeLocDep>>> out = empOut5.entrySet();
		for(Entry<Boolean,List<EmployeeLocDep>> o:out) {
			List<EmployeeLocDep> oE = o.getValue();
			if(o.getKey().equals(true)) {
				System.out.println(oE);
			}else {
				System.out.println(oE);
			}
		}
		
		Optional<EmployeeLocDep> empOut6 = emp.stream().collect(Collectors.maxBy(Comparator.comparingInt(EmployeeLocDep::getAge)));
		EmployeeLocDep opt = empOut6.get();
		System.out.println(opt);
		
		EmployeeLocDep empOut7 = emp.stream().collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(EmployeeLocDep::getAge)),Optional::get));
		System.out.println(empOut7);
	}

}
