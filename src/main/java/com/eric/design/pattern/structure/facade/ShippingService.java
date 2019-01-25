package com.eric.design.pattern.structure.facade;

public class ShippingService {
    public String shipGift(PointGift pointGift){
        //物流系统的对接逻辑
        System.out.println(pointGift.getName()+"已进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
