package com.sales.market.dto;

import com.sales.market.model.FeatureInstance;

public class FeatureInstanceDto extends ModelBaseDto<FeatureInstance> {
    private String value;
    private FeatureDto feature;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public FeatureDto getFeature() {
        return feature;
    }

    public void setFeature(FeatureDto feature) {
        this.feature = feature;
    }
}