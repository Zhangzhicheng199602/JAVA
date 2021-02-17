package com.seckillproject.service.model;

import org.joda.time.DateTime;

import java.math.BigDecimal;

public class PromoModel {

    private Integer id;

    //秒杀活动名称
    private String promoName;

    //活动开始时间
    private DateTime startDate;

    //活动结束时间
    private DateTime endDate;

    //秒杀活动的适用商品（本项目为了简单起见，同一个秒杀项目只能适用一个itemId）
    private Integer itemId;

    //秒杀活动的商品价格
    private BigDecimal promoItemPrice;

    //秒杀活动状态，1是还未开始，2是进行中，3是已结束
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getPromoItemPrice() {
        return promoItemPrice;
    }

    public void setPromoItemPrice(BigDecimal promoItemPrice) {
        this.promoItemPrice = promoItemPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
