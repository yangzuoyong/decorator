package com.gupaoedu.vip.decorator.battercake.v2;

public class SausageDecorator extends BattercakeDecorator {
    @Override
    protected void doSomething() {

    }

    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String getMsg() {
        return String.format("%s+1根香肠",super.getMsg());
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
}
