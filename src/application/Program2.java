package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
				
		System.out.println("\n===  TEST 1: Department insert ===");
		Department newDepartment = new Department(6, "Fitness");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n===  TEST 2: Update Department ===");
		Department department = departmentDao.findById(3);
		department.setName("Eletrônicos");
		departmentDao.update(department);
		System.out.println("Update Completed");
		
		System.out.println("\n===  TEST 3: Update Department ===");
		departmentDao.deleteById(6);
		System.out.println("Delete completed");
		
		
		System.out.println("\n===  TEST 4: Update Department ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
				sc.close();
	}

}