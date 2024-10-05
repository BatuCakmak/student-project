package com.batucakmak.starter.services;

import com.batucakmak.starter.dto.DtoCustomer;

public interface ICustomerService {

    public DtoCustomer findCustomerById(Long id);
}
