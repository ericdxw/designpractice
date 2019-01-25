package com.eric.design.pattern.structure.facade;

public class Test {
    public static void main(String[] args){
        PointGift pointGift = new PointGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.setPointsPaymentService(new PointsPaymentService());
        giftExchangeService.setQualifyService(new QualifyService());
        giftExchangeService.setShippingService(new ShippingService());
        giftExchangeService.giftExchange(pointGift);
    }
}
