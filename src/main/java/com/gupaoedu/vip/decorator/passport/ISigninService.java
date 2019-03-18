package com.gupaoedu.vip.decorator.passport;

public interface ISigninService {
    /**
     *  注册
     * @param username
     * @param password
     * @return
     */
    ResultMsg regist(String username, String password);


    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String password);
}
