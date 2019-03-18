package com.gupaoedu.vip.decorator.battercake.v1;

public class BattercakeWithEgg extends Battercake {
    @Override
    public String getMsg() {
        return String.format("%s+1个鸡蛋",super.getMsg());
    }

    @Override
    public int getPrice() {
        //加一个鸡蛋加1块钱
        return super.getPrice()+1;
    }
}
