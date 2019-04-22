package com.sunda.miaosha.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by 老蹄子 on 2019/4/22 下午8:22
 */
@Data
public class MiaoshaGoods {
    private Long id;
    private Long goodsId;
    private Integer stockCount;
    private Date startDate;
    private Date endDate;
}
