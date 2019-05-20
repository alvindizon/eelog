package com.alvindizon.eelog.data.network.interceptor;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.alvindizon.eelog.data.network.exception.NoNetworkException;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class ConnectivityInterceptor implements Interceptor {

    private final Context context;

    public ConnectivityInterceptor(Context context) {
        this.context = context;
    }

    private boolean isConnected() {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        if(isConnected()) {
            return chain.proceed(request);
        } else {
            throw new NoNetworkException();
        }
    }
}
