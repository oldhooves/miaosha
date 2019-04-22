package com.sunda.miaosha.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by 老蹄子 on 2019/4/22 下午8:23
 */
@Data
public class OrderInfo {
    private Long id;
    private Long userId;
    private Long goodsId;
    private Long  deliveryAddrId;
    private String goodsName;
    private Integer goodsCount;
    private Double goodsPrice;
    private Integer orderChannel;
    private Integer status;
    private Date createDate;
    private Date payDate;
}
