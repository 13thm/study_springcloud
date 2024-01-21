package org.example.service;

import org.springframework.stereotype.Component;

/**
 * @auther zzyy
 * @create 2019-11-12 11:12
 */
@Component //必须加 //必须加 //必须加
public class PaymentFallbackService implements PaymentHystrixService
{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService,paymentInfo_OK,FALL_back o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService,paymentInfo_TimeOut fallback o(╥﹏╥)o";
    }
}