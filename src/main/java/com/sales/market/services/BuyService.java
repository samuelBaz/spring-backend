/**
 * @author: Samuel Bazoalto
 */

package com.sales.market.services;

import com.sales.market.model.Buy;
import com.sales.market.repository.BuyRepository;
import org.springframework.stereotype.Service;

@Service
public class BuyService{

    private BuyRepository buyRepository;

    public BuyService(BuyRepository buyRepository){
        this.buyRepository = buyRepository;
    }

    public Buy save(Buy buy){
        Buy buyPersisted = buyRepository.save(buy);
        return  buyPersisted;
    }

    public Buy getById(Long id){
        return buyRepository.getById(id);
    }
}