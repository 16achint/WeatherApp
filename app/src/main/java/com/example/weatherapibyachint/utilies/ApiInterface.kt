package com.example.weatherapibyachint.utilies

import com.example.weatherapibyachint.models.WeatherModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("weather")
    fun getCurrentWeatherData(
        @Query("lat") lat : String,
        @Query("lon") lon : String,
        @Query("APPID") appid : String
    ) : Call<WeatherModel>

    @GET("weather")
    fun getCityWeatherData(
        @Query("q") q : String,
        @Query("APPID") appid : String
    ) : Call<WeatherModel>
}