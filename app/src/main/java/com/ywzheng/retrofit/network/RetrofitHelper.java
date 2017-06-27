package com.ywzheng.retrofit.network;

import com.google.gson.GsonBuilder;
import com.ywzheng.retrofit.network.api.AccountService;
import com.ywzheng.retrofit.network.api.ApplyService;
import com.ywzheng.retrofit.network.api.CodeService;
import com.ywzheng.retrofit.network.api.MessageService;
import com.ywzheng.retrofit.network.api.OrderService;
import com.ywzheng.retrofit.network.api.PhoneService;
import com.ywzheng.retrofit.network.api.UpdateService;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yongwei on 2017/6/27.
 */

public class RetrofitHelper {

    private static OkHttpClient mOkHttpClient = initOkHttpClient();

    static {
        initOkHttpClient();
    }

    /**
     * 根据传入的baseUrl，和api创建retrofit
     */
    private static <T> T createApi(Class<T> clazz, String baseUrl) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(mOkHttpClient)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder()
                        .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                        .serializeNulls()
                        .create()))
                .build();

        return retrofit.create(clazz);
    }

    private static OkHttpClient initOkHttpClient() {
        return new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build();

    }

    //用户相关
    public static AccountService getAccountAPI() {
        return createApi(AccountService.class, ApiConstants.USER);
    }

    //消息相关
    public static MessageService getMessageApi() {
        return createApi(MessageService.class, ApiConstants.MSG);
    }

    //申领单
    public static ApplyService getApplyApi() {
        return createApi(ApplyService.class, ApiConstants.APPLY);
    }

    //电话
    public static PhoneService getPhoneApi() {
        return createApi(PhoneService.class, ApiConstants.PHONE);
    }

    //更新
    public static UpdateService getUpdateApi() {
        return createApi(UpdateService.class, ApiConstants.UPDATE);
    }

    //条码相关
    public static CodeService getCodeApi() {
        return createApi(CodeService.class, ApiConstants.CODE);
    }

    //订单
    public static OrderService getOrderApi() {
        return createApi(OrderService.class, ApiConstants.ORDER);
    }


}
