package com.alvindizon.eelog.di.module;

import android.app.Application;
import android.content.Context;

import com.alvindizon.eelog.data.network.interceptor.ConnectivityInterceptor;
import com.alvindizon.eelog.data.network.interceptor.TokenInterceptor;
import com.alvindizon.eelog.data.network.service.ApiService;
import com.alvindizon.eelog.data.network.service.SessionRepository;
import com.alvindizon.eelog.data.prefs.PreferenceRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    Context provideApplicationContext() {
        return mApplication.getApplicationContext();
    }


    @Provides
    @Singleton
    PreferenceRepository providePreferenceRepository(Context context) {
        return new PreferenceRepository(context);
    }


    @Provides
    @Singleton
    HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }

    @Provides
    @Singleton
    TokenInterceptor provideTokenInterceptor(PreferenceRepository preferenceRepository) {
        return new TokenInterceptor(preferenceRepository);
    }

    @Provides
    @Singleton
    ConnectivityInterceptor provideConnectivityInterceptor(Context context) {
        return new ConnectivityInterceptor(context);
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor,
                                     ConnectivityInterceptor connectivityInterceptor,
                                     TokenInterceptor tokenInterceptor) {
        return new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .addInterceptor(connectivityInterceptor)
                .addInterceptor(tokenInterceptor)
                .build();
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl("http://10.36.101.12:8080")
                .addConverterFactory(MoshiConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();
    }

    @Provides
    @Singleton
    ApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }

    @Provides
    @Singleton
    SessionRepository provideSessionRepository(ApiService apiService,
                                               PreferenceRepository preferenceRepository) {
        return new SessionRepository(apiService, preferenceRepository);
    }

}
