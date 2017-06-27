package com.ywzheng.retrofit.network;

import com.google.gson.GsonBuilder;
import com.ywzheng.retrofit.network.api.AccountService;
import com.ywzheng.retrofit.network.api.MessageService;

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

    public static AccountService getAccountAPI() {
        return createApi(AccountService.class, ApiConstants.USER);
    }

    public static MessageService getMsgListApi() {
        return createApi(MessageService.class, ApiConstants.MSG);
    }

}
