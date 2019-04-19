package com.sunda.miaosha.util;

import java.util.UUID;

/**
 * Created by 老蹄子 on 2019/4/18 下午10:22
 */
public class UUIDUtil {
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
