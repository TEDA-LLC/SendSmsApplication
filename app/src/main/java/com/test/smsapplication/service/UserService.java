package com.test.smsapplication.service;

import com.test.smsapplication.models.DataClass;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface UserService {
    @GET("/sms")
    Call<DataClass> getData();

    @GET("/sms/status")
    Call<DataClass> updateStatus(@Query("status") String status);

    //body   [1,2]
    @PUT("/sms")
    Call<List<int[]>> updateSmsStatus(List<int[]> body);
}