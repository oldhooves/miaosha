package com.sunda.miaosha.redis;

/**
 * Created by 老蹄子 on 2019/4/19 下午3:57
 */
public interface KeyPrefix {

    public int expireSeconds();

    public String getPrefix();
}
