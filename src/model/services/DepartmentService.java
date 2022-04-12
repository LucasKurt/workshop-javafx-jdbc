package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmenDao();

	public List<Department> findAll() {
		return dao.findAll();
	}
	
	public void saveOrUpdate(Department department) {
		if(department.getId() == null) {
			dao.insert(department);
		} else {
			dao.update(department);
		}
	}
	
	public void remove(Department department) {
		dao.deleteByid(department.getId());
	}
}
