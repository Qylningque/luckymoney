package com.linco.luckymoney.controller;

import com.linco.luckymoney.entity.LuckyMoney;
import com.linco.luckymoney.repository.LuckyMoneyRepository;
import com.linco.luckymoney.service.LuckyMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName LuckyMoneyController
 * @Description TODO
 * @Author qylni
 * @Data 2019/5/27 20:50
 * @Version 1.0
 **/
@RestController
public class LuckyMoneyController {

    @Autowired
    private LuckyMoneyRepository luckyMoneyRepository;

    @Autowired
    private LuckyMoneyService luckyMoneyService;

    /**
     * @Description  //红包列表
     * @return java.util.List<com.linco.luckymoney.entity.LuckyMoney>
     **/
    @GetMapping("/luckymoneyList")
    public List<LuckyMoney> list(){
        return luckyMoneyRepository.findAll();
    }

    /**
     * @Description  //查询红包
     **/
    @PostMapping("/createLuckyMoney")
    public LuckyMoney createLuckyMoney(@RequestParam("producer") String producer,
                                       @RequestParam("money")BigDecimal money){
        LuckyMoney luckyMoney = new LuckyMoney();
        luckyMoney.setProducer(producer);
        luckyMoney.setMoney(money);
        return luckyMoneyRepository.save(luckyMoney);
    }

    /**
     * @Description  //通过id查询红包
     **/
    @GetMapping("/getLuckyMoneyById/{id}")
    public LuckyMoney getLuckyMoneyById(@PathVariable("id") Integer id){
        return  luckyMoneyRepository.findById(id).orElse(null);
    }
    /**
     * @Description  //更新红包
     **/
    @PutMapping("/updateLuckyMoney/{id}")
    public LuckyMoney updateLuckyMoney(@PathVariable("id") Integer id,
                                       @RequestParam("consumer") String consumer){
        Optional<LuckyMoney> optional = luckyMoneyRepository.findById(id);
        if(optional.isPresent()){
            LuckyMoney luckyMoney = optional.get();
            luckyMoney.setConsumer(consumer);
            return luckyMoneyRepository.save(luckyMoney);
        }
        return null;
    }
    /**
     * @Description  //红包事务
     **/
    @PutMapping("/createTransactional")
    public void createTwo(){
        luckyMoneyService.createTwoLuckyMoney();
    }

}
