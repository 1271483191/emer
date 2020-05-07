package com.yunjing.emer.util;

/**
 * @author: wzs
 * @date: 2020/5/7-10:25
 */
public class Message {

    private int code;
    private boolean res;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isRes() {
        return res;
    }

    public void setRes(boolean res) {
        this.res = res;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
