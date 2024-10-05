package com.batucakmak.starter.services;

import com.batucakmak.starter.dto.DtoHome;

public interface IHomeService {

    public DtoHome findHomeById(Long id);
}
