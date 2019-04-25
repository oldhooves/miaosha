package com.sunda.miaosha.redis;

/**
 * Created by 老蹄子 on 2019/4/24 下午7:48
 */
public class GoodsKey extends BasePrefix{

    private GoodsKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
    public static GoodsKey getGoodsList = new GoodsKey(60, "gl");
    public static GoodsKey getGoodsDetail = new GoodsKey(60, "gd");
    public static GoodsKey getMiaoshaGoodsStock= new GoodsKey(0, "gs");

}
