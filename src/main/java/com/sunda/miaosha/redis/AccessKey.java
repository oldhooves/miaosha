package com.sunda.miaosha.redis;

/**
 * Created by 老蹄子 on 2019/4/26 下午7:54
 */
public class AccessKey extends BasePrefix{

    private AccessKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static AccessKey withExpire(int expireSeconds) {
        return new AccessKey(expireSeconds, "access");
    }
}
