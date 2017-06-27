package com.ywzheng.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ywzheng.retrofit.entity.param.User;
import com.ywzheng.retrofit.entity.response.UserInfo;
import com.ywzheng.retrofit.network.RetrofitHelper;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<UserInfo> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RetrofitHelper.getAccountAPI()
                .login(new User("hh_test", "123456", "0", "0.0.0.1", "null"))
                .enqueue(MainActivity.this);
    }

    @Override
    public void onResponse(Call<UserInfo> call, Response<UserInfo> response) {

        System.out.println("/n" + response);
    }

    @Override
    public void onFailure(Call<UserInfo> call, Throwable t) {

    }
}
