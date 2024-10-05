package com.batucakmak.starter.controller;

import com.batucakmak.starter.dto.DtoAddress;

public interface IAddressController {

    public DtoAddress findAddressById(Long id);
}
