package TCS;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PractiseApp {

	public static void main(String[] args) {

		List<Employee> employeesList = new ArrayList<>();
		List<Employee> employeesList1 = new ArrayList<>();

		employeesList.add(new Employee("Mahesh", 25, "Developer"));
		employeesList.add(new Employee("Bhaskar", 24, "Tester"));
		employeesList.add(new Employee("Devi", 26, "ChatBot"));

		System.out.println(sortedListOfEmployee(employeesList).toString());

		employeesList.stream().filter(name -> name.getName().equals("Mahesh")).forEach(System.out::println);
		employeesList.stream().filter(name -> name.getName().equals("Mahesh")).forEach(employeesList1::add);
		System.out.println(employeesList1);

		List<Integer> numbers = List.of(1, 2, 4, 5, 4, 1, 7, 5, 8, 6, 9);
		List<Integer> numberForEach = new ArrayList<>();
		numbers.stream().filter(n -> n % 2 == 0).forEach(numberForEach::add);
		System.out.println(numberForEach);

		Map<Integer, String> nameValue = new LinkedHashMap<>();
		nameValue.put(2, "Devi");
		nameValue.put(1, "Mahesh");
		nameValue.put(3, "Bhaskara");
		Map<Integer, String> nameValue2 = new LinkedHashMap<>();
		nameValue2.put(4, "Devi");
		nameValue2.put(6, "Mahesh");
		nameValue2.put(5, "Bhaskara");
		Map<Integer, String> nameValue3 = new LinkedHashMap<>();
		nameValue3.put(2, "Devi");
		nameValue3.put(1, "Mahesh");
		nameValue3.put(3, "Bhaskara");

		List<Map<Integer, String>> nn = new ArrayList<Map<Integer, String>>();
		nn.add(nameValue);
		nn.add(nameValue2);
		nn.add(nameValue3);
		
		System.out.println("nn"+nn);
		List<Map<Integer, String>> np = nn.stream()
				.map(nm -> nm.entrySet().stream().sorted(Map.Entry.comparingByValue())
						.collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, Map.Entry::getValue)))
				.collect(Collectors.toList());
		System.out.println("np" + np);

		Map<Integer, String> mmr = nameValue.entrySet().stream().filter(f -> f.getValue().equals("Mahesh"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		Map<Integer, String> mmr1 = new LinkedHashMap<>();
		nameValue.entrySet().stream().filter(f -> f.getValue().equals("Mahesh"))
				.forEach(n -> mmr1.put(n.getKey(), n.getValue()));
		System.out.println(mmr);
		System.out.println("mmr1" + mmr1);

		System.out.println(nameValue);

		System.out.println(numbers.stream().filter(n -> n > 5).count());

		List<String> fruits = List.of("apple", "pineapple", "watermelon", "banana", "kiwi", "apple", "kiwi");

		Map<String, String> fruitsaf = fruits.stream().distinct()
				.collect(Collectors.toMap(Function.identity(), String::toUpperCase));
		System.out.println(fruitsaf);
		String str = "burger,cheese burger,veg burger";
		List<String> fp = new ArrayList<>();
		List<String> ch = List.of("burger","cheese burger","veg burger");
		Supplier<List<String>> fp1 = ()-> fp;
		fp1.get().forEach(System.out::println);
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n != 1) {
			if (primeOrComposite(n)) {
				System.out.println("Prime");
			} else {
				System.out.println("Composite");
			}
		} else {
			System.out.println("Neither Prime nor Composite");
		}

		factorial(n);

	}

	private static List<Employee> sortedListOfEmployee(List<Employee> employeeList) {
		List<Employee> outputEmployeesList = new ArrayList<>();
//		outputEmployeesList = employeeList.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
		outputEmployeesList = employeeList.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		return outputEmployeesList;
	}

	private static boolean primeOrComposite(int n) {
		return IntStream.range(2, n).noneMatch(i -> n % i == 0);
	}

	private static void factorial(int n) {
		System.out.println((IntStream.rangeClosed(2, n).reduce(1, (a, b) -> a * b)));
	}

}
