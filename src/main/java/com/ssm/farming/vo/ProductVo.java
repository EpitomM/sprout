package com.ssm.farming.vo;

import com.ssm.farming.pojo.Product;

public class ProductVo extends Product {

    private String mername;

    public String getMername() {
        return mername;
    }

    public void setMername(String mername) {
        this.mername = mername;
    }

    @Override
    public String toString() {
        return "ProductVo{" +
                "mername='" + mername + '\'' +
                '}';
    }
}
