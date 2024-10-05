package com.batucakmak.starter.services.impl;

import com.batucakmak.starter.dto.DtoDepartment;
import com.batucakmak.starter.dto.DtoEmployee;
import com.batucakmak.starter.entities.Department;
import com.batucakmak.starter.entities.Employee;
import com.batucakmak.starter.repository.EmployeeRepository;
import com.batucakmak.starter.services.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<DtoEmployee> findAllEmployees() {
        List<DtoEmployee> dtoEmployeeList=new ArrayList<>();
        List<Employee> employeeList=  employeeRepository.findAll();
        if (employeeList!= null && !employeeList.isEmpty()){
            for (Employee employee:employeeList){
                DtoEmployee dtoEmployee = new DtoEmployee();
                BeanUtils.copyProperties(employee,dtoEmployee);

                dtoEmployee.setDepartment(new Department(employee.getDepartment().getId(),employee.getDepartment().getDepartmentName()));
                dtoEmployeeList.add(dtoEmployee);
            }


        }
        return dtoEmployeeList;
    }
}
