package com.crud.crudexample.response;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class StudentResponse {
    private long id;
    private String name;
    private String country;
    private boolean isActive;
}
