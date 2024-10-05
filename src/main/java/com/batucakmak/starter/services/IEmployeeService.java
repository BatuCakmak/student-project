package com.batucakmak.starter.services;

import com.batucakmak.starter.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeService {

    public List<DtoEmployee>findAllEmployees();
}
