package com.batucakmak.starter.services;

import com.batucakmak.starter.dto.DtoAddress;

public interface IAddressService {

    public DtoAddress findAddressById(Long id);
}
