package com.example.appmysql;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RegisterInterface {

    String REGIURL = "http://192.168.1.13/LoginRegister/";
    @FormUrlEncoded
    @POST("register.php")
    Call<String> getUserRegi(
            @Field("name") String name,
            @Field("email") String email,
            @Field("username") String uname,
            @Field("password") String password

    );

}


