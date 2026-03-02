package com.Aadi;


import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.Aadi.BookRepository.BookRepository;
import com.Aadi.BookRepository.EmployeeRepository;
import com.Aadi.entity.Book;
import com.Aadi.entity.Employee;



@SpringBootApplication
public class SpringBoot2Application implements CommandLineRunner {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context = SpringApplication.run(SpringBoot2Application.class, args);
	
	}
	
//    @Autowired
//	BookRepository bookRepository;
//	
//	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
//		Book book = new Book();
//		
//		book.setId(1);
//		book.setName("Java");
//		book.setPrice(500);
//		book.setQuantity(30);
//		
//		Book book2 =new Book();
//		book2.setId(2);
//		book2.setName("Python");
//		book2.setPrice(400);
//		book2.setQuantity(9);
//		Book book3 = new Book();
//		book3.setId(3);
//		book3.setName("C++");
//		book3.setPrice(300);
//		book3.setQuantity(9);
		
//		bookRepository.save(book);
		
//		bookRepository.saveAll(List.of(book2,book3));
//		
//		
//		Optional<Book> optional = bookRepository.findById(1);
//	
//		if (optional.isPresent()) {
//		Book book4 = optional.get();
//		System.out.println(book4);
//		}else {
//			System.out.println("No data is found");
//		}
		
//	Iterable< Book> itrIterable =	bookRepository.findAllById(List.of(1,3));
// 
//		for (Book book4 : itrIterable) {
//			System.out.println(book4);
//		}
		
//		bookRepository.findAllById(List.of(1,3)).forEach(x->System.out.println());
		
//		boolean b = bookRepository.existsById(1);
//		System.err.print(b);
		
//		long count = bookRepository.count();
//		
//		System.out.print(count);
		
