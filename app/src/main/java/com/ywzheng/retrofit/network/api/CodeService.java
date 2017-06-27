package com.ywzheng.retrofit.network.api;

import com.ywzheng.retrofit.entity.param.CodeUseAge;
import com.ywzheng.retrofit.entity.param.StockCount;
import com.ywzheng.retrofit.entity.response.BarcodeUsages;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by yongwei on 2017/6/27.
 */

public interface CodeService {

    //条码使用
    @POST("TrdOrderServiceForMobile.svc/fetchBarcodeUsagesWithPlatId")
    Call<BarcodeUsages> fetchBarcodeUsagesWithPlatId(@Body CodeUseAge codeUseAge);


    //库存统计数
    @POST("TrdOrderServiceForMobile.svc/fetchStockCountStatistics")
    Call<BarcodeUsages> fetchStockCountStatistics(@Body StockCount stockCount);
}
