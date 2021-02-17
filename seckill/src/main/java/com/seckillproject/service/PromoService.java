package com.seckillproject.service;

import com.seckillproject.service.model.PromoModel;

public interface PromoService {

    //根据itemId获取即将进行或正在进行的商品活动
    PromoModel getPromoByItemId(Integer itemId);
}
