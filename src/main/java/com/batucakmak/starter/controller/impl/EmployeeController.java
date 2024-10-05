package com.batucakmak.starter.controller.impl;

import com.batucakmak.starter.controller.IEmployeeController;
import com.batucakmak.starter.dto.DtoEmployee;
import com.batucakmak.starter.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/api/employee")
public class EmployeeController implements IEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @Override
    @GetMapping(path = "/list")
    public List<DtoEmployee> findAllEmployees() {
        return employeeService.findAllEmployees();
    }
}
