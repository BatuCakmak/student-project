package com.batucakmak.starter.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DataSource {

    private String url;

    private String username;

    private String password;
}
