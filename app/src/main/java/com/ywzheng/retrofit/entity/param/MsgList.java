package com.ywzheng.retrofit.entity.param;

/**
 * Created by yongwei on 2017/6/27.
 */

public class MsgList {


    /**
     * appName : ENT_PLAT_APP
     * busCode : ORDER
     * currentPage : 1
     * pageSize : 10
     * userId : ZZYC00000000000000753315
     */

    private String userId;
    private String busCode;
    private String appName;
    private int currentPage;
    private int pageSize;

    public MsgList(String userId, String busCode, String appName, int currentPage, int pageSize) {
        this.userId = userId;
        this.busCode = busCode;
        this.appName = appName;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }
}
