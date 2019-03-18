package com.gupaoedu.vip.decorator;

import com.gupaoedu.vip.decorator.battercake.v1.Battercake;
import com.gupaoedu.vip.decorator.battercake.v1.BattercakeWithEgg;
import com.gupaoedu.vip.decorator.battercake.v1.BattercakeWithEggAndSausage;
import com.gupaoedu.vip.decorator.battercake.v2.BaseBattercake;
import com.gupaoedu.vip.decorator.battercake.v2.EggDecorator;
import com.gupaoedu.vip.decorator.battercake.v2.SausageDecorator;
import com.gupaoedu.vip.decorator.passport.SigninService;
import com.gupaoedu.vip.decorator.passport.upgrade.ISiginForThirdService;
import com.gupaoedu.vip.decorator.passport.upgrade.SiginForThirdService;
import org.junit.Test;

public class DecoratorTest {
    @Test
    public void battercakeTest() {
        Battercake battercake = new Battercake();
        System.out.println(String.format("%s,总价格：%s", battercake.getMsg(), battercake.getPrice()));
        battercake = new BattercakeWithEgg();
        System.out.println(String.format("%s,总价格：%s", battercake.getMsg(), battercake.getPrice()));
        battercake = new BattercakeWithEggAndSausage();
        System.out.println(String.format("%s,总价格：%s", battercake.getMsg(), battercake.getPrice()));
    }

    @Test
    public void battercakeTest2() {
        com.gupaoedu.vip.decorator.battercake.v2.Battercake battercake;
        //路边摊买一个煎饼
        battercake = new BaseBattercake();
        //煎饼有点小，想再加一个鸡蛋
        battercake = new EggDecorator(battercake);
        //很饿，再加根香肠
        battercake = new SausageDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        battercake = new EggDecorator(battercake);
        //跟静态代理最大区别就是职责不同
        //静态代理不一定要满足is-a的关系
        //静态代理会做功能增强，同一个职责变得不一样
        //装饰器更多考虑是扩展
        System.out.println(String.format("%s,总价：%s", battercake.getMsg(), battercake.getPrice()));
    }

    @Test
    public void siginForThirdServiceTest() {
        //满足一个is-a
        ISiginForThirdService siginForThirdService = new SiginForThirdService(new SigninService());
        siginForThirdService.loginForQQ("11111111999");
    }
}
