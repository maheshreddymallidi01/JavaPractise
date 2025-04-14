package Practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeBySalary {

	public static void main(String[] args) {
		List<EmployeeSalary> emp = Arrays.asList(
				new EmployeeSalary("Mahesh","IT",60000),
				new EmployeeSalary("MMR","IT",30000),
				new EmployeeSalary("mr","bpo",10000),
				new EmployeeSalary("m","bpo",20000));
		Map<String,EmployeeSalary> empSorted = emp.stream().collect(Collectors.groupingBy(EmployeeSalary::getDep,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(EmployeeSalary::getSalary)), Optional::get)));
		System.out.println("---------------");
		empSorted.entrySet().stream().forEach(System.out::println);
		System.out.println("---------------");
		System.out.println(empSorted);
		DoubleSummaryStatistics r = emp.stream().collect(Collectors.summarizingDouble(EmployeeSalary::getSalary));
		System.out.println(r.getAverage());
		System.out.println(r.getSum());
		
		Map<String, Integer> count = new HashMap<>();
		for(EmployeeSalary e: emp) {
			if(!count.containsKey(e.getDep())) {
				count.put(e.getDep(), 1);
			}else {
				count.put(e.getDep(), count.get(e.getDep())+1);
			}
		}
		System.out.println(count);
	}

}
