package com.science.retrofit;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class RetrofitFieldMap {

    private HashMap<String, String> mParams;
    private JSONObject jsonObject;

    public RetrofitFieldMap(
                            HashMap<String, String> params) {
        if (params == null) {
            mParams = new HashMap<>();
        } else {
            mParams = params;
        }

    }

    public RetrofitFieldMap(JSONObject jsonObject) {
       // mContext = context;

        if (jsonObject == null) {
            this.jsonObject = new JSONObject();
        } else {
            this.jsonObject = jsonObject;
        }
    }


    public Map<String, String> getParams() {
        return mParams;
    }

}
