package com.github.ever.pojo;

import com.github.ever.enums.ResponseStatus;
import com.github.ever.enums.ResponseStatus;

import java.io.Serializable;

/**
 * 响应通用格式
 * Created by Jarek on 2017/5/27.
 */
public class ResponseData implements Serializable {
    private ResponseStatus status = ResponseStatus.SUCCESS; //响应状态默认为 success
    private Object data; //响应数据 当状态为 failure 的时候 data = null
    private String message; //响应的消息,当状态为 failure 的时候 message != null

    public ResponseData(ResponseStatus status, Object data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
