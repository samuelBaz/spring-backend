package com.sales.market.model;

import com.sales.market.dto.PositionDto;

import javax.persistence.Entity;

@Entity
public class Position extends ModelBase<PositionDto> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}