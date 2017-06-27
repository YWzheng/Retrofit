package com.ywzheng.retrofit.network.api;

import com.ywzheng.retrofit.entity.param.User;
import com.ywzheng.retrofit.entity.response.UserInfo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by yongwei on 2017/6/27.
 */

public interface AccountService {


    @POST("api/user/applogin")
    Call<UserInfo> login(@Body User user);



}
