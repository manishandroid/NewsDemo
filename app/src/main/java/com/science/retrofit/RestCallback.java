package com.science.retrofit;

import retrofit.RetrofitError;
import retrofit.client.Response;

public interface RestCallback<T> {

    public void onFailure(RetrofitError e, GlobalVariables.SERVICE_MODE mode);
    public void onSuccess(T model, Response response, GlobalVariables.SERVICE_MODE mode);

}