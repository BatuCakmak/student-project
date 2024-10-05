package com.batucakmak.starter.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {

    @NotEmpty(message = "Firstname alanı boş bırakılamaz!")
    @Size(min = 3, max = 40, message = "Firstname 3 ile 40 karakter arasında olmalıdır")
    private String firstName;

    @Size(min = 3,max = 30)
    private String lastName;

    private Date birthOfDate;

    @Email(message = "Email formatında bir adres giriniz!")
    private String email;

    @Size(min = 11,max = 11,message = "TCKN alanı 11 haneli olmalıdır")
    @NotEmpty(message ="TCKN alanı boş geçilemez")
    private String tckn;
}
