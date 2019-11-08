package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class ProgramDepartment {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		DepartmentDAO department = DaoFactory.createDepartmentDao();
		System.out.println("\n=== TEST 1: insert Department=======");
		Department newDepartment = new Department(null, "Music");
		department.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());
		
		
		System.out.println("\n=== TEST 2: delete Department=======");
		System.out.print("Enter id for delete: ");
		int id = input.nextInt();
		department.deleteById(id);
		System.out.println("Delete completed");
		
		
		System.out.println("=== TEST 3: findById Department=======");
		Department dep = department.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 4: update Department=======");
		Department dep2 = department.findById(5);
		dep2.setName("TI");
		department.update(dep2);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 5: findAll Department=======");
		List<Department> list = department.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		
		input.close();
	}

}
