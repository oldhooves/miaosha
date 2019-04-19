package com.sunda.miaosha.exception;

import com.sunda.miaosha.result.CodeMsg;

/**
 * Created by 老蹄子 on 2019/4/19 下午4:10
 */
public class GlobalException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private CodeMsg cm;

    public GlobalException(CodeMsg cm) {
        super(cm.toString());
        this.cm = cm;
    }

    public CodeMsg getCm() {
        return cm;
    }

}
