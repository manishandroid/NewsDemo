package com.science.retrofit;

import com.science.model.NewsDataModel;

import retrofit.client.Response;
import retrofit.http.GET;

public interface RestService
{	
	@GET(GlobalVariables.GET_NEWS_DATA)
    void getNewsData(MyCallback<NewsDataModel[]> callback);
}
