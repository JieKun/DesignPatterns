package com.nf147.ssm_superman.FactoryMode.简单工厂.Phones;

import com.nf147.ssm_superman.FactoryMode.简单工厂.dao.Phone1;

public class IPhone_1 implements Phone1 {

    public void play() {
        System.out.println("我是苹果手机");
    }
}
