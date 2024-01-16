package org.example.springcloud.service;


import org.apache.ibatis.annotations.Param;
import org.example.springcloud.entities.Payment;


/**
 * @auther zzyy
 * @create 2020-01-27 21:11
 */
public interface PaymentService
{
    public int create(Payment payment);


    public Payment getPaymentById(@Param("id") Long id);

}