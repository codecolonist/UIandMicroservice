package com.hcc.TodoService.Repository;

import org.springframework.data.repository.CrudRepository;

import com.hcc.TodoService.model.EmployeeTodos;

public interface EmployeeTodosRepository extends CrudRepository<EmployeeTodos, Long> {

}
