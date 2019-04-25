package com.sunda.miaosha.rabbitmq;

import com.sunda.miaosha.domain.MiaoshaUser;
import lombok.Data;

/**
 * Created by 老蹄子 on 2019/4/25 下午9:21
 */
@Data
public class MiaoshaMessage {
    private MiaoshaUser user;
    private long goodsId;
}
