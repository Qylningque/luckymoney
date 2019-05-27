package com.linco.luckymoney.service;

import com.linco.luckymoney.entity.LuckyMoney;
import com.linco.luckymoney.repository.LuckyMoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @ClassName LuckyMoneyService
 * @Description TODO
 * @Author qylni
 * @Data 2019/5/27 21:15
 * @Version 1.0
 **/
@Service
public class LuckyMoneyService {

    @Autowired
    private LuckyMoneyRepository repository;

    @Transactional
    public void createTwoLuckyMoney(){
        LuckyMoney luckyMoney520 = new LuckyMoney();
        luckyMoney520.setProducer("寜缺");
        luckyMoney520.setMoney(new BigDecimal(520));
        repository.save(luckyMoney520);

        LuckyMoney luckyMoney1314 = new LuckyMoney();
        luckyMoney1314.setProducer("寜缺");
        luckyMoney1314.setMoney(new BigDecimal(1314));
        repository.save(luckyMoney1314);
    }

}
