package com.dreams.dream.pojo.base;

import java.io.Serializable;

public class AdminInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private byte[] adminId;

    private String 管理员帐号;

    private String 管理员密码;

    public byte[] getAdminId() {
        return adminId;
    }

    public void setAdminId(byte[] adminId) {
        this.adminId = adminId;
    }

    public String get管理员帐号() {
        return 管理员帐号;
    }

    public void set管理员帐号(String 管理员帐号) {
        this.管理员帐号 = 管理员帐号;
    }

    public String get管理员密码() {
        return 管理员密码;
    }

    public void set管理员密码(String 管理员密码) {
        this.管理员密码 = 管理员密码;
    }
}