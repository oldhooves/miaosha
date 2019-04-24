package com.sunda.miaosha.vo;

import com.sunda.miaosha.domain.MiaoshaUser;
import lombok.Data;

/**
 * Created by 老蹄子 on 2019/4/24 下午7:46
 */
@Data
public class GoodsDetailVo {
    private int miaoshaStatus = 0;
    private int remainSeconds = 0;
    private GoodsVo goods ;
    private MiaoshaUser user;
}
