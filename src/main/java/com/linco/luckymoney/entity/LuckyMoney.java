package com.linco.luckymoney.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @ClassName LuckyMoney
 * @Description TODO
 * @Author qylni
 * @Data 2019/5/27 20:23
 * @Version 1.0
 **/
@Entity
public class LuckyMoney {

    @Id
    @GeneratedValue
    private Integer id;

    private BigDecimal money;
    /**
     * @Description  //发送方
     **/
    private String producer;
    /**
     * @Description  //接收方
     **/
    private String consumer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }
}
