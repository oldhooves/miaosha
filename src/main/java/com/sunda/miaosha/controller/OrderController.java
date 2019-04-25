package com.sunda.miaosha.controller;

import com.sunda.miaosha.domain.MiaoshaUser;
import com.sunda.miaosha.domain.OrderInfo;
import com.sunda.miaosha.rabbitmq.MQSender;
import com.sunda.miaosha.redis.GoodsKey;
import com.sunda.miaosha.redis.RedisService;
import com.sunda.miaosha.result.CodeMsg;
import com.sunda.miaosha.result.Result;
import com.sunda.miaosha.service.GoodsService;
import com.sunda.miaosha.service.MiaoshaService;
import com.sunda.miaosha.service.MiaoshaUserService;
import com.sunda.miaosha.service.OrderService;
import com.sunda.miaosha.vo.GoodsVo;
import com.sunda.miaosha.vo.OrderDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 老蹄子 on 2019/4/24 下午8:13
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    MiaoshaUserService userService;

    @Autowired
    RedisService redisService;

    @Autowired
    OrderService orderService;

    @Autowired
    GoodsService goodsService;


    @RequestMapping("/detail")
    @ResponseBody
    public Result<OrderDetailVo> info(Model model, MiaoshaUser user,
                                      @RequestParam("orderId") long orderId) {
        if(user == null) {
            return Result.error(CodeMsg.SESSION_ERROR);
        }
        OrderInfo order = orderService.getOrderById(orderId);
        if(order == null) {
            return Result.error(CodeMsg.ORDER_NOT_EXIST);
        }
        long goodsId = order.getGoodsId();
        GoodsVo goods = goodsService.getGoodsVoByGoodsId(goodsId);
        OrderDetailVo vo = new OrderDetailVo();
        vo.setOrder(order);
        vo.setGoods(goods);
        return Result.success(vo);
    }
}
