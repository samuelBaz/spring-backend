package com.sales.market.model;

import com.sales.market.dto.SubCategoryDto;

import javax.persistence.Entity;

@Entity
public class SubCategory extends ModelBase<SubCategoryDto> {
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