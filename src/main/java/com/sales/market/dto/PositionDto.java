package com.sales.market.dto;

import com.sales.market.model.Position;

public class PositionDto extends ModelBaseDto<Position> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}