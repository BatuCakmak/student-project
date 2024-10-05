package com.batucakmak.starter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DtoStudent {

    private String firstName;

    private String lastName;

    private Integer id;

    private List<DtoCourse> courses = new ArrayList<>();


}
