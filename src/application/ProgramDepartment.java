package application;

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
		
		input.close();
	}

}
