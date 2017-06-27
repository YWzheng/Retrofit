package com.ywzheng.retrofit.network.api;

import com.ywzheng.retrofit.entity.param.MsgGetAndGetup;
import com.ywzheng.retrofit.entity.response.UserInfo;
import com.ywzheng.retrofit.entity.param.MsgList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by yongwei on 2017/6/27.
 */

public interface MessageService {

    @POST("api/getmessage/list")
    Call<UserInfo> list(@Body MsgList msgList);

    @POST("api/getmessage/getup")
    Call<UserInfo> getup(@Body MsgGetAndGetup msgGetAndGetup);

    @POST("api/getmessage/get")
    Call<UserInfo> get(@Body MsgGetAndGetup msgGetAndGetup);
}
