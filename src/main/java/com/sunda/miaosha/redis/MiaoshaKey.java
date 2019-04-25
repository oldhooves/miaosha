package com.sunda.miaosha.redis;

/**
 * Created by 老蹄子 on 2019/4/25 下午9:25
 */
public class MiaoshaKey extends BasePrefix{

    private MiaoshaKey(String prefix) {
        super(prefix);
    }
    public static MiaoshaKey isGoodsOver = new MiaoshaKey("go");

}
