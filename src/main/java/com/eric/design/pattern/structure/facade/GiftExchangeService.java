package com.eric.design.pattern.structure.facade;

public class GiftExchangeService {
    private QualifyService qualifyService;
    private PointsPaymentService pointsPaymentService;
    private ShippingService shippingService;


    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public void setPointsPaymentService(PointsPaymentService pointsPaymentService) {
        this.pointsPaymentService = pointsPaymentService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void giftExchange(PointGift pointGift){
        if(qualifyService.isAvailable(pointGift)){
            if (pointsPaymentService.pay(pointGift)) {

                String shippingOrderNo = shippingService.shipGift(pointGift);
                System.out.println("物流号码是"+shippingOrderNo);
            }
        }
    }
}
