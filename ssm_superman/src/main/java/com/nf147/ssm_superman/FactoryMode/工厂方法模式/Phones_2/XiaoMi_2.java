package com.nf147.ssm_superman.FactoryMode.工厂方法模式.Phones_2;

import com.nf147.ssm_superman.FactoryMode.工厂方法模式.dao_2.Phone_2;

public class XiaoMi_2 implements Phone_2 {
    @Override
    public void play() {
        System.out.println("大家好我是小米。Are you OK?");
    }
}
