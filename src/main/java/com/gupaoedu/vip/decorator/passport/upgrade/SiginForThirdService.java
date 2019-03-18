package com.gupaoedu.vip.decorator.passport.upgrade;

import com.gupaoedu.vip.decorator.passport.ISigninService;
import com.gupaoedu.vip.decorator.passport.ResultMsg;

public class SiginForThirdService implements ISiginForThirdService {
    private ISigninService signinService;

    public SiginForThirdService(ISigninService signinService) {
        this.signinService = signinService;
    }

    @Override
    public ResultMsg loginForQQ(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }

    @Override
    public ResultMsg regist(String username, String password) {
        return  this.signinService.regist(username,password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return this.signinService.login(username,password);
    }
}
