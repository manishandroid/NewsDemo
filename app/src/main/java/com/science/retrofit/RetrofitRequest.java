package com.science.retrofit;
import com.science.main.MyApplication;
import com.science.model.NewsDataModel;

import retrofit.client.Response;

public class RetrofitRequest {

    private static RestService restService = MyApplication.getRestAdapter().create(RestService.class);


    public static void getNewsData(MyCallback<NewsDataModel[]> cb) {
        restService.getNewsData(cb);
    }

}
