package com.batucakmak.starter.dto;


import com.batucakmak.starter.entities.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoEmployee {

    private Long id;

    private String name;

    private Department department;
}
