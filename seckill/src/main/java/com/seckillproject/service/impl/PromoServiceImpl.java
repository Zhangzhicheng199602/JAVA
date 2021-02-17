package com.seckillproject.service.impl;

import com.seckillproject.dao.PromoDOMapper;
import com.seckillproject.dataobject.PromoDO;
import com.seckillproject.service.PromoService;
import com.seckillproject.service.model.PromoModel;
import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PromoServiceImpl implements PromoService {

    @Autowired
    private PromoDOMapper promoDOMapper;

    //根据itemId获取即将进行或正在进行的商品活动
    @Override
    public PromoModel getPromoByItemId(Integer itemId) {

        //获取商品秒杀活动信息
        PromoDO promoDO = promoDOMapper.selectByItemId(itemId);

        //dataobject->model
        PromoModel promoModel = convertFromDataObject(promoDO);

        if ( promoModel == null) {
            return null;
        }

        //判断当前时间秒杀活动是还未开始还是即将开始
        if (promoModel.getStartDate().isAfterNow()) {
            //未开始
            promoModel.setStatus(1);
        } else if (promoModel.getEndDate().isBeforeNow()) {
            //已结束
            promoModel.setStatus(3);
        } else {
            //进行中
            promoModel.setStatus(2);
        }

        return promoModel;
    }

    //dataobject->model
    private PromoModel convertFromDataObject(PromoDO promoDO) {
        if (promoDO == null) {
            return null;
        }
        PromoModel promoModel = new PromoModel();
        BeanUtils.copyProperties(promoDO, promoModel);
        //价格DO是double而Model是BigDecimal，要转一下
        promoModel.setPromoItemPrice(new BigDecimal(promoDO.getPromoItemPrice()));
        //还有日期也要转一下
        promoModel.setStartDate(new DateTime(promoDO.getStartDate()));
        promoModel.setEndDate(new DateTime(promoDO.getEndDate()));
        return promoModel;
    }
}
