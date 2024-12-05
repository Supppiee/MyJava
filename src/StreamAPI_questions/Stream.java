package StreamAPI_questions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		Date joiningDateRam = dateFormat.parse("01-01-2001");
		Date joiningDateSita = dateFormat.parse("15-05-1995");
		Date joiningDateVishnu = dateFormat.parse("10-12-1998");
		Date joiningDateMahesh = dateFormat.parse("20-03-1990");
		
		List<Employee> emp = Arrays.asList(
				new Employee("Ram",50000.0,joiningDateRam,"M"),
				new Employee("Sita",40000.0, joiningDateSita, "F"),
				new Employee("Mashesh", 70000.0, joiningDateMahesh, "M"),
				new Employee("Vishnu", 20000.0, joiningDateVishnu, "M")
		);
		
		
		System.out.println("1.Finding the max salary");
        //Employee MaxSal = emp.stream().max((a,b)->(Double.compare(a.getSalary(), b.getSalary()))).get();
		//Another way to sort the elements in the stream.
		Employee MaxSal = emp.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println(MaxSal.getName());
		System.out.println(MaxSal.getSalary());
		System.out.println();
		
		
		System.out.println("2.Finding the min salary");
		Employee Minsal = emp.stream().min((a,b)->(Double.compare(a.getSalary(), b.getSalary()))).get();
		System.out.println(Minsal.getName());
		System.out.println(Minsal.getSalary());
		
		System.out.println();
		
		
		
		System.out.println("3.Find the 2nd highest salary ");
		Employee listEmp = emp.stream().sorted((a,b)->(Double.compare(b.getSalary(), a.getSalary())))
				.skip(1)
				.findFirst()
				.get();
		System.out.println(listEmp);
		System.out.println();
		System.out.println("2nd Highest Salary (optional)----->");
		Optional<Employee> listEmp1 = emp.stream().sorted((a,b)->(Double.compare(b.getSalary(), a.getSalary())))
				.skip(1)
				.findFirst();
		listEmp1.ifPresent(System.out::println);
		System.out.println();
		
		
		
		System.out.println("4.find the emp who is most expirence");
		//Employee MaxExp = emp.stream().min((a,b)->a.getJoiningDate().compareTo(b.getJoiningDate())).get();
		Employee MaxExp = emp.stream().min(Comparator.comparing(Employee::getJoiningDate)).get();
		System.out.println("max expirence : "+MaxExp);
		System.out.println();
		
		
		System.out.println("5.Count the number of employee on the basis of gender");
		long CountOfMale = emp.stream().filter(i->i.getGender().equals("M")).count();
		System.out.println("Count M :"+CountOfMale);
		long CountOfFemale = emp.stream().filter(i->i.getGender().equals("F")).count();
		System.out.println("Count F :"+CountOfFemale);
		
		//Another way to count using MAP
		Map<String, Long> count = emp.stream()
		.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(count);
	}
}