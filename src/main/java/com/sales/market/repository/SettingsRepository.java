/**
 * @author: Samuel Bazoalto
 */

package com.sales.market.repository;

import com.sales.market.model.Settings;

public interface SettingsRepository extends GenericRepository<Settings> {
    String findByKey(String key);
}