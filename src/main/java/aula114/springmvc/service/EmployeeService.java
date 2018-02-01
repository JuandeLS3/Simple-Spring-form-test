package aula114.springmvc.service;

import java.util.List;

import aula114.springmvc.domain.Contact;

public interface EmployeeService {

	public List<String> listIdEmployee();
	//listallEmployee de contactos
	//public Contact show(String id);
	public List<String> listGroupEmployee(String id);
}
