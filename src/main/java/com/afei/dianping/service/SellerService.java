package com.afei.dianping.service;

import com.afei.dianping.common.BusinessException;
import com.afei.dianping.model.SellerModel;

import java.util.List;

public interface SellerService {

    SellerModel create(SellerModel sellerModel);

    SellerModel get(Integer id);

    List<SellerModel> selectAll();

    SellerModel changeStatus(Integer id, Integer disableFlag) throws BusinessException;

    Integer countAllSeller();
}
