package com.afei.dianping.service;

import com.afei.dianping.common.BusinessException;
import com.afei.dianping.model.ShopModel;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface ShopService {

    ShopModel create(ShopModel shopModel) throws BusinessException;

    ShopModel get(Integer id);

    List<ShopModel> selectAll();

    List<ShopModel> recommend(BigDecimal longitude, BigDecimal latitude);

    List<Map<String, Object>> searchGroupByTags(String keyword, Integer categoryId, String tags);

    List<ShopModel> search(BigDecimal longitude, BigDecimal latitude,
                           String keyword, Integer orderby, Integer categoryId,
                           String tags);

    Integer countAllShop();



}
