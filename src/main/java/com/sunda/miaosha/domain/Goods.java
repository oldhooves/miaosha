package com.sunda.miaosha.domain;

import lombok.Data;

/**
 * Created by 老蹄子 on 2019/4/22 下午8:20
 */
@Data
public class Goods {

    private Long id;
    private String goodsName;
    private String goodsTitle;
    private String goodsImg;
    private String goodsDetail;
    private Double goodsPrice;
    private Integer goodsStock;
}
