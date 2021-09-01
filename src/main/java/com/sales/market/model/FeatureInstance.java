/**
 * @author: Samuel Bazoalto
 */

package com.sales.market.model;

import com.sales.market.dto.FeatureInstanceDto;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class FeatureInstance extends ModelBase<FeatureInstanceDto> {
    private String value;
    @ManyToOne
    private Feature feature;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }
}