package model;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import network.okhttp;

public class ModelImpl implements IModel{
    private okhttp okhttps;

    @Override
    public void getdata(String url, Sta sta) {
        okhttps.setOkHttpClient(url, new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {

            }
        });
    }
}