//		bookRepository.deleteById(1);
//		bookRepository.deleteAll();
		
		List<Employee> employees = List.of(

				new Employee("Ram","Pune",40000.00,"Male","IT"),
				new Employee("Shyam","Mumbai",45000.00,"Male","HR"),
				new Employee("Amit","Delhi",50000.00,"Male","Finance"),
				new Employee("Priya","Chennai",42000.00,"Female","IT"),
				new Employee("Sneha","Bangalore",48000.00,"Female","Marketing"),
				new Employee("Rohan","Hyderabad",55000.00,"Male","IT"),
				new Employee("Neha","Pune",47000.00,"Female","HR"),
				new Employee("Vikas","Mumbai",52000.00,"Male","Finance"),
				new Employee("Kiran","Nagpur",39000.00,"Male","Support"),
				new Employee("Anjali","Delhi",46000.00,"Female","IT"),

				new Employee("Rahul","Chennai",60000.00,"Male","IT"),
				new Employee("Pooja","Bangalore",41000.00,"Female","HR"),
				new Employee("Suresh","Hyderabad",53000.00,"Male","Marketing"),
				new Employee("Meena","Pune",44000.00,"Female","Finance"),
				new Employee("Arjun","Mumbai",58000.00,"Male","IT"),
				new Employee("Divya","Delhi",49000.00,"Female","Support"),
				new Employee("Manoj","Chennai",51000.00,"Male","IT"),
				new Employee("Kavita","Bangalore",47000.00,"Female","Marketing"),
				new Employee("Sunil","Hyderabad",45000.00,"Male","HR"),
				new Employee("Ritika","Pune",52000.00,"Female","Finance"),

				new Employee("Nikhil","Mumbai",54000.00,"Male","IT"),
				new Employee("Swati","Delhi",43000.00,"Female","Support"),
				new Employee("Abhishek","Chennai",62000.00,"Male","IT"),
				new Employee("Komal","Bangalore",48000.00,"Female","Marketing"),
				new Employee("Deepak","Hyderabad",56000.00,"Male","Finance"),
				new Employee("Sanjana","Pune",47000.00,"Female","HR"),
				new Employee("Ajay","Mumbai",51000.00,"Male","IT"),
				new Employee("Preeti","Delhi",45000.00,"Female","Support"),
				new Employee("Ravi","Chennai",60000.00,"Male","Marketing"),
				new Employee("Shreya","Bangalore",49000.00,"Female","Finance"),

				new Employee("Vivek","Hyderabad",53000.00,"Male","IT"),
				new Employee("Tina","Pune",44000.00,"Female","HR"),
				new Employee("Gaurav","Mumbai",58000.00,"Male","Finance"),
				new Employee("Asha","Delhi",46000.00,"Female","Marketing"),
				new Employee("Harsh","Chennai",52000.00,"Male","IT"),
				new Employee("Mitali","Bangalore",47000.00,"Female","Support"),
				new Employee("Prakash","Hyderabad",55000.00,"Male","HR"),
				new Employee("Isha","Pune",48000.00,"Female","Finance"),
				new Employee("Kunal","Mumbai",60000.00,"Male","IT"),
				new Employee("Rekha","Delhi",43000.00,"Female","Marketing"),

				new Employee("Yogesh","Chennai",51000.00,"Male","Support"),
				new Employee("Nisha","Bangalore",47000.00,"Female","IT"),
				new Employee("Tarun","Hyderabad",54000.00,"Male","Finance"),
				new Employee("Payal","Pune",45000.00,"Female","HR"),
				new Employee("Siddharth","Mumbai",62000.00,"Male","IT"),
				new Employee("Bhavana","Delhi",49000.00,"Female","Marketing"),
				new Employee("Lokesh","Chennai",53000.00,"Male","Support"),
				new Employee("Radhika","Bangalore",48000.00,"Female","Finance"),
				new Employee("Aakash","Hyderabad",56000.00,"Male","IT"),
				new Employee("Monika","Pune",47000.00,"Female","HR")

				);
		
		employeeRepository.saveAll(employees);
		
		Sort sort = Sort.by("name");
	employeeRepository.findAll(sort).forEach(x->System.out.println(x));;
		
		Sort sort2 = Sort.by("salary");
	List<Employee> employees2 =	employeeRepository.findAll(sort);
	 
	   for (Employee employee : employees2) {
	System.out.println(employee);
	}
		
		
	
		System.out.println("Run method is calling");
		
	
	
		//Pagination
	PageRequest request =	PageRequest.of(0, 10);
	
	
	Page<Employee> page = employeeRepository.findAll(request);
		
	List<Employee> employees3 = page.getContent();
	
	employees3.forEach(i->System.out.println(i));
		
		
		// Filteration
		
		Employee employee = new Employee();
		employee.setAddress("Pune");
		employee.setAddress("Banglore");
		employee.setAddress("Chennai");
		employee.setName("Raj");
		employee.setName("Payal");
         employee.setSalary(45000.00);
	Example<Employee> emExample =	Example.of(employee);
	
	List<Employee> employees4 = employeeRepository.findAll(emExample);
	
	employees4.forEach(i->System.out.println(i));
//		
		List<Employee> bynamEmployees = employeeRepository.findByName("Payal");
		
		bynamEmployees.forEach(i->System.out.println(i));
//		
		
//		List<Employee> bydep = employeeRepository.findByDep("IT");
//		bydep.forEach(i->System.out.println(i));
		
		
//		List<Employee> byaddressEmployees = employeeRepository.findByAddress("Pune");
//		
//		byaddressEmployees.forEach(i->System.out.println(i));
		
		
//		List<Employee> bygenderEmployees = employeeRepository.findByGender("Male");
//		bygenderEmployees.forEach(i->System.out.println(i));
		
//		List<Employee> bySalaryEmployees = employeeRepository.findBySalary(50000.0);
//		bySalaryEmployees.forEach(i->System.out.println(i));
		
		
//	List<Employee> bysalarygreater =	employeeRepository.findBySalaryGreaterThan(40000.00);
//	bysalarygreater.forEach(i->System.out.println(i));
		
	List<Employee> bydepandgenderEmployees = 	employeeRepository.findByDepAndGender("IT", "Male");
	bydepandgenderEmployees.forEach(i->System.out.println(i));
		
	}
		

}
