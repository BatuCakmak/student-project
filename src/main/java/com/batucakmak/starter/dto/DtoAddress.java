package com.batucakmak.starter.dto;

import com.batucakmak.starter.entities.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DtoAddress {

    private Long id;

    private String description;

    private DtoCustomer customer;
}
