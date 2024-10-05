package com.batucakmak.starter.controller;

import com.batucakmak.starter.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeController {
    public List<DtoEmployee>findAllEmployees();
}
