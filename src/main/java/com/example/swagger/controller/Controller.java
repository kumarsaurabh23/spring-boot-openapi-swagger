package com.example.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees/one")
public class Controller {

    private List<Employee> employees = createList();

    @GetMapping("/{id}")
    public Employee getById(@PathVariable String id) {
        return employees.stream().filter(e-> id.equals(e.empId())).findFirst().orElseThrow(() -> new RuntimeException("employee not found"));
    }

    private static List<Employee> createList() {
        List<Employee> tempEmployees = new ArrayList<>();
        Employee emp1 = new Employee("emp1","manager","1",3000);
        Employee emp2 = new Employee("emp2","developer","2",3000);
        tempEmployees.add(emp1);
        tempEmployees.add(emp2);
        return tempEmployees;
    }
}
