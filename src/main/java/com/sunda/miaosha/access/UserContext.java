package com.sunda.miaosha.access;

import com.sunda.miaosha.domain.MiaoshaUser;

/**
 * Created by 老蹄子 on 2019/4/26 下午9:21
 */
public class UserContext {

    //保证用户线程安全
    private static ThreadLocal<MiaoshaUser> userHolder = new ThreadLocal<>();

    public static void setUser(MiaoshaUser user) {
        userHolder.set(user);
    }

    public static MiaoshaUser getUser() {
        return userHolder.get();
    }

    private UserContext(){

    }
}
