package com.sales.market.model;

import com.sales.market.dto.ItemDto;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class Item extends ModelBase<ItemDto> {
    private String name;
    private String code;
    private String brand;
    private String description;
    @Lob
    private Byte[] image;

    @OneToOne
    private SubCategory subCategory;

    @OneToMany
    private Set<FeatureInstance> featureInstances;

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

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<FeatureInstance> getFeatureInstances() {
        return featureInstances;
    }

    public void setFeatureInstances(Set<FeatureInstance> featureInstances) {
        this.featureInstances = featureInstances;
    }
}