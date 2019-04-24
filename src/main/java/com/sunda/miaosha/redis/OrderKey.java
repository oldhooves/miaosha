package com.sunda.miaosha.redis;

/**
 * Created by 老蹄子 on 2019/4/19 下午4:00
 */
public class OrderKey extends BasePrefix{

    public OrderKey(String prefix) {
        super(prefix);
    }
    public static OrderKey getMiaoshaOrderByUidGid = new OrderKey("moug");

}
