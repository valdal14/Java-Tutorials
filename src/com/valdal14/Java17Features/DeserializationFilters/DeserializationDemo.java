package com.valdal14.Java17Features.DeserializationFilters;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.util.function.Predicate;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("/home/valdal14/IdeaProjects/Java-Tutorials/src/com/valdal14/Java17Features/DeserializationFilters/Emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		// Filters
		// ObjectInputFilter.Config.createFilter("DeserializationFilters.Employee");
		ObjectInputFilter filter1 = ObjectInputFilter.Config.createFilter("com.valdal14.Java17Features.DeserializationFilters.*;java.base/*;!*");
		// ois.setObjectInputFilter(filter1);

		// Allow or Reject
		// If we change the class to String.class it will be rejected
		Predicate<Class<?>> predicate = c -> c.equals(Employee.class);
		// check whether or not a the predicates return true otherwise we reject
		System.out.println(predicate);
		ObjectInputFilter filter2 = ObjectInputFilter.allowFilter(predicate,ObjectInputFilter.Status.REJECTED);
		// ois.setObjectInputFilter(filter2);

		// Merge two filters
		ObjectInputFilter mergedFilters = ObjectInputFilter.merge(filter1, filter2);
		ois.setObjectInputFilter(mergedFilters);

		Object obj = ois.readObject();
		Employee emp = (Employee) obj;

		System.out.println("Employee Id: " + emp.id);
		System.out.println("Employee Name: " + emp.name);
		System.out.println("Employee Salary: " + emp.salary);
		System.out.println("Employee SSN: " + emp.ssn);

	}

}
