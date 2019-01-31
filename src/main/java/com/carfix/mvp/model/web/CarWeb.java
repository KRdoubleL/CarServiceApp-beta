package com.carfix.mvp.model.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarWeb {

    @NotBlank
    @Length(min = 3, max = 3)
    private String tsn;

    @NotBlank
    @Length(min = 4, max = 4)
    private String hsn;

    @Length(min = 17, max = 17)
    private String vin;

}
