package com.crud.crudexample.request;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class StudentRequest {
    private long id;
    private String name;
    private String country;
    private boolean isActive;
}
