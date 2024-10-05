package com.batucakmak.starter.controller;

import com.batucakmak.starter.dto.DtoCustomer;

public interface ICustomerController {

    public DtoCustomer findCustomerById(Long id);
}
