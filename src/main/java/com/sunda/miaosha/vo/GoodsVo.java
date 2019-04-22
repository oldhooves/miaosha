package com.sunda.miaosha.vo;

import com.sunda.miaosha.domain.Goods;
import lombok.Data;

import java.util.Date;

/**
 * Created by 老蹄子 on 2019/4/22 下午8:24
 */
@Data
public class GoodsVo extends Goods{
    private Double miaoshaPrice;
    private Integer stockCount;
    private Date startDate;
    private Date endDate;
}
