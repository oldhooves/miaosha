package com.sunda.miaosha.redis;

/**
 * Created by 老蹄子 on 2019/4/25 下午9:25
 */
public class MiaoshaKey extends BasePrefix{

    private MiaoshaKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
    public static MiaoshaKey isGoodsOver = new MiaoshaKey(0, "go");
    public static MiaoshaKey getMiaoshaPath = new MiaoshaKey(60, "mp");
    public static MiaoshaKey getMiaoshaVerifyCode = new MiaoshaKey(300, "vc");
}
