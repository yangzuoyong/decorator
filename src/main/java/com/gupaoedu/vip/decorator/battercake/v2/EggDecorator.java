package com.gupaoedu.vip.decorator.battercake.v2;

public class EggDecorator extends BattercakeDecorator {
    @Override
    protected void doSomething() {

    }

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
