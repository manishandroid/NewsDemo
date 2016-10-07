package com.science.retrofit;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.science.main.MyApplication;
import retrofit.RestAdapter;
import com.science.main.R;

public class BaseActivity extends ActionBarActivity {

    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.context = this;
    }

    public RestAdapter getRestAdaptor() {
        return ((MyApplication) getApplicationContext()).getRestAdapter();
    }
}
