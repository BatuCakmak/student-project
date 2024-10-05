package com.batucakmak.starter.dto;


import com.batucakmak.starter.entities.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DtoHome {

    private  Long id;

    private BigDecimal price;

    private List<DtoRoom> rooms = new ArrayList<>();
}
