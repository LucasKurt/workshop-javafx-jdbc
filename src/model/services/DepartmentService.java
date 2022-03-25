package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	public List<Department> findAll() {
		List<Department> tempList = new ArrayList<>();
		tempList.add(new Department(1, "Books"));
		tempList.add(new Department(2, "Computers"));
		tempList.add(new Department(3, "Electronics"));
		return tempList;
	}
}
