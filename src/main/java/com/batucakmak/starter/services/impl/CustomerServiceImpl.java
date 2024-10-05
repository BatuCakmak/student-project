package com.batucakmak.starter.services.impl;

import com.batucakmak.starter.dto.DtoAddress;
import com.batucakmak.starter.dto.DtoCustomer;
import com.batucakmak.starter.entities.Address;
import com.batucakmak.starter.entities.Customer;
import com.batucakmak.starter.repository.CustomerRepository;
import com.batucakmak.starter.services.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {


    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public DtoCustomer findCustomerById(Long id) {

        DtoCustomer dtoCustomer = new DtoCustomer();
        DtoAddress dtoAddress= new DtoAddress();

        Optional<Customer> optional = customerRepository.findById(id);
        if(optional.isEmpty())
        {
            return null;
        }
        Customer customer= optional.get();
        Address address=optional.get().getAddress();

        BeanUtils.copyProperties(customer,dtoCustomer);
        BeanUtils.copyProperties(address,dtoAddress);

        dtoCustomer.setAddress(dtoAddress);

        return dtoCustomer;
    }
}
