package com.sunda.miaosha.domain;

import lombok.Data;

/**
 * Created by 老蹄子 on 2019/4/22 下午8:22
 */
@Data
public class MiaoshaOrder {
    private Long id;
    private Long userId;
    private Long  orderId;
    private Long goodsId;
}
