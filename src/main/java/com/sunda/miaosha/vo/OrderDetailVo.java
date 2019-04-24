package com.sunda.miaosha.vo;

import com.sunda.miaosha.domain.OrderInfo;
import lombok.Data;

/**
 * Created by 老蹄子 on 2019/4/24 下午7:46
 */
@Data
public class OrderDetailVo {
    private GoodsVo goods;
    private OrderInfo order;
}
