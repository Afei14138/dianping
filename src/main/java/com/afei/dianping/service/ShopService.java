package com.afei.dianping.service;

import com.afei.dianping.common.BusinessException;
import com.afei.dianping.model.ShopModel;

import java.util.List;

public interface ShopService {

    ShopModel create(ShopModel shopModel) throws BusinessException;

    ShopModel get(Integer id);

    List<ShopModel> selectAll();

}
