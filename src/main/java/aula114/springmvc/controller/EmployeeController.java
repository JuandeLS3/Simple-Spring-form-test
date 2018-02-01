package aula114.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import aula114.springmvc.service.EmployeeService;
import redis.clients.jedis.Jedis;
import aula114.springmvc.domain.Contact;

import java.util.List;
import java.util.ArrayList;

@Controller
public class EmployeeController {

  @Autowired
  EmployeeService employeeService;

  @RequestMapping("/employee")
  public String consultaEmployee(Model model) {
     List<String> list = new ArrayList<String>();
     list = employeeService.listIdEmployee();
     model.addAttribute("list", list);
     return "consulta";
  }
  
  @RequestMapping(value="/show/{id}")
  public String mostrarFicha(Model model, @PathVariable("id") String id){
	  model.addAttribute("n", id);
	  List<String> grupos = new ArrayList<String>();
	  grupos = employeeService.listGroupEmployee(id);  
	  model.addAttribute("grupos", grupos);
  	return "mostrar";
  }
  
  @RequestMapping(value="/showgr/{gpo}")
  public String mostrarGrupo(Model model, @PathVariable("gpo") String gpo){
	  model.addAttribute("g", gpo);	// Pasamos el grupo seleccionado
  	return "vistagrupos";
  }
  
  @RequestMapping(value="/showgr/update")
  public String enviarGrupos(Model model, @RequestParam("datagroup") String datagroup){
	  System.out.println(datagroup);
	  return "redirect:/employee";	//redirect to home page
  }
  
}
