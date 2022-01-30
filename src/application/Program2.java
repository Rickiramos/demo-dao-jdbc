package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
				
		//System.out.println("\n===  TEST 1: Department insert ===");
		//Department newDepartment = new Department(5, "Clothes");
		//departmentDao.insert(newDepartment);
		//System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n===  TEST 1: Update Department ===");
		Department department = departmentDao.findById(1);
		department.setName("");
		departmentDao.update(department);
		System.out.println("Update Completed");
		}
		
	
		
				
				sc.close();
	}

}