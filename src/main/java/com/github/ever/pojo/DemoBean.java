package com.github.ever.pojo;

import java.io.Serializable;

/**
 * Created by ever on 2017/8/27.
 */
public class DemoBean implements Serializable {
    private Integer v1;
    private Integer v2;

    public Integer getV1() {
        return v1;
    }

    public void setV1(Integer v1) {
        this.v1 = v1;
    }

    public Integer getV2() {
        return v2;
    }

    public void setV2(Integer v2) {
        this.v2 = v2;
    }
}
