package com.ywzheng.retrofit.entity.param;

/**
 * Created by yongwei on 2017/6/27.
 */

public class CodeUseAge {

    /**
     * userName : bjwgyhrggjkfyxgs
     * userPwd : 123456
     * orgId : CFYC00000000000000707102
     * platId : NBJY99999999999999999999
     * pageSize : 10
     * pageIndex : 1
     * beginTime : 2017-04-10
     * endTime : 2017-05-10
     */

    private String userName;
    private String userPwd;
    private String orgId;
    private String platId;
    private String beginTime;
    private String endTime;
    private int pageSize;
    private int pageIndex;

    public CodeUseAge(String userName, String userPwd, String orgId, String platId, String beginTime, String endTime, int pageSize, int pageIndex) {
        this.userName = userName;
        this.userPwd = userPwd;
        this.orgId = orgId;
        this.platId = platId;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
    }
}
