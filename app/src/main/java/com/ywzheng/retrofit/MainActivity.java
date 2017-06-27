package com.ywzheng.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ywzheng.retrofit.entity.param.User;
import com.ywzheng.retrofit.entity.response.UserInfo;
import com.ywzheng.retrofit.network.RetrofitHelper;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RetrofitHelper.getAccountAPI()
                        .login(new User("hh_test", "123456", "0", "0.0.0.1", "null"))
                        .enqueue(new Callback<UserInfo>() {
                            @Override
                            public void onResponse(Call<UserInfo> call, Response<UserInfo> response) {
                                System.out.println("response\n"+response.body().toString());

                            }

                            @Override
                            public void onFailure(Call<UserInfo> call, Throwable t) {

                            }
                        });
            }
        });


    }
}
