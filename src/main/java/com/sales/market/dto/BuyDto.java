/**
 * @author: Samuel Bazoalto
 */
package com.sales.market.dto;

import com.sales.market.model.Buy;

import java.math.BigDecimal;

public class BuyDto extends ModelBaseDto<Buy> {

    private BigDecimal value;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
