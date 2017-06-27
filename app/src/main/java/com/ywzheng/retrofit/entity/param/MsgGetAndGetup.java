package com.ywzheng.retrofit.entity.param;

/**
 * Created by yongwei on 2017/6/27.
 */

public class MsgGetAndGetup {

    /**
     * appName : ENT_PLAT_APP
     * msgId : MSGE00000000000003567936
     * userId : ZZYC00000000000000753315
     */

    private String appName;
    private String msgId;
    private String userId;

    public MsgGetAndGetup(String appName, String msgId, String userId) {
        this.appName = appName;
        this.msgId = msgId;
        this.userId = userId;
    }
}
