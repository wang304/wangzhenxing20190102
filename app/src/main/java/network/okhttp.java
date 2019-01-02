package network;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class okhttp {

    public void setOkHttpClient(String url, Callback callback){
        OkHttpClient okHttpClient=new OkHttpClient();
        Request request =new Request.Builder().url(url).get().build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {
                String json = response.body().string();
            }
        });
    }

}
