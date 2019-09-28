package com.hcc.TodoService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcc.TodoService.Repository.EmployeeTodosRepository;
import com.hcc.TodoService.model.EmployeeTodos;

@RestController
public class EmpTodosController {
	
	@Autowired 
	private EmployeeTodosRepository employeTodosRepo;
	
	@PostMapping("/createTodo")
	public  @ResponseBody String CreateTodos(@RequestBody EmployeeTodos employeeTodos) {
		employeTodosRepo.save(employeeTodos);
		
		return "Success";
		
	}
	
	@GetMapping("/todoslist")
	public List<EmployeeTodos> getAllTodos(){
		
		return (List<EmployeeTodos>) employeTodosRepo.findAll();
	}
	
	@PutMapping("/updatestatus/{Id}")
	public EmployeeTodos UpdateTodos(@PathVariable Long Id,@RequestBody EmployeeTodos employeeTodos) {
		
		EmployeeTodos employeeTodosout = new EmployeeTodos();
		
		employeeTodosout=employeTodosRepo.save(employeeTodos);
		
		return employeeTodosout;
	}
	
	@DeleteMapping("deleteTodo/{Id}")
	public void deleteTodo(Long Id) {
		
		employeTodosRepo.deleteById(Id);
		
	}
	
}
