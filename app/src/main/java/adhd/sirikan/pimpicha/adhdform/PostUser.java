package adhd.sirikan.pimpicha.adhdform;

import android.app.DownloadManager;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

/**
 * Created by TheUser on 30/3/2560.
 */

public class PostUser extends AsyncTask<String, Void,String>{

    private Context context;
    private String tag = "30MarchV1";

    public PostUser(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... params) {

        try {
            OkHttpClient okHttpClient = new OkHttpClient();
            RequestBody requestBody = new FormEncodingBuilder()
                    .add("isAdd", "true")
                    .add("User", params[0])
                    .add("Password", params[1])
                    .add("Type" , params[2])
                    .build();
            Request.Builder builder = new Request.Builder();
            Request request = builder.url(params[3]).post(requestBody).build();
            Response response = okHttpClient.newCall((request)).execute();
            return  response.body().string();
        }catch (Exception e){
            Log.d(tag, "e doIn ==>" +e.toString());
            return null;
        }

    }
}//main class
