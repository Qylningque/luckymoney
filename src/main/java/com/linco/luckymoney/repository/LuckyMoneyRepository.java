package com.linco.luckymoney.repository;

import com.linco.luckymoney.entity.LuckyMoney;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LuckyMoneyRepository extends JpaRepository<LuckyMoney,Integer>{
}
