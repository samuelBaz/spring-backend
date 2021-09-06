package com.sales.market.model;

import com.sales.market.dto.CategoryDto;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Category extends ModelBase<CategoryDto> {
    private String name;
    private String code;

    @OneToMany
    private Set<SubCategory> subCategorySet = new HashSet<>();

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

    public Set<SubCategory> getSubCategorySet() {
        return subCategorySet;
    }

    public void setSubCategorySet(Set<SubCategory> subCategorySet) {
        this.subCategorySet = subCategorySet;
    }
}