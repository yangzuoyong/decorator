package com.gupaoedu.vip.decorator.battercake.v1;

public class BattercakeWithEggAndSausage extends BattercakeWithEgg {
    @Override
    public String getMsg() {
        return super.getMsg()+"+1根香肠";
    }

    @Override
    public int getPrice() {
        //加一个香肠加2块钱
        return super.getPrice()+2;
    }
}
