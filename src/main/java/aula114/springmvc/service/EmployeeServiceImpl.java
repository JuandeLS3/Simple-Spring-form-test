package aula114.springmvc.service;

import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import aula114.springmvc.domain.Contact;

@Service
public class EmployeeServiceImpl implements EmployeeService {

        private Jedis conn;
        public EmployeeServiceImpl() {
          conn = new Jedis("localhost");
          conn.select(12);
        }

	@Override
	public List<String> listIdEmployee() {
           List<String> list1 = new ArrayList<String>();
           Set<String> list = conn.smembers("grupos:usuario:set");
           for(String st : list) { 
             list1.add(st);
           }
           return list1;
	}

	/*@Override
	public Contact show(String id) {
		Contact c = new Contact();
		c.setName(id);
		return c;
	}*/

		/* Con este método obtenemos los grupos de la BD redis del usuario (ID) que le hayamos pasado desde el controlador */
	@Override
	public List<String> listGroupEmployee(String id) {
		List<String> grupos = new ArrayList<String>();
		grupos = conn.lrange("grupos:usuario:" + id + ":grupos", 0, -1);
		return grupos;
	}
	
	
}
