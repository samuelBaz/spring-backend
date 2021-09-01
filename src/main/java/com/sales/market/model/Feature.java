/**
 * @author: Samuel Bazoalto
 */

package com.sales.market.model;

import com.sales.market.dto.FeatureDto;

import javax.persistence.Entity;

@Entity
public class Feature extends ModelBase<FeatureDto> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}