package com.example.mappingtest.form;

import javax.validation.constraints.NotBlank;

public class DeleteForm {
    @NotBlank
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
