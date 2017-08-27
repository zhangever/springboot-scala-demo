package com.github.ever.enums;

/**
 * 相应返回状态
 * Created by Jarek on 2017/5/27.
 */
public enum ResponseStatus {

    /**
     * 成功
     **/
    SUCCESS(1),

    /**
     * 失败
     **/
    FAILURE(2);


    private final int value;

    private ResponseStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static ResponseStatus findByValue(int value) {
        switch (value) {

            case 1:
                return SUCCESS;

            case 2:
                return FAILURE;
            default:
                return null;
        }
    }
}
