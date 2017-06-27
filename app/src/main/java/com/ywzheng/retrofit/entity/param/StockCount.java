package com.ywzheng.retrofit.entity.param;

/**
 * Created by yongwei on 2017/6/27.
 */

public class StockCount {


    /**
     * userName :
     * userPwd :
     * orgId :
     * platId :
     * beginTime :
     * endTime :
     */

    private String userName;
    private String userPwd;
    private String orgId;
    private String platId;
    private String beginTime;
    private String endTime;

    public StockCount(String userName, String userPwd, String orgId, String platId, String beginTime, String endTime) {
        this.userName = userName;
        this.userPwd = userPwd;
        this.orgId = orgId;
        this.platId = platId;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }
}
