package com.sales.market.model;

import com.sales.market.dto.CategoryDto;

import javax.persistence.Entity;

@Entity
public class Category extends ModelBase<CategoryDto> {
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}