package com.batucakmak.starter.controller;

import com.batucakmak.starter.dto.DtoHome;

public interface IHomeController {
    public DtoHome findHomeById(Long id);
}
