package com.ywzheng.retrofit.entity.param;

/**
 * Created by yongwei on 2017/6/27.
 */

public class User {


    /**
     * systemId : null
     * isMD5 : 0
     * loginPassword : 730316
     * loginIP : 0.0.0.1
     * loginName : hh_hztyyl
     */

    private String loginName;
    private String loginPassword;
    private String isMD5;
    private String loginIP;
    private String systemId;

    public User(String loginName, String loginPassword, String isMD5, String loginIP, String systemId) {
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.isMD5 = isMD5;
        this.loginIP = loginIP;
        this.systemId = systemId;
    }
}
